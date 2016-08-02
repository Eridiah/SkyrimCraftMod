package com.skyrimcraft.mod.libs;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SCDecs {
	
	//Tool Materials
	
		//Iron
		static ToolMaterial ironDagger = EnumHelper.addToolMaterial("ironDagger", 2, 600, 7.0F, 1.6F, 10);
		static ToolMaterial ironWarAxe = EnumHelper.addToolMaterial("ironWarAxe", 2, 600, 7.0F, 2.1F, 10);
		static ToolMaterial ironMace = EnumHelper.addToolMaterial("ironMace", 2, 600, 7.0F, 2.2F, 10);
		static ToolMaterial ironGreatSword = EnumHelper.addToolMaterial("ironLongSword", 2, 600, 7.0F, 2.5F, 10);
		static ToolMaterial ironBattleAxe = EnumHelper.addToolMaterial("ironBattleAxe", 2, 600, 7.0F, 2.7F, 10);
		static ToolMaterial ironWarHammer = EnumHelper.addToolMaterial("ironWarHammer", 2, 600, 7.0F, 2.6F, 10);
	
		//Steel
		static ToolMaterial steelDagger = EnumHelper.addToolMaterial("steelDagger", 2, 600, 7.0F, 1.9F, 10);
		static ToolMaterial steelSword = EnumHelper.addToolMaterial("steelSword", 2, 600, 7.0F, 2.5F, 10);
		static ToolMaterial steelWarAxe = EnumHelper.addToolMaterial("steelWarAxe", 2, 600, 7.0F, 3.0F, 10);
		static ToolMaterial steelMace = EnumHelper.addToolMaterial("steelMace", 2, 600, 7.0F, 2.8F, 10);
		static ToolMaterial steelGreatSword = EnumHelper.addToolMaterial("steelLongSword", 2, 600, 7.0F, 3.5F, 10);
		static ToolMaterial steelBattleAxe = EnumHelper.addToolMaterial("steelBattleAxe", 2, 600, 7.0F, 3.7F, 10);
		static ToolMaterial steelWarHammer = EnumHelper.addToolMaterial("steelWarHammer", 2, 600, 7.0F, 3.6F, 10);

	//Items
		public static Item itemDaedraHeart;
		public static Item itemLeatherStraps;
		
	//Blocks
	
	//Ingots
		public static Item itemSilverIngot;
		public static Item itemCorundumIngot;
		public static Item itemEbonyIngot;
		public static Item itemOrichalcumIngot;
		public static Item itemMalachiteIngot;
		public static Item itemMoonStoneIngot;
		public static Item itemQuickSilverIngot;
		public static Item itemSteelIngot;

	//Ores
		public static Block blockSilverOre;
		public static Block blockCorundumOre;
		public static Block blockEbonyOre;
		public static Block blockOrichalcumOre;
		public static Block blockMalachiteOre;
		public static Block blockMoonStoneOre;
		public static Block blockQuickSilverOre;
	
	//Weapons
	
	//Iron
		public static Item itemIronDagger;
		public static Item itemIronWarAxe;
		public static Item itemIronMace;
		public static Item itemIronGreatSword;
		public static Item itemIronBattleAxe;
		public static Item itemIronWarHammer;
	
	//Steel
		public static Item itemSteelDagger;
		public static Item itemSteelSword;
		public static Item itemSteelWarAxe;
		public static Item itemSteelMace;
		public static Item itemSteelGreatSword;
		public static Item itemSteelBattleAxe;
		public static Item itemSteelWarHammer;
	
}
