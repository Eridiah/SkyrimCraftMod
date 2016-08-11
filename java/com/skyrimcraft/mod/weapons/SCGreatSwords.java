package com.skyrimcraft.mod.weapons;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.libs.ModWeapon;
import com.skyrimcraft.mod.libs.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCGreatSwords extends ModWeapon {

	public SCGreatSwords(ToolMaterial material) {
		super(material, 8.5F);
		
		this.setFull3D();
		this.setCreativeTab(SkyrimCraft.tabSkyrimCraftWeapons);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Reference.modID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
