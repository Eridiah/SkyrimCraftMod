package com.skyrimcraft.mod.libs;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.weapons.ModSwordBase;

public class ModWeapon extends ModSwordBase {

	private float weaponDamage;
	
	public ModWeapon(ToolMaterial material, float weaponDamage) {
		super(material);
		this.weaponDamage = weaponDamage + material.getDamageVsEntity();
		
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entity, EntityLivingBase entityLiving, EntityPlayer player) {
		int i = EnchantmentHelper.getEnchantmentLevel(SkyrimCraft.shockEnchantment.effectId, stack);
		int j = EnchantmentHelper.getEnchantmentLevel(SkyrimCraft.meridiasRetribution.effectId, stack);
		int k = EnchantmentHelper.getEnchantmentLevel(SkyrimCraft.frostEnchantment.effectId, stack);
		
		if(i > 0) {
			entity.addPotionEffect(new PotionEffect(Potion.poison.id, 20 * i));
		}
		
		if(j > 0) {
			entity.setFire(3);
		}
		
		if(k > 0) {
			entity.addPotionEffect(new PotionEffect(Potion.poison.id, 20 * k));
		}
		
		return true;
	}
	
}
