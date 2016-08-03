package com.skyrimcraft.mod.crafting;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.skyrimcraft.mod.libs.SCDecs;

public class SmelteryRecipes {

	public SmelteryRecipes() {
		
	}
	
	public static ItemStack getCookingResult(Item item, Item item2) {
		return getOutput(item, item2);
	}
	
	public static ItemStack getOutput(Item item, Item item2) {
		
		//Recipes go here
		if(item == SCDecs.itemCorundumIngot && item2 == Items.iron_ingot || item == Items.iron_ingot && item2 == SCDecs.itemCorundumIngot) {
			return new ItemStack(SCDecs.itemSteelIngot, 1);
		}
			
		return null;	
	}
	
}
