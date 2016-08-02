package com.skyrimcraft.mod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.skyrimcraft.mod.SkyrimCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DaedraHeart extends Item {

	public DaedraHeart() {
		this.setCreativeTab(SkyrimCraft.tabSkyrimCraftItems);
	}
	
    public boolean hasEffect(ItemStack itemstack)
    {
        return true;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(SkyrimCraft.modID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
