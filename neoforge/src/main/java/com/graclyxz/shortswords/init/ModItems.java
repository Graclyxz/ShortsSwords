package com.graclyxz.shortswords.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.graclyxz.shortswords.Constants.MOD_ID;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);


    public static final DeferredItem<SwordItem> WOODEN_SHORT_SWORD = ITEMS.register("wooden_short_sword",
            () -> new SwordItem(ToolMaterial.WOOD, 2, -1.5f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "wooden_short_sword")))));

    public static final DeferredItem<SwordItem> STONE_SHORT_SWORD = ITEMS.register("stone_short_sword",
            () -> new SwordItem(ToolMaterial.STONE, 2, -1.5f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "stone_short_sword")))));

    public static final DeferredItem<SwordItem> IRON_SHORT_SWORD = ITEMS.register("iron_short_sword",
            () -> new SwordItem(ToolMaterial.IRON, 2, -1.5f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "iron_short_sword")))));

    public static final DeferredItem<SwordItem> GOLDEN_SHORT_SWORD = ITEMS.register("golden_short_sword",
            () -> new SwordItem(ToolMaterial.GOLD, 2, -1.5f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "golden_short_sword")))));

    public static final DeferredItem<SwordItem> DIAMONT_SHORT_SWORD = ITEMS.register("diamont_short_sword",
            () -> new SwordItem(ToolMaterial.DIAMOND, 2, -1.5f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "diamont_short_sword")))));

    public static final DeferredItem<SwordItem> NETHERITE_SHORT_SWORD = ITEMS.register("netherite_short_sword",
            () -> new SwordItem(ToolMaterial.NETHERITE, 2, -1.5f, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "netherite_short_sword")))
                    .fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
