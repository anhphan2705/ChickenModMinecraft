package com.chickenmod.init;

import java.util.ArrayList;
import java.util.List;

import com.chickenmod.blocks.ChickenPearlBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CHICKEN_PEARL_BLOCK = new ChickenPearlBlock("chicken_pearl_block", Material.IRON);
}
