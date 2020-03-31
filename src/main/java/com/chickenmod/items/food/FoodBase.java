package com.chickenmod.items.food;

import com.chickenmod.Main;
import com.chickenmod.init.ModItems;
import com.chickenmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {

	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModel() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
