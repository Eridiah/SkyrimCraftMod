package com.skyrimcraft.mod.crafting;

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.ChestGenHooks;

public class RecipeRemover {

	public static void RemoveVanillaRecipes() {
		
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

		Iterator<IRecipe> recipe = recipes.iterator();

		while (recipe.hasNext()) {
			ItemStack is = recipe.next().getRecipeOutput();
			if (is != null && is.getItem() == Items.iron_sword)
				recipe.remove();
		};
		
		RecipeRemover.RemoveChestRecipes();
	}
	
	public static void RemoveChestRecipes() {
		ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.iron_sword));
		ChestGenHooks.removeItem(ChestGenHooks.VILLAGE_BLACKSMITH, new ItemStack(Items.iron_sword));
		ChestGenHooks.removeItem(ChestGenHooks.MINESHAFT_CORRIDOR, new ItemStack(Items.iron_sword));
		ChestGenHooks.removeItem(ChestGenHooks.BONUS_CHEST, new ItemStack(Items.iron_sword));
		ChestGenHooks.removeItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new ItemStack(Items.iron_sword));
		ChestGenHooks.removeItem(ChestGenHooks.VILLAGE_BLACKSMITH, new ItemStack(Items.iron_sword));
	}
	
}
