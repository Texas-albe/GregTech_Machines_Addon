package com.castorice.gregtech_addon.events;

import net.minecraft.ChatFormatting;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "gregtech_machines_addon", value = Dist.CLIENT)
public class ClientEvents {
    static Component Link = Component.literal("This is a URL to Github.")
            .withStyle(ChatFormatting.DARK_RED)
            .withStyle(style -> style.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/Texas-albe/GregTech_Addon")));

    @SubscribeEvent
    public static void onClientLogin(ClientPlayerNetworkEvent.LoggingIn event) {
        LocalPlayer player = event.getPlayer();
        if (player != null) {
            player.sendSystemMessage(Component.literal("§6[GregTech Machines Addon]Created By Castorice."));
            player.sendSystemMessage(Link);
        }
    }
}
