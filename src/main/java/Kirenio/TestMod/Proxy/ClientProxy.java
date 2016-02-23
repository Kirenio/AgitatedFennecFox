package Kirenio.TestMod.Proxy;

import Kirenio.TestMod.init.blocks;
import Kirenio.TestMod.init.items;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerRenders()
    {
        blocks.registerRenders();
        items.registerRenders();
    }
}
