package com.wuppy.livemodding.items;

import com.wuppy.livemodding.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemLiveAxe extends ItemAxe 
{
	public ItemLiveAxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("liveAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
	}
}