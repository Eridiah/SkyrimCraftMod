package com.skyrimcraft.mod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.util.EnumHelper;

import com.skyrimcraft.mod.battleaxes.SCBattleAxes;
import com.skyrimcraft.mod.blocks.SCOres;
import com.skyrimcraft.mod.daggers.SCDaggers;
import com.skyrimcraft.mod.greatswords.SCGreatSwords;
import com.skyrimcraft.mod.handler.SkyrimCraftEventHandler;
import com.skyrimcraft.mod.items.DaedraHeart;
import com.skyrimcraft.mod.items.SCIngots;
import com.skyrimcraft.mod.items.SCItem;
import com.skyrimcraft.mod.maces.SCMaces;
import com.skyrimcraft.mod.proxy.CommonProxy;
import com.skyrimcraft.mod.swords.SCSwords;
import com.skyrimcraft.mod.waraxes.SCWarAxes;
import com.skyrimcraft.mod.warhammers.SCWarHammers;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SkyrimCraft.modID, version = SkyrimCraft.version, name = SkyrimCraft.modName)
public class SkyrimCraft {

	public static final String modID = "skyrimcraft";
	public static final String version = "Alpha v0.1";
	public static final String modName = "SkyrimCraft";
	
	@SidedProxy(clientSide = "com.skyrimcraft.mod.proxy.ClientProxy", serverSide = "com.skyrimcraft.mod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(modID)
	public static SkyrimCraft instance;
	
	//Tool Materials
	
		//Iron
	
		//Steel
		ToolMaterial steelDagger = EnumHelper.addToolMaterial("steelDagger", 2, 600, 7.0F, 1.9F, 10);
		ToolMaterial steelSword = EnumHelper.addToolMaterial("steelSword", 2, 600, 7.0F, 2.5F, 10);
		ToolMaterial steelWarAxe = EnumHelper.addToolMaterial("steelWarAxe", 2, 600, 7.0F, 3.0F, 10);
		ToolMaterial steelMace = EnumHelper.addToolMaterial("steelMace", 2, 600, 7.0F, 2.8F, 10);
		ToolMaterial steelGreatSword = EnumHelper.addToolMaterial("steelLongSword", 2, 600, 7.0F, 3.5F, 10);
		ToolMaterial steelBattleAxe = EnumHelper.addToolMaterial("steelBattleAxe", 2, 600, 7.0F, 3.7F, 10);
		ToolMaterial steelWarHammer = EnumHelper.addToolMaterial("steelWarHammer", 2, 600, 7.0F, 3.6F, 10);
	
	SkyrimCraftEventHandler handler = new SkyrimCraftEventHandler();
	
	//Declarations
	
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
			public static Item itemSteelDagger;
			public static Item itemSteelSword;
			public static Item itemSteelWarAxe;
			public static Item itemSteelMace;
			public static Item itemSteelGreatSword;
			public static Item itemSteelBattleAxe;
			public static Item itemSteelWarHammer;
	
		//Armor
	
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent) {
		
		//Initializations
		
			//Items
				itemDaedraHeart = new DaedraHeart().setUnlocalizedName("DaedraHeart");
				itemLeatherStraps = new SCItem().setUnlocalizedName("LeatherStraps");
			
			//Blocks
	
			//Ingots
				itemSilverIngot = new SCIngots().setUnlocalizedName("SilverIngot");
				itemCorundumIngot = new SCIngots().setUnlocalizedName("CorundumIngot");
				itemEbonyIngot = new SCIngots().setUnlocalizedName("EbonyIngot");
				itemOrichalcumIngot = new SCIngots().setUnlocalizedName("OrichalcumIngot");
				itemMalachiteIngot = new SCIngots().setUnlocalizedName("MalachiteIngot");
				itemMoonStoneIngot = new SCIngots().setUnlocalizedName("MoonStoneIngot");
				itemQuickSilverIngot = new SCIngots().setUnlocalizedName("QuickSilverIngot");
				itemSteelIngot = new SCIngots().setUnlocalizedName("SteelIngot");
	
			//Ores
				blockSilverOre = new SCOres().setBlockName("SilverOre");
				blockCorundumOre = new SCOres().setBlockName("CorundumOre");
				blockEbonyOre = new SCOres().setBlockName("EbonyOre");
				blockOrichalcumOre = new SCOres().setBlockName("OrichalcumOre");
				blockMalachiteOre = new SCOres().setBlockName("MalachiteOre");
				blockMoonStoneOre = new SCOres().setBlockName("MoonStoneOre");
				blockQuickSilverOre = new SCOres().setBlockName("QuickSilverOre");
				
			//Weapons
				itemSteelDagger = new SCDaggers(steelDagger).setUnlocalizedName("SteelDagger");
				itemSteelSword = new SCSwords(steelSword).setUnlocalizedName("SteelSword");
				itemSteelWarAxe = new SCWarAxes(steelWarAxe).setUnlocalizedName("SteelWarAxe");
				itemSteelMace = new SCMaces(steelMace).setUnlocalizedName("SteelMace");
				itemSteelGreatSword = new SCGreatSwords(steelGreatSword).setUnlocalizedName("SteelGreatSword");
				itemSteelBattleAxe = new SCBattleAxes(steelBattleAxe).setUnlocalizedName("SteelBattleAxe");
				itemSteelWarHammer = new SCWarHammers(steelWarHammer).setUnlocalizedName("SteelWarHammer");
				
	
			//Armor
		
		
		
		//Registers
		
			//Items
				GameRegistry.registerItem(itemDaedraHeart, "DaedraHeart");
				GameRegistry.registerItem(itemLeatherStraps, "LeatherStraps");
			
			//Blocks
	
			//Ingots
				GameRegistry.registerItem(itemSilverIngot, "SilverIngot");
				GameRegistry.registerItem(itemCorundumIngot, "CorundumIngot");
				GameRegistry.registerItem(itemEbonyIngot, "EbonyIngot");
				GameRegistry.registerItem(itemOrichalcumIngot, "OrichalcumIngot");
				GameRegistry.registerItem(itemMalachiteIngot, "MalachiteIngot");
				GameRegistry.registerItem(itemMoonStoneIngot, "MoonStoneIngot");
				GameRegistry.registerItem(itemQuickSilverIngot, "QuickSilverIngot");
				GameRegistry.registerItem(itemSteelIngot, "SteelIngot");
				
			
			//Ores
				GameRegistry.registerBlock(blockSilverOre, "SilverOre");
				GameRegistry.registerBlock(blockCorundumOre, "CorundumOre");
				GameRegistry.registerBlock(blockEbonyOre, "EbonyOre");
				GameRegistry.registerBlock(blockOrichalcumOre, "OrichalcumOre");
				GameRegistry.registerBlock(blockMalachiteOre, "MalachiteOre");
				GameRegistry.registerBlock(blockMoonStoneOre, "MoonStoneOre");
				GameRegistry.registerBlock(blockQuickSilverOre, "QuickSilverOre");
				
			//Weapons
				GameRegistry.registerItem(itemSteelDagger, "SteelDagger");
				GameRegistry.registerItem(itemSteelSword, "SteelSword");
				GameRegistry.registerItem(itemSteelWarAxe, "SteelWarAxe");
				GameRegistry.registerItem(itemSteelMace, "SteelMace");
				GameRegistry.registerItem(itemSteelGreatSword, "SteelGreatSword");
				GameRegistry.registerItem(itemSteelBattleAxe, "SteelBattleAxe");
				GameRegistry.registerItem(itemSteelWarHammer, "SteelWarHammer");
	
			//Armor
				
			//Handlers
				GameRegistry.registerWorldGenerator(handler, 0);
		
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
	
		//Crafting Recipes
		
		
		//Smelting Recipes
		
			//Ores
				GameRegistry.addSmelting(blockSilverOre, new ItemStack(itemSilverIngot), 20);
				GameRegistry.addSmelting(blockCorundumOre, new ItemStack(itemCorundumIngot), 20);
				GameRegistry.addSmelting(blockEbonyOre, new ItemStack(itemEbonyIngot), 20);
				GameRegistry.addSmelting(blockOrichalcumOre, new ItemStack(itemOrichalcumIngot), 20);
				GameRegistry.addSmelting(blockMalachiteOre, new ItemStack(itemMalachiteIngot), 20);
				GameRegistry.addSmelting(blockMoonStoneOre, new ItemStack(itemMoonStoneIngot), 20);
				GameRegistry.addSmelting(blockQuickSilverOre, new ItemStack(itemQuickSilverIngot), 20);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent) {
		
	}
	
	public static CreativeTabs tabSkyrimCraftBlocks = new CreativeTabs("tabSkyrimCraftBlocks") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(Blocks.crafting_table).getItem();
		}
	};
	
	public static CreativeTabs tabSkyrimCraftItems = new CreativeTabs("tabSkyrimCraftItems") {
		@Override
		public Item getTabIconItem() {
			return Items.apple;
		}
	};
	
	public static CreativeTabs tabSkyrimCraftMaterials = new CreativeTabs("tabSkyrimCraftMaterials") {
		@Override
		public Item getTabIconItem() {
			return SkyrimCraft.itemCorundumIngot;
		}
	};
	
	public static CreativeTabs tabSkyrimCraftWeapons = new CreativeTabs("tabSkyrimCraftWeapons") {
		@Override
		public Item getTabIconItem() {
			return Items.diamond_sword;
		}
	};
}
