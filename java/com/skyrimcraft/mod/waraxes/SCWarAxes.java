package com.skyrimcraft.mod.waraxes;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

import com.skyrimcraft.mod.SkyrimCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCWarAxes extends ItemSword {

	public SCWarAxes(ToolMaterial material) {
		super(material);
		
		this.setFull3D();
		this.setCreativeTab(SkyrimCraft.tabSkyrimCraftWeapons);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(SkyrimCraft.modID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}