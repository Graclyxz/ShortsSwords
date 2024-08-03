package com.graclyxz.shortswords;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.common.MinecraftForge;

import com.graclyxz.shortswords.init.ShortswordsModTabs;
import com.graclyxz.shortswords.init.ShortswordsModItems;

@Mod("shortswords")
public class ShortswordsMod {
	public static final String MODID = "shortswords";

	public ShortswordsMod() {
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ShortswordsModItems.REGISTRY.register(bus);

		ShortswordsModTabs.REGISTRY.register(bus);
	}
}
