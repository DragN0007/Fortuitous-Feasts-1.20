package com.dragn0007.dffeasts.worldgen;

import com.dragn0007.dffeasts.DFFeastsMain;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeHitter {
    public static final ResourceKey<BiomeModifier> ADD_DFF_ORANGE = registerKey("add_dff_orange");
    public static final ResourceKey<BiomeModifier> ADD_DFF_COCONUT = registerKey("add_dff_coconut");
    public static final ResourceKey<BiomeModifier> ADD_DFF_MANGO = registerKey("add_dff_mango");
    public static final ResourceKey<BiomeModifier> ADD_DFF_KIWI = registerKey("add_dff_kiwi");
    public static final ResourceKey<BiomeModifier> ADD_DFF_GRAPEFRUIT = registerKey("add_dff_grapefruit");
    public static final ResourceKey<BiomeModifier> ADD_DFF_POMEGRANATE = registerKey("add_dff_pomegranate");
    public static final ResourceKey<BiomeModifier> ADD_DFF_CHERRY = registerKey("add_dff_cherry");
    public static final ResourceKey<BiomeModifier> ADD_DFF_LYCHEE = registerKey("add_dff_lychee");
    public static final ResourceKey<BiomeModifier> ADD_DFF_AVOCADO = registerKey("add_dff_avocado");
    public static final ResourceKey<BiomeModifier> ADD_DFF_PEAR = registerKey("add_dff_pear");
    public static final ResourceKey<BiomeModifier> ADD_DFF_BANANA = registerKey("add_dff_banana");
    public static final ResourceKey<BiomeModifier> ADD_DFF_DRAGONFRUIT = registerKey("add_dff_dragonfruit");
    public static final ResourceKey<BiomeModifier> ADD_DFF_PASSIONFRUIT = registerKey("add_dff_passionfruit");
    public static final ResourceKey<BiomeModifier> ADD_DFF_CASHEW = registerKey("add_dff_cashew");
    public static final ResourceKey<BiomeModifier> ADD_DFF_ALMOND = registerKey("add_dff_almond");
    public static final ResourceKey<BiomeModifier> ADD_DFF_OLIVE = registerKey("add_dff_olive");
    public static final ResourceKey<BiomeModifier> ADD_DFF_WALNUT = registerKey("add_dff_walnut");


    public static final ResourceKey<BiomeModifier> ADD_DFF_BLUEBERRY = registerKey("add_dff_blueberry");
    public static final ResourceKey<BiomeModifier> ADD_DFF_BLACKBERRY = registerKey("add_dff_blackberry");
    public static final ResourceKey<BiomeModifier> ADD_DFF_RASPBERRY = registerKey("add_dff_raspberry");
    public static final ResourceKey<BiomeModifier> ADD_DFF_WHITE_RASPBERRY = registerKey("add_dff_white_raspberry");

    public static final ResourceKey<BiomeModifier> ADD_DFF_ROSEMARY = registerKey("add_dff_rosemary");
    public static final ResourceKey<BiomeModifier> ADD_DFF_OREGANO = registerKey("add_dff_oregano");
    public static final ResourceKey<BiomeModifier> ADD_DFF_CILANTRO = registerKey("add_dff_cilantro");
    public static final ResourceKey<BiomeModifier> ADD_DFF_MINT = registerKey("add_dff_mint");

    public static final ResourceKey<BiomeModifier> ADD_DFF_BELL_PEPPER = registerKey("add_dff_bell_pepper");
    public static final ResourceKey<BiomeModifier> ADD_DFF_BLACK_BEAN = registerKey("add_dff_black_bean");
    public static final ResourceKey<BiomeModifier> ADD_DFF_BRUSSELS_SPROUTS = registerKey("add_dff_brussels_sprouts");
    public static final ResourceKey<BiomeModifier> ADD_DFF_CORN = registerKey("add_dff_corn");
    public static final ResourceKey<BiomeModifier> ADD_DFF_CELERY = registerKey("add_dff_celery");
    public static final ResourceKey<BiomeModifier> ADD_DFF_CHILI_PEPPER = registerKey("add_dff_chili_pepper");
    public static final ResourceKey<BiomeModifier> ADD_DFF_BUTTERNUT_SQUASH = registerKey("add_dff_butternut_squash");
    public static final ResourceKey<BiomeModifier> ADD_DFF_CUCUMBER = registerKey("add_dff_cucumber");
    public static final ResourceKey<BiomeModifier> ADD_DFF_CRANBERRY = registerKey("add_dff_cranberry");
    public static final ResourceKey<BiomeModifier> ADD_DFF_GARLIC = registerKey("add_dff_garlic");
    public static final ResourceKey<BiomeModifier> ADD_DFF_GINGER = registerKey("add_dff_ginger");
    public static final ResourceKey<BiomeModifier> ADD_DFF_GREEN_BEAN = registerKey("add_dff_green_bean");
    public static final ResourceKey<BiomeModifier> ADD_DFF_PURPLE_GRAPE = registerKey("add_dff_purple_grape");
    public static final ResourceKey<BiomeModifier> ADD_DFF_RED_GRAPE = registerKey("add_dff_red_grape");
    public static final ResourceKey<BiomeModifier> ADD_DFF_JALEPENO_PEPPER = registerKey("add_dff_jalepeno_pepper");
    public static final ResourceKey<BiomeModifier> ADD_DFF_KIDNEY_BEAN = registerKey("add_dff_kidney_bean");
    public static final ResourceKey<BiomeModifier> ADD_DFF_ONION = registerKey("add_dff_onion");
    public static final ResourceKey<BiomeModifier> ADD_DFF_PEANUT = registerKey("add_dff_peanut");
    public static final ResourceKey<BiomeModifier> ADD_DFF_RADISH = registerKey("add_dff_radish");
    public static final ResourceKey<BiomeModifier> ADD_DFF_RYE = registerKey("add_dff_rye");
    public static final ResourceKey<BiomeModifier> ADD_DFF_SOYBEAN = registerKey("add_dff_soybean");
    public static final ResourceKey<BiomeModifier> ADD_DFF_SUGAR_BEET = registerKey("add_dff_sugar_beet");
    public static final ResourceKey<BiomeModifier> ADD_DFF_STRAWBERRY = registerKey("add_dff_strawberry");
    public static final ResourceKey<BiomeModifier> ADD_DFF_TOMATO = registerKey("add_dff_tomato");
    public static final ResourceKey<BiomeModifier> ADD_DFF_WHITE_GRAPE = registerKey("add_dff_white_grape");
    public static final ResourceKey<BiomeModifier> ADD_DFF_ZUCCHINI = registerKey("add_dff_zucchini");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_DFF_ORANGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_ORANGE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_COCONUT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_COCONUT_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_MANGO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_MANGO_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_KIWI, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_KIWI_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_GRAPEFRUIT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_GRAPEFRUIT_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_POMEGRANATE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_POMEGRANATE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_CHERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_CHERRY_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_LYCHEE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_LYCHEE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_AVOCADO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_AVOCADO_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_PEAR, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_PEAR_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_BANANA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_BANANA_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_DRAGONFRUIT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_DRAGONFRUIT_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_PASSIONFRUIT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_PASSIONFRUIT_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_CASHEW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_CASHEW_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_ALMOND, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_ALMOND_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_OLIVE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_OLIVE_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DFF_WALNUT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_WALNUT_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


        context.register(ADD_DFF_BLUEBERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_BLUEBERRY_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        
         context.register(ADD_DFF_BLACKBERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_BLACKBERRY_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));
         
         context.register(ADD_DFF_RASPBERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_RASPBERRY_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));
         
         context.register(ADD_DFF_WHITE_RASPBERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_WHITE_RASPBERRY_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));
         

         context.register(ADD_DFF_ROSEMARY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_ROSEMARY_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));
         
         context.register(ADD_DFF_OREGANO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_HOT),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_OREGANO_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));
         
         context.register(ADD_DFF_CILANTRO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_CILANTRO_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));
         
         context.register(ADD_DFF_MINT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_COLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_MINT_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));
         

         context.register(ADD_DFF_BELL_PEPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_BELL_PEPPER_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_BLACK_BEAN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_BLACK_BEAN_PLANT_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_BRUSSELS_SPROUTS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_BRUSSELS_SPROUTS_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_CORN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_CORN_PLANT_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_CELERY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_CELERY_PLANT_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_CHILI_PEPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_CHILI_PEPPER_PLANT_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_BUTTERNUT_SQUASH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_BUTTERNUT_SQUASH_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_CUCUMBER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_CUCUMBER_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_CRANBERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_WET),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_CRANBERRY_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_GARLIC, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_GARLIC_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_GINGER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_GINGER_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_GREEN_BEAN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_GREEN_BEAN_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_PURPLE_GRAPE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_PURPLE_GRAPE_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_RED_GRAPE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_RED_GRAPE_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_JALEPENO_PEPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_JALEPENO_PEPPER_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_KIDNEY_BEAN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_KIDNEY_BEAN_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_ONION, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_ONION_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_PEANUT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_PEANUT_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_RADISH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_RADISH_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_RYE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_RYE_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_SOYBEAN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_SOYBEAN_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_SUGAR_BEET, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_SUGAR_BEET_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_STRAWBERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_STRAWBERRY_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_TOMATO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_TOMATO_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_WHITE_GRAPE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_WHITE_GRAPE_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_DFF_ZUCCHINI, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DFF_ZUCCHINI_PLACED)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));
    }
    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(DFFeastsMain.MODID, name));
    }
}