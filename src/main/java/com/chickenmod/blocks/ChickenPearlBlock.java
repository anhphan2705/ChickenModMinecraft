package com.chickenmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChickenPearlBlock extends BlockBase {

	public ChickenPearlBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(25.0F);									//Reference: 0.5 = dirt  		50 = obsidian
		setResistance(25.5F);								//Reference: 1200 = Obsidian  	1 = pumpkin
		setHarvestLevel("pickaxe", 2);						// 0 = wood		1 = rock 	2 = iron 	3 = diamond 	
		setLightLevel(10);									//Reference: 14 = torch
		setResistance(50.0F);								//Reference: 1200 = Obsidian  	1 = pumpkin
		setHarvestLevel("pickaxe", 2);						// 0 = wood		1 = rock 	2 = iron 	3 = diamond 	
		setLightLevel(7);									//Reference: 14 = torch
		//setLightOpacity();								This is for making window type block
		//setBlockUnbreakable();							Make the block unbreakable
	}

}
