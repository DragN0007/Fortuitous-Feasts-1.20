package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.item.DFFItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class DFFItemModelProvider extends ItemModelProvider {
    public DFFItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DFFeastsMain.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Update 1.7
        simpleItem(DFFItems.CHOCOLATE_CHIP_COOKIE);
        simpleItem(DFFItems.CRANBERRY_COOKIE);
        simpleItem(DFFItems.DOUBLE_CHOCOLATE_CHIP_COOKIE);
        simpleItem(DFFItems.ICED_SUGAR_COOKIE);
        simpleItem(DFFItems.PEANUT_BUTTER_COOKIE);
        simpleItem(DFFItems.STRAWBERRY_CHEESECAKE_COOKIE);
        simpleItem(DFFItems.SUGAR_COOKIE);

        simpleItem(DFFItems.WHITE_BREAD);
        simpleItem(DFFItems.BANANA_BREAD);
        simpleItem(DFFItems.BLUEBERRY_BREAD);
        simpleItem(DFFItems.CRANBERRY_BREAD);
        simpleItem(DFFItems.RYE_BREAD);
        simpleItem(DFFItems.NUT_BREAD);

        //Update 1.6
        simpleItem(DFFItems.APPLE_BEER);
        simpleItem(DFFItems.BLACKBERRY_BEER);
        simpleItem(DFFItems.BLUEBERRY_BEER);
        simpleItem(DFFItems.CRANBERRY_BEER);
        simpleItem(DFFItems.GRAPEFRUIT_BEER);
        simpleItem(DFFItems.ORANGE_BEER);
        simpleItem(DFFItems.PURPLE_GRAPE_BEER);
        simpleItem(DFFItems.RASPBERRY_BEER);
        simpleItem(DFFItems.RED_GRAPE_BEER);
        simpleItem(DFFItems.STRAWBERRY_BEER);
        simpleItem(DFFItems.GREEN_GRAPE_BEER);
        simpleItem(DFFItems.WHITE_RASPBERRY_BEER);
        simpleItem(DFFItems.MANGO_BEER);
        simpleItem(DFFItems.CHERRY_BEER);
        simpleItem(DFFItems.KIWI_BEER);
        simpleItem(DFFItems.LYCHEE_BEER);
        simpleItem(DFFItems.PEAR_BEER);
        simpleItem(DFFItems.POMEGRANATE_BEER);
        simpleItem(DFFItems.DRAGONFRUIT_BEER);
        simpleItem(DFFItems.PASSIONFRUIT_BEER);


        simpleItem(DFFItems.DOUGH);
        simpleItem(DFFItems.COCOA_POWDER);
        simpleItem(DFFItems.MILK_BOTTLE);
        simpleItem(DFFItems.FLOUR);
        simpleItem(DFFItems.PASTA);
        simpleItem(DFFItems.PANKO);
        simpleItem(DFFItems.PURIFIED_WATER);
        simpleItem(DFFItems.BUTTER);
        simpleItem(DFFItems.CHEESE_CURDS);
        simpleItem(DFFItems.TOFU);
        simpleItem(DFFItems.COOKED_TOFU);


        simpleItem(DFFItems.DRAGONFRUIT_TURNOVER);
        simpleItem(DFFItems.PASSIONFRUIT_TURNOVER);
        simpleItem(DFFItems.PICKLED_OLIVES);
        simpleItem(DFFItems.DRAGONFRUIT_PIE);
        simpleItem(DFFItems.PASSIONFRUIT_PIE);
        simpleItem(DFFItems.DRAGONFRUIT_JAM);
        simpleItem(DFFItems.PASSIONFRUIT_JAM);
        simpleItem(DFFItems.DRAGONFRUIT_PASTRY);
        simpleItem(DFFItems.PASSIONFRUIT_PASTRY);
        simpleItem(DFFItems.DRAGONFRUIT_JUICE);
        simpleItem(DFFItems.PASSIONFRUIT_JUICE);
        simpleItem(DFFItems.DRAGONFRUIT_WINE);
        simpleItem(DFFItems.PASSIONFRUIT_WINE);
        simpleItem(DFFItems.DRAGONFRUIT_SODA);
        simpleItem(DFFItems.PASSIONFRUIT_SODA);
        simpleItem(DFFItems.DRAGONFRUIT_SMOOTHIE);
        simpleItem(DFFItems.PASSIONFRUIT_SMOOTHIE);
        simpleItem(DFFItems.DRAGONFRUIT_TEA);
        simpleItem(DFFItems.PASSIONFRUIT_TEA);



        simpleItem(DFFItems.BLACKBERRY_TURNOVER);
        simpleItem(DFFItems.BLUEBERRY_TURNOVER);
        simpleItem(DFFItems.CRANBERRY_TURNOVER);
        simpleItem(DFFItems.GRAPEFRUIT_TURNOVER);
        simpleItem(DFFItems.ORANGE_TURNOVER);
        simpleItem(DFFItems.PURPLE_GRAPE_TURNOVER);
        simpleItem(DFFItems.RASPBERRY_TURNOVER);
        simpleItem(DFFItems.RED_GRAPE_TURNOVER);
        simpleItem(DFFItems.STRAWBERRY_TURNOVER);
        simpleItem(DFFItems.GREEN_GRAPE_TURNOVER);
        simpleItem(DFFItems.WHITE_RASPBERRY_TURNOVER);
        simpleItem(DFFItems.MANGO_TURNOVER);
        simpleItem(DFFItems.CHERRY_TURNOVER);
        simpleItem(DFFItems.KIWI_TURNOVER);
        simpleItem(DFFItems.LYCHEE_TURNOVER);
        simpleItem(DFFItems.PEAR_TURNOVER);
        simpleItem(DFFItems.POMEGRANATE_TURNOVER);

        simpleItem(DFFItems.CHOCOLATE_CAKE);
        simpleItem(DFFItems.YELLOW_CHOCOLATE_CAKE);
        simpleItem(DFFItems.CHERRY_CHOCOLATE_CAKE);
        simpleItem(DFFItems.RED_VELVET_CAKE);
        simpleItem(DFFItems.WHITE_CAKE);
        simpleItem(DFFItems.BLACKBERRY_CAKE);
        simpleItem(DFFItems.BLUEBERRY_CAKE);
        simpleItem(DFFItems.CRANBERRY_CAKE);
        simpleItem(DFFItems.GRAPEFRUIT_CAKE);
        simpleItem(DFFItems.ORANGE_CAKE);
        simpleItem(DFFItems.PURPLE_GRAPE_CAKE);
        simpleItem(DFFItems.RASPBERRY_CAKE);
        simpleItem(DFFItems.RED_GRAPE_CAKE);
        simpleItem(DFFItems.STRAWBERRY_CAKE);
        simpleItem(DFFItems.GREEN_GRAPE_CAKE);
        simpleItem(DFFItems.WHITE_RASPBERRY_CAKE);
        simpleItem(DFFItems.MANGO_CAKE);
        simpleItem(DFFItems.CHERRY_CAKE);
        simpleItem(DFFItems.KIWI_CAKE);
        simpleItem(DFFItems.LYCHEE_CAKE);
        simpleItem(DFFItems.PEAR_CAKE);
        simpleItem(DFFItems.POMEGRANATE_CAKE);

        simpleItem(DFFItems.PARMESAN_CHEESE);
        simpleItem(DFFItems.CHEDDAR_CHEESE);
        simpleItem(DFFItems.MOZZARELLA_CHEESE);

        simpleItem(DFFItems.VEGGIE_PASTA);
        simpleItem(DFFItems.VEGGIE_PLATTER);
        simpleItem(DFFItems.SOUP);
        simpleItem(DFFItems.BLOOMING_ONION);
        simpleItem(DFFItems.GARLIC_PARM_WINGS);
        simpleItem(DFFItems.DUMPLINGS);
        simpleItem(DFFItems.CHICKEN_PARM);
        simpleItem(DFFItems.MAC_N_CHEESE);
        simpleItem(DFFItems.PEANUT_BUTTER);
        simpleItem(DFFItems.PEANUT_BUTTER_JELLY);
        simpleItem(DFFItems.POT_ROAST);
        simpleItem(DFFItems.SAUSAGE_MAC);
        simpleItem(DFFItems.SPAGHETTI);
        simpleItem(DFFItems.SPAGHETTI_AND_MEATBALLS);
        simpleItem(DFFItems.TOMATO_SOUP);
        simpleItem(DFFItems.AVOCADO_TOAST);
        simpleItem(DFFItems.MERMAID_TOAST);
        simpleItem(DFFItems.LASAGNA);

        simpleItem(DFFItems.PICKLES);
        simpleItem(DFFItems.PICKLED_GARLIC);
        simpleItem(DFFItems.PICKLED_GINGER);
        simpleItem(DFFItems.PICKLED_PEPPERS);
        simpleItem(DFFItems.PICKLED_RADISH);

        simpleItem(DFFItems.MEAT_WRAP);
        simpleItem(DFFItems.MEAT_CHEESE_WRAP);
        simpleItem(DFFItems.MEAT_VEGGIE_WRAP);
        simpleItem(DFFItems.VEGGIE_WRAP);

        simpleItem(DFFItems.BEEF_SAUSAGE);
        simpleItem(DFFItems.CHICKEN_SAUSAGE);
        simpleItem(DFFItems.MUTTON_SAUSAGE);
        simpleItem(DFFItems.PORK_SAUSAGE);
        simpleItem(DFFItems.COOKED_BEEF_SAUSAGE);
        simpleItem(DFFItems.COOKED_CHICKEN_SAUSAGE);
        simpleItem(DFFItems.COOKED_MUTTON_SAUSAGE);
        simpleItem(DFFItems.COOKED_PORK_SAUSAGE);

        simpleItem(DFFItems.ROASTED_BRUSSELS_SPROUTS);
        simpleItem(DFFItems.ROASTED_BUTTERNUT_SQUASH);
        simpleItem(DFFItems.ROASTED_CORN);
        simpleItem(DFFItems.ROASTED_CHILI_PEPPER);
        simpleItem(DFFItems.ROASTED_CUCUMBER);
        simpleItem(DFFItems.ROASTED_PEANUTS);
        simpleItem(DFFItems.ROASTED_JALEPENO_PEPPER);
        simpleItem(DFFItems.ROASTED_RADISH);
        simpleItem(DFFItems.ROASTED_ZUCCHINI);
        simpleItem(DFFItems.ROASTED_TOMATO);
        simpleItem(DFFItems.ROASTED_GREEN_BEANS);
        simpleItem(DFFItems.ROASTED_GARLIC);

        simpleItem(DFFItems.BLACKBERRY_PIE);
        simpleItem(DFFItems.BLUEBERRY_PIE);
        simpleItem(DFFItems.CRANBERRY_PIE);
        simpleItem(DFFItems.GRAPEFRUIT_PIE);
        simpleItem(DFFItems.ORANGE_PIE);
        simpleItem(DFFItems.PURPLE_GRAPE_PIE);
        simpleItem(DFFItems.RASPBERRY_PIE);
        simpleItem(DFFItems.RED_GRAPE_PIE);
        simpleItem(DFFItems.STRAWBERRY_PIE);
        simpleItem(DFFItems.GREEN_GRAPE_PIE);
        simpleItem(DFFItems.WHITE_RASPBERRY_PIE);
        simpleItem(DFFItems.MANGO_PIE);
        simpleItem(DFFItems.CHERRY_PIE);
        simpleItem(DFFItems.KIWI_PIE);
        simpleItem(DFFItems.LYCHEE_PIE);
        simpleItem(DFFItems.PEAR_PIE);
        simpleItem(DFFItems.POMEGRANATE_PIE);

        simpleItem(DFFItems.BLACKBERRY_JAM);
        simpleItem(DFFItems.BLUEBERRY_JAM);
        simpleItem(DFFItems.CRANBERRY_JAM);
        simpleItem(DFFItems.GRAPEFRUIT_JAM);
        simpleItem(DFFItems.ORANGE_JAM);
        simpleItem(DFFItems.PURPLE_GRAPE_JAM);
        simpleItem(DFFItems.RASPBERRY_JAM);
        simpleItem(DFFItems.RED_GRAPE_JAM);
        simpleItem(DFFItems.STRAWBERRY_JAM);
        simpleItem(DFFItems.GREEN_GRAPE_JAM);
        simpleItem(DFFItems.WHITE_RASPBERRY_JAM);
        simpleItem(DFFItems.MANGO_JAM);
        simpleItem(DFFItems.CHERRY_JAM);
        simpleItem(DFFItems.KIWI_JAM);
        simpleItem(DFFItems.LYCHEE_JAM);
        simpleItem(DFFItems.PEAR_JAM);
        simpleItem(DFFItems.POMEGRANATE_JAM);

        simpleItem(DFFItems.BLACKBERRY_PASTRY);
        simpleItem(DFFItems.BLUEBERRY_PASTRY);
        simpleItem(DFFItems.CRANBERRY_PASTRY);
        simpleItem(DFFItems.GRAPEFRUIT_PASTRY);
        simpleItem(DFFItems.ORANGE_PASTRY);
        simpleItem(DFFItems.PURPLE_GRAPE_PASTRY);
        simpleItem(DFFItems.RASPBERRY_PASTRY);
        simpleItem(DFFItems.RED_GRAPE_PASTRY);
        simpleItem(DFFItems.STRAWBERRY_PASTRY);
        simpleItem(DFFItems.GREEN_GRAPE_PASTRY);
        simpleItem(DFFItems.WHITE_RASPBERRY_PASTRY);
        simpleItem(DFFItems.MANGO_PASTRY);
        simpleItem(DFFItems.CHERRY_PASTRY);
        simpleItem(DFFItems.KIWI_PASTRY);
        simpleItem(DFFItems.LYCHEE_PASTRY);
        simpleItem(DFFItems.PEAR_PASTRY);
        simpleItem(DFFItems.POMEGRANATE_PASTRY);

        simpleItem(DFFItems.BLACKBERRY_SODA);
        simpleItem(DFFItems.BLUEBERRY_SODA);
        simpleItem(DFFItems.CRANBERRY_SODA);
        simpleItem(DFFItems.GRAPEFRUIT_SODA);
        simpleItem(DFFItems.ORANGE_SODA);
        simpleItem(DFFItems.PURPLE_GRAPE_SODA);
        simpleItem(DFFItems.RASPBERRY_SODA);
        simpleItem(DFFItems.RED_GRAPE_SODA);
        simpleItem(DFFItems.STRAWBERRY_SODA);
        simpleItem(DFFItems.GREEN_GRAPE_SODA);
        simpleItem(DFFItems.WHITE_RASPBERRY_SODA);
        simpleItem(DFFItems.MANGO_SODA);
        simpleItem(DFFItems.CHERRY_SODA);
        simpleItem(DFFItems.KIWI_SODA);
        simpleItem(DFFItems.LYCHEE_SODA);
        simpleItem(DFFItems.PEAR_SODA);
        simpleItem(DFFItems.POMEGRANATE_SODA);
        simpleItem(DFFItems.GINGER_SODA);

        simpleItem(DFFItems.BLACKBERRY_SMOOTHIE);
        simpleItem(DFFItems.BLUEBERRY_SMOOTHIE);
        simpleItem(DFFItems.CRANBERRY_SMOOTHIE);
        simpleItem(DFFItems.GRAPEFRUIT_SMOOTHIE);
        simpleItem(DFFItems.ORANGE_SMOOTHIE);
        simpleItem(DFFItems.PURPLE_GRAPE_SMOOTHIE);
        simpleItem(DFFItems.RASPBERRY_SMOOTHIE);
        simpleItem(DFFItems.RED_GRAPE_SMOOTHIE);
        simpleItem(DFFItems.STRAWBERRY_SMOOTHIE);
        simpleItem(DFFItems.GREEN_GRAPE_SMOOTHIE);
        simpleItem(DFFItems.WHITE_RASPBERRY_SMOOTHIE);
        simpleItem(DFFItems.MANGO_SMOOTHIE);
        simpleItem(DFFItems.CHERRY_SMOOTHIE);
        simpleItem(DFFItems.KIWI_SMOOTHIE);
        simpleItem(DFFItems.LYCHEE_SMOOTHIE);
        simpleItem(DFFItems.PEAR_SMOOTHIE);
        simpleItem(DFFItems.POMEGRANATE_SMOOTHIE);

        simpleItem(DFFItems.DRIED_BLACKBERRY);
        simpleItem(DFFItems.DRIED_BLUEBERRIES);
        simpleItem(DFFItems.DRIED_CRANBERRIES);
        simpleItem(DFFItems.DRIED_GRAPEFRUIT);
        simpleItem(DFFItems.DRIED_ORANGE);
        simpleItem(DFFItems.DRIED_PURPLE_GRAPES);
        simpleItem(DFFItems.DRIED_RASPBERRY);
        simpleItem(DFFItems.DRIED_RED_GRAPES);
        simpleItem(DFFItems.DRIED_STRAWBERRY);
        simpleItem(DFFItems.DRIED_GREEN_GRAPES);
        simpleItem(DFFItems.DRIED_WHITE_RASPBERRY);
        simpleItem(DFFItems.DRIED_MANGO);
        simpleItem(DFFItems.DRIED_CHERRIES);
        simpleItem(DFFItems.DRIED_KIWI);
        simpleItem(DFFItems.DRIED_LYCHEE);
        simpleItem(DFFItems.DRIED_PEAR);
        simpleItem(DFFItems.DRIED_POMEGRANATE);

        simpleItem(DFFItems.BLACKBERRY_JUICE);
        simpleItem(DFFItems.BLUEBERRY_JUICE);
        simpleItem(DFFItems.CRANBERRY_JUICE);
        simpleItem(DFFItems.GRAPEFRUIT_JUICE);
        simpleItem(DFFItems.ORANGE_JUICE);
        simpleItem(DFFItems.PURPLE_GRAPE_JUICE);
        simpleItem(DFFItems.RASPBERRY_JUICE);
        simpleItem(DFFItems.RED_GRAPE_JUICE);
        simpleItem(DFFItems.STRAWBERRY_JUICE);
        simpleItem(DFFItems.GREEN_GRAPE_JUICE);
        simpleItem(DFFItems.WHITE_RASPBERRY_JUICE);
        simpleItem(DFFItems.MANGO_JUICE);
        simpleItem(DFFItems.CHERRY_JUICE);
        simpleItem(DFFItems.KIWI_JUICE);
        simpleItem(DFFItems.LYCHEE_JUICE);
        simpleItem(DFFItems.PEAR_JUICE);
        simpleItem(DFFItems.POMEGRANATE_JUICE);

        simpleItem(DFFItems.BLACKBERRY_TEA);
        simpleItem(DFFItems.BLUEBERRY_TEA);
        simpleItem(DFFItems.CRANBERRY_TEA);
        simpleItem(DFFItems.GRAPEFRUIT_TEA);
        simpleItem(DFFItems.ORANGE_TEA);
        simpleItem(DFFItems.PURPLE_GRAPE_TEA);
        simpleItem(DFFItems.RASPBERRY_TEA);
        simpleItem(DFFItems.RED_GRAPE_TEA);
        simpleItem(DFFItems.STRAWBERRY_TEA);
        simpleItem(DFFItems.GREEN_GRAPE_TEA);
        simpleItem(DFFItems.WHITE_RASPBERRY_TEA);
        simpleItem(DFFItems.MANGO_TEA);
        simpleItem(DFFItems.CHERRY_TEA);
        simpleItem(DFFItems.KIWI_TEA);
        simpleItem(DFFItems.LYCHEE_TEA);
        simpleItem(DFFItems.PEAR_TEA);
        simpleItem(DFFItems.POMEGRANATE_TEA);

        simpleItem(DFFItems.BLACKBERRY_WINE);
        simpleItem(DFFItems.BLUEBERRY_WINE);
        simpleItem(DFFItems.CRANBERRY_WINE);
        simpleItem(DFFItems.GRAPEFRUIT_WINE);
        simpleItem(DFFItems.ORANGE_WINE);
        simpleItem(DFFItems.PURPLE_GRAPE_WINE);
        simpleItem(DFFItems.RASPBERRY_WINE);
        simpleItem(DFFItems.RED_GRAPE_WINE);
        simpleItem(DFFItems.STRAWBERRY_WINE);
        simpleItem(DFFItems.GREEN_GRAPE_WINE);
        simpleItem(DFFItems.WHITE_RASPBERRY_WINE);
        simpleItem(DFFItems.MANGO_WINE);
        simpleItem(DFFItems.CHERRY_WINE);
        simpleItem(DFFItems.KIWI_WINE);
        simpleItem(DFFItems.LYCHEE_WINE);
        simpleItem(DFFItems.PEAR_WINE);
        simpleItem(DFFItems.POMEGRANATE_WINE);

        simpleItem(DFFItems.PLAIN_DONUT);
        simpleItem(DFFItems.CHOCOLATE_DONUT);
        simpleItem(DFFItems.POWDERED_DONUT);
        simpleItem(DFFItems.CHOCOLATE_POWDERED_DONUT);
        simpleItem(DFFItems.GLAZED_DONUT);
        simpleItem(DFFItems.ICED_CHOCOLATE_DONUT);
        simpleItem(DFFItems.CHOCOLATE_GLAZED_DONUT);
        simpleItem(DFFItems.DOUBLE_CHOCOLATE_DONUT);
        simpleItem(DFFItems.STRAWBERRY_GLAZED_DONUT);
        simpleItem(DFFItems.STRAWBERRY_CHOCOLATE_DONUT);
        simpleItem(DFFItems.JELLY_DONUT);
        simpleItem(DFFItems.PEANUT_BUTTER_DONUT);


        simpleItem(DFFItems.BELL_PEPPER);
        simpleItem(DFFItems.BLACKBERRY);
        simpleItem(DFFItems.BLUEBERRIES);
        simpleItem(DFFItems.CORN);
        simpleItem(DFFItems.CRANBERRIES);
        simpleItem(DFFItems.GARLIC);
        simpleItem(DFFItems.GRAPEFRUIT);
        simpleItem(DFFItems.GREEN_BEANS);
        simpleItem(DFFItems.ONION);
        simpleItem(DFFItems.ORANGE);
        simpleItem(DFFItems.PURPLE_GRAPES);
        simpleItem(DFFItems.RASPBERRY);
        simpleItem(DFFItems.RED_GRAPES);
        simpleItem(DFFItems.STRAWBERRY);
        simpleItem(DFFItems.WHITE_GRAPES);
        simpleItem(DFFItems.WHITE_RASPBERRY);
        simpleItem(DFFItems.JALEPENO_PEPPER);
        simpleItem(DFFItems.CHILI_PEPPER);
        simpleItem(DFFItems.MANGO);
        simpleItem(DFFItems.TOMATO);
        simpleItem(DFFItems.RADISH);
        simpleItem(DFFItems.COCONUT);
        simpleItem(DFFItems.SOYBEANS);
        simpleItem(DFFItems.AVOCADO);
        simpleItem(DFFItems.BRUSSELS_SPROUTS);
        simpleItem(DFFItems.BUTTERNUT_SQUASH);
        simpleItem(DFFItems.CELERY);
        simpleItem(DFFItems.CHERRIES);
        simpleItem(DFFItems.CUCUMBER);
        simpleItem(DFFItems.GINGER);
        simpleItem(DFFItems.KIDNEY_BEANS);
        simpleItem(DFFItems.BLACK_BEANS);
        simpleItem(DFFItems.KIWI);
        simpleItem(DFFItems.LYCHEE);
        simpleItem(DFFItems.PEANUTS);
        simpleItem(DFFItems.PEAR);
        simpleItem(DFFItems.POMEGRANATE);
        simpleItem(DFFItems.RYE);
        simpleItem(DFFItems.ZUCCHINI);
        simpleItem(DFFItems.SUGAR_BEET);
        simpleItem(DFFItems.WALNUT);
        simpleItem(DFFItems.BANANA);
        simpleItem(DFFItems.DRAGONFRUIT);
        simpleItem(DFFItems.PASSIONFRUIT);
        simpleItem(DFFItems.CASHEWS);
        simpleItem(DFFItems.ALMONDS);
        simpleItem(DFFItems.OLIVES);

        simpleItem(DFFItems.OREGANO);
        simpleItem(DFFItems.ROSEMARY);
        simpleItem(DFFItems.CILANTRO);
        simpleItem(DFFItems.MINT);

        simpleItem(DFFItems.ORANGE_SEEDS);
        simpleItem(DFFItems.GRAPEFRUIT_SEEDS);
        simpleItem(DFFItems.MANGO_SEED);
        simpleItem(DFFItems.AVOCADO_PIT);
        simpleItem(DFFItems.CHERRY_PIT);
        simpleItem(DFFItems.KIWI_SEEDS);
        simpleItem(DFFItems.LYCHEE_SEED);
        simpleItem(DFFItems.PEAR_SEEDS);
        simpleItem(DFFItems.POMEGRANATE_SEEDS);
        simpleItem(DFFItems.BANANA_SEEDS);
        simpleItem(DFFItems.DRAGONFRUIT_SEEDS);
        simpleItem(DFFItems.PASSIONFRUIT_SEEDS);

        simpleItem(DFFItems.CROP_COIN);
    }


    private ItemModelBuilder simpleSpriteBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DFFeastsMain.MODID,"block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DFFeastsMain.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DFFeastsMain.MODID,"item/" + item.getId().getPath()));
    }
}