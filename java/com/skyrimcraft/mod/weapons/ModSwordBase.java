package com.skyrimcraft.mod.weapons;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModSwordBase extends Item {
	
	private float float1;
	private final Item.ToolMaterial toolMaterial;

	public ModSwordBase(Item.ToolMaterial material) {
		
		toolMaterial = material;
		this.maxStackSize = 1;
		this.setMaxDamage(material.getMaxUses());
		this.float1 = 4.0F + material.getDamageVsEntity();
	}
	
	public float functionSword1() {
		return this.toolMaterial.getDamageVsEntity();
	}
	

    public float whatSwordCanBreak(ItemStack stack, Block block)
    {
        if (block == Blocks.web)
        {
            return 15.0F;
        }
        else
        {
            Material material = block.getMaterial();
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
        }
    }
	
    public boolean hitEntity(ItemStack stack, EntityLivingBase entity, EntityLivingBase entityLiving, EntityPlayer player) {
    	
    	stack.damageItem(1, entityLiving);
    	return true;
    }
    
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int i, int j, int k, EntityLivingBase entity) {
        if ((double)block.getBlockHardness(world, i, j, k) != 0.0D)
        {
            stack.damageItem(2, entity);
        }

        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
    
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.block;
    }
    
    public int getMaxItemUseDuration(ItemStack stack) {
        return 72000;
    }
    
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }
    
    public boolean isBlockWeb(Block block) {
        return block == Blocks.web;
    }
    
    public int getItemEnchantability() {
        return this.toolMaterial.getEnchantability();
    }
    
    public String getToolMaterialName() {
        return this.toolMaterial.toString();
    }
    
    public boolean getIsRepairable(ItemStack stack, ItemStack itemStack) {
        ItemStack mat = this.toolMaterial.getRepairItemStack();
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, itemStack, false)) return true;
        return super.getIsRepairable(stack, itemStack);
    }
    
    public Multimap getItemAttributeModifiers() {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.float1, 0));
        return multimap;
    }
    
}
