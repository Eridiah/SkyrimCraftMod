package com.skyrimcraft.mod.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentAbsorbHealth extends Enchantment {

	public EnchantmentAbsorbHealth(int id, int rarity) {
		super(id, rarity, EnumEnchantmentType.weapon);
		
		this.setName("absorbHealthEnchantment");
	}
	
	public int getMinEnchantability(int par1) {
		return 5 + (par1 - 1) * 10;
	}
	
	public int getMaxEnchantability(int par1) {
		return this.getMinEnchantability(par1) + 20;
	}
	
	public int getMaxLevel() {
		return 2;
	}

}
