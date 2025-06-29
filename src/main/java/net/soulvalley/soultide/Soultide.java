package net.soulvalley.soultide;

import net.fabricmc.api.ModInitializer;

import net.soulvalley.soultide.block.ModBlocks;
import net.soulvalley.soultide.enchantment.ModEnchantmentEffects;
import net.soulvalley.soultide.item.ModItemGroups;
import net.soulvalley.soultide.item.ModItems;
import net.soulvalley.soultide.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Soultide implements ModInitializer {
	public static final String MOD_ID = "soultide";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModEnchantmentEffects.registerEnchantmentEffects();
	}
}