package com.skyrimcraft.mod.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.skyrimcraft.mod.container.ContainerToolForge;
import com.skyrimcraft.mod.gui.GuiToolForge;
import com.skyrimcraft.mod.libs.SCDecs;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		if(ID == SCDecs.guiIDToolForge) {
			return ID == SCDecs.guiIDToolForge && world.getBlock(x, y, z) == SCDecs.blockToolForge ? new ContainerToolForge(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		if(ID == SCDecs.guiIDToolForge) {
			return ID == SCDecs.guiIDToolForge && world.getBlock(x, y, z) == SCDecs.blockToolForge ? new GuiToolForge(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

}
