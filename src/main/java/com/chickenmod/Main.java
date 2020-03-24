package com.chickenmod;

<<<<<<< HEAD
import com.chickenmod.init.ModRecipes;
=======
>>>>>>> d6be11ddb6d06eae1070fcd8cc5820a4cfe0550c
import com.chickenmod.proxy.CommonProxy;
import com.chickenmod.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
<<<<<<< HEAD
		ModRecipes.init();
=======
		
>>>>>>> d6be11ddb6d06eae1070fcd8cc5820a4cfe0550c
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}


}
