package com.skyrimcraft.mod.libs;

import cpw.mods.fml.common.registry.GameRegistry;

public class SCRegisters {

	public static void itemRegisters() {
		
		//Items
			GameRegistry.registerItem(SCDecs.itemDaedraHeart, "DaedraHeart");
			GameRegistry.registerItem(SCDecs.itemDaedraHeartReg, "DaedraHeartReg");
			GameRegistry.registerItem(SCDecs.itemLeatherStraps, "LeatherStraps");
		
		//Ingots
			GameRegistry.registerItem(SCDecs.itemSilverIngot, "SilverIngot");
			GameRegistry.registerItem(SCDecs.itemCorundumIngot, "CorundumIngot");
			GameRegistry.registerItem(SCDecs.itemEbonyIngot, "EbonyIngot");
			GameRegistry.registerItem(SCDecs.itemOrichalcumIngot, "OrichalcumIngot");
			GameRegistry.registerItem(SCDecs.itemMalachiteIngot, "MalachiteIngot");
			GameRegistry.registerItem(SCDecs.itemMoonStoneIngot, "MoonStoneIngot");
			GameRegistry.registerItem(SCDecs.itemQuickSilverIngot, "QuickSilverIngot");
			GameRegistry.registerItem(SCDecs.itemSteelIngot, "SteelIngot");
	}
	
	public static void blockRegisters() {
		
		//Blocks
			GameRegistry.registerBlock(SCDecs.blockToolForge, "ToolForge");
			
			GameRegistry.registerBlock(SCDecs.blockSmelteryIdle, "SmelteryIdle");
			GameRegistry.registerBlock(SCDecs.blockSmelteryActive, "SmelteryActive");
		
		//Ores
			GameRegistry.registerBlock(SCDecs.blockSilverOre, "SilverOre");
			GameRegistry.registerBlock(SCDecs.blockCorundumOre, "CorundumOre");
			GameRegistry.registerBlock(SCDecs.blockEbonyOre, "EbonyOre");
			GameRegistry.registerBlock(SCDecs.blockOrichalcumOre, "OrichalcumOre");
			GameRegistry.registerBlock(SCDecs.blockMalachiteOre, "MalachiteOre");
			GameRegistry.registerBlock(SCDecs.blockMoonStoneOre, "MoonStoneOre");
			GameRegistry.registerBlock(SCDecs.blockQuickSilverOre, "QuickSilverOre");
	}
	
	public static void weaponRegisters() {
		
		//Iron
			GameRegistry.registerItem(SCDecs.itemIronDagger, "IronDagger");
			GameRegistry.registerItem(SCDecs.itemIronSword, "IronSword");
			GameRegistry.registerItem(SCDecs.itemIronWarAxe, "IronWarAxe");
			GameRegistry.registerItem(SCDecs.itemIronMace, "IronMace");
			GameRegistry.registerItem(SCDecs.itemIronGreatSword, "IronGreatSword");
			GameRegistry.registerItem(SCDecs.itemIronBattleAxe, "IronBattleAxe");
			GameRegistry.registerItem(SCDecs.itemIronWarHammer, "IronWarHammer");
		
		//Steel
			GameRegistry.registerItem(SCDecs.itemSteelDagger, "SteelDagger");
			GameRegistry.registerItem(SCDecs.itemSteelSword, "SteelSword");
			GameRegistry.registerItem(SCDecs.itemSteelWarAxe, "SteelWarAxe");
			GameRegistry.registerItem(SCDecs.itemSteelMace, "SteelMace");
			GameRegistry.registerItem(SCDecs.itemSteelGreatSword, "SteelGreatSword");
			GameRegistry.registerItem(SCDecs.itemSteelBattleAxe, "SteelBattleAxe");
			GameRegistry.registerItem(SCDecs.itemSteelWarHammer, "SteelWarHammer");
			
		//Orcish
			GameRegistry.registerItem(SCDecs.itemOrcishDagger, "OrcishDagger");
			GameRegistry.registerItem(SCDecs.itemOrcishSword, "OrcishSword");
			GameRegistry.registerItem(SCDecs.itemOrcishWarAxe, "OrcishWarAxe");
			GameRegistry.registerItem(SCDecs.itemOrcishMace, "OrcishMace");
			GameRegistry.registerItem(SCDecs.itemOrcishGreatSword, "OrcishGreatSword");
			GameRegistry.registerItem(SCDecs.itemOrcishBattleAxe, "OrcishBattleAxe");
			GameRegistry.registerItem(SCDecs.itemOrcishWarHammer, "OrcishWarHammer");
	}
	
}
