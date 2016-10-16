package com.skyrimcraft.mod.libs;

import com.skyrimcraft.mod.blocks.SCOres;
import com.skyrimcraft.mod.blocks.ToolForge;
import com.skyrimcraft.mod.bows.HuntingBow;
import com.skyrimcraft.mod.bows.ModBowBase;
import com.skyrimcraft.mod.items.DaedraHeart;
import com.skyrimcraft.mod.items.DaedraHeartReg;
import com.skyrimcraft.mod.items.SCIngots;
import com.skyrimcraft.mod.items.SCItem;
import com.skyrimcraft.mod.special_weapons.Chillrend;
import com.skyrimcraft.mod.special_weapons.Dawnbreaker;
import com.skyrimcraft.mod.special_weapons.Dragonbane;
import com.skyrimcraft.mod.special_weapons.Grimsever;
import com.skyrimcraft.mod.weapons.SCBattleAxes;
import com.skyrimcraft.mod.weapons.SCDaggers;
import com.skyrimcraft.mod.weapons.SCGreatSwords;
import com.skyrimcraft.mod.weapons.SCMaces;
import com.skyrimcraft.mod.weapons.SCSwords;
import com.skyrimcraft.mod.weapons.SCWarAxes;
import com.skyrimcraft.mod.weapons.SCWarHammers;

public class SCInits {

