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
        GameRegistry.addSmelting(new ItemStack(blocks.oreCopper, 1),new ItemStack(items.ingotCopper, 1),0.3f);
        GameRegistry.addSmelting(new ItemStack(items.dustCopper, 1),new ItemStack(items.ingotCopper, 1),0f);
        GameRegistry.addShapelessRecipe(new ItemStack(items.ingotCopper, 9), new Object[]{new ItemStack(blocks.blockCopper, 1)} );
        GameRegistry.addRecipe(new ItemStack(blocks.blockCopper, 1), new Object[]{"III","III","III", 'I', items.ingotCopper});
        GameRegistry.addSmelting(new ItemStack(blocks.oreTin, 1),new ItemStack(items.ingotTin, 1),0.3f);
        GameRegistry.addSmelting(new ItemStack(items.dustTin, 1),new ItemStack(items.ingotTin, 1),0f);
        GameRegistry.addShapelessRecipe(new ItemStack(items.ingotTin, 9), new Object[]{new ItemStack(blocks.blockTin, 1)} );
        GameRegistry.addRecipe(new ItemStack(blocks.blockTin, 1), new Object[]{"III","III","III", 'I', items.ingotTin});
    }
}
