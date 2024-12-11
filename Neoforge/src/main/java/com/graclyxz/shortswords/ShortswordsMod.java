package com.graclyxz.shortswords;

import com.graclyxz.shortswords.init.ModItems;
import com.graclyxz.shortswords.init.ModTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ShortswordsMod.MOD_ID)
public class ShortswordsMod {

    public static final String MOD_ID = "shortswords";

    public ShortswordsMod(IEventBus eventBus) {

        ModItems.init(eventBus);
        ModTab.init(eventBus);

    }
}