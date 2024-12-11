package com.graclyxz.shortswords.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ToolMaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static com.graclyxz.shortswords.ShortSwordsMod.MOD_ID;

public class ModItems {


    public static final List<Item> ITEMS = new ArrayList<>();

    public static final List<Item> SHORT_SWORDS = registerSwords("short_sword", new Item.Properties());

    public static Item registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        var itemReg = Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)),
                function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)))));
        ITEMS.add(itemReg);
        return itemReg;
    }

    private static List<Item> registerSwords(String name, Item.Properties itemProp) {
        return List.of(
                registerItem("wooden_" + name, (p) -> new SwordItem(ToolMaterial.WOOD,  2, -1.5f, p), itemProp),
                registerItem("stone_" + name, (p) -> new SwordItem(ToolMaterial.STONE,  2, -1.5f, p), itemProp),
                registerItem("iron_" + name , (p) -> new SwordItem(ToolMaterial.IRON,  2, -1.5f, p), itemProp),
                registerItem("golden_" + name, (p) -> new SwordItem(ToolMaterial.GOLD,  2, -1.5f, p), itemProp),
                registerItem( "diamont_" + name, (p) -> new SwordItem(ToolMaterial.DIAMOND,  2, -1.5f, p), itemProp),
                registerItem("netherite_" + name, (p) -> new SwordItem(ToolMaterial.NETHERITE,  2, -1.5f, p), itemProp.fireResistant())
        );
    }

    public static void init() {
    }

}
