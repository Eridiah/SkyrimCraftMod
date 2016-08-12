package com.skyrimcraft.mod.libs;

import com.skyrimcraft.mod.SkyrimCraft;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ModWeapon extends ItemSword {

	private float weaponDamage;
	
	public ModWeapon(ToolMaterial material, float weaponDamage) {
		super(material);
		this.weaponDamage = weaponDamage + material.getDamageVsEntity();
		
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entity, EntityLivingBase entityLiving) {
		int i = EnchantmentHelper.getEnchantmentLevel(SkyrimCraft.shockEnchantment.effectId, stack);
		int j = EnchantmentHelper.getEnchantmentLevel(SkyrimCraft.meridiasRetribution.effectId, stack);
		int k = EnchantmentHelper.getEnchantmentLevel(SkyrimCraft.frostEnchantment.effectId, stack);
		int l = EnchantmentHelper.getEnchantmentLevel(SkyrimCraft.absorbHealthEnchantment.effectId, stack);
		
		if(i > 0) {
			entity.addPotionEffect(new PotionEffect(Potion.poison.id, 20 * i));
		}
		
		if(j > 0) {
			entity.setFire(3);
		}
		
		if(k > 0) {
			entity.addPotionEffect(new PotionEffect(Potion.poison.id, 20 * k));
		}
		
		if(l > 0) {
			entity.addPotionEffect(new PotionEffect(Potion.heal.id, 2 * l));
		}
		
		return true;
	}
	
}
