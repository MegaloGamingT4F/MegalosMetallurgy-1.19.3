package net.megalogaming.megalosmetallurgy;

import net.fabricmc.api.ModInitializer;
import net.megalogaming.megalosmetallurgy.block.ModBlocks;
import net.megalogaming.megalosmetallurgy.item.ModItemGroup;
import net.megalogaming.megalosmetallurgy.item.ModItems;
import net.megalogaming.megalosmetallurgy.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MegalosMetallurgy implements ModInitializer {
	public static final  String MOD_ID = "megalosmetallurgy";
		public static final Logger LOGGER = LoggerFactory.getLogger("megalosmetallurgy");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModWorldGeneration.generateModWorldGen();

	}
}