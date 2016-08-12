package com.skyrimcraft.mod.special_weapons;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.creativetabs.SkyrimCraftTabs;
import com.skyrimcraft.mod.libs.ModWeapon;
import com.skyrimcraft.mod.libs.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Chillrend extends ModWeapon {

	public Chillrend(ToolMaterial material) {
		super(material, 5.0F);
		
		this.setCreativeTab(SkyrimCraftTabs.tabSkyrimCraftWeapons);
	}
	
	public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
		super.onUpdate(stack, world, entity, i, bool);
		
		if(stack.isItemEnchanted() == false) {
			stack.addEnchantment(SkyrimCraft.frostEnchantment, 2);
			super.onUpdate(stack, world, entity, i, bool);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Reference.modID + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
