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
			
		//Dwarven
			GameRegistry.registerItem(SCDecs.itemDwarvenDagger, "DwarvenDagger");
			GameRegistry.registerItem(SCDecs.itemDwarvenSword, "DwarvenSword");
			GameRegistry.registerItem(SCDecs.itemDwarvenWarAxe, "DwarvenWarAxe");
			GameRegistry.registerItem(SCDecs.itemDwarvenMace, "DwarvenMace");
			GameRegistry.registerItem(SCDecs.itemDwarvenGreatSword, "DwarvenGreatSword");
			GameRegistry.registerItem(SCDecs.itemDwarvenBattleAxe, "DwarvenBattleAxe");
			GameRegistry.registerItem(SCDecs.itemDwarvenWarHammer, "DwarvenWarHammer");
			
		//Elven
			GameRegistry.registerItem(SCDecs.itemElvenDagger, "ElvenDagger");
			GameRegistry.registerItem(SCDecs.itemElvenSword, "ElvenSword");
			GameRegistry.registerItem(SCDecs.itemElvenWarAxe, "ElvenWarAxe");
			GameRegistry.registerItem(SCDecs.itemElvenMace, "ElvenMace");
			GameRegistry.registerItem(SCDecs.itemElvenGreatSword, "ElvenGreatSword");
			GameRegistry.registerItem(SCDecs.itemElvenBattleAxe, "ElvenBattleAxe");
			GameRegistry.registerItem(SCDecs.itemElvenWarHammer, "ElvenWarHammer");
			
		//Glass
			GameRegistry.registerItem(SCDecs.itemGlassDagger, "GlassDagger");
			GameRegistry.registerItem(SCDecs.itemGlassSword, "GlassSword");
			GameRegistry.registerItem(SCDecs.itemGlassWarAxe, "GlassWarAxe");
			GameRegistry.registerItem(SCDecs.itemGlassMace, "GlassMace");
			GameRegistry.registerItem(SCDecs.itemGlassGreatSword, "GlassGreatSword");
			GameRegistry.registerItem(SCDecs.itemGlassBattleAxe, "GlassBattleAxe");
			GameRegistry.registerItem(SCDecs.itemGlassWarHammer, "GlassWarHammer");
			
		//Ebony
			GameRegistry.registerItem(SCDecs.itemEbonyDagger, "EbonyDagger");
			GameRegistry.registerItem(SCDecs.itemEbonySword, "EbonySword");
			GameRegistry.registerItem(SCDecs.itemEbonyWarAxe, "EbonyWarAxe");
			GameRegistry.registerItem(SCDecs.itemEbonyMace, "EbonyMace");
			GameRegistry.registerItem(SCDecs.itemEbonyGreatSword, "EbonyGreatSword");
			GameRegistry.registerItem(SCDecs.itemEbonyBattleAxe, "EbonyBattleAxe");
			GameRegistry.registerItem(SCDecs.itemEbonyWarHammer, "EbonyWarHammer");
			
		//Stalhrim
			GameRegistry.registerItem(SCDecs.itemStalhrimDagger, "StalhrimDagger");
			GameRegistry.registerItem(SCDecs.itemStalhrimSword, "StalhrimSword");
			GameRegistry.registerItem(SCDecs.itemStalhrimWarAxe, "StalhrimWarAxe");
			GameRegistry.registerItem(SCDecs.itemStalhrimMace, "StalhrimMace");
			GameRegistry.registerItem(SCDecs.itemStalhrimGreatSword, "StalhrimGreatSword");
			GameRegistry.registerItem(SCDecs.itemStalhrimBattleAxe, "StalhrimBattleAxe");
			GameRegistry.registerItem(SCDecs.itemStalhrimWarHammer, "StalhrimWarHammer");
			
		//Daedric
			GameRegistry.registerItem(SCDecs.itemDaedricDagger, "DaedricDagger");
			GameRegistry.registerItem(SCDecs.itemDaedricSword, "DaedricSword");
			GameRegistry.registerItem(SCDecs.itemDaedricWarAxe, "DaedricWarAxe");
			GameRegistry.registerItem(SCDecs.itemDaedricMace, "DaedricMace");
			GameRegistry.registerItem(SCDecs.itemDaedricGreatSword, "DaedricGreatSword");
			GameRegistry.registerItem(SCDecs.itemDaedricBattleAxe, "DaedricBattleAxe");
			GameRegistry.registerItem(SCDecs.itemDaedricWarHammer, "DaedricWarHammer");
			
		//DragonBone
			GameRegistry.registerItem(SCDecs.itemDragonBoneDagger, "DragonBoneDagger");
			GameRegistry.registerItem(SCDecs.itemDragonBoneSword, "DragonBoneSword");
			GameRegistry.registerItem(SCDecs.itemDragonBoneWarAxe, "DragonBoneWarAxe");
			GameRegistry.registerItem(SCDecs.itemDragonBoneMace, "DragonBoneMace");
			GameRegistry.registerItem(SCDecs.itemDragonBoneGreatSword, "DragonBoneGreatSword");
			GameRegistry.registerItem(SCDecs.itemDragonBoneBattleAxe, "DragonBoneBattleAxe");
			GameRegistry.registerItem(SCDecs.itemDragonBoneWarHammer, "DragonBoneWarHammer");
			
			
			
		//Bows
			
			//Maple
			GameRegistry.registerItem(SCDecs.itemMapleBow, "MapleBow");
			
			
		//Special Weapons
			
			//Swords
			GameRegistry.registerItem(SCDecs.itemChillrend, "ChillRend");
			GameRegistry.registerItem(SCDecs.itemDawnbreaker, "DawnBreaker");
			GameRegistry.registerItem(SCDecs.itemDragonbane, "DragonBane");
			GameRegistry.registerItem(SCDecs.itemGauldurBlackBlade, "BlackBlade");
	}
	
}
