package com.skyrimcraft.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.skyrimcraft.mod.SkyrimCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCOres extends Block {

	public SCOres() {
		super(Material.rock);
		
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(SkyrimCraft.tabSkyrimCraftMaterials);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(SkyrimCraft.modID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
