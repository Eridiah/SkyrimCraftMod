package com.skyrimcraft.mod.libs;

import com.skyrimcraft.mod.battleaxes.SCBattleAxes;
import com.skyrimcraft.mod.blocks.SCOres;
import com.skyrimcraft.mod.daggers.SCDaggers;
import com.skyrimcraft.mod.greatswords.SCGreatSwords;
import com.skyrimcraft.mod.items.DaedraHeart;
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
			SCDecs.itemIronDagger = new SCDaggers(SCDecs.ironDagger).setUnlocalizedName("IronDagger");
			SCDecs.itemIronWarAxe = new SCWarAxes(SCDecs.ironWarAxe).setUnlocalizedName("IronWarAxe");
			SCDecs.itemIronMace = new SCMaces(SCDecs.ironMace).setUnlocalizedName("IronMace");
			SCDecs.itemIronGreatSword = new SCGreatSwords(SCDecs.ironGreatSword).setUnlocalizedName("IronGreatSword");
			SCDecs.itemIronBattleAxe = new SCBattleAxes(SCDecs.ironBattleAxe).setUnlocalizedName("IronBattleAxe");
			SCDecs.itemIronWarHammer = new SCWarHammers(SCDecs.ironWarHammer).setUnlocalizedName("IronWarHammer");
			
			//Steel
			SCDecs.itemSteelDagger = new SCDaggers(SCDecs.steelDagger).setUnlocalizedName("SteelDagger");
			SCDecs.itemSteelSword = new SCSwords(SCDecs.steelSword).setUnlocalizedName("SteelSword");
			SCDecs.itemSteelWarAxe = new SCWarAxes(SCDecs.steelWarAxe).setUnlocalizedName("SteelWarAxe");
			SCDecs.itemSteelMace = new SCMaces(SCDecs.steelMace).setUnlocalizedName("SteelMace");
			SCDecs.itemSteelGreatSword = new SCGreatSwords(SCDecs.steelGreatSword).setUnlocalizedName("SteelGreatSword");
			SCDecs.itemSteelBattleAxe = new SCBattleAxes(SCDecs.steelBattleAxe).setUnlocalizedName("SteelBattleAxe");
			SCDecs.itemSteelWarHammer = new SCWarHammers(SCDecs.steelWarHammer).setUnlocalizedName("SteelWarHammer");
	}
	
	public static void initBlocks() {
		
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
