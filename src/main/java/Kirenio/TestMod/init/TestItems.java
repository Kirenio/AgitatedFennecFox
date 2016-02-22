package Kirenio.TestMod.init;

import Kirenio.TestMod.Reference;
import Kirenio.TestMod.TestMod;
import Kirenio.TestMod.items.coordinates_module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TestItems {

    public static Item energy_cell;
    public static Item coordinates_module;

    public static void init(){
        energy_cell = new Item().setUnlocalizedName("energy_cell").setCreativeTab(TestMod.tabEnergy);
        coordinates_module = new coordinates_module().setUnlocalizedName("coordinates_module").setCreativeTab(TestMod.tabEnergy);
    }

    public static void register(){
        GameRegistry.registerItem(energy_cell, energy_cell.getUnlocalizedName().substring(5)); // Substring(5) will remove the "tile." from tile.energy_cell returned by .getUnlocalizedName()
        GameRegistry.registerItem(coordinates_module, coordinates_module.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(energy_cell);
        registerRender(coordinates_module);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
