package com.castorice.gregtech_addon;

import com.castorice.gregtech_addon.foods.ToastBread;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GregTechAddon.MOD_ID)
public class GregTechAddon {
    public static final String MOD_ID = "gregtech_addon";

    public GregTechAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ToastBread.ITEMS.register(modEventBus);
    }
}