package com.collinbaker.collin_forge_test;

import com.collinbaker.collin_forge_test.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Collin on 5/13/2015.
 */

@Mod(
    modid = ForgeTest.MOD_ID,
    name = ForgeTest.MOD_NAME,
    version = ForgeTest.VERSION
)
public class ForgeTest
{
    public static final String MOD_ID = "forge-test";
    public static final String MOD_NAME = "Forge Test";
    public static final String VERSION = "0.1";

    @Mod.Instance(MOD_ID)
    public static ForgeTest instance;

    @SidedProxy(
               clientSide = "com.collinbaker.collin_forge_test.ClientProxy",
               serverSide = "com.collinbaker.collin_forge_test.ServerProxy"
    )
    public static IProxy proxy;

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
