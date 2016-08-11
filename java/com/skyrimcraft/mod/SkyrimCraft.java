package com.skyrimcraft.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.skyrimcraft.mod.crafting.CraftingRecipes;
import com.skyrimcraft.mod.crafting.RecipeRemover;
import com.skyrimcraft.mod.crafting.SmeltingRecipes;
import com.skyrimcraft.mod.handler.GuiHandler;
import com.skyrimcraft.mod.handler.SkyrimCraftEventHandler;
import com.skyrimcraft.mod.libs.Reference;
import com.skyrimcraft.mod.libs.SCDecs;
import com.skyrimcraft.mod.libs.SCInits;
import com.skyrimcraft.mod.libs.SCRegisters;
import com.skyrimcraft.mod.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.modID, version = Reference.version, name = Reference.modName)
public class SkyrimCraft {
	
	@SidedProxy(clientSide = "com.skyrimcraft.mod.proxy.ClientProxy", serverSide = "com.skyrimcraft.mod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Reference.modID)
	public static SkyrimCraft instance;
	SkyrimCraftEventHandler handler = new SkyrimCraftEventHandler();
	
	public static SimpleNetworkWrapper network;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent) {
		SCInits.initItems();
		SCInits.initBlocks();
		SCRegisters.itemRegisters();
		SCRegisters.blockRegisters();
		SCRegisters.weaponRegisters();
		proxy.preInit(preEvent);
		GameRegistry.registerWorldGenerator(handler, 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		CraftingRecipes.craftingRecipes();
		SmeltingRecipes.smeltingRecipes();
		RecipeRemover.RemoveVanillaRecipes();
		RecipeRemover.RemoveChestRecipes();
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent) {
		proxy.postInit(postEvent);
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
}
