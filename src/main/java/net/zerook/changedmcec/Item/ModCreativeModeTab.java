package net.zerook.changedmcec.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CHANGEDMCEC_TAB = new CreativeModeTab("changedmcectab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.POTATOCHIPS.get());
        }
    };
}
