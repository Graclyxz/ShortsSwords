
package com.graclyxz.shortswords.item;

import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.SwordItem;

public class GoldenShortSwordItem extends SwordItem {
	public GoldenShortSwordItem() {
		super(Tiers.GOLD, new Properties().attributes(createAttributes(Tiers.GOLD, 2, -1.5f)));
	}
}
