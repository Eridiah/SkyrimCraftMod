package com.skyrimcraft.mod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.skyrimcraft.mod.libs.SCDecs;

public class SkyrimCraftTabs {
	
	public static CreativeTabs tabSkyrimCraftBlocks = new CreativeTabs("tabSkyrimCraftBlocks") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(Blocks.crafting_table).getItem();
		}
	};
	
	public static CreativeTabs tabSkyrimCraftItems = new CreativeTabs("tabSkyrimCraftItems") {
		@Override
		public Item getTabIconItem() {
			return SCDecs.itemDaedraHeartReg;
		}
	};
	
	public static CreativeTabs tabSkyrimCraftMaterials = new CreativeTabs("tabSkyrimCraftMaterials") {
		@Override
		public Item getTabIconItem() {
			return SCDecs.itemCorundumIngot;
		}
	};
	
	public static CreativeTabs tabSkyrimCraftWeapons = new CreativeTabs("tabSkyrimCraftWeapons") {
		@Override
		public Item getTabIconItem() {
			return SCDecs.itemIronBattleAxe;
		}
	};
	
	public static final void init() {
		
	}
	
}
