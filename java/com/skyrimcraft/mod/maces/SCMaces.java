package com.skyrimcraft.mod.maces;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.libs.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCMaces extends ItemSword {

	public SCMaces(ToolMaterial material) {
		super(material);
		
		this.setFull3D();
		this.setCreativeTab(SkyrimCraft.tabSkyrimCraftWeapons);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Reference.modID + ":" + this.getUnlocalizedName().substring(5));
	}

}
