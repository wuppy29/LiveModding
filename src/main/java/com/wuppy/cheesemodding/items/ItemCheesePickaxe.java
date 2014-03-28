package com.wuppy.cheesemodding.items;

import com.wuppy.cheesemodding.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemCheesePickaxe extends ItemPickaxe
{
	public ItemCheesePickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("cheesePickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
	}
}
