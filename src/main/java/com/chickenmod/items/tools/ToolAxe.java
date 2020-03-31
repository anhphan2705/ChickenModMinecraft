package com.chickenmod.items.tools;

import com.chickenmod.Main;
import com.chickenmod.init.ModItems;
import com.chickenmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	public ToolAxe(String name, ToolMaterial material){
		super(material, 10.0F, -2.7F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModel() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
