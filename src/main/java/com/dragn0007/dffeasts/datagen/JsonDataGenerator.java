package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = DFFeastsMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JsonDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new DFFRecipeMaker(packOutput));
        generator.addProvider(event.includeServer(), DFFLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new DFFBlockstateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new DFFItemModelProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new DFFWorldGenerator(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new DFFPoiTags(packOutput, lookupProvider, existingFileHelper));
    }
}
