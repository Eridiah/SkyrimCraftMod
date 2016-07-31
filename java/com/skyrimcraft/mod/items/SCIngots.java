package com.skyrimcraft.mod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import com.skyrimcraft.mod.SkyrimCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCIngots extends Item {

	public SCIngots() {
		
		this.setCreativeTab(SkyrimCraft.tabSkyrimCraftMaterials);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(SkyrimCraft.modID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
