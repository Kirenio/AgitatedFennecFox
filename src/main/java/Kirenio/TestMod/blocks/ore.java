package Kirenio.TestMod.blocks;

import Kirenio.TestMod.TestMod;
import jdk.nashorn.internal.objects.annotations.Constructor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.apache.logging.log4j.core.config.plugins.ResolverUtil;

import java.util.Random;

public class ore extends Block{

    public ore(Material material){
        super(material);
        setCreativeTab(TestMod.tabEnergy);
    }

    @Override
    public Item getItemDropped(IBlockState blockState, Random random, int fortune){
        return  Item.getItemFromBlock(this);
    }
}
