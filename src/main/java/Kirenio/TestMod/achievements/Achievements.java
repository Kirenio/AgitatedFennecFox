package Kirenio.TestMod.achievements;

import Kirenio.TestMod.init.blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class Achievements {
    public static Achievement achievementOreCopper;
    public static Achievement achievementOreTin;

    public static void initAchievements(){
        achievementOreCopper = new Achievement("achievement.mineOreCopper", "mineCopper", 0, 0, new ItemStack(blocks.oreCopper), (Achievement)null).initIndependentStat().registerStat();
        achievementOreTin = new Achievement("achievement.mineOreTin", "mineTin", 0, 1, new ItemStack(blocks.oreTin), (Achievement)null).initIndependentStat().registerStat();
    }

    public static void initAchievementsPage(){
        AchievementPage.registerAchievementPage(new AchievementPage("Agitated Fennec Fox Achievements Page", new Achievement[]{achievementOreCopper,achievementOreTin}));
        FMLCommonHandler.instance().bus().register(new OnMineEvent());
    }
}
