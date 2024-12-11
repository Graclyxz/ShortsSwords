package com.graclyxz.shortswords;

import com.graclyxz.shortswords.init.ModItems;
import com.graclyxz.shortswords.init.ModTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MOD_ID)
public class ShortSwordsMod {
    public ShortSwordsMod(FMLJavaModLoadingContext context) {

        IEventBus eventBus = context.getModEventBus();

        Constants.LOG.info("Hello Forge world!");

        ModItems.register(eventBus);
        ModTab.register(eventBus);
    }
}