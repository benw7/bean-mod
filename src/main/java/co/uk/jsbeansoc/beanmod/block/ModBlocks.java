package co.uk.jsbeansoc.beanmod.block;

import co.uk.jsbeansoc.beanmod.BeanMod;
import co.uk.jsbeansoc.beanmod.block.custom.TomatoPlant;
import co.uk.jsbeansoc.beanmod.item.ModItemGroup;
import co.uk.jsbeansoc.beanmod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,BeanMod.MOD_ID);

    public static final RegistryObject<Block> BEAN_BLOCK = registerBlock("bean_block",() -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block>TOMATO_PLANT = BLOCKS.register("tomato_plant",()-> new TomatoPlant(AbstractBlock.Properties.from((Blocks.WHEAT))));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.BEAN_GROUP)));
    }
    public static void register(IEventBus eventBus){
       BLOCKS.register(eventBus);
    }
}
