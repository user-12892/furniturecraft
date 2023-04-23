package net.user12892.furniturecraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.user12892.furniturecraft.Furniturecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Furniturecraft.MOD_ID);

    public static final RegistryObject<Item> PAINTBRUSH  = ITEMS.register("paintbrush",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Furniturecraft_Items)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Furniturecraft_Minerals)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
