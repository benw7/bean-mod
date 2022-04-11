package co.uk.jsbeansoc.beanmod.item;

import net.minecraft.command.arguments.ItemParser;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup BEAN_GROUP = new ItemGroup("beanModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack((ModItems.BAKED_BEAN.get()));
        }
    };
}
