package Kirenio.TestMod.Proxy;

import Kirenio.TestMod.init.TestBlocks;
import Kirenio.TestMod.init.TestItems;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerRenders()
    {
        TestBlocks.registerRenders();
        TestItems.registerRenders();
    }
}
