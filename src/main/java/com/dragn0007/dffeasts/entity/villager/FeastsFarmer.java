package com.dragn0007.dffeasts.entity.villager;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocksNoDatagen;
import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FeastsFarmer {
    private static boolean enableFeastsFarmerProfession = true;

    public static final DeferredRegister<PoiType> POI_TYPES
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, DFFeastsMain.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS
            = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, DFFeastsMain.MODID);

    public static final RegistryObject<PoiType> FEASTS_FARMER_POI = POI_TYPES.register("feasts_farmer_poi",
            () -> new PoiType(ImmutableSet.copyOf(DFFBlocksNoDatagen.CROP_BARREL.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> FEASTS_FARMER =
            VILLAGER_PROFESSIONS.register("feasts_farmer", () -> new VillagerProfession("feasts_farmer",
                    holder -> holder.get() == FEASTS_FARMER_POI.get(), holder -> holder.get() == FEASTS_FARMER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_FARMER));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
