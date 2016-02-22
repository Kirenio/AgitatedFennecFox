package Kirenio.TestMod.blocks;

import Kirenio.TestMod.items.coordinates_module;
import Kirenio.TestMod.tileentity.TileEntityTeleport;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class transporter_platform extends Block implements ITileEntityProvider {
    public transporter_platform(Material materialIn)
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
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ){
        ItemStack stack = playerIn.getCurrentEquippedItem();
        if (stack != null){
            if(stack.getItem() instanceof coordinates_module){
                if(stack.getItem().hasEffect(stack))
                {
                    TileEntityTeleport tet = (TileEntityTeleport) worldIn.getTileEntity(pos);
                    tet.addEntry("test",stack);
                    stack.stackSize--;
                    playerIn.addChatMessage(new ChatComponentText("Coordinates locked.")); // gets called twice on server and client...
                }
            }
        }
        return true;
    }

    @Override
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityTeleport();
    }
}
