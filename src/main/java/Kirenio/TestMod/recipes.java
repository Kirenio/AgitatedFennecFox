package Kirenio.TestMod;

import Kirenio.TestMod.init.blocks;
import Kirenio.TestMod.init.items;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class recipes {
    public static void initRecipes() {
        GameRegistry.addRecipe(new ItemStack(blocks.basic_injector), new Object[]{/*"I I"," I ", "I I", 'I', Items.iron_ingot*/"IHI", "RLR", "IQI", 'I', Items.iron_ingot, 'H', Blocks.hopper, 'R', Items.redstone, 'L', Blocks.lever, 'Q', Items.quartz});
        GameRegistry.addSmelting(new ItemStack(blocks.oreCopper, 1),new ItemStack(items.impureCopperIngot, 1),0.5f);
    }
}
