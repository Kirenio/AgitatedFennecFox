package Kirenio.TestMod.blocks;

import Kirenio.TestMod.TestMod;
import Kirenio.TestMod.init.blocks;
import Kirenio.TestMod.init.items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class ore extends Block{

    public ore(Material material){
        super(material);
        setCreativeTab(TestMod.tabEnergy);
    }

    @Override
    public Item getItemDropped(IBlockState blockState, Random random, int fortune){
        return this == blocks.oreHeberum ? items.shardHeberum : (this == blocks.oreImpetum ? items.shardImpetum : Item.getItemFromBlock(this));
    }

    @Override
    public int quantityDropped(Random random){
        return this == blocks.oreHeberum ? 2 + random.nextInt(2) : (this == blocks.oreImpetum ? 2 + random.nextInt(3) : 1);
    }
}
