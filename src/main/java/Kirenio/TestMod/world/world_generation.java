package Kirenio.TestMod.world;

import Kirenio.TestMod.init.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class world_generation implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        switch(world.provider.getDimensionId()) {
            case 0:
                this.generateOverworld(world, random, chunkX, chunkZ);
                break;
            default:
                break;
        }
    }

    public void generateOverworld(World world,  Random random, int x, int z){
        generateOre(blocks.oreCopper, world, random, x, z, 4, 8, 15, 2, 250, Blocks.stone);
        generateOre(blocks.oreTin, world, random, x, z, 5, 10, 18, 20, 254, Blocks.stone);
    }

    public void generateNether(){
    }

    public void generateEnd(){
    }

    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn){
        if(minY < 1 || maxY > 255 || minY > maxY) throw new IllegalArgumentException("Illegal height arguments for WorldGenerator");

        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY + 1;
        WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), veinSize, BlockHelper.forBlock(generateIn));
        for( int i = 0; i < chance; i++){
            int xRandom = chunkX * 16 + random.nextInt(16);
            int yRandom = random.nextInt(heightRange) + minY;
            int zRandom = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, new BlockPos(xRandom, yRandom, zRandom));
        }
    }
}
