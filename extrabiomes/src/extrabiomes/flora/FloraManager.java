/**
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license
 * located in /MMPL-1.0.txt
 */

package extrabiomes.flora;

import net.minecraft.src.Block;

import com.google.common.base.Optional;

import extrabiomes.api.BiomeManager;
import extrabiomes.api.ExtrabiomesBiomeDecorations;
import extrabiomes.api.ExtrabiomesBlock;
import extrabiomes.api.ITreeFactory;
import extrabiomes.api.TerrainGenManager;
import extrabiomes.blocks.BlockCustomFlower;
import extrabiomes.blocks.BlockCustomTallGrass;
import extrabiomes.terrain.BiomeDecoration;
import extrabiomes.terrain.TreeFactory;
import extrabiomes.terrain.WorldGenChunkCatTail;
import extrabiomes.terrain.WorldGenChunkCustomFlower;
import extrabiomes.terrain.WorldGenChunkGrass;
import extrabiomes.terrain.WorldGenChunkLeafPile;
import extrabiomes.terrain.WorldGenChunkOasis;

public class FloraManager {

	private static boolean	initialized	= false;

	private static void configureAutumnWoodsDecorations() {
		if (ExtrabiomesBlock.flower.isPresent()) {
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.autumnwoods.get(),
					new BiomeDecoration(2,
							new WorldGenChunkCustomFlower(
									BlockCustomFlower.metaToadstool)));
			ExtrabiomesBiomeDecorations.biomeDecorations
					.get()
					.put(BiomeManager.autumnwoods.get(),
							new BiomeDecoration(
									2,
									new WorldGenChunkCustomFlower(
											BlockCustomFlower.metaAutumnShrub)));
		}
	}

	private static void configureGreenHillsDecorations() {
		if (ExtrabiomesBlock.flower.isPresent()) {
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.greenhills.get(),
					new BiomeDecoration(new WorldGenChunkCustomFlower(
							BlockCustomFlower.metaOrange)));
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.greenhills.get(),
					new BiomeDecoration(new WorldGenChunkCustomFlower(
							BlockCustomFlower.metaWhite)));
		}
	}

	private static void configureGreenSwampDecorations() {
		if (ExtrabiomesBlock.flower.isPresent()) {
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.greenswamp.get(),
					new BiomeDecoration(new WorldGenChunkCustomFlower(
							BlockCustomFlower.metaHydrangea)));
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.greenhills.get(),
					new BiomeDecoration(15,
							new WorldGenChunkCustomFlower(
									BlockCustomFlower.metaRoot)));
		}
		if (ExtrabiomesBlock.catTail.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get()
					.put(BiomeManager.greenswamp.get(),
							new BiomeDecoration(999,
									new WorldGenChunkCatTail()));
		if (ExtrabiomesBlock.leafPile.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get()
					.put(BiomeManager.greenswamp.get(),
							new BiomeDecoration(10,
									new WorldGenChunkLeafPile()));
	}

	private static void configureMountainRidgeDecorations() {
		if (ExtrabiomesBlock.flower.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.mountainridge.get(),
					new BiomeDecoration(10,
							new WorldGenChunkCustomFlower(
									BlockCustomFlower.metaTinyCactus)));
		if (ExtrabiomesBlock.grass.isPresent()) {
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.mountainridge.get(),
					new BiomeDecoration(100, new WorldGenChunkGrass(
							BlockCustomTallGrass.metaBrown)));
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.mountainridge.get(),
					new BiomeDecoration(100, new WorldGenChunkGrass(
							BlockCustomTallGrass.metaShortBrown)));
		}
		if (ExtrabiomesBlock.leafPile.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get()
					.put(BiomeManager.mountainridge.get(),
							new BiomeDecoration(10,
									new WorldGenChunkLeafPile()));
		ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
				BiomeManager.mountainridge.get(),
				new BiomeDecoration(999, new WorldGenChunkOasis()));
	}

	private static void configureRedwoodLushDecorations() {
		if (ExtrabiomesBlock.flower.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.redwoodlush.get(),
					new BiomeDecoration(15,
							new WorldGenChunkCustomFlower(
									BlockCustomFlower.metaRoot)));
		if (ExtrabiomesBlock.leafPile.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get()
					.put(BiomeManager.redwoodlush.get(),
							new BiomeDecoration(15,
									new WorldGenChunkLeafPile()));
	}

	private static void configureSavannaDecorations() {
		if (ExtrabiomesBlock.flower.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.savanna.get(),
					new BiomeDecoration(new WorldGenChunkCustomFlower(
							BlockCustomFlower.metaPurple)));
	}

	private static void configureSnowRainforestDecorations() {
		if (ExtrabiomesBlock.flower.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.snowyrainforest.get(),
					new BiomeDecoration(2,
							new WorldGenChunkCustomFlower(
									BlockCustomFlower.metaToadstool)));
	}

	private static void configureTemperateRainforestDecorations() {
		if (ExtrabiomesBlock.flower.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.temperaterainforest.get(),
					new BiomeDecoration(2,
							new WorldGenChunkCustomFlower(
									BlockCustomFlower.metaToadstool)));
	}

	private static void configureTrees() {
		TerrainGenManager.treesCanGrowOnIDs.add(Integer
				.valueOf(Block.grass.blockID));
		TerrainGenManager.treesCanGrowOnIDs.add(Integer
				.valueOf(Block.dirt.blockID));
		TerrainGenManager.treesCanGrowOnIDs.add(Integer
				.valueOf(Block.tilledField.blockID));
	}

	private static void configureTundraDecorations() {
		if (ExtrabiomesBlock.flower.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.tundra.get(),
					new BiomeDecoration(2,
							new WorldGenChunkCustomFlower(
									BlockCustomFlower.metaToadstool)));
	}

	private static void configureWastelandDecorations() {
		if (ExtrabiomesBlock.grass.isPresent()) {
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.wasteland.get(),
					new BiomeDecoration(9, new WorldGenChunkGrass(
							BlockCustomTallGrass.metaDead)));
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.wasteland.get(),
					new BiomeDecoration(9, new WorldGenChunkGrass(
							BlockCustomTallGrass.metaDeadYellow)));
			ExtrabiomesBiomeDecorations.biomeDecorations.get().put(
					BiomeManager.wasteland.get(),
					new BiomeDecoration(7, new WorldGenChunkGrass(
							BlockCustomTallGrass.metaDeadTall)));
		}
	}

	private static void configureWoodlandsDecorations() {
		if (ExtrabiomesBlock.leafPile.isPresent())
			ExtrabiomesBiomeDecorations.biomeDecorations.get()
					.put(BiomeManager.woodlands.get(),
							new BiomeDecoration(30,
									new WorldGenChunkLeafPile()));
	}

	public void addCustomFlora() {
		if (initialized) return;
		initialized = true;

		configureTrees();

		configureAutumnWoodsDecorations();
		configureGreenHillsDecorations();
		configureGreenSwampDecorations();
		configureMountainRidgeDecorations();
		configureRedwoodLushDecorations();
		configureSavannaDecorations();
		configureSnowRainforestDecorations();
		configureTemperateRainforestDecorations();
		configureTundraDecorations();
		configureWastelandDecorations();
		configureWoodlandsDecorations();
	}

}