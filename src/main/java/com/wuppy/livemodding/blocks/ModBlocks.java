package com.wuppy.livemodding.blocks;

import net.minecraft.block.Block;

import com.wuppy.livemodding.help.RegisterHelper;

public class ModBlocks 
{
	public static Block liveOre;
	
	public static void loadBlocks()
	{
		liveOre = new BlockLiveOre();
		
		RegisterHelper.registerBlock(liveOre);
	}
}
