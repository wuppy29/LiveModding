package com.wuppy.cheesemodding.blocks;

import net.minecraft.block.Block;

import com.wuppy.cheesemodding.help.RegisterHelper;

public class ModBlocks 
{
	public static Block cheeseOre;
	
	public static void loadBlocks()
	{
		cheeseOre = new BlockCheeseOre();
		
		RegisterHelper.registerBlock(cheeseOre);
	}
}
