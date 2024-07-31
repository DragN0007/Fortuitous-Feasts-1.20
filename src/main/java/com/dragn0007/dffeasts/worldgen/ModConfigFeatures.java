package com.dragn0007.dffeasts.worldgen;


import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfigFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_ORANGE = registerKey("dff_orange");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_COCONUT = registerKey("dff_coconut");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_MANGO = registerKey("dff_mango");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_POMEGRANATE = registerKey("dff_pomegranate");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_KIWI = registerKey("dff_kiwi");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_GRAPEFRUIT = registerKey("dff_grapefruit");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_PEAR = registerKey("dff_pear");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_CHERRY = registerKey("dff_cherry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_LYCHEE = registerKey("dff_lychee");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_AVOCADO = registerKey("dff_avocado");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_BANANA = registerKey("dff_banana");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_DRAGONFRUIT = registerKey("dff_dragonfruit");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_PASSIONFRUIT = registerKey("dff_passionfruit");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_CASHEW = registerKey("dff_cashew");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_ALMOND = registerKey("dff_almond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_OLIVE = registerKey("dff_olive");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_WALNUT = registerKey("dff_walnut");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_BLUEBERRY = registerKey("dff_blueberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_BLACKBERRY = registerKey("dff_blackberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_RASPBERRY = registerKey("dff_raspberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_WHITE_RASPBERRY = registerKey("dff_white_raspberry");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_ROSEMARY = registerKey("dff_rosemary");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_OREGANO = registerKey("dff_oregano");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_CILANTRO = registerKey("dff_cilantro");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_MINT = registerKey("dff_mint");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_BELL_PEPPER = registerKey("dff_bell_pepper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_BLACK_BEAN = registerKey("dff_black_bean");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_BRUSSELS_SPROUTS = registerKey("dff_brussels_sprouts");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_CORN = registerKey("dff_corn");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_CELERY = registerKey("dff_celery");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_CHILI_PEPPER = registerKey("dff_chili_pepper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_BUTTERNUT_SQUASH = registerKey("dff_butternut_squash");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_CUCUMBER = registerKey("dff_cucumber");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_CRANBERRY = registerKey("dff_cranberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_GARLIC = registerKey("dff_garlic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_GINGER = registerKey("dff_ginger");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_GREEN_BEAN = registerKey("dff_green_bean");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_PURPLE_GRAPE = registerKey("dff_purple_grape");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_RED_GRAPE = registerKey("dff_red_grape");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_JALEPENO_PEPPER = registerKey("dff_jalepeno_pepper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_KIDNEY_BEAN = registerKey("dff_kidney_bean");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_ONION = registerKey("dff_onion");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_PEANUT = registerKey("dff_peanut");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_RADISH = registerKey("dff_radish");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_RYE = registerKey("dff_rye");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_SOYBEAN = registerKey("dff_soybean");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_SUGAR_BEET = registerKey("dff_sugar_beet");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_STRAWBERRY = registerKey("dff_strawberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_TOMATO = registerKey("dff_tomato");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_WHITE_GRAPE = registerKey("dff_white_grape");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DFF_ZUCCHINI = registerKey("dff_zucchini");






    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {



        //Orange
        register(context, DFF_ORANGE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.ORANGE_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.ORANGE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Coconut
        register(context, DFF_COCONUT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.COCONUT_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.COCONUT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Mango
        register(context, DFF_MANGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.MANGO_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.MANGO_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Pomegranate
        register(context, DFF_POMEGRANATE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.POMEGRANATE_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.POMEGRANATE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Kiwi
        register(context, DFF_KIWI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.KIWI_LOG.get()),
                new StraightTrunkPlacer(1, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.KIWI_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Grapefruit
        register(context, DFF_GRAPEFRUIT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.GRAPEFRUIT_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.GRAPEFRUIT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Pear
        register(context, DFF_PEAR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.PEAR_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.PEAR_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Cherry
        register(context, DFF_CHERRY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.CHERRY_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.CHERRY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Lychee
        register(context, DFF_LYCHEE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.LYCHEE_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.LYCHEE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Avocado
        register(context, DFF_AVOCADO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.AVOCADO_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.AVOCADO_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Banana
        register(context, DFF_BANANA, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.BANANA_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.BANANA_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Dragonfruit
        register(context, DFF_DRAGONFRUIT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.DRAGONFRUIT_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.DRAGONFRUIT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Passionfruit
        register(context, DFF_PASSIONFRUIT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.PASSIONFRUIT_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.PASSIONFRUIT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Cashew
        register(context, DFF_CASHEW, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.CASHEW_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.CASHEW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Almond
        register(context, DFF_ALMOND, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.ALMOND_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.ALMOND_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Olive
        register(context, DFF_OLIVE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.OLIVE_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.OLIVE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //Walnut
        register(context, DFF_WALNUT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(DFFBlocks.WALNUT_LOG.get()),
                new StraightTrunkPlacer(2, 0, 2),
                BlockStateProvider.simple(DFFBlocksNoDatagen.WALNUT_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());




        //Wild Berry
        register(context, DFF_BLUEBERRY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.BLUEBERRY_BUSH.get())))));

        register(context, DFF_BLACKBERRY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.BLACKBERRY_BUSH.get())))));

        register(context, DFF_RASPBERRY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.RASPBERRY_BUSH.get())))));

        register(context, DFF_WHITE_RASPBERRY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocksNoDatagen.WHITE_RASPBERRY_BUSH.get())))));



        //Crop
        register(context, DFF_ROSEMARY, Feature.FLOWER,
                        new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_ROSEMARY.get())))));
        register(context, DFF_OREGANO, Feature.FLOWER,
                        new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_OREGANO.get())))));
        register(context, DFF_CILANTRO, Feature.FLOWER,
                        new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CILANTRO.get())))));
        register(context, DFF_MINT, Feature.FLOWER,
                        new RandomPatchConfiguration(6, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_MINT.get())))));


        register(context, DFF_BELL_PEPPER, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_BELL_PEPPER_PLANT.get())))));
        register(context, DFF_BLACK_BEAN, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_BLACK_BEAN_PLANT.get())))));
        register(context, DFF_BRUSSELS_SPROUTS, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_BRUSSELS_SPROUTS_PLANT.get())))));
        register(context, DFF_CORN, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CORN_PLANT.get())))));
        register(context, DFF_CELERY, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CELERY_PLANT.get())))));
        register(context, DFF_CHILI_PEPPER, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CHILI_PEPPER_PLANT.get())))));
        register(context, DFF_BUTTERNUT_SQUASH, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_BUTTERNUT_SQUASH_PLANT.get())))));
        register(context, DFF_CUCUMBER, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CUCUMBER_PLANT.get())))));
        register(context, DFF_CRANBERRY, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_CRANBERRY_PLANT.get())))));
        register(context, DFF_GARLIC, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_GARLIC_PLANT.get())))));
        register(context, DFF_GINGER, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_GINGER_PLANT.get())))));
        register(context, DFF_GREEN_BEAN, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_GREEN_BEAN_PLANT.get())))));
        register(context, DFF_PURPLE_GRAPE, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_PURPLE_GRAPE_PLANT.get())))));
        register(context, DFF_RED_GRAPE, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_RED_GRAPE_PLANT.get())))));
        register(context, DFF_JALEPENO_PEPPER, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_JALEPENO_PEPPER_PLANT.get())))));
        register(context, DFF_KIDNEY_BEAN, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_KIDNEY_BEAN_PLANT.get())))));
        register(context, DFF_ONION, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_ONION_PLANT.get())))));
        register(context, DFF_PEANUT, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_PEANUT_PLANT.get())))));
        register(context, DFF_RADISH, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_RADISH_PLANT.get())))));
        register(context, DFF_RYE, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_RYE_PLANT.get())))));
        register(context, DFF_SOYBEAN, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_SOYBEAN_PLANT.get())))));
        register(context, DFF_SUGAR_BEET, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_SUGAR_BEET_PLANT.get())))));
        register(context, DFF_STRAWBERRY, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_STRAWBERRY_PLANT.get())))));
        register(context, DFF_TOMATO, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_TOMATO_PLANT.get())))));
        register(context, DFF_WHITE_GRAPE, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_WHITE_GRAPE_PLANT.get())))));
        register(context, DFF_ZUCCHINI, Feature.FLOWER,
                        new RandomPatchConfiguration(2, 4, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(DFFBlocks.WILD_ZUCCHINI_PLANT.get())))));
        
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(DFFeastsMain.MODID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}


