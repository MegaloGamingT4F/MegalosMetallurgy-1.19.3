package net.megalogaming.megalosmetallurgy;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.megalogaming.megalosmetallurgy.data.ModLootTableGenerator;
import net.megalogaming.megalosmetallurgy.data.ModModelProvider;
import net.megalogaming.megalosmetallurgy.data.ModRecipeGenerator;

public class MegalosMetallurgyDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
	}
}
