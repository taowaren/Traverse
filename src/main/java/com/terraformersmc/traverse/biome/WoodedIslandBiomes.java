package com.terraformersmc.traverse.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;

import com.terraformersmc.terraform.biome.builder.DefaultFeature;

public class WoodedIslandBiomes {
	static final Biome WOODED_ISLAND = TraverseBiomes.BIOME_TEMPLATE.builder()
			.addDefaultFeatures(DefaultFeature.LAKES, DefaultFeature.FOREST_FLOWERS, DefaultFeature.DEFAULT_FLOWERS, DefaultFeature.FOREST_GRASS, DefaultFeature.FOREST_TREES, DefaultFeature.MORE_SEAGRASS, DefaultFeature.LESS_KELP)
			.addDefaultSpawnEntries()
			.addSpawnEntry(new Biome.SpawnEntry(EntityType.WOLF, 5, 4, 4))
			.category(Biome.Category.FOREST)
			.depth(0.1F)
			.scale(0.6F)
			.temperature(0.8F)
			.downfall(0.8F)
			.build();
}
