package com.graclyxz.shortswords;

import com.graclyxz.shortswords.init.ModItems;
import com.graclyxz.shortswords.init.ModTab;
import net.fabricmc.api.ModInitializer;

public class ShortSwordsMod implements ModInitializer {

    public static final String MOD_ID = "shortswords";

    @Override
    public void onInitialize() {
        ModItems.init();
        ModTab.init();
    }
}
