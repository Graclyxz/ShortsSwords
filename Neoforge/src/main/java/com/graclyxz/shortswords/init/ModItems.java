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

import java.util.List;
import java.util.function.Function;

import static com.graclyxz.shortswords.ShortswordsMod.MOD_ID;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final List<DeferredItem<Item>> SHORT_SWORDS = registerTools("short_sword", new Item.Properties());

    public static DeferredItem<Item> registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        return ITEMS.register(name, () -> function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
    }

    private static List<DeferredItem<Item>> registerTools(String name, Item.Properties itemProp) {
        return List.of(
                registerItem("wooden_" + name, (p) -> new SwordItem(ToolMaterial.WOOD,  2, -1.5f, p), itemProp),
                registerItem("stone_" + name, (p) -> new SwordItem(ToolMaterial.STONE,  2, -1.5f, p), itemProp),
                registerItem("iron_" + name , (p) -> new SwordItem(ToolMaterial.IRON,  2, -1.5f, p), itemProp),
                registerItem("golden_" + name, (p) -> new SwordItem(ToolMaterial.GOLD,  2, -1.5f, p), itemProp),
                registerItem( "diamont_" + name, (p) -> new SwordItem(ToolMaterial.DIAMOND,  2, -1.5f, p), itemProp),
                registerItem("netherite_" + name, (p) -> new SwordItem(ToolMaterial.NETHERITE,  2, -1.5f, p), itemProp.fireResistant())
        );
    }

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
