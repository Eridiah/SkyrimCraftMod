package com.skyrimcraft.mod.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.crafting.CraftingRecipes;
import com.skyrimcraft.mod.crafting.RecipeRemover;
import com.skyrimcraft.mod.crafting.SmeltingRecipes;
import com.skyrimcraft.mod.handler.ModifiedAttackHandler;
import com.skyrimcraft.mod.libs.Reference;
import com.skyrimcraft.mod.libs.SCInits;
import com.skyrimcraft.mod.libs.SCRegisters;
import com.skyrimcraft.mod.messages.MessageExtendedReachAttack;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preEvent) {
		
	}
	
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(ModifiedAttackHandler.INSTANCE);
		SkyrimCraft.network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.NETWORK_CHANNEL_NAME);
		int packetId = 0;
		SkyrimCraft.network.registerMessage(MessageExtendedReachAttack.Handler.class,
				MessageExtendedReachAttack.class, packetId++, Side.SERVER);
		
	}
	
	public void postInit(FMLPostInitializationEvent postEvent) {
		
	}
	
}
