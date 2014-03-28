package com.wuppy.cheesemodding.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.wuppy.cheesemodding.help.Reference;

public class ItemCheeseIngot extends Item
{
	public ItemCheeseIngot()
	{
		super();
		setUnlocalizedName("cheeseIngot");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
