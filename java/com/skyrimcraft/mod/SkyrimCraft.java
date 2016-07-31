package com.skyrimcraft.mod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.skyrimcraft.mod.blocks.SCOres;
import com.skyrimcraft.mod.handler.SkyrimCraftEventHandler;
import com.skyrimcraft.mod.items.SCIngots;
import com.skyrimcraft.mod.proxy.CommonProxy;

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
	
	SkyrimCraftEventHandler handler = new SkyrimCraftEventHandler();
	
	//Declarations
	
		//Items
	
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
	
		//Armor
	
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent) {
		
		//Initializations
		
			//Items
			
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
	
			//Armor
		
		
		
		//Registers
		
			//Items
			
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
			return SkyrimCraft.itemSilverIngot;
		}
	};
	
	public static CreativeTabs tabSkyrimCraftWeapons = new CreativeTabs("tabSkyrimCraftWeapons") {
		@Override
		public Item getTabIconItem() {
			return Items.diamond_sword;
		}
	};
}
