package com.graclyxz.shortswords.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.graclyxz.shortswords.ShortSwordsMod.MOD_ID;


public class ModTab {

    public static final CreativeModeTab TAB_SHORTS_SWORDS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.SHORT_SWORDS.get(5)))
            .displayItems((features, event) -> {
                for (Item item : ModItems.ITEMS)
                    event.accept(item);
            })
            .title(Component.translatable("item_group.shortswords.tab_shorts_swords"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "tab_shortswords"), TAB_SHORTS_SWORDS);
    }
}