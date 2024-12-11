package com.graclyxz.shortswords;

import com.graclyxz.shortswords.init.ModItems;
import com.graclyxz.shortswords.init.ModTab;
import net.fabricmc.api.ModInitializer;

public class ShortSwordsMod implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");;

        ModItems.init();
        ModTab.init();
    }
}
