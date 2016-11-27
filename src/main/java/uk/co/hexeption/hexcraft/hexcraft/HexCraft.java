package uk.co.hexeption.hexcraft.hexcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = HexCraft.MOD_ID,
        name = HexCraft.MOD_NAME,
        version = HexCraft.VERSION
)
public class HexCraft {

    public static final String MOD_ID = "hexcraft";
    public static final String MOD_NAME = "HexCraft";
    public static final String VERSION = "1.0.0-SNAPSHOT";

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
