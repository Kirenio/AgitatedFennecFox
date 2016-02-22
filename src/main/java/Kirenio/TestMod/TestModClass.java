package Kirenio.TestMod;

import Kirenio.TestMod.Proxy.CommonProxy;
import Kirenio.TestMod.init.TestBlocks;
import Kirenio.TestMod.init.TestItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.core.config.plugins.ResolverUtil;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.VERSION)
public class TestModClass {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final TestModTab tabEnergy =  new TestModTab("tabEnergy");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        TestBlocks.init();
        TestBlocks.register();
        TestItems.init();
        TestItems.register();
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
