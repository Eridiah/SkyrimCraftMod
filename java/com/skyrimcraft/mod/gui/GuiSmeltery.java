package com.skyrimcraft.mod.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.skyrimcraft.mod.container.ContainerSmeltery;
import com.skyrimcraft.mod.libs.Reference;
import com.skyrimcraft.mod.tileentity.TileEntitySmeltery;

public class GuiSmeltery extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(Reference.modID + ":" + "/textures/gui/SmelteryGui.png");
	private TileEntitySmeltery blastFurnace;

	public GuiSmeltery(InventoryPlayer invPlayer, TileEntitySmeltery teBlastFurnace) {
		super(new ContainerSmeltery(invPlayer, teBlastFurnace));
		blastFurnace = teBlastFurnace;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		String name = this.blastFurnace.hasCustomInventoryName() ? this.blastFurnace.getInventoryName() : I18n.format(this.blastFurnace.getInventoryName());
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 5, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if(blastFurnace.hasPower()) {
			int i1 = blastFurnace.getPowerRemainingScaled(47);
			drawTexturedModalRect(guiLeft + 9, guiTop + 54 - i1, 176, 63 - i1, 16, i1);
		}
		
		int j1 = blastFurnace.getFurnaceProgressScaled(48);
		drawTexturedModalRect(guiLeft + 56, guiTop + 34, 176, 0, j1 + 1, 17);
	}
	
}
