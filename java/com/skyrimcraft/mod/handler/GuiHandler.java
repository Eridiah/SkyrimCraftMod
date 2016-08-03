package com.skyrimcraft.mod.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.skyrimcraft.mod.container.ContainerSmeltery;
import com.skyrimcraft.mod.container.ContainerToolForge;
import com.skyrimcraft.mod.gui.GuiSmeltery;
import com.skyrimcraft.mod.gui.GuiToolForge;
import com.skyrimcraft.mod.libs.SCDecs;
import com.skyrimcraft.mod.tileentity.TileEntitySmeltery;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case SCDecs.guiIDSmeltery:
				if(entity instanceof TileEntitySmeltery) {
					return new ContainerSmeltery(player.inventory, (TileEntitySmeltery) entity);
				}
				return null;
			}
		}
		
		if(ID == SCDecs.guiIDToolForge) {
			return ID == SCDecs.guiIDToolForge && world.getBlock(x, y, z) == SCDecs.blockToolForge ? new ContainerToolForge(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case SCDecs.guiIDSmeltery:
				if(entity instanceof TileEntitySmeltery) {
					return new GuiSmeltery(player.inventory, (TileEntitySmeltery) entity);
				}
			}
		}
		
		if(ID == SCDecs.guiIDToolForge) {
			return ID == SCDecs.guiIDToolForge && world.getBlock(x, y, z) == SCDecs.blockToolForge ? new GuiToolForge(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

}
