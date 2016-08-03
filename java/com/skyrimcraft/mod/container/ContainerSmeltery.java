package com.skyrimcraft.mod.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

import com.skyrimcraft.mod.slots.SlotSmeltery;
import com.skyrimcraft.mod.tileentity.TileEntitySmeltery;

public class ContainerSmeltery extends Container {

	private TileEntitySmeltery furnace;
	private int dualCookTime;
	private int dualPower;
	private int lastItemBurnTime;
	
	public ContainerSmeltery(InventoryPlayer invPlayer, TileEntitySmeltery teBlastFurnace) {
		dualCookTime = 0;
		dualPower = 0;
		lastItemBurnTime = 0;
		
		furnace = teBlastFurnace;
		
		this.addSlotToContainer(new Slot(teBlastFurnace, 0, 37, 16));
		this.addSlotToContainer(new Slot(teBlastFurnace, 1, 37, 54));
		this.addSlotToContainer(new Slot(teBlastFurnace, 2, 9, 57));
		this.addSlotToContainer(new SlotSmeltery(invPlayer.player, teBlastFurnace, 3, 116, 35));
		
		
		//Inventory
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		
		//Action Bar
		for(int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
	}
	
	public void addCraftingToCrafters(ICrafting crafting) {
		super.addCraftingToCrafters(crafting);
		crafting.sendProgressBarUpdate(this, 0, this.furnace.dualCookTime);
		crafting.sendProgressBarUpdate(this, 1, this.furnace.dualPower);
	}
	
	public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (p_82846_2_ != 1 && p_82846_2_ != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (p_82846_2_ >= 3 && p_82846_2_ < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (p_82846_2_ >= 30 && p_82846_2_ < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(p_82846_1_, itemstack1);
        }

        return itemstack;
    }

	@Override
	public boolean canInteractWith(EntityPlayer player) {	
		return furnace.isUseableByPlayer(player);
	}

	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		
		for(int i = 0; i < this.crafters.size(); i++) {
			ICrafting par1 = (ICrafting)this.crafters.get(i);
			
			if(this.dualCookTime != this.furnace.dualCookTime) {
				par1.sendProgressBarUpdate(this, 0, this.furnace.dualCookTime);
			}
			
			if(this.dualCookTime != this.furnace.dualPower) {
				par1.sendProgressBarUpdate(this, 1, this.furnace.dualPower);
			}
		}
		this.dualCookTime = this.furnace.dualCookTime;
		this.dualPower = this.furnace.dualPower;
	}
	
	public void updateProgressBar(int i, int j) {
		if(i == 0) {
			furnace.dualCookTime = j;
		}
		
		if(i == 1) {
			furnace.dualPower = j;
		}
	}
	
}
