package com.wuppy.livemodding.items;

import com.wuppy.livemodding.help.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * ItemLiveArmor
 *
 * This is the armor.
 */
public class ItemLiveArmor extends ItemArmor
{
	public ItemLiveArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

    /**
     * This method returns what file MC should use, to render the armor (make it visible from above).
     */
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.liveHelmet)
		{
			return Reference.MODID + ":models/armor/livearmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemLiveArmor");
			return null;
		}
	}
}