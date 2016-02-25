package Kirenio.TestMod.init;

import Kirenio.TestMod.Reference;
import Kirenio.TestMod.TestMod;
import Kirenio.TestMod.items.coordinates_module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class items {

    public static Item energy_cell;
    public static Item coordinates_module;
    public static Item impureCopperIngot;
    public static Item ingotCopper;
    public static Item dustCopper;
    public static Item ingotTin;
    public static Item dustTin;

    public static void init(){
        ingotCopper = new Item().setUnlocalizedName("ingotCopper").setCreativeTab(TestMod.tabEnergy);
        dustCopper = new Item().setUnlocalizedName("dustCopper").setCreativeTab(TestMod.tabEnergy);
        ingotTin = new Item().setUnlocalizedName("ingotTin").setCreativeTab(TestMod.tabEnergy);
        dustTin = new Item().setUnlocalizedName("dustTin").setCreativeTab(TestMod.tabEnergy);
        impureCopperIngot = new Item().setUnlocalizedName("impureCopperIngot").setCreativeTab(TestMod.tabEnergy);
        energy_cell = new Item().setUnlocalizedName("energy_cell").setCreativeTab(TestMod.tabEnergy);
        coordinates_module = new coordinates_module().setUnlocalizedName("coordinates_module").setCreativeTab(TestMod.tabEnergy);
    }

    public static void register(){
        GameRegistry.registerItem(ingotCopper, ingotCopper.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(dustCopper, dustCopper.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ingotTin, ingotTin.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(dustTin, dustTin.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(energy_cell, energy_cell.getUnlocalizedName().substring(5)); // Substring(5) will remove the "tile." from tile.energy_cell returned by .getUnlocalizedName()
        GameRegistry.registerItem(coordinates_module, coordinates_module.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(impureCopperIngot, impureCopperIngot.getUnlocalizedName().substring(5));
    }

    public static void registerOreDict(){
        OreDictionary.registerOre("ingotCopper", ingotCopper);
        OreDictionary.registerOre("dustCopper", dustCopper);
        OreDictionary.registerOre("ingotTin", ingotTin);
        OreDictionary.registerOre("dustTin", dustTin);
    }

    public static void registerRenders(){
        registerRender(ingotCopper);
        registerRender(ingotTin);
        registerRender(energy_cell);
        registerRender(coordinates_module);
        registerRender(impureCopperIngot);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
