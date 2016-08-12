package com.skyrimcraft.mod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

import com.skyrimcraft.mod.creativetabs.SkyrimCraftTabs;
import com.skyrimcraft.mod.libs.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DaedraHeart extends ItemFood {

	public DaedraHeart(int food, float saturation, boolean wolfFood) {
		super(food, saturation, wolfFood);
		this.setPotionEffect(Potion.poison.id, 5, 0, 0.7F);
		this.setCreativeTab(SkyrimCraftTabs.tabSkyrimCraftItems);
	}
	
    public boolean hasEffect(ItemStack itemstack)
    {
        return true;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Reference.modID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
