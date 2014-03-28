package com.wuppy.livemodding;

import com.wuppy.livemodding.blocks.ModBlocks;
import com.wuppy.livemodding.handler.ModRecipes;
import com.wuppy.livemodding.help.Reference;
import com.wuppy.livemodding.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * This @Mod annotation tells forge that we are creating a new mod. Without this, forge wont
 * find your mod. This takes 2 values, a modid, which is a "name" for your mod. This cant be the
 * same for ANY mod. So find a name which is new. Version is the current mod version.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class LiveModding 
{

    /**
     * This is where you can add your own stuff.
     * In the preInit, you add stuff like blocks, items, recipes, etc.
     * Basically everything needed before the world starts playing.
     * @param event
     */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
        //Block handlers, handles all blocks
		ModBlocks.loadBlocks();

        //Item handlers, handles all items
		ModItems.loadItems();

        //Register handler, adds all the recipes
		ModRecipes.addRecipes();
	}
}