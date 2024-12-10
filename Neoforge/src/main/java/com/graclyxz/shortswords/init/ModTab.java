package com.graclyxz.shortswords.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.graclyxz.shortswords.Constants.MOD_ID;

public class ModTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> TAB_SHORTS_SWORDS = TABS.register("tab_shortswords", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.NETHERITE_SHORT_SWORD.get()))
            .displayItems((features, event) -> {
                for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries())
                    event.accept(item.get());
            })
            .title(Component.translatable("item_group.shortswords.tab_shorts_swords"))
            .build());


    public static void register(IEventBus modEventBus) {
        TABS.register(modEventBus);
    }
}