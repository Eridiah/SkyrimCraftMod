package com.skyrimcraft.mod.proxy;

import net.minecraftforge.client.MinecraftForgeClient;

import com.skyrimcraft.mod.SkyrimCraft;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent postEvent) {
		super.postInit(postEvent);
	}
	
}
