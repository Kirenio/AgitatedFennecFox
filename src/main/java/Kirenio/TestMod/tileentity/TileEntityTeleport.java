package Kirenio.TestMod.tileentity;

import Kirenio.TestMod.CoordEntry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import java.util.ArrayList;
import java.util.List;

public class TileEntityTeleport extends TileEntity{

    private List<CoordEntry> teleports = new ArrayList<CoordEntry>();

    public void addEntry(String name, ItemStack coordinates_module){
        NBTTagCompound nbt = (NBTTagCompound)coordinates_module.getTagCompound().getTag("coords");
        int dim = nbt.getInteger("dim");
        int posX = nbt.getInteger("posX");
        int posY = nbt.getInteger("posY");
        int posZ = nbt.getInteger("posZ");
    }
}
