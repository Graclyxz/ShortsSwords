package com.graclyxz.shortswords.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.graclyxz.shortswords.ShortswordsMod;

public class ShortswordsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShortswordsMod.MODID);
	public static final RegistryObject<CreativeModeTab> TAB_SHORTS_SWORDS = REGISTRY.register("tab_shorts_swords",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shortswords.tab_shorts_swords")).icon(()
					-> new ItemStack(ShortswordsModItems.NETHERITE_SHORT_SWORD.get())).displayItems((parameters, tabData)
					-> {
				tabData.accept(ShortswordsModItems.WOODEN_SHORT_SWORD.get());
				tabData.accept(ShortswordsModItems.STONE_SHORT_SWORD.get());
				tabData.accept(ShortswordsModItems.IRON_SHORTSWORD.get());
				tabData.accept(ShortswordsModItems.GOLDEN_SHORT_SWORD.get());
				tabData.accept(ShortswordsModItems.DIAMONT_SHORT_SWORD.get());
				tabData.accept(ShortswordsModItems.NETHERITE_SHORT_SWORD.get());
			}).withSearchBar().build());
}
