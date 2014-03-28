package com.wuppy.cheesemodding.handler;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.wuppy.cheesemodding.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes
{

    /**
     * Adds the recipes.
     * Called in the preInit
     */
	public static void addRecipes() 
	{
        /**
         * A basic recipe. This requires 2 values: Output, an itemstack output, and an Object Array, of what the
         * recipe is.
         * Pretend the array as an crafting grid, where spaces are empty places.
         * All other chars can be any item assigned.
         */
		GameRegistry.addRecipe(new ItemStack(ModItems.cheesePickaxe), new Object[]
		{
			"XXX",
			" Y ",
			" Y ",
			'X', ModItems.cheeseIngot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.cheeseAxe), new Object[]
		{
			"XX",
			"XY",
			" Y",
			'X', ModItems.cheeseIngot, 'Y', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.cheeseAxe), new Object[]
		{
			"XX",
			"YX",
			"Y ",
			'X', ModItems.cheeseIngot, 'Y', Items.stick
		});

        /**
         * Shapeless recipes are the same as normal recipes, except that they dont have a layout.
         */
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cheeseIngot), new Object[]
		{
			Items.iron_ingot, new ItemStack(Items.dye, 1, 11)
		});
	}
}