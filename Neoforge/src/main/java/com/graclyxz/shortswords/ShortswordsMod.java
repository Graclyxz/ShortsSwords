package com.graclyxz.shortswords;


import com.graclyxz.shortswords.init.ModItems;
import com.graclyxz.shortswords.init.ModTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ShortSwordsMod {

    public ShortSwordsMod(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        Constants.LOG.info("Hello NeoForge world!");
        //CommonClass.init();

        ModItems.register(eventBus);
        ModTab.register(eventBus);

    }
}