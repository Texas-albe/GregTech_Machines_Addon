package com.castorice.gregtech_addon.foods;

import com.castorice.gregtech_addon.GregTechAddon;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToastBread {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GregTechAddon.MOD_ID);

    public static final RegistryObject<Item> TOAST_BREAD = ITEMS.register("toast_bread",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationMod(0.8F)
                            .build()
                    )
            ));
}