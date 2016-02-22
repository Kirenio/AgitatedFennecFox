package Kirenio.TestMod;

import net.minecraft.util.BlockPos;

public class CoordEntry {
    private String name;
    private int dimension;
    private int x,y,z;

    public int getDimension() {
        return dimension;
    }

    public String getName() {
        return name;
    }


    public CoordEntry(String name, int dimension, int x, int y, int z) {
        this.name = name;
        this.dimension = dimension;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public BlockPos getPos(){
        return new BlockPos(x,y,z);
    }
}
