package Kirenio.TestMod.init;

import Kirenio.TestMod.Reference;
import Kirenio.TestMod.TestModClass;
import Kirenio.TestMod.blocks.BlockTest;
import Kirenio.TestMod.blocks.Teleport_Beacon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TestBlocks {
    public static Block cell_injector;
    public static Block teleport_beacon;

    public static void init(){
        cell_injector = new BlockTest(Material.cloth).setUnlocalizedName("cell_injector").setCreativeTab(TestModClass.tabEnergy);
        teleport_beacon = new Teleport_Beacon(Material.cloth).setUnlocalizedName("Teleport_Beacon").setCreativeTab(TestModClass.tabEnergy);
    }

    public static void register(){
        GameRegistry.registerBlock(cell_injector, cell_injector.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(teleport_beacon, teleport_beacon.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(cell_injector);
        registerRender(teleport_beacon);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
