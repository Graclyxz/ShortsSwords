package com.graclyxz.shortswords;

import com.graclyxz.shortswords.init.ModItems;
import com.graclyxz.shortswords.init.ModTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ShortswordsMod.MOD_ID)
public class ShortswordsMod {

    public static final String MOD_ID = "shortswords";

    public ShortswordsMod(FMLJavaModLoadingContext context) {

        IEventBus eventBus = context.getModEventBus();

        ModItems.register(eventBus);
        ModTab.register(eventBus);
    }
}