package Kirenio.TestMod.Proxy;

import Kirenio.TestMod.init.blocks;
import Kirenio.TestMod.init.TestItems;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerRenders()
    {
        blocks.registerRenders();
        TestItems.registerRenders();
    }
}
