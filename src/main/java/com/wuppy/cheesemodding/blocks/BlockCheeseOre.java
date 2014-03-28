package com.wuppy.cheesemodding.blocks;

import com.wuppy.cheesemodding.help.Reference;
import com.wuppy.cheesemodding.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCheeseOre extends Block
{
	public BlockCheeseOre()
	{
		super(Material.rock);
		setBlockName("cheeseOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
	}

    /**
     * Determines what item is dropped when broken
     * */
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
    {
		return ModItems.cheeseIngot;
    }
}
