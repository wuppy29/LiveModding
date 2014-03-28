package com.wuppy.cheesemodding.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.wuppy.cheesemodding.help.RegisterHelper;

public class ModItems 
{
    //non-functional items.
	public static Item cheeseIngot;
	
	//Tools
	public static Item cheesePickaxe;
	public static Item cheeseAxe;
	
	// Armor
	public static Item cheeseHelmet;
	
	//materials
	static ToolMaterial cheeseToolMaterial = EnumHelper.addToolMaterial("cheeseToolMaterial", 2, 750, 7, 2.0F, 20);
	static ArmorMaterial cheeseArmorMaterial = EnumHelper.addArmorMaterial("cheeseArmorMaterial", 20, new int[]{2, 6, 5, 2}, 20);

    /**
     * We call this in our main mod file.
     * We add all items here to the game.
     */
	public static void loadItems()
	{
		cheeseIngot = new ItemCheeseIngot();
		
		RegisterHelper.registerItem(cheeseIngot);
		
		//Tools
		cheesePickaxe = new ItemCheesePickaxe(cheeseToolMaterial);
		cheeseAxe = new ItemCheeseAxe(cheeseToolMaterial);
		
		RegisterHelper.registerItem(cheesePickaxe);
		RegisterHelper.registerItem(cheeseAxe);
		
		//Armor
		cheeseHelmet = new ItemCheeseArmor(cheeseArmorMaterial, 0, "cheeseHelmet");
		
		RegisterHelper.registerItem(cheeseHelmet);
	}
}
