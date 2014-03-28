package com.wuppy.livemodding.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.wuppy.livemodding.help.Reference;

public class ItemLiveIngot extends Item 
{
	public ItemLiveIngot()
	{
		super();
		setUnlocalizedName("liveIngot");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
