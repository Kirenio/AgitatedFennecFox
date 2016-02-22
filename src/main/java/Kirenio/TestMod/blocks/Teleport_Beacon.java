package Kirenio.TestMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Teleport_Beacon extends Block {

    public Teleport_Beacon(Material materialIn)
    {
        super(materialIn);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean isFullCube()
    {
        return false;
    }

    @Override
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
}
