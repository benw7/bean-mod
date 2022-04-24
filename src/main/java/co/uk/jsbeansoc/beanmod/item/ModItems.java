package co.uk.jsbeansoc.beanmod.item;

import co.uk.jsbeansoc.beanmod.BeanMod;
import co.uk.jsbeansoc.beanmod.block.ModBlocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeanMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> BAKED_BEAN = ITEMS.register("baked_bean", () -> new Item(new Item.Properties().group(ModItemGroup.BEAN_GROUP)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(new Food.Builder().hunger(1).saturation(1).fastToEat().build()).maxStackSize(16).group(ModItemGroup.BEAN_GROUP)));
    public static final RegistryObject<Item> TOMATO_SAUCE = ITEMS.register("tomato_sauce", () -> new Item(new Item.Properties().group(ModItemGroup.BEAN_GROUP)));

    public static final RegistryObject<Item> TIN_CAN = ITEMS.register("tin_can", () -> new Item(new Item.Properties().maxStackSize(16).group(ModItemGroup.BEAN_GROUP)));
    public static final RegistryObject<Item> BEANS_CAN = ITEMS.register("beans_can", () -> new Item(new Item.Properties().food(new Food.Builder().hunger(4).saturation(2).fastToEat().build()).maxStackSize(16).group(ModItemGroup.BEAN_GROUP)));

    public static final RegistryObject<Item> BEAN_STALK = ITEMS.register("bean_stalk", () -> new Item(new Item.Properties().group(ModItemGroup.BEAN_GROUP)));


    public static final RegistryObject<Item> RAW_BEAN = ITEMS.register("raw_bean", () -> new BlockItem(ModBlocks.RAW_BEAN.get() ,new Item.Properties().group(ModItemGroup.BEAN_GROUP)));
    public static final RegistryObject<Item> TOMATO_PLANT = ITEMS.register("tomato_plant", () -> new BlockItem(ModBlocks.TOMATO_PLANT.get(), new Item.Properties().group(ModItemGroup.BEAN_GROUP)));

    public static final RegistryObject<Item> BEAN_HELMET = ITEMS.register("bean_helmet", () -> new ArmorItem(ModArmorMaterial.BEAN, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroup.BEAN_GROUP)));
    public static final RegistryObject<Item> BEAN_BOOTS = ITEMS.register("bean_boots", () -> new ArmorItem(ModArmorMaterial.BEAN, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroup.BEAN_GROUP)));
    public static final RegistryObject<Item> BEAN_CHESTPLATE = ITEMS.register("bean_chestplate", () -> new ArmorItem(ModArmorMaterial.BEAN, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroup.BEAN_GROUP)));
    public static final RegistryObject<Item> BEAN_LEGGINGS = ITEMS.register("bean_leggings", () -> new ArmorItem(ModArmorMaterial.BEAN, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroup.BEAN_GROUP)));

}
