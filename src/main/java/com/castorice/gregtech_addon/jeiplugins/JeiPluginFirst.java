package com.castorice.gregtech_addon.jeiplugins;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@JeiPlugin
public class JeiPluginFirst implements IModPlugin {

    private static final ResourceLocation PLUGIN_UID = new ResourceLocation("gregtech_addon", "jei_plugin");

    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return PLUGIN_UID;
    }
}