
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.graclyxz.shortswords.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Item;

import com.graclyxz.shortswords.item.WoodenShortSwordItem;
import com.graclyxz.shortswords.item.StoneShortSwordItem;
import com.graclyxz.shortswords.item.NetheriteShortSwordItem;
import com.graclyxz.shortswords.item.IronShortswordItem;
import com.graclyxz.shortswords.item.GoldenShortSwordItem;
import com.graclyxz.shortswords.item.DiamontShortSwordItem;
import com.graclyxz.shortswords.ShortswordsMod;

public class ShortswordsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ShortswordsMod.MODID);
	public static final DeferredHolder<Item, Item> WOODEN_SHORT_SWORD = REGISTRY.register("wooden_short_sword", WoodenShortSwordItem::new);
	public static final DeferredHolder<Item, Item> STONE_SHORT_SWORD = REGISTRY.register("stone_short_sword", StoneShortSwordItem::new);
	public static final DeferredHolder<Item, Item> IRON_SHORTSWORD = REGISTRY.register("iron_shortsword", IronShortswordItem::new);
	public static final DeferredHolder<Item, Item> GOLDEN_SHORT_SWORD = REGISTRY.register("golden_short_sword", GoldenShortSwordItem::new);
	public static final DeferredHolder<Item, Item> DIAMONT_SHORT_SWORD = REGISTRY.register("diamont_short_sword", DiamontShortSwordItem::new);
	public static final DeferredHolder<Item, Item> NETHERITE_SHORT_SWORD = REGISTRY.register("netherite_short_sword", NetheriteShortSwordItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
