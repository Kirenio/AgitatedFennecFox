package Kirenio.TestMod.achievements;

import Kirenio.TestMod.init.blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class OnMineEvent {
    @SubscribeEvent
    public void oreCopperGot(PlayerEvent.ItemPickupEvent e){
        if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Item.getItemFromBlock(blocks.oreCopper)))){
            e.player.addStat(Achievements.achievementOreCopper, 1);
        }
    }
    @SubscribeEvent
    public void oreTinGot(PlayerEvent.ItemPickupEvent e){
        if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Item.getItemFromBlock(blocks.oreTin)))){
            e.player.addStat(Achievements.achievementOreTin, 1);
        }
    }
}