package com.graclyxz.shortswords;

import com.graclyxz.shortswords.init.ModItems;
import com.graclyxz.shortswords.init.ModTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ShortSwordsMod {
    public ShortSwordsMod(FMLJavaModLoadingContext context) {

        IEventBus eventBus = context.getModEventBus();

        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.

        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();

        ModItems.register(eventBus);
        ModTab.register(eventBus);
    }
}