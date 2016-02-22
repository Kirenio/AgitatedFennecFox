package Kirenio.TestMod;

import Kirenio.TestMod.init.TestItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestModTab extends CreativeTabs{
    public TestModTab(String label){
        super(label);
        this.setBackgroundImageName("energy.png");
    }

    @Override
    public Item getTabIconItem(){
        return TestItems.energy_cell;
    }
}
