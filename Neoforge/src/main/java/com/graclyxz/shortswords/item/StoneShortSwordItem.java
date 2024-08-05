
package com.graclyxz.shortswords.item;

import net.minecraft.world.item.*;

public class StoneShortSwordItem extends SwordItem {
	public StoneShortSwordItem() {
		super(Tiers.STONE, new Properties().attributes(createAttributes(Tiers.STONE, 2, -1.5f)));
	}
}
