package Kirenio.TestMod;

import Kirenio.TestMod.Proxy.CommonProxy;
import Kirenio.TestMod.init.TeleportTileEntities;
import Kirenio.TestMod.init.blocks;
import Kirenio.TestMod.init.TestItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.VERSION)
public class TestMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final TestModTab tabEnergy =  new TestModTab("tabEnergy");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        blocks.init();
        blocks.register();
        TestItems.init();
        TestItems.register();
        TeleportTileEntities.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
