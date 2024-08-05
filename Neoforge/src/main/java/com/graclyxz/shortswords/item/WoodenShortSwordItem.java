
package com.graclyxz.shortswords.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class WoodenShortSwordItem extends SwordItem {
	public WoodenShortSwordItem() {
		super(Tiers.WOOD, new Properties().attributes(createAttributes(Tiers.WOOD, 2, -1.5f)));
	}
}
