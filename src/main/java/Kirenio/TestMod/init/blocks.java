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
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class blocks {
    public static Block oreHeberum;
    public static Block blockHeberum;
    public static Block oreImpetum;
    public static Block blockImpetum;
    public static Block oreCopper;
    public static Block blockCopper;
    public static Block oreTin;
    public static Block blockTin;
    public static Block basic_injector;
    public static Block teleport_beacon;
    public static Block transporter_platform;

    public static void preInit(){

        oreHeberum = new ore(Material.rock).setUnlocalizedName("oreHeberum").setHardness(3f).setResistance(4f);
        blockHeberum = new ore(Material.rock).setUnlocalizedName("blockHeberum").setHardness(4f).setResistance(5f);
        oreImpetum = new ore(Material.rock).setUnlocalizedName("oreImpetum").setHardness(2f).setResistance(3f);
        blockImpetum = new ore(Material.rock).setUnlocalizedName("blockImpetum").setHardness(3f).setResistance(4f);
        oreCopper = new ore(Material.rock).setUnlocalizedName("oreCopper").setHardness(3f).setResistance(5f);
        blockCopper = new Block(Material.iron).setUnlocalizedName("blockCopper").setHardness(5).setResistance(9f);
        oreTin = new ore(Material.rock).setUnlocalizedName("oreTin").setHardness(3f).setResistance(5f);
        blockTin = new Block(Material.iron).setUnlocalizedName("blockTin").setHardness(5).setResistance(9f);
        basic_injector = new cell_injector(Material.cloth).setUnlocalizedName("basic_injector").setCreativeTab(TestMod.tabEnergy);
        teleport_beacon = new teleport_beacon(Material.cloth).setUnlocalizedName("teleport_beacon").setCreativeTab(TestMod.tabEnergy);
        transporter_platform = new transporter_platform(Material.cloth).setUnlocalizedName("transporter_platform").setCreativeTab(TestMod.tabEnergy);
    }

    public static void register(){
        GameRegistry.registerBlock(oreHeberum, oreHeberum.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockHeberum, blockHeberum.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreImpetum, oreImpetum.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockImpetum, blockImpetum.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreCopper, oreCopper.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockCopper, blockCopper.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreTin, oreTin.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockTin, blockTin.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(basic_injector, basic_injector.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(teleport_beacon, teleport_beacon.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(transporter_platform, transporter_platform.getUnlocalizedName().substring(5));
    }

    public static void registerOreDict(){
        OreDictionary.registerOre("oreHeberum", oreHeberum);
        OreDictionary.registerOre("blockHeberum", blockHeberum);
        OreDictionary.registerOre("oreImpetum", oreImpetum);
        OreDictionary.registerOre("blockImpetum", blockImpetum);
        OreDictionary.registerOre("oreCopper", oreCopper);
        OreDictionary.registerOre("blockCopper", blockCopper);
        OreDictionary.registerOre("oreTin", oreTin);
        OreDictionary.registerOre("blockTin", blockTin);
    }

    public static void registerRenders(){
        registerRender(oreHeberum);
        registerRender(blockHeberum);
        registerRender(oreImpetum);
        registerRender(blockImpetum);
        registerRender(oreCopper);
        registerRender(blockCopper);
        registerRender(oreTin);
        registerRender(blockTin);
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
