package com.collinbaker.collin_forge_test;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Collin on 5/13/2015.
 */

@Mod(
    modid = "forge-test",
    name = "Forge Test",
    version = "0.1"
)
public class ForgeTest
{
    @Mod.Instance("forge-test")
    public static ForgeTest instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
