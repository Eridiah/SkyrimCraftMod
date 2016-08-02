package com.skyrimcraft.mod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.util.EnumHelper;

import com.skyrimcraft.mod.battleaxes.SCBattleAxes;
import com.skyrimcraft.mod.blocks.SCOres;
import com.skyrimcraft.mod.crafting.CraftingRecipes;
import com.skyrimcraft.mod.crafting.RecipeRemover;
import com.skyrimcraft.mod.crafting.SmeltingRecipes;
import com.skyrimcraft.mod.daggers.SCDaggers;
import com.skyrimcraft.mod.greatswords.SCGreatSwords;
import com.skyrimcraft.mod.handler.SkyrimCraftEventHandler;
import com.skyrimcraft.mod.items.DaedraHeart;
import com.skyrimcraft.mod.items.SCIngots;
import com.skyrimcraft.mod.items.SCItem;
import com.skyrimcraft.mod.libs.Reference;
import com.skyrimcraft.mod.libs.SCDecs;
import com.skyrimcraft.mod.libs.SCInits;
import com.skyrimcraft.mod.libs.SCRegisters;
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

@Mod(modid = Reference.modID, version = Reference.version, name = Reference.modName)
public class SkyrimCraft {
	
	@SidedProxy(clientSide = "com.skyrimcraft.mod.proxy.ClientProxy", serverSide = "com.skyrimcraft.mod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Reference.modID)
	public static SkyrimCraft instance;
	
	SkyrimCraftEventHandler handler = new SkyrimCraftEventHandler();
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent) {
		
		SCInits.initItems();
		SCInits.initBlocks();
		SCRegisters.itemRegisters();
		SCRegisters.blockRegisters();
		SCRegisters.weaponRegisters();
		GameRegistry.registerWorldGenerator(handler, 0);
		
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		CraftingRecipes.craftingRecipes();
		SmeltingRecipes.smeltingRecipes();
		
		RecipeRemover.RemoveVanillaRecipes();
		RecipeRemover.RemoveChestRecipes();
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
			return SCDecs.itemDaedraHeart;
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
}
