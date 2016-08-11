package com.skyrimcraft.mod.libs;

import net.minecraft.item.ItemSword;

public class ModWeapon extends ItemSword {

	private float weaponDamage;
	
	public ModWeapon(ToolMaterial material, float weaponDamage) {
		super(material);
		this.weaponDamage = weaponDamage + material.getDamageVsEntity();
		
	}

}