	public static void initItems() {
		
		//Items
		SCDecs.itemDaedraHeart = new DaedraHeart(3, 0.3F, false).setUnlocalizedName("DaedraHeart");
		SCDecs.itemDaedraHeartReg = new DaedraHeartReg().setUnlocalizedName("DaedraHeartReg");
		SCDecs.itemLeatherStraps = new SCItem().setUnlocalizedName("LeatherStraps");
		
		//Ingots
		SCDecs.itemSilverIngot = new SCIngots().setUnlocalizedName("SilverIngot");
		SCDecs.itemCorundumIngot = new SCIngots().setUnlocalizedName("CorundumIngot");
		SCDecs.itemEbonyIngot = new SCIngots().setUnlocalizedName("EbonyIngot");
		SCDecs.itemOrichalcumIngot = new SCIngots().setUnlocalizedName("OrichalcumIngot");
		SCDecs.itemMalachiteIngot = new SCIngots().setUnlocalizedName("MalachiteIngot");
		SCDecs.itemMoonStoneIngot = new SCIngots().setUnlocalizedName("MoonStoneIngot");
		SCDecs.itemQuickSilverIngot = new SCIngots().setUnlocalizedName("QuickSilverIngot");
		SCDecs.itemSteelIngot = new SCIngots().setUnlocalizedName("SteelIngot");
		
		//Weapons
		
			//Iron
			SCDecs.itemIronDagger = new SCDaggers(SCToolMaterials.IRON_MATERIAL).setUnlocalizedName("IronDagger");
			SCDecs.itemIronSword = new SCSwords(SCToolMaterials.IRON_MATERIAL).setUnlocalizedName("IronSword");
			SCDecs.itemIronWarAxe = new SCWarAxes(SCToolMaterials.IRON_MATERIAL).setUnlocalizedName("IronWarAxe");
			SCDecs.itemIronMace = new SCMaces(SCToolMaterials.IRON_MATERIAL).setUnlocalizedName("IronMace");
			SCDecs.itemIronGreatSword = new SCGreatSwords(SCToolMaterials.IRON_MATERIAL).setUnlocalizedName("IronGreatSword");
			SCDecs.itemIronBattleAxe = new SCBattleAxes(SCToolMaterials.IRON_MATERIAL).setUnlocalizedName("IronBattleAxe");
			SCDecs.itemIronWarHammer = new SCWarHammers(SCToolMaterials.IRON_MATERIAL).setUnlocalizedName("IronWarHammer");
			
			//Steel
			SCDecs.itemSteelDagger = new SCDaggers(SCToolMaterials.STEEL_MATERIAL).setUnlocalizedName("SteelDagger");
			SCDecs.itemSteelSword = new SCSwords(SCToolMaterials.STEEL_MATERIAL).setUnlocalizedName("SteelSword");
			SCDecs.itemSteelWarAxe = new SCWarAxes(SCToolMaterials.STEEL_MATERIAL).setUnlocalizedName("SteelWarAxe");
			SCDecs.itemSteelMace = new SCMaces(SCToolMaterials.STEEL_MATERIAL).setUnlocalizedName("SteelMace");
			SCDecs.itemSteelGreatSword = new SCGreatSwords(SCToolMaterials.STEEL_MATERIAL).setUnlocalizedName("SteelGreatSword");
			SCDecs.itemSteelBattleAxe = new SCBattleAxes(SCToolMaterials.STEEL_MATERIAL).setUnlocalizedName("SteelBattleAxe");
			SCDecs.itemSteelWarHammer = new SCWarHammers(SCToolMaterials.STEEL_MATERIAL).setUnlocalizedName("SteelWarHammer");
			
			//Orcish
			SCDecs.itemOrcishDagger = new SCDaggers(SCToolMaterials.ORCISH_MATERIAL).setUnlocalizedName("OrcishDagger");
			SCDecs.itemOrcishSword = new SCSwords(SCToolMaterials.ORCISH_MATERIAL).setUnlocalizedName("OrcishSword");
			SCDecs.itemOrcishWarAxe = new SCWarAxes(SCToolMaterials.ORCISH_MATERIAL).setUnlocalizedName("OrcishWarAxe");
			SCDecs.itemOrcishMace = new SCMaces(SCToolMaterials.ORCISH_MATERIAL).setUnlocalizedName("OrcishMace");
			SCDecs.itemOrcishGreatSword = new SCGreatSwords(SCToolMaterials.ORCISH_MATERIAL).setUnlocalizedName("OrcishGreatSword");
			SCDecs.itemOrcishBattleAxe = new SCBattleAxes(SCToolMaterials.ORCISH_MATERIAL).setUnlocalizedName("OrcishBattleAxe");
			SCDecs.itemOrcishWarHammer = new SCWarHammers(SCToolMaterials.ORCISH_MATERIAL).setUnlocalizedName("OrcishWarHammer");
			
			//Dwarven
			SCDecs.itemDwarvenDagger = new SCDaggers(SCToolMaterials.DWARVEN_MATERIAL).setUnlocalizedName("DwarvenDagger");
			SCDecs.itemDwarvenSword = new SCDaggers(SCToolMaterials.DWARVEN_MATERIAL).setUnlocalizedName("DwarvenSword");
			SCDecs.itemDwarvenWarAxe = new SCDaggers(SCToolMaterials.DWARVEN_MATERIAL).setUnlocalizedName("DwarvenWarAxe");
			SCDecs.itemDwarvenMace = new SCDaggers(SCToolMaterials.DWARVEN_MATERIAL).setUnlocalizedName("DwarvenMace");
			SCDecs.itemDwarvenGreatSword = new SCDaggers(SCToolMaterials.DWARVEN_MATERIAL).setUnlocalizedName("DwarvenGreatSword");
			SCDecs.itemDwarvenBattleAxe = new SCDaggers(SCToolMaterials.DWARVEN_MATERIAL).setUnlocalizedName("DwarvenBattleAxe");
			SCDecs.itemDwarvenWarHammer = new SCDaggers(SCToolMaterials.DWARVEN_MATERIAL).setUnlocalizedName("DwarvenWarHammer");
			
			//Elven
			SCDecs.itemElvenDagger = new SCDaggers(SCToolMaterials.ELVEN_MATERIAL).setUnlocalizedName("ElvenDagger");
			SCDecs.itemElvenSword = new SCDaggers(SCToolMaterials.ELVEN_MATERIAL).setUnlocalizedName("ElvenSword");
			SCDecs.itemElvenWarAxe = new SCDaggers(SCToolMaterials.ELVEN_MATERIAL).setUnlocalizedName("ElvenWarAxe");
			SCDecs.itemElvenMace = new SCDaggers(SCToolMaterials.ELVEN_MATERIAL).setUnlocalizedName("ElvenMace");
			SCDecs.itemElvenGreatSword = new SCDaggers(SCToolMaterials.ELVEN_MATERIAL).setUnlocalizedName("ElvenGreatSword");
			SCDecs.itemElvenBattleAxe = new SCDaggers(SCToolMaterials.ELVEN_MATERIAL).setUnlocalizedName("ElvenBattleAxe");
			SCDecs.itemElvenWarHammer = new SCDaggers(SCToolMaterials.ELVEN_MATERIAL).setUnlocalizedName("ElvenWarHammer");
			
			//Glass
			SCDecs.itemGlassDagger = new SCDaggers(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("GlassDagger");
			SCDecs.itemGlassSword = new SCDaggers(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("GlassSword");
			SCDecs.itemGlassWarAxe = new SCDaggers(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("GlassWarAxe");
			SCDecs.itemGlassMace = new SCDaggers(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("GlassMace");
			SCDecs.itemGlassGreatSword = new SCDaggers(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("GlassGreatSword");
			SCDecs.itemGlassBattleAxe = new SCDaggers(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("GlassBattleAxe");
			SCDecs.itemGlassWarHammer = new SCDaggers(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("GlassWarHammer");
			
			//Ebony
			SCDecs.itemEbonyDagger = new SCDaggers(SCToolMaterials.EBONY_MATERIAL).setUnlocalizedName("EbonyDagger");
			SCDecs.itemEbonySword = new SCDaggers(SCToolMaterials.EBONY_MATERIAL).setUnlocalizedName("EbonySword");
			SCDecs.itemEbonyWarAxe = new SCDaggers(SCToolMaterials.EBONY_MATERIAL).setUnlocalizedName("EbonyWarAxe");
			SCDecs.itemEbonyMace = new SCDaggers(SCToolMaterials.EBONY_MATERIAL).setUnlocalizedName("EbonyMace");
			SCDecs.itemEbonyGreatSword = new SCDaggers(SCToolMaterials.EBONY_MATERIAL).setUnlocalizedName("EbonyGreatSword");
			SCDecs.itemEbonyBattleAxe = new SCDaggers(SCToolMaterials.EBONY_MATERIAL).setUnlocalizedName("EbonyBattleAxe");
			SCDecs.itemEbonyWarHammer = new SCDaggers(SCToolMaterials.EBONY_MATERIAL).setUnlocalizedName("EbonyWarHammer");
			
			//Stalhrim
			SCDecs.itemStalhrimDagger = new SCDaggers(SCToolMaterials.STALHRIM_MATERIAL).setUnlocalizedName("StalhrimDagger");
			SCDecs.itemStalhrimSword = new SCDaggers(SCToolMaterials.STALHRIM_MATERIAL).setUnlocalizedName("StalhrimSword");
			SCDecs.itemStalhrimWarAxe = new SCDaggers(SCToolMaterials.STALHRIM_MATERIAL).setUnlocalizedName("StalhrimWarAxe");
			SCDecs.itemStalhrimMace = new SCDaggers(SCToolMaterials.STALHRIM_MATERIAL).setUnlocalizedName("StalhrimMace");
			SCDecs.itemStalhrimGreatSword = new SCDaggers(SCToolMaterials.STALHRIM_MATERIAL).setUnlocalizedName("StalhrimGreatSword");
			SCDecs.itemStalhrimBattleAxe = new SCDaggers(SCToolMaterials.STALHRIM_MATERIAL).setUnlocalizedName("StalhrimBattleAxe");
			SCDecs.itemStalhrimWarHammer = new SCDaggers(SCToolMaterials.STALHRIM_MATERIAL).setUnlocalizedName("StalhrimWarHammer");
			
			//Daedric
			SCDecs.itemDaedricDagger = new SCDaggers(SCToolMaterials.DAEDRIC_MATERIAL).setUnlocalizedName("DaedricDagger");
			SCDecs.itemDaedricSword = new SCDaggers(SCToolMaterials.DAEDRIC_MATERIAL).setUnlocalizedName("DaedricSword");
			SCDecs.itemDaedricWarAxe = new SCDaggers(SCToolMaterials.DAEDRIC_MATERIAL).setUnlocalizedName("DaedricWarAxe");
			SCDecs.itemDaedricMace = new SCDaggers(SCToolMaterials.DAEDRIC_MATERIAL).setUnlocalizedName("DaedricMace");
			SCDecs.itemDaedricGreatSword = new SCDaggers(SCToolMaterials.DAEDRIC_MATERIAL).setUnlocalizedName("DaedricGreatSword");
			SCDecs.itemDaedricBattleAxe = new SCDaggers(SCToolMaterials.DAEDRIC_MATERIAL).setUnlocalizedName("DaedricBattleAxe");
			SCDecs.itemDaedricWarHammer = new SCDaggers(SCToolMaterials.DAEDRIC_MATERIAL).setUnlocalizedName("DaedricWarHammer");
			
			//DragonBone
			SCDecs.itemDragonBoneDagger = new SCDaggers(SCToolMaterials.DRAGONBONE_MATERIAL).setUnlocalizedName("DragonBoneDagger");
			SCDecs.itemDragonBoneSword = new SCDaggers(SCToolMaterials.DRAGONBONE_MATERIAL).setUnlocalizedName("DragonBoneSword");
			SCDecs.itemDragonBoneWarAxe = new SCDaggers(SCToolMaterials.DRAGONBONE_MATERIAL).setUnlocalizedName("DragonBoneWarAxe");
			SCDecs.itemDragonBoneMace = new SCDaggers(SCToolMaterials.DRAGONBONE_MATERIAL).setUnlocalizedName("DragonBoneMace");
			SCDecs.itemDragonBoneGreatSword = new SCDaggers(SCToolMaterials.DRAGONBONE_MATERIAL).setUnlocalizedName("DragonBoneGreatSword");
			SCDecs.itemDragonBoneBattleAxe = new SCDaggers(SCToolMaterials.DRAGONBONE_MATERIAL).setUnlocalizedName("DragonBoneBattleAxe");
			SCDecs.itemDragonBoneWarHammer = new SCDaggers(SCToolMaterials.DRAGONBONE_MATERIAL).setUnlocalizedName("DragonBoneWarHammer");
			
			//Bow
				
				//Maple
				SCDecs.itemHuntingBow = new ModBowBase().setUnlocalizedName("HuntingBow");
				SCDecs.itemElvenBow = new ModBowBase().setUnlocalizedName("ElvenBow");
				
				
			//Special Weapons
				
				//Swords
				SCDecs.itemChillrend = new Chillrend(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("ChillRend");
				SCDecs.itemDawnbreaker = new Dawnbreaker(SCToolMaterials.EBONY_MATERIAL).setUnlocalizedName("DawnBreaker");
				SCDecs.itemDragonbane = new Dragonbane(SCToolMaterials.NORDIC_MATERIAL).setUnlocalizedName("DragonBane");
				SCDecs.itemGrimsever = new Grimsever(SCToolMaterials.GLASS_MATERIAL).setUnlocalizedName("GrimSever");
	}
	
	public static void initBlocks() {
		
		//Blocks
		SCDecs.blockToolForge = new ToolForge().setBlockName("ToolForge");
		
		//Ores
		SCDecs.blockSilverOre = new SCOres().setBlockName("SilverOre");
		SCDecs.blockCorundumOre = new SCOres().setBlockName("CorundumOre");
		SCDecs.blockEbonyOre = new SCOres().setBlockName("EbonyOre");
		SCDecs.blockOrichalcumOre = new SCOres().setBlockName("OrichalcumOre");
		SCDecs.blockMalachiteOre = new SCOres().setBlockName("MalachiteOre");
		SCDecs.blockMoonStoneOre = new SCOres().setBlockName("MoonStoneOre");
		SCDecs.blockQuickSilverOre = new SCOres().setBlockName("QuickSilverOre");
	}
	
}
