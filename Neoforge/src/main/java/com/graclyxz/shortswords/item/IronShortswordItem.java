
package com.graclyxz.shortswords.item;

import net.minecraft.world.item.*;

public class IronShortswordItem extends SwordItem {
	public IronShortswordItem() {
		super(Tiers.IRON, new Properties().attributes(createAttributes(Tiers.IRON, 2, -1.5f)));
	}
}
