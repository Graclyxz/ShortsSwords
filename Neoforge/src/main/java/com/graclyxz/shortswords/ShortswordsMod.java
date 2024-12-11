package com.graclyxz.shortswords;


import com.graclyxz.shortswords.init.ModItems;
import com.graclyxz.shortswords.init.ModTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MOD_ID)
public class ShortSwordsMod {

    public ShortSwordsMod(IEventBus eventBus) {

        Constants.LOG.info("Hello NeoForge world!");

        ModItems.register(eventBus);
        ModTab.register(eventBus);

    }
}