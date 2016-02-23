package Kirenio.TestMod.init;

import Kirenio.TestMod.Reference;
import Kirenio.TestMod.TestMod;
import Kirenio.TestMod.blocks.ore;
import Kirenio.TestMod.blocks.teleport_beacon;
import Kirenio.TestMod.blocks.cell_injector;
import Kirenio.TestMod.blocks.transporter_platform;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class blocks {
    public static Block copperOre;
    public static Block basic_injector;
    public static Block teleport_beacon;
    public static Block transporter_platform;

    public static void preInit(){

        basic_injector = new cell_injector(Material.cloth).setUnlocalizedName("basic_injector").setCreativeTab(TestMod.tabEnergy);
        teleport_beacon = new teleport_beacon(Material.cloth).setUnlocalizedName("teleport_beacon").setCreativeTab(TestMod.tabEnergy);
        transporter_platform = new transporter_platform(Material.cloth).setUnlocalizedName("transporter_platform").setCreativeTab(TestMod.tabEnergy);
        copperOre = new ore(Material.rock).setUnlocalizedName("copperOre").setHardness(4f).setResistance(6f);
    }

    public static void register(){
        GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(basic_injector, basic_injector.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(teleport_beacon, teleport_beacon.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(transporter_platform, transporter_platform.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(copperOre);
        registerRender(basic_injector);
        registerRender(teleport_beacon);
        registerRender(transporter_platform);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void init(){

    }
}
