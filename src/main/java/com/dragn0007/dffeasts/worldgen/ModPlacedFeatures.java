package com.dragn0007.dffeasts.worldgen;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> DFF_ORANGE_PLACED = registerKey("dff_orange_placed");
    public static final ResourceKey<PlacedFeature> DFF_COCONUT_PLACED = registerKey("dff_coconut_placed");
    public static final ResourceKey<PlacedFeature> DFF_MANGO_PLACED = registerKey("dff_mango_placed");
    public static final ResourceKey<PlacedFeature> DFF_GRAPEFRUIT_PLACED = registerKey("dff_grapefruit_placed");
    public static final ResourceKey<PlacedFeature> DFF_AVOCADO_PLACED = registerKey("dff_avocado_placed");
    public static final ResourceKey<PlacedFeature> DFF_PEAR_PLACED = registerKey("dff_pear_placed");
    public static final ResourceKey<PlacedFeature> DFF_KIWI_PLACED = registerKey("dff_kiwi_placed");
    public static final ResourceKey<PlacedFeature> DFF_CHERRY_PLACED = registerKey("dff_cherry_placed");
    public static final ResourceKey<PlacedFeature> DFF_POMEGRANATE_PLACED = registerKey("dff_pomegranate_placed");
    public static final ResourceKey<PlacedFeature> DFF_LYCHEE_PLACED = registerKey("dff_lychee_placed");
    public static final ResourceKey<PlacedFeature> DFF_BANANA_PLACED = registerKey("dff_banana_placed");
    public static final ResourceKey<PlacedFeature> DFF_DRAGONFRUIT_PLACED = registerKey("dff_dragonfruit_placed");
    public static final ResourceKey<PlacedFeature> DFF_PASSIONFRUIT_PLACED = registerKey("dff_passionfruit_placed");
    public static final ResourceKey<PlacedFeature> DFF_CASHEW_PLACED = registerKey("dff_cashew_placed");
    public static final ResourceKey<PlacedFeature> DFF_ALMOND_PLACED = registerKey("dff_almond_placed");
    public static final ResourceKey<PlacedFeature> DFF_OLIVE_PLACED = registerKey("dff_olive_placed");
    public static final ResourceKey<PlacedFeature> DFF_WALNUT_PLACED = registerKey("dff_walnut_placed");

    public static final ResourceKey<PlacedFeature> DFF_BLUEBERRY_PLACED = registerKey("dff_blueberry_placed");
    public static final ResourceKey<PlacedFeature> DFF_BLACKBERRY_PLACED = registerKey("dff_blackberry_placed");
    public static final ResourceKey<PlacedFeature> DFF_RASPBERRY_PLACED = registerKey("dff_raspberry_placed");
    public static final ResourceKey<PlacedFeature> DFF_WHITE_RASPBERRY_PLACED = registerKey("dff_white_raspberry_placed");

    public static final ResourceKey<PlacedFeature> DFF_ROSEMARY_PLACED = registerKey("dff_rosemary_placed");
    public static final ResourceKey<PlacedFeature> DFF_OREGANO_PLACED = registerKey("dff_oregano_placed");
    public static final ResourceKey<PlacedFeature> DFF_CILANTRO_PLACED = registerKey("dff_cilantro_placed");
    public static final ResourceKey<PlacedFeature> DFF_MINT_PLACED = registerKey("dff_mint_placed");
    public static final ResourceKey<PlacedFeature> DFF_BELL_PEPPER_PLACED = registerKey("dff_bell_pepper_placed");
    public static final ResourceKey<PlacedFeature> DFF_BLACK_BEAN_PLANT_PLACED = registerKey("dff_black_bean_plant_placed");
    public static final ResourceKey<PlacedFeature> DFF_BRUSSELS_SPROUTS_PLACED = registerKey("dff_brussels_sprouts_placed");
    public static final ResourceKey<PlacedFeature> DFF_CORN_PLANT_PLACED = registerKey("dff_corn_plant_placed");
    public static final ResourceKey<PlacedFeature> DFF_CELERY_PLANT_PLACED = registerKey("dff_celery_plant_placed");
    public static final ResourceKey<PlacedFeature> DFF_CHILI_PEPPER_PLANT_PLACED = registerKey("dff_chili_pepper_plant_placed");
    public static final ResourceKey<PlacedFeature> DFF_BUTTERNUT_SQUASH_PLACED = registerKey("dff_butternut_squash_placed");
    public static final ResourceKey<PlacedFeature> DFF_CUCUMBER_PLACED = registerKey("dff_cucumber_placed");
    public static final ResourceKey<PlacedFeature> DFF_CRANBERRY_PLACED = registerKey("dff_cranberry_placed");
    public static final ResourceKey<PlacedFeature> DFF_GARLIC_PLACED = registerKey("dff_garlic_placed");
    public static final ResourceKey<PlacedFeature> DFF_GINGER_PLACED = registerKey("dff_ginger_placed");
    public static final ResourceKey<PlacedFeature> DFF_GREEN_BEAN_PLACED = registerKey("dff_green_bean_placed");
    public static final ResourceKey<PlacedFeature> DFF_PURPLE_GRAPE_PLACED = registerKey("dff_purple_grape_placed");
    public static final ResourceKey<PlacedFeature> DFF_RED_GRAPE_PLACED = registerKey("dff_red_grape_placed");
    public static final ResourceKey<PlacedFeature> DFF_JALEPENO_PEPPER_PLACED = registerKey("dff_jalepeno_pepper_placed");
    public static final ResourceKey<PlacedFeature> DFF_KIDNEY_BEAN_PLACED = registerKey("dff_kidney_bean_placed");
    public static final ResourceKey<PlacedFeature> DFF_ONION_PLACED = registerKey("dff_onion_placed");
    public static final ResourceKey<PlacedFeature> DFF_PEANUT_PLACED = registerKey("dff_peanut_placed");
    public static final ResourceKey<PlacedFeature> DFF_RADISH_PLACED = registerKey("dff_radish_placed");
    public static final ResourceKey<PlacedFeature> DFF_RYE_PLACED = registerKey("dff_rye_placed");
    public static final ResourceKey<PlacedFeature> DFF_SOYBEAN_PLACED = registerKey("dff_soybean_placed");
    public static final ResourceKey<PlacedFeature> DFF_SUGAR_BEET_PLACED = registerKey("dff_sugar_beet_placed");
    public static final ResourceKey<PlacedFeature> DFF_STRAWBERRY_PLACED = registerKey("dff_strawberry_placed");
    public static final ResourceKey<PlacedFeature> DFF_TOMATO_PLACED = registerKey("dff_tomato_placed");
    public static final ResourceKey<PlacedFeature> DFF_WHITE_GRAPE_PLACED = registerKey("dff_white_grape_placed");
    public static final ResourceKey<PlacedFeature> DFF_ZUCCHINI_PLACED = registerKey("dff_zucchini_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, DFF_ORANGE_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_ORANGE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_ORANGE_SAPLING.get()));

        register(context, DFF_COCONUT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_COCONUT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_COCONUT_SAPLING.get()));

        register(context, DFF_MANGO_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_MANGO),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_MANGO_SAPLING.get()));

        register(context, DFF_GRAPEFRUIT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_GRAPEFRUIT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get()));

        register(context, DFF_AVOCADO_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_AVOCADO),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_AVOCADO_SAPLING.get()));

        register(context, DFF_PEAR_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_PEAR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_PEAR_SAPLING.get()));

        register(context, DFF_KIWI_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_KIWI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_KIWI_SAPLING.get()));

        register(context, DFF_CHERRY_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_CHERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_CHERRY_SAPLING.get()));

        register(context, DFF_POMEGRANATE_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_POMEGRANATE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_POMEGRANATE_SAPLING.get()));

        register(context, DFF_LYCHEE_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_LYCHEE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_LYCHEE_SAPLING.get()));

        register(context, DFF_BANANA_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_BANANA),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_BANANA_SAPLING.get()));

        register(context, DFF_DRAGONFRUIT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_DRAGONFRUIT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_DRAGONFRUIT_SAPLING.get()));

        register(context, DFF_PASSIONFRUIT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_PASSIONFRUIT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_PASSIONFRUIT_SAPLING.get()));

        register(context, DFF_CASHEW_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_CASHEW),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_CASHEW_SAPLING.get()));

        register(context, DFF_ALMOND_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_ALMOND),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_ALMOND_SAPLING.get()));

        register(context, DFF_OLIVE_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_OLIVE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_OLIVE_SAPLING.get()));

        register(context, DFF_WALNUT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_WALNUT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        DFFBlocks.DFF_WALNUT_SAPLING.get()));


        //BUSHES
        register(context, DFF_BLUEBERRY_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_BLUEBERRY),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        
        register(context, DFF_BLACKBERRY_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_BLACKBERRY),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        
        register(context, DFF_RASPBERRY_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_RASPBERRY),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        
        register(context, DFF_WHITE_RASPBERRY_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_WHITE_RASPBERRY),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


        //CROPS
        register(context, DFF_ROSEMARY_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_ROSEMARY),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_OREGANO_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_OREGANO),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_CILANTRO_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_CILANTRO),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_MINT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_MINT),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


        register(context, DFF_BELL_PEPPER_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_BELL_PEPPER),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_BLACK_BEAN_PLANT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_BLACK_BEAN),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_BRUSSELS_SPROUTS_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_BRUSSELS_SPROUTS),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_CORN_PLANT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_CORN),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_CELERY_PLANT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_CELERY),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_CHILI_PEPPER_PLANT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_CHILI_PEPPER),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_BUTTERNUT_SQUASH_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_BUTTERNUT_SQUASH),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_CUCUMBER_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_CUCUMBER),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_CRANBERRY_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_CRANBERRY),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_GARLIC_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_GARLIC),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_GINGER_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_GINGER),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_GREEN_BEAN_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_GREEN_BEAN),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_PURPLE_GRAPE_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_PURPLE_GRAPE),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_RED_GRAPE_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_RED_GRAPE),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_JALEPENO_PEPPER_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_JALEPENO_PEPPER),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_KIDNEY_BEAN_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_KIDNEY_BEAN),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_ONION_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_ONION),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_PEANUT_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_PEANUT),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_RADISH_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_RADISH),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_RYE_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_RYE),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_SOYBEAN_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_SOYBEAN),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_SUGAR_BEET_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_SUGAR_BEET),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_STRAWBERRY_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_STRAWBERRY),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_TOMATO_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_TOMATO),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_WHITE_GRAPE_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_WHITE_GRAPE),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, DFF_ZUCCHINI_PLACED, configuredFeatures.getOrThrow(ModConfigFeatures.DFF_ZUCCHINI),
                List.of(RarityFilter.onAverageOnceEvery(28),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


    }

        private static ResourceKey<PlacedFeature> registerKey (String name){
            return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(DFFeastsMain.MODID, name));
        }
        private static void register
        (BootstapContext < PlacedFeature > context, ResourceKey < PlacedFeature > key, Holder < ConfiguredFeature < ?, ?>>
        configuration,
                List < PlacementModifier > modifiers){
            context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
        }
}
