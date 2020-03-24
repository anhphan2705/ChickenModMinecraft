package com.chickenmod.init;

import java.util.ArrayList;
import java.util.List;

import com.chickenmod.items.ItemBase;
import com.chickenmod.items.tools.ToolAxe;
import com.chickenmod.items.tools.ToolHoe;
import com.chickenmod.items.tools.ToolPickaxe;
import com.chickenmod.items.tools.ToolSpade;
import com.chickenmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_CHICKEN = EnumHelper.addToolMaterial("material_chicken", 3, 750, 12.0F, 4.4F, 10);
	
	//Items
	public static final Item CHICKEN_PEARL = new ItemBase("chicken_pearl");
	public static final Item CHICKEN_MAGIC_FRUIT = new ItemBase("chicken_magic_fruit");
	
	//Tools
	public static final ItemSword CHICKEN_SWORD = new ToolSword("chicken_sword", MATERIAL_CHICKEN);
	public static final ItemSpade CHICKEN_SHOVEL = new ToolSpade("chicken_shovel", MATERIAL_CHICKEN);
	public static final ItemPickaxe CHICKEN_PICKAXE = new ToolPickaxe("chicken_pickaxe", MATERIAL_CHICKEN);
	public static final ItemAxe CHICKEN_AXE = new ToolAxe("chicken_axe", MATERIAL_CHICKEN);
	public static final ItemHoe CHICKEN_HOE = new ToolHoe("chicken_hoe", MATERIAL_CHICKEN);
}
