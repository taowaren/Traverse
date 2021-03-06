package com.terraformersmc.traverse.surfacebuilder;

import java.util.Random;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class SandWithPatchesSurfaceBuilder extends SurfaceBuilder<TernarySurfaceConfig> {

	private final double threshold;

	public SandWithPatchesSurfaceBuilder(Function<Dynamic<?>, ? extends TernarySurfaceConfig> function_1, double threshold) {
		super(function_1);
		this.threshold = threshold;
	}

	@Override
	public void generate(Random random, Chunk chunk, Biome biome, int int_1, int int_2, int int_3, double noise, BlockState blockState_1, BlockState blockState_2, int int_4, long long_1, TernarySurfaceConfig config) {
		if (noise > threshold) {
			SurfaceBuilder.DEFAULT.generate(random, chunk, biome, int_1, int_2, int_3, noise, blockState_1, blockState_2, int_4, long_1, config);
		} else {
			SurfaceBuilder.DEFAULT.generate(random, chunk, biome, int_1, int_2, int_3, noise, blockState_1, blockState_2, int_4, long_1, SurfaceBuilder.SAND_CONFIG);
		}

	}

}

