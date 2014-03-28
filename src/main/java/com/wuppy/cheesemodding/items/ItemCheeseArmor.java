package com.wuppy.cheesemodding.items;

import com.wuppy.cheesemodding.help.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * ItemCheeseArmor
 *
 * This is the armor.
 */
public class ItemCheeseArmor extends ItemArmor
{
	public ItemCheeseArmor(ArmorMaterial material, int armorType, String name)
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
		if(stack.getItem() == ModItems.cheeseHelmet)
		{
			return Reference.MODID + ":models/armor/cheesearmor1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemCheeseArmor");
			return null;
		}
	}
}