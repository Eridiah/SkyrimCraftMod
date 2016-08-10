package com.skyrimcraft.mod.messages;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;

import com.skyrimcraft.mod.IExtendedReach;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class MessageExtendedReachAttack implements IMessage {

	private int entityId;
	
	public MessageExtendedReachAttack() {
	}
	
	public MessageExtendedReachAttack(int entityId) {
		this.entityId = entityId;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		entityId = ByteBufUtils.readVarInt(buf, 4);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeVarInt(buf, entityId, 4);
	}
	
	public static class Handler implements IMessageHandler<MessageExtendedReachAttack, IMessage> {
		public IMessage onMessage(final MessageExtendedReachAttack message, MessageContext context) {
			final EntityPlayerMP player = (EntityPlayerMP) context.getServerHandler().playerEntity;
			Entity entity = player.worldObj.getEntityByID(message.entityId);
			if (player.getCurrentEquippedItem().getItem() instanceof IExtendedReach) {
					IExtendedReach theExtendedReachWeapon =
							(IExtendedReach)player.getCurrentEquippedItem().getItem();
					double distanceSq = player.getDistanceSqToEntity(entity);
					double reachSq = theExtendedReachWeapon.getReach()*
							theExtendedReachWeapon.getReach();
					if (reachSq >= distanceSq)
						player.attackTargetEntityWithCurrentItem(entity);
			}
			return null;
		}
	}
	
}
