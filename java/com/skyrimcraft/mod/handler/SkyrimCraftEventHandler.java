package com.skyrimcraft.mod.handler;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.skyrimcraft.mod.SkyrimCraft;
import com.skyrimcraft.mod.libs.SCDecs;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class SkyrimCraftEventHandler implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
			case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
			
			case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
			
			case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		
		}
		
	}

	private void generateEnd(World world, Random random, int x, int z) {
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		
		addOreSpawn(SCDecs.blockSilverOre, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 5, 30);
		addOreSpawn(SCDecs.blockCorundumOre, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 5, 5, 50);
		addOreSpawn(SCDecs.blockEbonyOre, 0, Blocks.stone, world, random, x, z, 16, 16, 4 + random.nextInt(4), 2, 2, 15);
		addOreSpawn(SCDecs.blockOrichalcumOre, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 3, 40);
		addOreSpawn(SCDecs.blockMalachiteOre, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 3, 2, 25);
		addOreSpawn(SCDecs.blockMoonStoneOre, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 1, 32);
		addOreSpawn(SCDecs.blockQuickSilverOre, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 3, 27);
		
	}

	private void generateNether(World world, Random random, int x, int z) {
		
	}
	
	public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		
		int maxPossY = minY + (maxY -1);
		assert maxY > minY;
		assert maxX > 0 && maxX <= 16;
		assert minY > 0;
		assert maxY < 256 && maxY > 0;
		assert maxZ > 0 && maxZ <= 16;
		
		int diffBtwnMinMaxY = maxY - minY;
		for(int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
		}
		
	}
	
}
