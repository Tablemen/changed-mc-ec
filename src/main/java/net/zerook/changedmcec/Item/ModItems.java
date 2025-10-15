package net.zerook.changedmcec.Item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.zerook.changedmcec.ChangedMcExtraContent;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChangedMcExtraContent.MOD_ID);

    public static final RegistryObject<Item> POTATOCHIPS = ITEMS.register("potato_chips",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.CHANGEDMCEC_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(6) // how much hunger it restores
                            .saturationMod(0.8F) // how much saturation (like "filling" factor)
                            .build())));

    public static final RegistryObject<Item> LATEXPOTATOCHIPS = ITEMS.register("latex_potato_chips",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.CHANGEDMCEC_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(4) // how much hunger it restores
                            .saturationMod(1.4F) // how much saturation (like "filling" factor)
                            .build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
