package net.user12892.furniturecraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Furniturecraft_Items = new CreativeModeTab("FurniturecraftItems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRUSH.get());
        }
    };

    public static final CreativeModeTab Furniturecraft_Minerals = new CreativeModeTab("FurniturecraftMinerals") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

}
