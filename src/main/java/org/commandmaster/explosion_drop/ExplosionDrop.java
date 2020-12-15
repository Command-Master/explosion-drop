package org.commandmaster.explosion_drop;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = ExplosionDrop.MODID, name = ExplosionDrop.NAME, version = ExplosionDrop.VERSION)
public class ExplosionDrop
{
    public static final String MODID = "drop100";
    public static final String NAME = "Explosion Drops";
    public static final String VERSION = "1.0";



    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.HarvestDropsEvent event) {
        event.setDropChance(1.0f);
    }
}
