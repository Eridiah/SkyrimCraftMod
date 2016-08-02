package com.skyrimcraft.mod.crafting;

import net.minecraft.item.ItemStack;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.libs.SCDecs;

import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes {

	public static void smeltingRecipes() {
		
		GameRegistry.addSmelting(SCDecs.blockSilverOre, new ItemStack(SCDecs.itemSilverIngot), 20);
		GameRegistry.addSmelting(SCDecs.blockCorundumOre, new ItemStack(SCDecs.itemCorundumIngot), 20);
		GameRegistry.addSmelting(SCDecs.blockEbonyOre, new ItemStack(SCDecs.itemEbonyIngot), 20);
		GameRegistry.addSmelting(SCDecs.blockOrichalcumOre, new ItemStack(SCDecs.itemOrichalcumIngot), 20);
		GameRegistry.addSmelting(SCDecs.blockMalachiteOre, new ItemStack(SCDecs.itemMalachiteIngot), 20);
		GameRegistry.addSmelting(SCDecs.blockMoonStoneOre, new ItemStack(SCDecs.itemMoonStoneIngot), 20);
		GameRegistry.addSmelting(SCDecs.blockQuickSilverOre, new ItemStack(SCDecs.itemQuickSilverIngot), 20);
		
	}
	
}
