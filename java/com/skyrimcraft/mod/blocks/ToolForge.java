package com.skyrimcraft.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.libs.Reference;
import com.skyrimcraft.mod.libs.SCDecs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ToolForge extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon toolForgeTop;
	
	public ToolForge() {
		super(Material.rock);
		
		this.setCreativeTab(SkyrimCraft.tabSkyrimCraftBlocks);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return side == 0 ? Blocks.cobblestone.getBlockTextureFromSide(side) : side == 1 ? this.toolForgeTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.modID + ":" + "ToolStationSide");
		this.toolForgeTop = iconRegister.registerIcon(Reference.modID + ":" + "ToolStationTop");
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c) {
		
		if(!player.isSneaking()) {
			player.openGui(SkyrimCraft.instance, SCDecs.guiIDToolForge, world, x, y, z);
			return true;
		}else {
			return false;
		}
	}
}
