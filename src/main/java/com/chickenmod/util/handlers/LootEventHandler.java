package com.chickenmod.util.handlers;

import java.util.ArrayList;

import com.chickenmod.init.ModItems;
import com.chickenmod.util.loot.LootUtils;
import com.chickenmod.util.loot.LootUtils.ICondition;
import com.chickenmod.util.loot.LootUtils.IMethod;

import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.KilledByPlayer;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.LootingEnchantBonus;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootEventHandler {
	
	@SubscribeEvent
	public void lootTableLoad(LootTableLoadEvent event) {
		

		LootTable loot = event.getTable();
		
		if(event.getName().getResourcePath().equals("entities/chicken")) {
			LootUtils.addItemToTable(loot, ModItems.CHICKEN_PEARL, 1, 1, 1, 1, 1, 1, 2, "cm:chicken_pearl",
			new IMethod() {
				@Override
				public void FunctionsCallback(ArrayList<LootFunction> lootfuncs) {
					LootFunction looting = new LootingEnchantBonus(null, new RandomValueRange(0,1), 2);
					lootfuncs.add(looting);
				}
			},
			new ICondition() {
				@Override
				public void FunctionsCallback(ArrayList<LootCondition> lootconds) {
					lootconds.add(new KilledByPlayer(true));
				}
				});
		}
	}
}
