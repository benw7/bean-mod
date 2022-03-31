package co.uk.jsbeansoc.beanmod.item;

import co.uk.jsbeansoc.beanmod.BeanMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeanMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> BAKED_BEAN = ITEMS.register("baked_bean", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
}
