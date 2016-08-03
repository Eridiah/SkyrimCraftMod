package com.skyrimcraft.mod.libs;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.battleaxes.SCBattleAxes;
import com.skyrimcraft.mod.blocks.SCOres;
import com.skyrimcraft.mod.blocks.Smeltery;
import com.skyrimcraft.mod.blocks.ToolForge;
import com.skyrimcraft.mod.daggers.SCDaggers;
import com.skyrimcraft.mod.greatswords.SCGreatSwords;
import com.skyrimcraft.mod.items.DaedraHeart;
import com.skyrimcraft.mod.items.DaedraHeartReg;
import com.skyrimcraft.mod.items.SCIngots;
import com.skyrimcraft.mod.items.SCItem;
import com.skyrimcraft.mod.maces.SCMaces;
import com.skyrimcraft.mod.swords.SCSwords;
import com.skyrimcraft.mod.waraxes.SCWarAxes;
import com.skyrimcraft.mod.warhammers.SCWarHammers;

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
			SCDecs.itemIronDagger = new SCDaggers(SCToolMaterials.ironDagger).setUnlocalizedName("IronDagger");
			SCDecs.itemIronSword = new SCSwords(SCToolMaterials.ironSword).setUnlocalizedName("IronSword");
			SCDecs.itemIronWarAxe = new SCWarAxes(SCToolMaterials.ironWarAxe).setUnlocalizedName("IronWarAxe");
			SCDecs.itemIronMace = new SCMaces(SCToolMaterials.ironMace).setUnlocalizedName("IronMace");
			SCDecs.itemIronGreatSword = new SCGreatSwords(SCToolMaterials.ironGreatSword).setUnlocalizedName("IronGreatSword");
			SCDecs.itemIronBattleAxe = new SCBattleAxes(SCToolMaterials.ironBattleAxe).setUnlocalizedName("IronBattleAxe");
			SCDecs.itemIronWarHammer = new SCWarHammers(SCToolMaterials.ironWarHammer).setUnlocalizedName("IronWarHammer");
			
			//Steel
			SCDecs.itemSteelDagger = new SCDaggers(SCToolMaterials.steelDagger).setUnlocalizedName("SteelDagger");
			SCDecs.itemSteelSword = new SCSwords(SCToolMaterials.steelSword).setUnlocalizedName("SteelSword");
			SCDecs.itemSteelWarAxe = new SCWarAxes(SCToolMaterials.steelWarAxe).setUnlocalizedName("SteelWarAxe");
			SCDecs.itemSteelMace = new SCMaces(SCToolMaterials.steelMace).setUnlocalizedName("SteelMace");
			SCDecs.itemSteelGreatSword = new SCGreatSwords(SCToolMaterials.steelGreatSword).setUnlocalizedName("SteelGreatSword");
			SCDecs.itemSteelBattleAxe = new SCBattleAxes(SCToolMaterials.steelBattleAxe).setUnlocalizedName("SteelBattleAxe");
			SCDecs.itemSteelWarHammer = new SCWarHammers(SCToolMaterials.steelWarHammer).setUnlocalizedName("SteelWarHammer");
			
			//Orcish
			SCDecs.itemOrcishDagger = new SCDaggers(SCToolMaterials.orcDagger).setUnlocalizedName("OrcishDagger");
			SCDecs.itemOrcishSword = new SCSwords(SCToolMaterials.orcSword).setUnlocalizedName("OrcishSword");
			SCDecs.itemOrcishWarAxe = new SCWarAxes(SCToolMaterials.orcWarAxe).setUnlocalizedName("OrcishWarAxe");
			SCDecs.itemOrcishMace = new SCMaces(SCToolMaterials.orcMace).setUnlocalizedName("OrcishMace");
			SCDecs.itemOrcishGreatSword = new SCGreatSwords(SCToolMaterials.orcGreatSword).setUnlocalizedName("OrcishGreatSword");
			SCDecs.itemOrcishBattleAxe = new SCBattleAxes(SCToolMaterials.orcBattleAxe).setUnlocalizedName("OrcishBattleAxe");
			SCDecs.itemOrcishWarHammer = new SCWarHammers(SCToolMaterials.orcWarHammer).setUnlocalizedName("OrcishWarHammer");
	}
	
	public static void initBlocks() {
		
		//Blocks
		SCDecs.blockToolForge = new ToolForge().setBlockName("ToolForge");
		
		SCDecs.blockSmelteryIdle = new Smeltery(false).setBlockName("SmelteryIdle").setCreativeTab(SkyrimCraft.tabSkyrimCraftBlocks).setHardness(3.5F);
		SCDecs.blockSmelteryActive = new Smeltery(false).setBlockName("SmelteryActive").setHardness(3.5F);
		
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
