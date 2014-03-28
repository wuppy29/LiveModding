package com.wuppy.livemodding.blocks;

import com.wuppy.livemodding.help.Reference;
import com.wuppy.livemodding.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockLiveOre extends Block
{
	public BlockLiveOre()
	{
		super(Material.rock);
		setBlockName("liveOre");
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
		return ModItems.liveIngot;
    }
}
