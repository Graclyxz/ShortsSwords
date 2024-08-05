
package com.graclyxz.shortswords.item;

import net.minecraft.world.item.*;

public class NetheriteShortSwordItem extends SwordItem {
	public NetheriteShortSwordItem() {
		super(Tiers.NETHERITE, new Properties().attributes(createAttributes(Tiers.NETHERITE, 2, -1.5f)));
	}
}
