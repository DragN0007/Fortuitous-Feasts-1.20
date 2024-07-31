package com.dragn0007.dffeasts.item;


import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DFFItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DFFeastsMain.MODID);

    public static final RegistryObject<CreativeModeTab> CROP_GROUP = CREATIVE_MODE_TABS.register("cropmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DFFItems.RED_GRAPES.get())).title(Component.translatable("itemGroup.cropmodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(DFFItems.ALMONDS.get());
                        output.accept(DFFItems.AVOCADO.get());
                        output.accept(DFFItems.BANANA.get());
                        output.accept(DFFItems.BELL_PEPPER.get());
                        output.accept(DFFItems.BLACKBERRY.get());
                        output.accept(DFFItems.BLACK_BEANS.get());
                        output.accept(DFFItems.BLUEBERRIES.get());
                        output.accept(DFFItems.BRUSSELS_SPROUTS.get());
                        output.accept(DFFItems.BUTTERNUT_SQUASH.get());
                        output.accept(DFFItems.CASHEWS.get());
                        output.accept(DFFItems.CELERY.get());
                        output.accept(DFFItems.CHERRIES.get());
                        output.accept(DFFItems.CHILI_PEPPER.get());
                        output.accept(DFFItems.COCONUT.get());
                        output.accept(DFFItems.CORN.get());
                        output.accept(DFFItems.CRANBERRIES.get());
                        output.accept(DFFItems.CUCUMBER.get());
                        output.accept(DFFItems.DRAGONFRUIT.get());
                        output.accept(DFFItems.GARLIC.get());
                        output.accept(DFFItems.GRAPEFRUIT.get());
                        output.accept(DFFItems.PURPLE_GRAPES.get());
                        output.accept(DFFItems.RED_GRAPES.get());
                        output.accept(DFFItems.WHITE_GRAPES.get());
                        output.accept(DFFItems.GREEN_BEANS.get());
                        output.accept(DFFItems.GINGER.get());
                        output.accept(DFFItems.JALEPENO_PEPPER.get());
                        output.accept(DFFItems.KIDNEY_BEANS.get());
                        output.accept(DFFItems.KIWI.get());
                        output.accept(DFFItems.LYCHEE.get());
                        output.accept(DFFItems.MANGO.get());
                        output.accept(DFFItems.OLIVES.get());
                        output.accept(DFFItems.ONION.get());
                        output.accept(DFFItems.ORANGE.get());
                        output.accept(DFFItems.PEAR.get());
                        output.accept(DFFItems.PEANUTS.get());
                        output.accept(DFFItems.PASSIONFRUIT.get());
                        output.accept(DFFItems.POMEGRANATE.get());
                        output.accept(DFFItems.RADISH.get());
                        output.accept(DFFItems.RASPBERRY.get());
                        output.accept(DFFItems.WHITE_RASPBERRY.get());
                        output.accept(DFFItems.RYE.get());
                        output.accept(DFFItems.SOYBEANS.get());
                        output.accept(DFFItems.STRAWBERRY.get());
                        output.accept(DFFItems.SUGAR_BEET.get());
                        output.accept(DFFItems.TOMATO.get());
                        output.accept(DFFItems.WALNUT.get());
                        output.accept(DFFItems.ZUCCHINI.get());

                        output.accept(DFFItems.CILANTRO.get());
                        output.accept(DFFItems.MINT.get());
                        output.accept(DFFItems.OREGANO.get());
                        output.accept(DFFItems.ROSEMARY.get());

                        output.accept(DFFItems.ORANGE_SEEDS.get());
                        output.accept(DFFItems.GRAPEFRUIT_SEEDS.get());
                        output.accept(DFFItems.MANGO_SEED.get());
                        output.accept(DFFItems.AVOCADO_PIT.get());
                        output.accept(DFFItems.KIWI_SEEDS.get());
                        output.accept(DFFItems.PEAR_SEEDS.get());
                        output.accept(DFFItems.LYCHEE_SEED.get());
                        output.accept(DFFItems.CHERRY_PIT.get());
                        output.accept(DFFItems.POMEGRANATE_SEEDS.get());
                        output.accept(DFFItems.BANANA_SEEDS.get());
                        output.accept(DFFItems.DRAGONFRUIT_SEEDS.get());
                        output.accept(DFFItems.PASSIONFRUIT_SEEDS.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> FOOD_GROUP = CREATIVE_MODE_TABS.register("foodmodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DFFItems.STRAWBERRY_PASTRY.get())).title(Component.translatable("itemGroup.foodmodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(DFFItems.VEGGIE_PASTA.get());
                        output.accept(DFFItems.VEGGIE_PLATTER.get());
                        output.accept(DFFItems.SOUP.get());
                        output.accept(DFFItems.BLOOMING_ONION.get());
                        output.accept(DFFItems.GARLIC_PARM_WINGS.get());
                        output.accept(DFFItems.DUMPLINGS.get());
                        output.accept(DFFItems.CHICKEN_PARM.get());
                        output.accept(DFFItems.MAC_N_CHEESE.get());
                        output.accept(DFFItems.PEANUT_BUTTER.get());
                        output.accept(DFFItems.PEANUT_BUTTER_JELLY.get());
                        output.accept(DFFItems.POT_ROAST.get());
                        output.accept(DFFItems.SAUSAGE_MAC.get());
                        output.accept(DFFItems.SPAGHETTI.get());
                        output.accept(DFFItems.SPAGHETTI_AND_MEATBALLS.get());
                        output.accept(DFFItems.TOMATO_SOUP.get());
                        output.accept(DFFItems.AVOCADO_TOAST.get());
                        output.accept(DFFItems.MERMAID_TOAST.get());
                        output.accept(DFFItems.LASAGNA.get());

                        output.accept(DFFItems.PICKLES.get());
                        output.accept(DFFItems.PICKLED_GARLIC.get());
                        output.accept(DFFItems.PICKLED_GINGER.get());
                        output.accept(DFFItems.PICKLED_PEPPERS.get());
                        output.accept(DFFItems.PICKLED_RADISH.get());
                        output.accept(DFFItems.PICKLED_OLIVES.get());

                        output.accept(DFFItems.MEAT_WRAP.get());
                        output.accept(DFFItems.MEAT_CHEESE_WRAP.get());
                        output.accept(DFFItems.MEAT_VEGGIE_WRAP.get());
                        output.accept(DFFItems.VEGGIE_WRAP.get());

                        output.accept(DFFItems.PLAIN_DONUT.get());
                        output.accept(DFFItems.CHOCOLATE_DONUT.get());
                        output.accept(DFFItems.POWDERED_DONUT.get());
                        output.accept(DFFItems.CHOCOLATE_POWDERED_DONUT.get());
                        output.accept(DFFItems.GLAZED_DONUT.get());
                        output.accept(DFFItems.ICED_CHOCOLATE_DONUT.get());
                        output.accept(DFFItems.CHOCOLATE_GLAZED_DONUT.get());
                        output.accept(DFFItems.DOUBLE_CHOCOLATE_DONUT.get());
                        output.accept(DFFItems.STRAWBERRY_GLAZED_DONUT.get());
                        output.accept(DFFItems.STRAWBERRY_CHOCOLATE_DONUT.get());
                        output.accept(DFFItems.JELLY_DONUT.get());
                        output.accept(DFFItems.PEANUT_BUTTER_DONUT.get());

                        output.accept(DFFItems.CHOCOLATE_CAKE.get());
                        output.accept(DFFItems.YELLOW_CHOCOLATE_CAKE.get());
                        output.accept(DFFItems.CHERRY_CHOCOLATE_CAKE.get());
                        output.accept(DFFItems.RED_VELVET_CAKE.get());
                        output.accept(DFFItems.WHITE_CAKE.get());
                        output.accept(DFFItems.BLACKBERRY_CAKE.get());
                        output.accept(DFFItems.BLUEBERRY_CAKE.get());
                        output.accept(DFFItems.CRANBERRY_CAKE.get());
                        output.accept(DFFItems.GRAPEFRUIT_CAKE.get());
                        output.accept(DFFItems.ORANGE_CAKE.get());
                        output.accept(DFFItems.PURPLE_GRAPE_CAKE.get());
                        output.accept(DFFItems.RASPBERRY_CAKE.get());
                        output.accept(DFFItems.RED_GRAPE_CAKE.get());
                        output.accept(DFFItems.STRAWBERRY_CAKE.get());
                        output.accept(DFFItems.GREEN_GRAPE_CAKE.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_CAKE.get());
                        output.accept(DFFItems.MANGO_CAKE.get());
                        output.accept(DFFItems.CHERRY_CAKE.get());
                        output.accept(DFFItems.KIWI_CAKE.get());
                        output.accept(DFFItems.LYCHEE_CAKE.get());
                        output.accept(DFFItems.PEAR_CAKE.get());
                        output.accept(DFFItems.POMEGRANATE_CAKE.get());

                        output.accept(DFFItems.BLACKBERRY_PIE.get());
                        output.accept(DFFItems.BLUEBERRY_PIE.get());
                        output.accept(DFFItems.CRANBERRY_PIE.get());
                        output.accept(DFFItems.GRAPEFRUIT_PIE.get());
                        output.accept(DFFItems.ORANGE_PIE.get());
                        output.accept(DFFItems.PURPLE_GRAPE_PIE.get());
                        output.accept(DFFItems.RASPBERRY_PIE.get());
                        output.accept(DFFItems.RED_GRAPE_PIE.get());
                        output.accept(DFFItems.STRAWBERRY_PIE.get());
                        output.accept(DFFItems.GREEN_GRAPE_PIE.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_PIE.get());
                        output.accept(DFFItems.MANGO_PIE.get());
                        output.accept(DFFItems.CHERRY_PIE.get());
                        output.accept(DFFItems.KIWI_PIE.get());
                        output.accept(DFFItems.LYCHEE_PIE.get());
                        output.accept(DFFItems.PEAR_PIE.get());
                        output.accept(DFFItems.POMEGRANATE_PIE.get());
                        output.accept(DFFItems.PASSIONFRUIT_PIE.get());
                        output.accept(DFFItems.DRAGONFRUIT_PIE.get());

                        output.accept(DFFItems.BLACKBERRY_JAM.get());
                        output.accept(DFFItems.BLUEBERRY_JAM.get());
                        output.accept(DFFItems.CRANBERRY_JAM.get());
                        output.accept(DFFItems.GRAPEFRUIT_JAM.get());
                        output.accept(DFFItems.ORANGE_JAM.get());
                        output.accept(DFFItems.PURPLE_GRAPE_JAM.get());
                        output.accept(DFFItems.RASPBERRY_JAM.get());
                        output.accept(DFFItems.RED_GRAPE_JAM.get());
                        output.accept(DFFItems.STRAWBERRY_JAM.get());
                        output.accept(DFFItems.GREEN_GRAPE_JAM.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_JAM.get());
                        output.accept(DFFItems.MANGO_JAM.get());
                        output.accept(DFFItems.CHERRY_JAM.get());
                        output.accept(DFFItems.KIWI_JAM.get());
                        output.accept(DFFItems.LYCHEE_JAM.get());
                        output.accept(DFFItems.PEAR_JAM.get());
                        output.accept(DFFItems.POMEGRANATE_JAM.get());
                        output.accept(DFFItems.PASSIONFRUIT_JAM.get());
                        output.accept(DFFItems.DRAGONFRUIT_JAM.get());

                        output.accept(DFFItems.BLACKBERRY_PASTRY.get());
                        output.accept(DFFItems.BLUEBERRY_PASTRY.get());
                        output.accept(DFFItems.CRANBERRY_PASTRY.get());
                        output.accept(DFFItems.GRAPEFRUIT_PASTRY.get());
                        output.accept(DFFItems.ORANGE_PASTRY.get());
                        output.accept(DFFItems.PURPLE_GRAPE_PASTRY.get());
                        output.accept(DFFItems.RASPBERRY_PASTRY.get());
                        output.accept(DFFItems.RED_GRAPE_PASTRY.get());
                        output.accept(DFFItems.STRAWBERRY_PASTRY.get());
                        output.accept(DFFItems.GREEN_GRAPE_PASTRY.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_PASTRY.get());
                        output.accept(DFFItems.MANGO_PASTRY.get());
                        output.accept(DFFItems.CHERRY_PASTRY.get());
                        output.accept(DFFItems.KIWI_PASTRY.get());
                        output.accept(DFFItems.LYCHEE_PASTRY.get());
                        output.accept(DFFItems.PEAR_PASTRY.get());
                        output.accept(DFFItems.POMEGRANATE_PASTRY.get());
                        output.accept(DFFItems.PASSIONFRUIT_PASTRY.get());
                        output.accept(DFFItems.DRAGONFRUIT_PASTRY.get());

                        output.accept(DFFItems.BLACKBERRY_SODA.get());
                        output.accept(DFFItems.BLUEBERRY_SODA.get());
                        output.accept(DFFItems.CRANBERRY_SODA.get());
                        output.accept(DFFItems.GRAPEFRUIT_SODA.get());
                        output.accept(DFFItems.ORANGE_SODA.get());
                        output.accept(DFFItems.PURPLE_GRAPE_SODA.get());
                        output.accept(DFFItems.RASPBERRY_SODA.get());
                        output.accept(DFFItems.RED_GRAPE_SODA.get());
                        output.accept(DFFItems.STRAWBERRY_SODA.get());
                        output.accept(DFFItems.GREEN_GRAPE_SODA.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_SODA.get());
                        output.accept(DFFItems.MANGO_SODA.get());
                        output.accept(DFFItems.CHERRY_SODA.get());
                        output.accept(DFFItems.KIWI_SODA.get());
                        output.accept(DFFItems.LYCHEE_SODA.get());
                        output.accept(DFFItems.PEAR_SODA.get());
                        output.accept(DFFItems.POMEGRANATE_SODA.get());
                        output.accept(DFFItems.GINGER_SODA.get());
                        output.accept(DFFItems.PASSIONFRUIT_SODA.get());
                        output.accept(DFFItems.DRAGONFRUIT_SODA.get());

                        output.accept(DFFItems.BLACKBERRY_TURNOVER.get());
                        output.accept(DFFItems.BLUEBERRY_TURNOVER.get());
                        output.accept(DFFItems.CRANBERRY_TURNOVER.get());
                        output.accept(DFFItems.GRAPEFRUIT_TURNOVER.get());
                        output.accept(DFFItems.ORANGE_TURNOVER.get());
                        output.accept(DFFItems.PURPLE_GRAPE_TURNOVER.get());
                        output.accept(DFFItems.RASPBERRY_TURNOVER.get());
                        output.accept(DFFItems.RED_GRAPE_TURNOVER.get());
                        output.accept(DFFItems.STRAWBERRY_TURNOVER.get());
                        output.accept(DFFItems.GREEN_GRAPE_TURNOVER.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_TURNOVER.get());
                        output.accept(DFFItems.MANGO_TURNOVER.get());
                        output.accept(DFFItems.CHERRY_TURNOVER.get());
                        output.accept(DFFItems.KIWI_TURNOVER.get());
                        output.accept(DFFItems.LYCHEE_TURNOVER.get());
                        output.accept(DFFItems.PEAR_TURNOVER.get());
                        output.accept(DFFItems.POMEGRANATE_TURNOVER.get());
                        output.accept(DFFItems.PASSIONFRUIT_TURNOVER.get());
                        output.accept(DFFItems.DRAGONFRUIT_TURNOVER.get());

                        output.accept(DFFItems.CHOCOLATE_CHIP_COOKIE.get());
                        output.accept(DFFItems.CRANBERRY_COOKIE.get());
                        output.accept(DFFItems.DOUBLE_CHOCOLATE_CHIP_COOKIE.get());
                        output.accept(DFFItems.ICED_SUGAR_COOKIE.get());
                        output.accept(DFFItems.PEANUT_BUTTER_COOKIE.get());
                        output.accept(DFFItems.STRAWBERRY_CHEESECAKE_COOKIE.get());
                        output.accept(DFFItems.SUGAR_COOKIE.get());

                        output.accept(DFFItems.BLACKBERRY_SMOOTHIE.get());
                        output.accept(DFFItems.BLUEBERRY_SMOOTHIE.get());
                        output.accept(DFFItems.CRANBERRY_SMOOTHIE.get());
                        output.accept(DFFItems.GRAPEFRUIT_SMOOTHIE.get());
                        output.accept(DFFItems.ORANGE_SMOOTHIE.get());
                        output.accept(DFFItems.PURPLE_GRAPE_SMOOTHIE.get());
                        output.accept(DFFItems.RASPBERRY_SMOOTHIE.get());
                        output.accept(DFFItems.RED_GRAPE_SMOOTHIE.get());
                        output.accept(DFFItems.STRAWBERRY_SMOOTHIE.get());
                        output.accept(DFFItems.GREEN_GRAPE_SMOOTHIE.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_SMOOTHIE.get());
                        output.accept(DFFItems.MANGO_SMOOTHIE.get());
                        output.accept(DFFItems.CHERRY_SMOOTHIE.get());
                        output.accept(DFFItems.KIWI_SMOOTHIE.get());
                        output.accept(DFFItems.LYCHEE_SMOOTHIE.get());
                        output.accept(DFFItems.PEAR_SMOOTHIE.get());
                        output.accept(DFFItems.POMEGRANATE_SMOOTHIE.get());
                        output.accept(DFFItems.PASSIONFRUIT_SMOOTHIE.get());
                        output.accept(DFFItems.DRAGONFRUIT_SMOOTHIE.get());

                        output.accept(DFFItems.ROASTED_BRUSSELS_SPROUTS.get());
                        output.accept(DFFItems.ROASTED_BUTTERNUT_SQUASH.get());
                        output.accept(DFFItems.ROASTED_CORN.get());
                        output.accept(DFFItems.ROASTED_CHILI_PEPPER.get());
                        output.accept(DFFItems.ROASTED_CUCUMBER.get());
                        output.accept(DFFItems.ROASTED_PEANUTS.get());
                        output.accept(DFFItems.ROASTED_JALEPENO_PEPPER.get());
                        output.accept(DFFItems.ROASTED_RADISH.get());
                        output.accept(DFFItems.ROASTED_ZUCCHINI.get());
                        output.accept(DFFItems.ROASTED_TOMATO.get());
                        output.accept(DFFItems.ROASTED_GREEN_BEANS.get());
                        output.accept(DFFItems.ROASTED_GARLIC.get());

                        output.accept(DFFItems.DRIED_BLACKBERRY.get());
                        output.accept(DFFItems.DRIED_BLUEBERRIES.get());
                        output.accept(DFFItems.DRIED_CRANBERRIES.get());
                        output.accept(DFFItems.DRIED_GRAPEFRUIT.get());
                        output.accept(DFFItems.DRIED_ORANGE.get());
                        output.accept(DFFItems.DRIED_PURPLE_GRAPES.get());
                        output.accept(DFFItems.DRIED_RASPBERRY.get());
                        output.accept(DFFItems.DRIED_RED_GRAPES.get());
                        output.accept(DFFItems.DRIED_STRAWBERRY.get());
                        output.accept(DFFItems.DRIED_GREEN_GRAPES.get());
                        output.accept(DFFItems.DRIED_WHITE_RASPBERRY.get());
                        output.accept(DFFItems.DRIED_MANGO.get());
                        output.accept(DFFItems.DRIED_CHERRIES.get());
                        output.accept(DFFItems.DRIED_KIWI.get());
                        output.accept(DFFItems.DRIED_LYCHEE.get());
                        output.accept(DFFItems.DRIED_PEAR.get());
                        output.accept(DFFItems.DRIED_POMEGRANATE.get());

                        output.accept(DFFItems.BLACKBERRY_JUICE.get());
                        output.accept(DFFItems.BLUEBERRY_JUICE.get());
                        output.accept(DFFItems.CRANBERRY_JUICE.get());
                        output.accept(DFFItems.GRAPEFRUIT_JUICE.get());
                        output.accept(DFFItems.ORANGE_JUICE.get());
                        output.accept(DFFItems.PURPLE_GRAPE_JUICE.get());
                        output.accept(DFFItems.RASPBERRY_JUICE.get());
                        output.accept(DFFItems.RED_GRAPE_JUICE.get());
                        output.accept(DFFItems.STRAWBERRY_JUICE.get());
                        output.accept(DFFItems.GREEN_GRAPE_JUICE.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_JUICE.get());
                        output.accept(DFFItems.MANGO_JUICE.get());
                        output.accept(DFFItems.CHERRY_JUICE.get());
                        output.accept(DFFItems.KIWI_JUICE.get());
                        output.accept(DFFItems.LYCHEE_JUICE.get());
                        output.accept(DFFItems.PEAR_JUICE.get());
                        output.accept(DFFItems.POMEGRANATE_JUICE.get());
                        output.accept(DFFItems.PASSIONFRUIT_JUICE.get());
                        output.accept(DFFItems.DRAGONFRUIT_JUICE.get());

                        output.accept(DFFItems.PARMESAN_CHEESE.get());
                        output.accept(DFFItems.CHEDDAR_CHEESE.get());
                        output.accept(DFFItems.MOZZARELLA_CHEESE.get());

                        output.accept(DFFItems.BLACKBERRY_TEA.get());
                        output.accept(DFFItems.BLUEBERRY_TEA.get());
                        output.accept(DFFItems.CRANBERRY_TEA.get());
                        output.accept(DFFItems.GRAPEFRUIT_TEA.get());
                        output.accept(DFFItems.ORANGE_TEA.get());
                        output.accept(DFFItems.PURPLE_GRAPE_TEA.get());
                        output.accept(DFFItems.RASPBERRY_TEA.get());
                        output.accept(DFFItems.RED_GRAPE_TEA.get());
                        output.accept(DFFItems.STRAWBERRY_TEA.get());
                        output.accept(DFFItems.GREEN_GRAPE_TEA.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_TEA.get());
                        output.accept(DFFItems.MANGO_TEA.get());
                        output.accept(DFFItems.CHERRY_TEA.get());
                        output.accept(DFFItems.KIWI_TEA.get());
                        output.accept(DFFItems.LYCHEE_TEA.get());
                        output.accept(DFFItems.PEAR_TEA.get());
                        output.accept(DFFItems.POMEGRANATE_TEA.get());
                        output.accept(DFFItems.PASSIONFRUIT_TEA.get());
                        output.accept(DFFItems.DRAGONFRUIT_TEA.get());

                        output.accept(DFFItems.BEEF_SAUSAGE.get());
                        output.accept(DFFItems.CHICKEN_SAUSAGE.get());
                        output.accept(DFFItems.MUTTON_SAUSAGE.get());
                        output.accept(DFFItems.PORK_SAUSAGE.get());
                        output.accept(DFFItems.COOKED_BEEF_SAUSAGE.get());
                        output.accept(DFFItems.COOKED_CHICKEN_SAUSAGE.get());
                        output.accept(DFFItems.COOKED_MUTTON_SAUSAGE.get());
                        output.accept(DFFItems.COOKED_PORK_SAUSAGE.get());

                        output.accept(DFFItems.BLACKBERRY_WINE.get());
                        output.accept(DFFItems.BLUEBERRY_WINE.get());
                        output.accept(DFFItems.CRANBERRY_WINE.get());
                        output.accept(DFFItems.GRAPEFRUIT_WINE.get());
                        output.accept(DFFItems.ORANGE_WINE.get());
                        output.accept(DFFItems.PURPLE_GRAPE_WINE.get());
                        output.accept(DFFItems.RASPBERRY_WINE.get());
                        output.accept(DFFItems.RED_GRAPE_WINE.get());
                        output.accept(DFFItems.STRAWBERRY_WINE.get());
                        output.accept(DFFItems.GREEN_GRAPE_WINE.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_WINE.get());
                        output.accept(DFFItems.MANGO_WINE.get());
                        output.accept(DFFItems.CHERRY_WINE.get());
                        output.accept(DFFItems.KIWI_WINE.get());
                        output.accept(DFFItems.LYCHEE_WINE.get());
                        output.accept(DFFItems.PEAR_WINE.get());
                        output.accept(DFFItems.POMEGRANATE_WINE.get());
                        output.accept(DFFItems.PASSIONFRUIT_WINE.get());
                        output.accept(DFFItems.DRAGONFRUIT_WINE.get());

                        output.accept(DFFItems.BLACKBERRY_BEER.get());
                        output.accept(DFFItems.BLUEBERRY_BEER.get());
                        output.accept(DFFItems.CRANBERRY_BEER.get());
                        output.accept(DFFItems.GRAPEFRUIT_BEER.get());
                        output.accept(DFFItems.ORANGE_BEER.get());
                        output.accept(DFFItems.PURPLE_GRAPE_BEER.get());
                        output.accept(DFFItems.RASPBERRY_BEER.get());
                        output.accept(DFFItems.RED_GRAPE_BEER.get());
                        output.accept(DFFItems.STRAWBERRY_BEER.get());
                        output.accept(DFFItems.GREEN_GRAPE_BEER.get());
                        output.accept(DFFItems.WHITE_RASPBERRY_BEER.get());
                        output.accept(DFFItems.MANGO_BEER.get());
                        output.accept(DFFItems.CHERRY_BEER.get());
                        output.accept(DFFItems.KIWI_BEER.get());
                        output.accept(DFFItems.LYCHEE_BEER.get());
                        output.accept(DFFItems.PEAR_BEER.get());
                        output.accept(DFFItems.POMEGRANATE_BEER.get());
                        output.accept(DFFItems.PASSIONFRUIT_BEER.get());
                        output.accept(DFFItems.DRAGONFRUIT_BEER.get());

                        output.accept(DFFItems.DOUGH.get());
                        output.accept(DFFItems.COCOA_POWDER.get());
                        output.accept(DFFItems.MILK_BOTTLE.get());
                        output.accept(DFFItems.FLOUR.get());
                        output.accept(DFFItems.PASTA.get());
                        output.accept(DFFItems.PANKO.get());
                        output.accept(DFFItems.PURIFIED_WATER.get());
                        output.accept(DFFItems.BUTTER.get());
                        output.accept(DFFItems.CHEESE_CURDS.get());
                        output.accept(DFFItems.TOFU.get());
                        output.accept(DFFItems.COOKED_TOFU.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> DECOR_GROUP = CREATIVE_MODE_TABS.register("decormodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DFFItems.CROP_COIN.get())).title(Component.translatable("itemGroup.decormodtab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(DFFItems.CROP_COIN.get());

                        output.accept(DFFBlocksNoDatagen.CROP_BARREL.get());
                        output.accept(DFFBlocksNoDatagen.CROP_BAG_VEGGIES.get());
                        output.accept(DFFBlocksNoDatagen.CROP_BAG_FRUITS.get());

                        output.accept(DFFBlocks.ORANGE_LOG.get());
                        output.accept(DFFBlocks.ORANGE_PLANKS.get());
                        output.accept(DFFBlocks.ORANGE_SLAB.get());
                        output.accept(DFFBlocks.ORANGE_STAIRS.get());
                        output.accept(DFFBlocks.ORANGE_FENCE.get());
                        output.accept(DFFBlocks.ORANGE_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.ORANGE_LEAVES.get());
                        output.accept(DFFBlocks.ORANGE_DOOR.get());
                        output.accept(DFFBlocks.ORANGE_TRAPDOOR.get());

                        output.accept(DFFBlocks.COCONUT_LOG.get());
                        output.accept(DFFBlocks.COCONUT_PLANKS.get());
                        output.accept(DFFBlocks.COCONUT_SLAB.get());
                        output.accept(DFFBlocks.COCONUT_STAIRS.get());
                        output.accept(DFFBlocks.COCONUT_FENCE.get());
                        output.accept(DFFBlocks.COCONUT_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.COCONUT_LEAVES.get());
                        output.accept(DFFBlocks.COCONUT_DOOR.get());
                        output.accept(DFFBlocks.COCONUT_TRAPDOOR.get());

                        output.accept(DFFBlocks.GRAPEFRUIT_LOG.get());
                        output.accept(DFFBlocks.GRAPEFRUIT_PLANKS.get());
                        output.accept(DFFBlocks.GRAPEFRUIT_SLAB.get());
                        output.accept(DFFBlocks.GRAPEFRUIT_STAIRS.get());
                        output.accept(DFFBlocks.GRAPEFRUIT_FENCE.get());
                        output.accept(DFFBlocks.GRAPEFRUIT_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.GRAPEFRUIT_LEAVES.get());
                        output.accept(DFFBlocks.GRAPEFRUIT_DOOR.get());
                        output.accept(DFFBlocks.GRAPEFRUIT_TRAPDOOR.get());

                        output.accept(DFFBlocks.MANGO_LOG.get());
                        output.accept(DFFBlocks.MANGO_PLANKS.get());
                        output.accept(DFFBlocks.MANGO_SLAB.get());
                        output.accept(DFFBlocks.MANGO_STAIRS.get());
                        output.accept(DFFBlocks.MANGO_FENCE.get());
                        output.accept(DFFBlocks.MANGO_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.MANGO_LEAVES.get());
                        output.accept(DFFBlocks.MANGO_DOOR.get());
                        output.accept(DFFBlocks.MANGO_TRAPDOOR.get());

                        output.accept(DFFBlocks.POMEGRANATE_LOG.get());
                        output.accept(DFFBlocks.POMEGRANATE_PLANKS.get());
                        output.accept(DFFBlocks.POMEGRANATE_SLAB.get());
                        output.accept(DFFBlocks.POMEGRANATE_STAIRS.get());
                        output.accept(DFFBlocks.POMEGRANATE_FENCE.get());
                        output.accept(DFFBlocks.POMEGRANATE_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.POMEGRANATE_LEAVES.get());
                        output.accept(DFFBlocks.POMEGRANATE_DOOR.get());
                        output.accept(DFFBlocks.POMEGRANATE_TRAPDOOR.get());

                        output.accept(DFFBlocks.CHERRY_LOG.get());
                        output.accept(DFFBlocks.CHERRY_PLANKS.get());
                        output.accept(DFFBlocks.CHERRY_SLAB.get());
                        output.accept(DFFBlocks.CHERRY_STAIRS.get());
                        output.accept(DFFBlocks.CHERRY_FENCE.get());
                        output.accept(DFFBlocks.CHERRY_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.CHERRY_LEAVES.get());
                        output.accept(DFFBlocks.CHERRY_DOOR.get());
                        output.accept(DFFBlocks.CHERRY_TRAPDOOR.get());

                        output.accept(DFFBlocks.LYCHEE_LOG.get());
                        output.accept(DFFBlocks.LYCHEE_PLANKS.get());
                        output.accept(DFFBlocks.LYCHEE_SLAB.get());
                        output.accept(DFFBlocks.LYCHEE_STAIRS.get());
                        output.accept(DFFBlocks.LYCHEE_FENCE.get());
                        output.accept(DFFBlocks.LYCHEE_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.LYCHEE_LEAVES.get());
                        output.accept(DFFBlocks.LYCHEE_DOOR.get());
                        output.accept(DFFBlocks.LYCHEE_TRAPDOOR.get());

                        output.accept(DFFBlocks.KIWI_LOG.get());
                        output.accept(DFFBlocks.KIWI_PLANKS.get());
                        output.accept(DFFBlocks.KIWI_SLAB.get());
                        output.accept(DFFBlocks.KIWI_STAIRS.get());
                        output.accept(DFFBlocks.KIWI_FENCE.get());
                        output.accept(DFFBlocks.KIWI_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.KIWI_LEAVES.get());
                        output.accept(DFFBlocks.KIWI_DOOR.get());
                        output.accept(DFFBlocks.KIWI_TRAPDOOR.get());

                        output.accept(DFFBlocks.PEAR_LOG.get());
                        output.accept(DFFBlocks.PEAR_PLANKS.get());
                        output.accept(DFFBlocks.PEAR_SLAB.get());
                        output.accept(DFFBlocks.PEAR_STAIRS.get());
                        output.accept(DFFBlocks.PEAR_FENCE.get());
                        output.accept(DFFBlocks.PEAR_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.PEAR_LEAVES.get());
                        output.accept(DFFBlocks.PEAR_DOOR.get());
                        output.accept(DFFBlocks.PEAR_TRAPDOOR.get());

                        output.accept(DFFBlocks.AVOCADO_LOG.get());
                        output.accept(DFFBlocks.AVOCADO_PLANKS.get());
                        output.accept(DFFBlocks.AVOCADO_SLAB.get());
                        output.accept(DFFBlocks.AVOCADO_STAIRS.get());
                        output.accept(DFFBlocks.AVOCADO_FENCE.get());
                        output.accept(DFFBlocks.AVOCADO_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.AVOCADO_LEAVES.get());
                        output.accept(DFFBlocks.AVOCADO_DOOR.get());
                        output.accept(DFFBlocks.AVOCADO_TRAPDOOR.get());

                        output.accept(DFFBlocks.WALNUT_LOG.get());
                        output.accept(DFFBlocks.WALNUT_PLANKS.get());
                        output.accept(DFFBlocks.WALNUT_SLAB.get());
                        output.accept(DFFBlocks.WALNUT_STAIRS.get());
                        output.accept(DFFBlocks.WALNUT_FENCE.get());
                        output.accept(DFFBlocks.WALNUT_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.WALNUT_LEAVES.get());
                        output.accept(DFFBlocks.WALNUT_DOOR.get());
                        output.accept(DFFBlocks.WALNUT_TRAPDOOR.get());

                        output.accept(DFFBlocks.ALMOND_LOG.get());
                        output.accept(DFFBlocks.ALMOND_PLANKS.get());
                        output.accept(DFFBlocks.ALMOND_SLAB.get());
                        output.accept(DFFBlocks.ALMOND_STAIRS.get());
                        output.accept(DFFBlocks.ALMOND_FENCE.get());
                        output.accept(DFFBlocks.ALMOND_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.ALMOND_LEAVES.get());
                        output.accept(DFFBlocks.ALMOND_DOOR.get());
                        output.accept(DFFBlocks.ALMOND_TRAPDOOR.get());

                        output.accept(DFFBlocks.DRAGONFRUIT_LOG.get());
                        output.accept(DFFBlocks.DRAGONFRUIT_PLANKS.get());
                        output.accept(DFFBlocks.DRAGONFRUIT_SLAB.get());
                        output.accept(DFFBlocks.DRAGONFRUIT_STAIRS.get());
                        output.accept(DFFBlocks.DRAGONFRUIT_FENCE.get());
                        output.accept(DFFBlocks.DRAGONFRUIT_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.DRAGONFRUIT_LEAVES.get());
                        output.accept(DFFBlocks.DRAGONFRUIT_DOOR.get());
                        output.accept(DFFBlocks.DRAGONFRUIT_TRAPDOOR.get());

                        output.accept(DFFBlocks.PASSIONFRUIT_LOG.get());
                        output.accept(DFFBlocks.PASSIONFRUIT_PLANKS.get());
                        output.accept(DFFBlocks.PASSIONFRUIT_SLAB.get());
                        output.accept(DFFBlocks.PASSIONFRUIT_STAIRS.get());
                        output.accept(DFFBlocks.PASSIONFRUIT_FENCE.get());
                        output.accept(DFFBlocks.PASSIONFRUIT_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.PASSIONFRUIT_LEAVES.get());
                        output.accept(DFFBlocks.PASSIONFRUIT_DOOR.get());
                        output.accept(DFFBlocks.PASSIONFRUIT_TRAPDOOR.get());

                        output.accept(DFFBlocks.CASHEW_LOG.get());
                        output.accept(DFFBlocks.CASHEW_PLANKS.get());
                        output.accept(DFFBlocks.CASHEW_SLAB.get());
                        output.accept(DFFBlocks.CASHEW_STAIRS.get());
                        output.accept(DFFBlocks.CASHEW_FENCE.get());
                        output.accept(DFFBlocks.CASHEW_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.CASHEW_LEAVES.get());
                        output.accept(DFFBlocks.CASHEW_DOOR.get());
                        output.accept(DFFBlocks.CASHEW_TRAPDOOR.get());

                        output.accept(DFFBlocks.OLIVE_LOG.get());
                        output.accept(DFFBlocks.OLIVE_PLANKS.get());
                        output.accept(DFFBlocks.OLIVE_SLAB.get());
                        output.accept(DFFBlocks.OLIVE_STAIRS.get());
                        output.accept(DFFBlocks.OLIVE_FENCE.get());
                        output.accept(DFFBlocks.OLIVE_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.OLIVE_LEAVES.get());
                        output.accept(DFFBlocks.OLIVE_DOOR.get());
                        output.accept(DFFBlocks.OLIVE_TRAPDOOR.get());

                        output.accept(DFFBlocks.BANANA_LOG.get());
                        output.accept(DFFBlocks.BANANA_PLANKS.get());
                        output.accept(DFFBlocks.BANANA_SLAB.get());
                        output.accept(DFFBlocks.BANANA_STAIRS.get());
                        output.accept(DFFBlocks.BANANA_FENCE.get());
                        output.accept(DFFBlocks.BANANA_FENCE_GATE.get());
                        output.accept(DFFBlocksNoDatagen.BANANA_LEAVES.get());
                        output.accept(DFFBlocks.BANANA_DOOR.get());
                        output.accept(DFFBlocks.BANANA_TRAPDOOR.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
