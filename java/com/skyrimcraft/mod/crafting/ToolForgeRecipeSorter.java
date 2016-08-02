package com.skyrimcraft.mod.crafting;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class ToolForgeRecipeSorter implements Comparator {

	final ToolForgeCraftingManager toolForge;
	
	public ToolForgeRecipeSorter(ToolForgeCraftingManager toolStationCraftingManager) {
		this.toolForge = toolStationCraftingManager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
		return irecipe1 instanceof ToolForgeShapelessRecipes && irecipe2 instanceof ToolForgeShapedRecipes ? 1: (irecipe2 instanceof ToolForgeShapelessRecipes && irecipe1 instanceof ToolForgeShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}
	
}
