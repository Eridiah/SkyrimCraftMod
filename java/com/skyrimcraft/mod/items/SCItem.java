package com.skyrimcraft.mod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.libs.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCItem extends Item {

	public SCItem() {
		this.setCreativeTab(SkyrimCraft.tabSkyrimCraftItems);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Reference.modID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
