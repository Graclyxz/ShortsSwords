
package com.graclyxz.shortswords.item;

import net.minecraft.world.item.*;

public class DiamontShortSwordItem extends SwordItem {
	public DiamontShortSwordItem() {
		super(Tiers.DIAMOND, new Properties().attributes(createAttributes(Tiers.DIAMOND, 2, -1.5f)));
	}
}
