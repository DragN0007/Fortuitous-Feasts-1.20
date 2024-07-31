package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.block.DFFBlocks;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.dragn0007.dffeasts.item.DFFItems;
import com.dragn0007.dffeasts.util.DFFTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class DFFRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public DFFRecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        //TODO; Update 1.7
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.WHITE_BREAD.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BANANA_BREAD.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BANANA)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BLUEBERRY_BREAD.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BLUEBERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CRANBERRY_BREAD.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.ORANGE)
                .requires(DFFTags.Items.CRANBERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.NUT_BREAD.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.NUTS)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.RYE_BREAD.get())
                .requires(DFFTags.Items.RYE)
                .requires(DFFTags.Items.RYE)
                .requires(DFFTags.Items.RYE)
                .unlockedBy("has_rye", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.RYE)
                        .build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CHOCOLATE_CHIP_COOKIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.COCOA)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CRANBERRY_COOKIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.DRIED_CRANBERRIES.get())
                .requires(DFFItems.DRIED_CRANBERRIES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DOUBLE_CHOCOLATE_CHIP_COOKIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.COCOA)
                .requires(DFFTags.Items.COCOA)
                .requires(DFFTags.Items.MILK)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.ICED_SUGAR_COOKIE.get())
                .requires(DFFItems.SUGAR_COOKIE.get())
                .requires(DFFTags.Items.MILK)
                .unlockedBy("has_sugar_cookie", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.SUGAR_COOKIE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PEANUT_BUTTER_COOKIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PEANUT_BUTTER.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.STRAWBERRY_CHEESECAKE_COOKIE.get())
                .requires(DFFItems.SUGAR_COOKIE.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFItems.STRAWBERRY_JAM.get())
                .unlockedBy("has_sugar_cookie", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.SUGAR_COOKIE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.SUGAR_COOKIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);


        //TODO; Update 1.6
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BLACKBERRY_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BLUEBERRY_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CRANBERRY_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CHERRY_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.STRAWBERRY_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.GRAPEFRUIT_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.POMEGRANATE_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.GREEN_GRAPE_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.KIWI_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.LYCHEE_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.MANGO_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.ORANGE_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PEAR_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PURPLE_GRAPE_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.RASPBERRY_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.RED_GRAPE_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))

                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.WHITE_RASPBERRY_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.DRAGONFRUIT_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_BEER.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.RYE)
                .requires(DFFItems.PASSIONFRUIT_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);





        //TODO; Update 1.5

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.DRAGONFRUIT_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.PASSIONFRUIT_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.DRAGONFRUIT)
                .requires(DFFTags.Items.DRAGONFRUIT)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.PASSIONFRUIT)
                .requires(DFFTags.Items.PASSIONFRUIT)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.DRAGONFRUIT_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PASSIONFRUIT_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.DRAGONFRUIT_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.PASSIONFRUIT_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.DRAGONFRUIT_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.PASSIONFRUIT_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.DRAGONFRUIT)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.PASSIONFRUIT)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.DRAGONFRUIT)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.PASSIONFRUIT)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.DRAGONFRUIT_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PASSIONFRUIT_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);




        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PICKLED_OLIVES.get(), 2)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFTags.Items.GARLIC)
                .requires(DFFTags.Items.OLIVE)
                .requires(DFFTags.Items.OLIVE)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.DRAGONFRUIT_SEEDS.get())
                .requires(DFFTags.Items.DRAGONFRUIT)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.DRAGONFRUIT_PLANKS.get(), 4)
                .requires(DFFBlocks.DRAGONFRUIT_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.DRAGONFRUIT_STAIRS.get(), 4)
                .define('A', DFFBlocks.DRAGONFRUIT_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.DRAGONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.DRAGONFRUIT_SLAB.get(), 3)
                .define('A', DFFBlocks.DRAGONFRUIT_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.DRAGONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.DRAGONFRUIT_FENCE.get(), 3)
                .define('A', DFFBlocks.DRAGONFRUIT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.DRAGONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.DRAGONFRUIT_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.DRAGONFRUIT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.DRAGONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.DRAGONFRUIT_DOOR.get(), 3)
                .define('A', DFFBlocks.DRAGONFRUIT_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.DRAGONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.DRAGONFRUIT_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.DRAGONFRUIT_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.DRAGONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PASSIONFRUIT_SEEDS.get())
                .requires(DFFTags.Items.PASSIONFRUIT)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.PASSIONFRUIT_PLANKS.get(), 4)
                .requires(DFFBlocks.PASSIONFRUIT_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PASSIONFRUIT_STAIRS.get(), 4)
                .define('A', DFFBlocks.PASSIONFRUIT_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PASSIONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PASSIONFRUIT_SLAB.get(), 3)
                .define('A', DFFBlocks.PASSIONFRUIT_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PASSIONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PASSIONFRUIT_FENCE.get(), 3)
                .define('A', DFFBlocks.PASSIONFRUIT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PASSIONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PASSIONFRUIT_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.PASSIONFRUIT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PASSIONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PASSIONFRUIT_DOOR.get(), 3)
                .define('A', DFFBlocks.PASSIONFRUIT_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PASSIONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PASSIONFRUIT_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.PASSIONFRUIT_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PASSIONFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BANANA_SEEDS.get())
                .requires(DFFTags.Items.BANANA)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.BANANA_PLANKS.get(), 4)
                .requires(DFFBlocks.BANANA_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.BANANA_STAIRS.get(), 4)
                .define('A', DFFBlocks.BANANA_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.BANANA_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.BANANA_SLAB.get(), 3)
                .define('A', DFFBlocks.BANANA_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.BANANA_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.BANANA_FENCE.get(), 3)
                .define('A', DFFBlocks.BANANA_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.BANANA_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.BANANA_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.BANANA_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.BANANA_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.BANANA_DOOR.get(), 3)
                .define('A', DFFBlocks.BANANA_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.BANANA_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.BANANA_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.BANANA_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.BANANA_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.WALNUT_PLANKS.get(), 4)
                .requires(DFFBlocks.WALNUT_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.WALNUT_STAIRS.get(), 4)
                .define('A', DFFBlocks.WALNUT_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.WALNUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.WALNUT_SLAB.get(), 3)
                .define('A', DFFBlocks.WALNUT_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.WALNUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.WALNUT_FENCE.get(), 3)
                .define('A', DFFBlocks.WALNUT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.WALNUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.WALNUT_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.WALNUT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.WALNUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.WALNUT_DOOR.get(), 3)
                .define('A', DFFBlocks.WALNUT_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.WALNUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.WALNUT_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.WALNUT_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.WALNUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.ALMOND_PLANKS.get(), 4)
                .requires(DFFBlocks.ALMOND_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ALMOND_STAIRS.get(), 4)
                .define('A', DFFBlocks.ALMOND_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ALMOND_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ALMOND_SLAB.get(), 3)
                .define('A', DFFBlocks.ALMOND_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ALMOND_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ALMOND_FENCE.get(), 3)
                .define('A', DFFBlocks.ALMOND_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ALMOND_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ALMOND_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.ALMOND_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ALMOND_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ALMOND_DOOR.get(), 3)
                .define('A', DFFBlocks.ALMOND_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ALMOND_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ALMOND_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.ALMOND_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ALMOND_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.CASHEW_PLANKS.get(), 4)
                .requires(DFFBlocks.CASHEW_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CASHEW_STAIRS.get(), 4)
                .define('A', DFFBlocks.CASHEW_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CASHEW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CASHEW_SLAB.get(), 3)
                .define('A', DFFBlocks.CASHEW_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CASHEW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CASHEW_FENCE.get(), 3)
                .define('A', DFFBlocks.CASHEW_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CASHEW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CASHEW_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.CASHEW_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CASHEW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CASHEW_DOOR.get(), 3)
                .define('A', DFFBlocks.CASHEW_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CASHEW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CASHEW_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.CASHEW_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CASHEW_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.OLIVE_PLANKS.get(), 4)
                .requires(DFFBlocks.OLIVE_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.OLIVE_STAIRS.get(), 4)
                .define('A', DFFBlocks.OLIVE_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.OLIVE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.OLIVE_SLAB.get(), 3)
                .define('A', DFFBlocks.OLIVE_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.OLIVE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.OLIVE_FENCE.get(), 3)
                .define('A', DFFBlocks.OLIVE_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.OLIVE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.OLIVE_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.OLIVE_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.OLIVE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.OLIVE_DOOR.get(), 3)
                .define('A', DFFBlocks.OLIVE_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.OLIVE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.OLIVE_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.OLIVE_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.OLIVE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);







        //TODO; Turnover
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BLACKBERRY_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.BLACKBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BLUEBERRY_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.BLUEBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CRANBERRY_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.CRANBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CHERRY_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.CHERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.STRAWBERRY_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.STRAWBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.GRAPEFRUIT_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.GRAPEFRUIT_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.POMEGRANATE_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.POMEGRANATE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.GREEN_GRAPE_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.GREEN_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.KIWI_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.KIWI_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.LYCHEE_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.LYCHEE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.MANGO_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.MANGO_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.ORANGE_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.ORANGE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PEAR_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.PEAR_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PURPLE_GRAPE_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.PURPLE_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.RASPBERRY_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.RASPBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.RED_GRAPE_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.RED_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.WHITE_RASPBERRY_TURNOVER.get(), 2)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.WHITE_RASPBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Cakes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFItems.CHOCOLATE_CAKE.get())
                .define('A', DFFTags.Items.MILK)
                .define('B', DFFTags.Items.COCOA)
                .define('C', DFFTags.Items.SUGAR)
                .define('D', DFFTags.Items.FLOUR)
                .define('E', DFFTags.Items.EGG)
                .pattern("ABA")
                .pattern("CEC")
                .pattern("DBD")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,DFFItems.YELLOW_CHOCOLATE_CAKE.get())
                .define('A', DFFTags.Items.MILK)
                .define('B', DFFTags.Items.COCOA)
                .define('C', DFFTags.Items.SUGAR)
                .define('D', DFFTags.Items.FLOUR)
                .define('E', DFFTags.Items.EGG)
                .pattern("ABA")
                .pattern("CEC")
                .pattern("DDD")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHERRY_CHOCOLATE_CAKE.get())
                .requires(DFFItems.CHOCOLATE_CAKE.get())
                .requires(DFFTags.Items.CHERRY)
                .unlockedBy("has_chocolate_cake", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHOCOLATE_CAKE.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,DFFItems.RED_VELVET_CAKE.get())
                .define('A', DFFTags.Items.MILK)
                .define('C', DFFTags.Items.SUGAR)
                .define('D', DFFTags.Items.FLOUR)
                .define('E', DFFTags.Items.EGG)
                .define('F', Items.RED_DYE)
                .pattern("AAA")
                .pattern("CEC")
                .pattern("DFD")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,DFFItems.WHITE_CAKE.get())
                .define('A', DFFTags.Items.MILK)
                .define('B', DFFTags.Items.BUTTER)
                .define('C', DFFTags.Items.SUGAR)
                .define('D', DFFTags.Items.FLOUR)
                .define('E', DFFTags.Items.EGG)
                .pattern("AAA")
                .pattern("CEC")
                .pattern("DBD")
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR).build()))
                .save(pFinishedRecipeConsumer);




        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.BRUSSELS_SPROUTS.get()), RecipeCategory.MISC, DFFItems.ROASTED_BRUSSELS_SPROUTS.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_brussels_sprouts_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.BRUSSELS_SPROUTS.get()), RecipeCategory.MISC, DFFItems.ROASTED_BRUSSELS_SPROUTS.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_brussels_sprouts_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.BUTTERNUT_SQUASH.get()), RecipeCategory.MISC, DFFItems.ROASTED_BUTTERNUT_SQUASH.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_butternut_squash_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.BUTTERNUT_SQUASH.get()), RecipeCategory.MISC, DFFItems.ROASTED_BUTTERNUT_SQUASH.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_butternut_squash_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CHILI_PEPPER.get()), RecipeCategory.MISC, DFFItems.ROASTED_CHILI_PEPPER.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_chili_pepper_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CHILI_PEPPER.get()), RecipeCategory.MISC, DFFItems.ROASTED_CHILI_PEPPER.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_chili_pepper_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CORN.get()), RecipeCategory.MISC, DFFItems.ROASTED_CORN.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_corn_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CORN.get()), RecipeCategory.MISC, DFFItems.ROASTED_CORN.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_corn_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CUCUMBER.get()), RecipeCategory.MISC, DFFItems.ROASTED_CUCUMBER.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_cucumber_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CUCUMBER.get()), RecipeCategory.MISC, DFFItems.ROASTED_CUCUMBER.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_cucumber_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.GARLIC), RecipeCategory.MISC, DFFItems.ROASTED_GARLIC.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_garlic_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.GARLIC), RecipeCategory.MISC, DFFItems.ROASTED_GARLIC.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_garlic_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.GREEN_BEANS.get()), RecipeCategory.MISC, DFFItems.ROASTED_GREEN_BEANS.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_green_beans_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.GREEN_BEANS.get()), RecipeCategory.MISC, DFFItems.ROASTED_GREEN_BEANS.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_green_beans_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.JALEPENO_PEPPER.get()), RecipeCategory.MISC, DFFItems.ROASTED_JALEPENO_PEPPER.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_jalepeno_pepper_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.JALEPENO_PEPPER.get()), RecipeCategory.MISC, DFFItems.ROASTED_JALEPENO_PEPPER.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_jalepeno_pepper_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.RADISH.get()), RecipeCategory.MISC, DFFItems.ROASTED_RADISH.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_radish_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.RADISH.get()), RecipeCategory.MISC, DFFItems.ROASTED_RADISH.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_radish_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.ZUCCHINI.get()), RecipeCategory.MISC, DFFItems.ROASTED_ZUCCHINI.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_zucchini_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.ZUCCHINI.get()), RecipeCategory.MISC, DFFItems.ROASTED_ZUCCHINI.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "roasted_zucchini_campfire_cooking"));


        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.BLACKBERRY), RecipeCategory.MISC, DFFItems.DRIED_BLACKBERRY.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_blackberry_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.BLACKBERRY), RecipeCategory.MISC, DFFItems.DRIED_BLACKBERRY.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_blackberry_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.BLUEBERRY), RecipeCategory.MISC, DFFItems.DRIED_BLUEBERRIES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_blueberries_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.BLUEBERRY), RecipeCategory.MISC, DFFItems.DRIED_BLUEBERRIES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_blueberries_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.CHERRY), RecipeCategory.MISC, DFFItems.DRIED_CHERRIES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_cherries_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.CHERRY), RecipeCategory.MISC, DFFItems.DRIED_CHERRIES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_cherries_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.CRANBERRY), RecipeCategory.MISC, DFFItems.DRIED_CRANBERRIES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_cranberries_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.CRANBERRY), RecipeCategory.MISC, DFFItems.DRIED_CRANBERRIES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_cranberries_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.GRAPEFRUIT), RecipeCategory.MISC, DFFItems.DRIED_GRAPEFRUIT.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_grapefruit_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.GRAPEFRUIT), RecipeCategory.MISC, DFFItems.DRIED_GRAPEFRUIT.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_grapefruit_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.KIWI), RecipeCategory.MISC, DFFItems.DRIED_KIWI.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_kiwi_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.KIWI), RecipeCategory.MISC, DFFItems.DRIED_KIWI.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_kiwi_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.LYCHEE), RecipeCategory.MISC, DFFItems.DRIED_LYCHEE.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_lychee_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.LYCHEE), RecipeCategory.MISC, DFFItems.DRIED_LYCHEE.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_lychee_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.MANGO), RecipeCategory.MISC, DFFItems.DRIED_MANGO.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_mango_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.MANGO), RecipeCategory.MISC, DFFItems.DRIED_MANGO.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_mango_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.ORANGE), RecipeCategory.MISC, DFFItems.DRIED_ORANGE.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_orange_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.ORANGE), RecipeCategory.MISC, DFFItems.DRIED_ORANGE.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_orange_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.PEAR), RecipeCategory.MISC, DFFItems.DRIED_PEAR.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_pear_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.PEAR), RecipeCategory.MISC, DFFItems.DRIED_PEAR.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_pear_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.WHITE_GRAPES.get()), RecipeCategory.MISC, DFFItems.DRIED_GREEN_GRAPES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_green_grapes_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.WHITE_GRAPES.get()), RecipeCategory.MISC, DFFItems.DRIED_GREEN_GRAPES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_green_grapes_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.PURPLE_GRAPES.get()), RecipeCategory.MISC, DFFItems.DRIED_PURPLE_GRAPES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_purple_grapes_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.PURPLE_GRAPES.get()), RecipeCategory.MISC, DFFItems.DRIED_PURPLE_GRAPES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_purple_grapes_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.RED_GRAPES.get()), RecipeCategory.MISC, DFFItems.DRIED_RED_GRAPES.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_red_grapes_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.RED_GRAPES.get()), RecipeCategory.MISC, DFFItems.DRIED_RED_GRAPES.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_red_grapes_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.RASPBERRY), RecipeCategory.MISC, DFFItems.DRIED_RASPBERRY.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_raspberry_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.RASPBERRY), RecipeCategory.MISC, DFFItems.DRIED_RASPBERRY.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_raspberry_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.WHITERASPBERRY), RecipeCategory.MISC, DFFItems.DRIED_WHITE_RASPBERRY.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_white_raspberry_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.WHITERASPBERRY), RecipeCategory.MISC, DFFItems.DRIED_WHITE_RASPBERRY.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_white_raspberry_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.STRAWBERRY), RecipeCategory.MISC, DFFItems.DRIED_STRAWBERRY.get(), 0.35F, 100)
                .unlockedBy("has_smoker", has(Blocks.SMOKER)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_strawberry_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.STRAWBERRY), RecipeCategory.MISC, DFFItems.DRIED_STRAWBERRY.get(), 0.35F, 600)
                .unlockedBy("has_campfire", has(Blocks.CAMPFIRE)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "dried_strawberry_campfire_cooking"));



        //TODO; Meals
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.DUMPLINGS.get(), 2)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.DUMPLING_FILLING)
                .requires(DFFTags.Items.DUMPLING_FILLING)
                .requires(DFFTags.Items.DUMPLING_FILLING)
                .requires(DFFTags.Items.DOUGH)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POT_ROAST.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.RAW_BEEF)
                .requires(DFFTags.Items.VEGETABLES)
                .requires(DFFTags.Items.GARLIC)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MAC_N_CHEESE.get())
                .requires(DFFTags.Items.CHEESE)
                .requires(DFFTags.Items.PASTA)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.PASTA)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.SAUSAGE_MAC.get())
                .requires(DFFItems.MAC_N_CHEESE.get())
                .requires(DFFTags.Items.COOKED_SAUSAGE)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.PASTA)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.SPAGHETTI_AND_MEATBALLS.get())
                .requires(DFFItems.TOMATO_SOUP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.PASTA)
                .requires(DFFTags.Items.GARLIC)
                .requires(DFFTags.Items.COOKED_MEATS)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.PASTA)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.SPAGHETTI.get())
                .requires(DFFItems.TOMATO_SOUP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.PASTA)
                .requires(DFFTags.Items.GARLIC)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.PASTA)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEANUT_BUTTER_JELLY.get())
                .requires(DFFItems.PEANUT_BUTTER.get())
                .requires(DFFTags.Items.JAMS)
                .requires(Items.BREAD)
                .requires(Items.BREAD)
                .unlockedBy("has_bread", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BREAD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHICKEN_PARM.get())
                .requires(DFFItems.PARMESAN_CHEESE.get())
                .requires(DFFTags.Items.PASTA)
                .requires(DFFItems.TOMATO_SOUP.get())
                .requires(DFFTags.Items.COOKED_CHICKEN)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.PASTA)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEANUT_BUTTER.get(), 4)
                .requires(DFFTags.Items.PEANUT)
                .requires(DFFTags.Items.PEANUT)
                .unlockedBy("has_peanuts", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PEANUTS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.TOMATO_SOUP.get(), 4)
                .requires(DFFTags.Items.TOMATO)
                .requires(DFFTags.Items.TOMATO)
                .requires(DFFTags.Items.ONION)
                .requires(DFFTags.Items.HERBS)
                .unlockedBy("has_tomatoes", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TOMATO)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.AVOCADO_TOAST.get(), 2)
                .requires(DFFTags.Items.AVOCADO)
                .requires(Items.BREAD)
                .requires(DFFTags.Items.BUTTER)
                .unlockedBy("has_avocado", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.AVOCADO)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MERMAID_TOAST.get(), 2)
                .requires(DFFTags.Items.AVOCADO)
                .requires(Items.BREAD)
                .requires(DFFTags.Items.BUTTER)
                .requires(Items.BEETROOT)
                .requires(Items.KELP)
                .requires(DFFTags.Items.BLUEBERRY)
                .unlockedBy("has_avocado", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.AVOCADO)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.LASAGNA.get())
                .requires(DFFItems.TOMATO_SOUP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.PASTA)
                .requires(DFFTags.Items.GARLIC)
                .requires(DFFTags.Items.COOKED_MEATS)
                .requires(DFFTags.Items.CHEESE)
                .unlockedBy("has_pasta", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.PASTA)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Wrap
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MEAT_WRAP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.COOKED_MEATS)
                .requires(DFFTags.Items.DOUGH)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MEAT_CHEESE_WRAP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.COOKED_MEATS)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.CHEESE)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MEAT_VEGGIE_WRAP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.COOKED_MEATS)
                .requires(DFFTags.Items.DOUGH)
                .requires(DFFTags.Items.VEGETABLES)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.VEGGIE_WRAP.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.VEGETABLES)
                .requires(DFFTags.Items.DOUGH)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Sausage
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BEEF_SAUSAGE.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.RAW_BEEF)
                .requires(DFFTags.Items.RAW_BEEF)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.BEEF_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_beef_sausage", has(DFFItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_beef_sausage_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.BEEF_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_beef_sausage", has(DFFItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_beef_sausage_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.BEEF_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_BEEF_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_beef_sausage", has(DFFItems.BEEF_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_beef_sausage_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHICKEN_SAUSAGE.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.RAW_CHICKEN)
                .requires(DFFTags.Items.RAW_CHICKEN)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.CHICKEN_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_chicken_sausage", has(DFFItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_chicken_sausage_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.CHICKEN_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_chicken_sausage", has(DFFItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_chicken_sausage_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.CHICKEN_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_CHICKEN_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_chicken_sausage", has(DFFItems.CHICKEN_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_chicken_sausage_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MUTTON_SAUSAGE.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.RAW_MUTTON)
                .requires(DFFTags.Items.RAW_MUTTON)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.MUTTON_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_mutton_sausage", has(DFFItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_mutton_sausage_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.MUTTON_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_mutton_sausage", has(DFFItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_mutton_sausage_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.MUTTON_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_MUTTON_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_mutton_sausage", has(DFFItems.MUTTON_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_mutton_sausage_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PORK_SAUSAGE.get())
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.RAW_PORK)
                .requires(DFFTags.Items.RAW_PORK)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.PORK_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 100)
                .unlockedBy("has_pork_sausage", has(DFFItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_pork_sausage_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.PORK_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 200)
                .unlockedBy("has_pork_sausage", has(DFFItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_pork_sausage_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.PORK_SAUSAGE.get()), RecipeCategory.MISC, DFFItems.COOKED_PORK_SAUSAGE.get(), 0.35F, 600)
                .unlockedBy("has_pork_sausage", has(DFFItems.PORK_SAUSAGE.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_pork_sausage_campfire_cooking"));



        //TODO; Pickled Veggies
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PICKLED_GARLIC.get(), 2)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFTags.Items.GARLIC)
                .requires(DFFTags.Items.GARLIC)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PICKLED_RADISH.get(), 2)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFTags.Items.GARLIC)
                .requires(DFFTags.Items.RADISH)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PICKLED_PEPPERS.get(), 2)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFTags.Items.GARLIC)
                .requires(DFFTags.Items.PEPPERS)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PICKLED_GINGER.get(), 2)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFTags.Items.GARLIC)
                .requires(DFFTags.Items.GINGER)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PICKLES.get(), 2)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFTags.Items.WATER)
                .requires(DFFTags.Items.GARLIC)
                .requires(DFFTags.Items.VEGETABLES)
                .unlockedBy("has_herbs", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.HERBS)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Donuts
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PLAIN_DONUT.get(), 2)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.DOUGH)
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.DOUGH)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POWDERED_DONUT.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.JELLY_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFTags.Items.JAMS)
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GLAZED_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHOCOLATE_GLAZED_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFTags.Items.COCOA)
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_GLAZED_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.STRAWBERRY_JAM.get())
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHOCOLATE_DONUT.get(), 2)
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.COCOA)
                .requires(DFFTags.Items.DOUGH)
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.DOUGH)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHOCOLATE_POWDERED_DONUT.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.CHOCOLATE_DONUT.get())
                .unlockedBy("has_chocolate_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHOCOLATE_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.ICED_CHOCOLATE_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.CHOCOLATE_DONUT.get())
                .unlockedBy("has_chocolate_donut", inventoryTrigger(ItemPredicate.Builder.item()
                       .of(DFFItems.CHOCOLATE_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.DOUBLE_CHOCOLATE_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFTags.Items.COCOA)
                .requires(DFFItems.CHOCOLATE_DONUT.get())
                .unlockedBy("has_chocolate_donut", inventoryTrigger(ItemPredicate.Builder.item()
                       .of(DFFItems.CHOCOLATE_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_CHOCOLATE_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.STRAWBERRY_JAM.get())
                .requires(DFFItems.CHOCOLATE_DONUT.get())
                .unlockedBy("has_chocolate_donut", inventoryTrigger(ItemPredicate.Builder.item()
                       .of(DFFItems.CHOCOLATE_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEANUT_BUTTER_DONUT.get())
                .requires(DFFTags.Items.MILK)
                .requires(DFFItems.PEANUT_BUTTER.get())
                .requires(DFFItems.PLAIN_DONUT.get())
                .unlockedBy("has_donut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.PLAIN_DONUT.get())
                        .build()))
                .save(pFinishedRecipeConsumer);





        //TODO; Pie
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLACKBERRY_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.BLACKBERRY)
                .requires(DFFTags.Items.BLACKBERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLUEBERRY_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.BLUEBERRY)
                .requires(DFFTags.Items.BLUEBERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CRANBERRY_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.CRANBERRY)
                .requires(DFFTags.Items.CRANBERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHERRY_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.CHERRY)
                .requires(DFFTags.Items.CHERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.STRAWBERRY)
                .requires(DFFTags.Items.STRAWBERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GRAPEFRUIT_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.GRAPEFRUIT)
                .requires(DFFTags.Items.GRAPEFRUIT)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POMEGRANATE_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.POMEGRANATE)
                .requires(DFFTags.Items.POMEGRANATE)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GREEN_GRAPE_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFItems.WHITE_GRAPES.get())
                .requires(DFFItems.WHITE_GRAPES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.KIWI_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.KIWI)
                .requires(DFFTags.Items.KIWI)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.LYCHEE_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.LYCHEE)
                .requires(DFFTags.Items.LYCHEE)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MANGO_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.MANGO)
                .requires(DFFTags.Items.MANGO)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.ORANGE_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.ORANGE)
                .requires(DFFTags.Items.ORANGE)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEAR_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.PEAR)
                .requires(DFFTags.Items.PEAR)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PURPLE_GRAPE_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFItems.PURPLE_GRAPES.get())
                .requires(DFFItems.PURPLE_GRAPES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RASPBERRY_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.RASPBERRY)
                .requires(DFFTags.Items.RASPBERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RED_GRAPE_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFItems.RED_GRAPES.get())
                .requires(DFFItems.RED_GRAPES.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.WHITE_RASPBERRY_PIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.BUTTER)
                .requires(DFFTags.Items.WHITERASPBERRY)
                .requires(DFFTags.Items.WHITERASPBERRY)
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Smoothie
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLACKBERRY_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLUEBERRY_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CRANBERRY_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHERRY_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GRAPEFRUIT_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POMEGRANATE_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GREEN_GRAPE_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.KIWI_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.LYCHEE_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MANGO_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.ORANGE_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEAR_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PURPLE_GRAPE_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RASPBERRY_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RED_GRAPE_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.WHITE_RASPBERRY_SMOOTHIE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.SMOOTHIE_ICE)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_ice_or_snow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SMOOTHIE_ICE)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Wine
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLACKBERRY_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLUEBERRY_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CRANBERRY_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHERRY_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GRAPEFRUIT_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POMEGRANATE_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GREEN_GRAPE_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.KIWI_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.LYCHEE_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MANGO_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.ORANGE_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEAR_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PURPLE_GRAPE_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RASPBERRY_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RED_GRAPE_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.WHITE_RASPBERRY_WINE.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_flour", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Tea
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLACKBERRY_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLUEBERRY_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CRANBERRY_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHERRY_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GRAPEFRUIT_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POMEGRANATE_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GREEN_GRAPE_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.KIWI_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.LYCHEE_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MANGO_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.ORANGE_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEAR_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PURPLE_GRAPE_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RASPBERRY_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RED_GRAPE_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.WHITE_RASPBERRY_TEA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LEAVES)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.LEAVES)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Jam
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLACKBERRY_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.BLACKBERRY)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLUEBERRY_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.BLUEBERRY)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CRANBERRY_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.CRANBERRY)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHERRY_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.CHERRY)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.STRAWBERRY)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GRAPEFRUIT_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.GRAPEFRUIT)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POMEGRANATE_JAM.get())
                .requires(DFFTags.Items.SUGAR)

                .requires(DFFTags.Items.POMEGRANATE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GREEN_GRAPE_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.WHITE_GRAPES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.KIWI_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.KIWI)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.LYCHEE_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.LYCHEE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MANGO_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.MANGO)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.ORANGE_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.ORANGE)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEAR_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.PEAR)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PURPLE_GRAPE_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.PURPLE_GRAPES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RASPBERRY_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.RASPBERRY)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RED_GRAPE_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFItems.RED_GRAPES.get())
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.WHITE_RASPBERRY_JAM.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.WHITERASPBERRY)
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.SUGAR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Juice
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BLACKBERRY_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.BLACKBERRY)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.BLUEBERRY_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.BLUEBERRY)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CRANBERRY_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.CRANBERRY)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CHERRY_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.CHERRY)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.STRAWBERRY_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.STRAWBERRY)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.GRAPEFRUIT_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.GRAPEFRUIT)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.POMEGRANATE_JUICE.get())
                .requires(Items.GLASS_BOTTLE)

                .requires(DFFTags.Items.POMEGRANATE)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.GREEN_GRAPE_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.WHITE_GRAPES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.KIWI_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.KIWI)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.LYCHEE_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.LYCHEE)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.MANGO_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.MANGO)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.ORANGE_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.ORANGE)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PEAR_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.PEAR)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PURPLE_GRAPE_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.PURPLE_GRAPES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.RASPBERRY_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.RASPBERRY)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.RED_GRAPE_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFItems.RED_GRAPES.get())
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.WHITE_RASPBERRY_JUICE.get())
                .requires(Items.GLASS_BOTTLE)
                .requires(DFFTags.Items.WHITERASPBERRY)
                .unlockedBy("has_bottle", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLASS_BOTTLE)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Soda
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLACKBERRY_SODA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.BLACKBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLUEBERRY_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.BLUEBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CRANBERRY_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.CRANBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHERRY_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.CHERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.STRAWBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GRAPEFRUIT_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.GRAPEFRUIT_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POMEGRANATE_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.POMEGRANATE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GREEN_GRAPE_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.GREEN_GRAPE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.KIWI_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.KIWI_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.LYCHEE_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.LYCHEE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MANGO_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.MANGO_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.ORANGE_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.ORANGE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEAR_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.PEAR_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PURPLE_GRAPE_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.PURPLE_GRAPE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RASPBERRY_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.RASPBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RED_GRAPE_SODA.get())
                 .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.RED_GRAPE_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.WHITE_RASPBERRY_SODA.get())
                .requires(DFFTags.Items.SUGAR)
                .requires(DFFTags.Items.HERBS)
                .requires(DFFItems.WHITE_RASPBERRY_JUICE.get())
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WATER)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Pastry
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLACKBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BLACKBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BLUEBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.BLUEBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CRANBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.CRANBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.CHERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.STRAWBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.STRAWBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GRAPEFRUIT_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.GRAPEFRUIT_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.POMEGRANATE_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.POMEGRANATE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.GREEN_GRAPE_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.GREEN_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.KIWI_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.KIWI_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.LYCHEE_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.LYCHEE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MANGO_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.MANGO_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.ORANGE_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.ORANGE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PEAR_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PEAR_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PURPLE_GRAPE_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.PURPLE_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RASPBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.RASPBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.RED_GRAPE_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.RED_GRAPE_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))

                .save(pFinishedRecipeConsumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.WHITE_RASPBERRY_PASTRY.get(), 2)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFItems.WHITE_RASPBERRY_JAM.get())
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);



        //TODO; Ingredient
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.COCOA_POWDER.get(), 4)
                .requires(Items.COCOA_BEANS)
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PURIFIED_WATER.get(), 16)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_water", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WATER_BUCKET)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.FLOUR.get(), 3)
                .requires(DFFTags.Items.WHEAT)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.DOUGH.get(), 4)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.FLOUR)
                .requires(DFFTags.Items.WATER)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.FLOUR)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.BUTTER.get(), 6)
                .requires(DFFTags.Items.MILK)
                .unlockedBy("has_milk", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.MILK)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MILK_BOTTLE.get(), 8)
                .requires(Items.MILK_BUCKET)
                .unlockedBy("has_milk", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.MILK)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.TOFU.get(), 3)
                .requires(DFFTags.Items.SOYBEAN)
                .requires(DFFTags.Items.SOYBEAN)
                .requires(DFFTags.Items.SOYBEAN)
                .unlockedBy("has_soybeans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.SOYBEANS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PANKO.get(), 6)
                .requires(Items.BREAD)
                .unlockedBy("has_bread", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BREAD)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.CHEDDAR_CHEESE.get(), 3)
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.CILANTRO.get())
                .unlockedBy("has_cheese_curds", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHEESE_CURDS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PARMESAN_CHEESE.get(), 3)
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.ROSEMARY.get())
                .unlockedBy("has_cheese_curds", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHEESE_CURDS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.MOZZARELLA_CHEESE.get(), 3)
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFItems.CHEESE_CURDS.get())
                .requires(DFFTags.Items.WATER)
                .unlockedBy("has_cheese_curds", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.CHEESE_CURDS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,DFFItems.PASTA.get(), 4)
                .requires(DFFTags.Items.DOUGH)
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.DOUGH)
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFItems.TOFU.get()), RecipeCategory.MISC, DFFItems.COOKED_TOFU.get(), 0.35F, 100)
                .unlockedBy("has_tofu", has(DFFItems.TOFU.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_tofu_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFItems.TOFU.get()), RecipeCategory.MISC, DFFItems.COOKED_TOFU.get(), 0.35F, 200)
                .unlockedBy("has_tofu", has(DFFItems.TOFU.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_tofu_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFItems.TOFU.get()), RecipeCategory.MISC, DFFItems.COOKED_TOFU.get(), 0.35F, 600)
                .unlockedBy("has_tofu", has(DFFItems.TOFU.get())).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cooked_tofu_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.DOUGH), RecipeCategory.MISC, Items.BREAD, 0.35F, 100)
                .unlockedBy("has_dough", has(DFFTags.Items.DOUGH)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "pasta_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFTags.Items.DOUGH), RecipeCategory.MISC, Items.BREAD, 0.35F, 200)
                .unlockedBy("has_dough", has(DFFTags.Items.DOUGH)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "pasta_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.DOUGH), RecipeCategory.MISC, Items.BREAD, 0.35F, 600)
                .unlockedBy("has_dough", has(DFFTags.Items.DOUGH)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "pasta_campfire_cooking"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DFFTags.Items.MILK), RecipeCategory.MISC, DFFItems.CHEESE_CURDS.get(), 0.35F, 100)
                .unlockedBy("has_milk", has(DFFTags.Items.MILK)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cheese_curds_smoking"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DFFTags.Items.MILK), RecipeCategory.MISC, DFFItems.CHEESE_CURDS.get(), 0.35F, 200)
                .unlockedBy("has_milk", has(DFFTags.Items.MILK)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cheese_curds_smelting"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(DFFTags.Items.MILK), RecipeCategory.MISC, DFFItems.CHEESE_CURDS.get(), 0.35F, 600)
                .unlockedBy("has_milk", has(DFFTags.Items.MILK)).save(pFinishedRecipeConsumer, new ResourceLocation("dffeasts", "cheese_curds_campfire_cooking"));



        //TODO; Wood
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.CHERRY_PIT.get())
                .requires(DFFTags.Items.CHERRY)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.CHERRY_PLANKS.get(), 4)
                .requires(DFFBlocks.CHERRY_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CHERRY_STAIRS.get(), 4)
                .define('A', DFFBlocks.CHERRY_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CHERRY_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CHERRY_SLAB.get(), 3)
                .define('A', DFFBlocks.CHERRY_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CHERRY_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CHERRY_FENCE.get(), 3)
                .define('A', DFFBlocks.CHERRY_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CHERRY_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CHERRY_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.CHERRY_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CHERRY_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CHERRY_DOOR.get(), 3)
                .define('A', DFFBlocks.CHERRY_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CHERRY_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.CHERRY_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.CHERRY_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.CHERRY_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.AVOCADO_PIT.get())
                .requires(DFFTags.Items.AVOCADO)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.AVOCADO_PLANKS.get(), 4)
                .requires(DFFBlocks.AVOCADO_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.AVOCADO_STAIRS.get(), 4)
                .define('A', DFFBlocks.AVOCADO_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.AVOCADO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.AVOCADO_SLAB.get(), 3)
                .define('A', DFFBlocks.AVOCADO_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.AVOCADO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.AVOCADO_FENCE.get(), 3)
                .define('A', DFFBlocks.AVOCADO_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.AVOCADO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.AVOCADO_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.AVOCADO_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.AVOCADO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.AVOCADO_DOOR.get(), 3)
                .define('A', DFFBlocks.AVOCADO_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.AVOCADO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.AVOCADO_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.AVOCADO_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.AVOCADO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.LYCHEE_SEED.get())
                .requires(DFFTags.Items.LYCHEE)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.LYCHEE_PLANKS.get(), 4)
                .requires(DFFBlocks.LYCHEE_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.LYCHEE_STAIRS.get(), 4)
                .define('A', DFFBlocks.LYCHEE_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.LYCHEE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.LYCHEE_SLAB.get(), 3)
                .define('A', DFFBlocks.LYCHEE_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.LYCHEE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.LYCHEE_DOOR.get(), 3)
                .define('A', DFFBlocks.LYCHEE_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.LYCHEE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.LYCHEE_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.LYCHEE_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.LYCHEE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.KIWI_SEEDS.get())
                .requires(DFFTags.Items.KIWI)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.KIWI_PLANKS.get(), 4)
                .requires(DFFBlocks.KIWI_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.KIWI_STAIRS.get(), 4)
                .define('A', DFFBlocks.KIWI_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.KIWI_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.KIWI_SLAB.get(), 3)
                .define('A', DFFBlocks.KIWI_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.KIWI_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.KIWI_FENCE.get(), 3)
                .define('A', DFFBlocks.KIWI_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.KIWI_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.KIWI_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.KIWI_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.KIWI_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.KIWI_DOOR.get(), 3)
                .define('A', DFFBlocks.KIWI_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.KIWI_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.KIWI_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.KIWI_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.KIWI_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.PEAR_SEEDS.get())
                .requires(DFFTags.Items.PEAR)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.PEAR_PLANKS.get(), 4)
                .requires(DFFBlocks.PEAR_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PEAR_STAIRS.get(), 4)
                .define('A', DFFBlocks.PEAR_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PEAR_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PEAR_SLAB.get(), 3)
                .define('A', DFFBlocks.PEAR_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PEAR_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PEAR_FENCE.get(), 3)
                .define('A', DFFBlocks.PEAR_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PEAR_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PEAR_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.PEAR_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PEAR_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PEAR_DOOR.get(), 3)
                .define('A', DFFBlocks.PEAR_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PEAR_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.PEAR_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.PEAR_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.PEAR_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.POMEGRANATE_SEEDS.get())
                .requires(DFFTags.Items.POMEGRANATE)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.POMEGRANATE_PLANKS.get(), 4)
                .requires(DFFBlocks.POMEGRANATE_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.POMEGRANATE_STAIRS.get(), 4)
                .define('A', DFFBlocks.POMEGRANATE_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.POMEGRANATE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.POMEGRANATE_SLAB.get(), 3)
                .define('A', DFFBlocks.POMEGRANATE_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.POMEGRANATE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.POMEGRANATE_FENCE.get(), 3)
                .define('A', DFFBlocks.POMEGRANATE_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.POMEGRANATE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.POMEGRANATE_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.POMEGRANATE_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.POMEGRANATE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.POMEGRANATE_DOOR.get(), 3)
                .define('A', DFFBlocks.POMEGRANATE_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.POMEGRANATE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.POMEGRANATE_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.POMEGRANATE_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.POMEGRANATE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.ORANGE_SEEDS.get())
                .requires(DFFTags.Items.ORANGE)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.ORANGE_PLANKS.get(), 4)
                .requires(DFFBlocks.ORANGE_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ORANGE_STAIRS.get(), 4)
                .define('A', DFFBlocks.ORANGE_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ORANGE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ORANGE_SLAB.get(), 3)
                .define('A', DFFBlocks.ORANGE_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ORANGE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ORANGE_FENCE.get(), 3)
                .define('A', DFFBlocks.ORANGE_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ORANGE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ORANGE_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.ORANGE_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ORANGE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ORANGE_DOOR.get(), 3)
                .define('A', DFFBlocks.ORANGE_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ORANGE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.ORANGE_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.ORANGE_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.ORANGE_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.MANGO_SEED.get())
                .requires(DFFTags.Items.MANGO)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.MANGO_PLANKS.get(), 4)
                .requires(DFFBlocks.MANGO_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.MANGO_STAIRS.get(), 4)
                .define('A', DFFBlocks.MANGO_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.MANGO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.MANGO_SLAB.get(), 3)
                .define('A', DFFBlocks.MANGO_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.MANGO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.MANGO_FENCE.get(), 3)
                .define('A', DFFBlocks.MANGO_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.MANGO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.MANGO_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.MANGO_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.MANGO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.MANGO_DOOR.get(), 3)
                .define('A', DFFBlocks.MANGO_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.MANGO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.MANGO_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.MANGO_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.MANGO_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.COCONUT_PLANKS.get(), 4)
                .requires(DFFBlocks.COCONUT_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.COCONUT_STAIRS.get(), 4)
                .define('A', DFFBlocks.COCONUT_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.COCONUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.COCONUT_SLAB.get(), 3)
                .define('A', DFFBlocks.COCONUT_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.COCONUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.COCONUT_FENCE.get(), 3)
                .define('A', DFFBlocks.COCONUT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.COCONUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.COCONUT_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.COCONUT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.COCONUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.COCONUT_DOOR.get(), 3)
                .define('A', DFFBlocks.COCONUT_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.COCONUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.COCONUT_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.COCONUT_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.COCONUT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFItems.GRAPEFRUIT_SEEDS.get())
                .requires(DFFTags.Items.GRAPEFRUIT)
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DFFBlocks.GRAPEFRUIT_PLANKS.get(), 4)
                .requires(DFFBlocks.GRAPEFRUIT_LOG.get())
                .unlockedBy("has_seedable_fruit", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.TREE_FRUITS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.GRAPEFRUIT_STAIRS.get(), 4)
                .define('A', DFFBlocks.GRAPEFRUIT_PLANKS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.GRAPEFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.GRAPEFRUIT_SLAB.get(), 3)
                .define('A', DFFBlocks.GRAPEFRUIT_PLANKS.get())
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.GRAPEFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.GRAPEFRUIT_FENCE.get(), 3)
                .define('A', DFFBlocks.GRAPEFRUIT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern("ABA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.GRAPEFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.GRAPEFRUIT_FENCE_GATE.get(), 1)
                .define('A', DFFBlocks.GRAPEFRUIT_PLANKS.get())
                .define('B', Items.STICK)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.GRAPEFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.GRAPEFRUIT_DOOR.get(), 3)
                .define('A', DFFBlocks.GRAPEFRUIT_PLANKS.get())
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.GRAPEFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocks.GRAPEFRUIT_TRAPDOOR.get(), 2)
                .define('A', DFFBlocks.GRAPEFRUIT_PLANKS.get())
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFBlocks.GRAPEFRUIT_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);





        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ROTTEN_FLESH), RecipeCategory.MISC, Items.LEATHER, 0.35F, 200)
                .unlockedBy("has_rotten_flesh", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ROTTEN_FLESH).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PAPER, 12)
                .requires(DFFTags.Items.PAPERABLE_LOGS)
                .requires(DFFTags.Items.PAPERABLE_LOGS)
                .unlockedBy("has_paperable_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.PAPERABLE_LOGS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BREAD, 1)
                .requires(DFFTags.Items.RYE)
                .requires(DFFTags.Items.RYE)
                .requires(DFFTags.Items.RYE)
                .unlockedBy("has_rye", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFTags.Items.RYE)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 4)
                .requires(DFFItems.SUGAR_BEET.get())
                .unlockedBy("has_sugar_beet", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DFFItems.SUGAR_BEET.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DFFBlocksNoDatagen.CROP_BARREL.get())
                .define('A', Blocks.BARREL)
                .define('B', DFFTags.Items.CROPS)
                .pattern("BBB")
                .pattern(" A ")
                .unlockedBy("has_barrel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.BARREL).build()))
                .save(pFinishedRecipeConsumer);
    }
}