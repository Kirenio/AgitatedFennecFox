package Kirenio.TestMod.init;

import Kirenio.TestMod.tileentity.TileEntityTeleport;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TeleportTileEntities {
    public static void register(){
        GameRegistry.registerTileEntity(TileEntityTeleport.class, "tmTeleport");
    }
}
