package com.wuppy.cheesemodding.items;

import com.wuppy.cheesemodding.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemCheeseAxe extends ItemAxe
{
	public ItemCheeseAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("cheeseAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
	}
}
