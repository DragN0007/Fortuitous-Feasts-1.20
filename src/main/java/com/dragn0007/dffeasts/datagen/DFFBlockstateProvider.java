package com.dragn0007.dffeasts.datagen;

import com.dragn0007.dffeasts.DFFeastsMain;
import com.dragn0007.dffeasts.block.DFFBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DFFBlockstateProvider extends BlockStateProvider {
    public DFFBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DFFeastsMain.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {



        logBlock(DFFBlocks.ORANGE_LOG.get());
        blockWithItem(DFFBlocks.ORANGE_PLANKS);
        stairsBlock((StairBlock) DFFBlocks.ORANGE_STAIRS.get(), blockTexture(DFFBlocks.ORANGE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ORANGE_STAIRS.get(), models().stairs(DFFBlocks.ORANGE_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.ORANGE_SLAB.get(), blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ORANGE_SLAB.get(), models().slab(DFFBlocks.ORANGE_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get()), blockTexture(DFFBlocks.ORANGE_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_ORANGE_SAPLING.get(), models().cross(DFFBlocks.DFF_ORANGE_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_ORANGE_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.ORANGE_FENCE.get(), blockTexture(DFFBlocks.ORANGE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ORANGE_FENCE.get(), models().fenceInventory(DFFBlocks.ORANGE_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.ORANGE_FENCE_GATE.get(), blockTexture(DFFBlocks.ORANGE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ORANGE_FENCE_GATE.get(), models().fenceGate(DFFBlocks.ORANGE_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.ORANGE_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.ORANGE_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/orange_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/orange_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.ORANGE_TRAPDOOR.get(), blockTexture(DFFBlocks.ORANGE_TRAPDOOR.get()), true, "cutout");


        logBlock(DFFBlocks.COCONUT_LOG.get());
        simpleBlock(DFFBlocks.COCONUT_PLANKS.get());
        simpleBlockItem(DFFBlocks.COCONUT_PLANKS.get(), models().cubeAll(DFFBlocks.COCONUT_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.COCONUT_STAIRS.get(), blockTexture(DFFBlocks.COCONUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.COCONUT_STAIRS.get(), models().stairs(DFFBlocks.COCONUT_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.COCONUT_SLAB.get(), blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.COCONUT_SLAB.get(), models().slab(DFFBlocks.COCONUT_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get()), blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_COCONUT_SAPLING.get(), models().cross(DFFBlocks.DFF_COCONUT_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_COCONUT_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.COCONUT_FENCE.get(), blockTexture(DFFBlocks.COCONUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.COCONUT_FENCE.get(), models().fenceInventory(DFFBlocks.COCONUT_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.COCONUT_FENCE_GATE.get(), blockTexture(DFFBlocks.COCONUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.COCONUT_FENCE_GATE.get(), models().fenceGate(DFFBlocks.COCONUT_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.COCONUT_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.COCONUT_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/coconut_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/coconut_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.COCONUT_TRAPDOOR.get(), blockTexture(DFFBlocks.COCONUT_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.MANGO_LOG.get());
        simpleBlock(DFFBlocks.MANGO_PLANKS.get());
        simpleBlockItem(DFFBlocks.MANGO_PLANKS.get(), models().cubeAll(DFFBlocks.MANGO_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.MANGO_STAIRS.get(), blockTexture(DFFBlocks.MANGO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.MANGO_STAIRS.get(), models().stairs(DFFBlocks.MANGO_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.MANGO_SLAB.get(), blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.MANGO_SLAB.get(), models().slab(DFFBlocks.MANGO_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get()), blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_MANGO_SAPLING.get(), models().cross(DFFBlocks.DFF_MANGO_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_MANGO_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.MANGO_FENCE.get(), blockTexture(DFFBlocks.MANGO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.MANGO_FENCE.get(), models().fenceInventory(DFFBlocks.MANGO_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.MANGO_FENCE_GATE.get(), blockTexture(DFFBlocks.MANGO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.MANGO_FENCE_GATE.get(), models().fenceGate(DFFBlocks.MANGO_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.MANGO_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.MANGO_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/mango_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/mango_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.MANGO_TRAPDOOR.get(), blockTexture(DFFBlocks.MANGO_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.GRAPEFRUIT_LOG.get());
        simpleBlock(DFFBlocks.GRAPEFRUIT_PLANKS.get());
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_PLANKS.get(), models().cubeAll(DFFBlocks.GRAPEFRUIT_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.GRAPEFRUIT_STAIRS.get(), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_STAIRS.get(), models().stairs(DFFBlocks.GRAPEFRUIT_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.GRAPEFRUIT_SLAB.get(), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_SLAB.get(), models().slab(DFFBlocks.GRAPEFRUIT_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get(), models().cross(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_GRAPEFRUIT_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.GRAPEFRUIT_FENCE.get(), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_FENCE.get(), models().fenceInventory(DFFBlocks.GRAPEFRUIT_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.GRAPEFRUIT_FENCE_GATE.get(), blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.GRAPEFRUIT_FENCE_GATE.get(), models().fenceGate(DFFBlocks.GRAPEFRUIT_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.GRAPEFRUIT_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.GRAPEFRUIT_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/grapefruit_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/grapefruit_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.GRAPEFRUIT_TRAPDOOR.get(), blockTexture(DFFBlocks.GRAPEFRUIT_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.AVOCADO_LOG.get());
        simpleBlock(DFFBlocks.AVOCADO_PLANKS.get());
        simpleBlockItem(DFFBlocks.AVOCADO_PLANKS.get(), models().cubeAll(DFFBlocks.AVOCADO_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.AVOCADO_STAIRS.get(), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.AVOCADO_STAIRS.get(), models().stairs(DFFBlocks.AVOCADO_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.AVOCADO_SLAB.get(), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.AVOCADO_SLAB.get(), models().slab(DFFBlocks.AVOCADO_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()), blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_AVOCADO_SAPLING.get(), models().cross(DFFBlocks.DFF_AVOCADO_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_AVOCADO_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.AVOCADO_FENCE.get(), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.AVOCADO_FENCE.get(), models().fenceInventory(DFFBlocks.AVOCADO_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.AVOCADO_FENCE_GATE.get(), blockTexture(DFFBlocks.AVOCADO_PLANKS.get()));
        simpleBlockItem(DFFBlocks.AVOCADO_FENCE_GATE.get(), models().fenceGate(DFFBlocks.AVOCADO_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.AVOCADO_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.AVOCADO_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/avocado_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/avocado_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.AVOCADO_TRAPDOOR.get(), blockTexture(DFFBlocks.AVOCADO_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.KIWI_LOG.get());
        simpleBlock(DFFBlocks.KIWI_PLANKS.get());
        simpleBlockItem(DFFBlocks.KIWI_PLANKS.get(), models().cubeAll(DFFBlocks.KIWI_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.KIWI_STAIRS.get(), blockTexture(DFFBlocks.KIWI_PLANKS.get()));
        simpleBlockItem(DFFBlocks.KIWI_STAIRS.get(), models().stairs(DFFBlocks.KIWI_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.KIWI_SLAB.get(), blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get()));
        simpleBlockItem(DFFBlocks.KIWI_SLAB.get(), models().slab(DFFBlocks.KIWI_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get()), blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_KIWI_SAPLING.get(), models().cross(DFFBlocks.DFF_KIWI_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_KIWI_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.KIWI_FENCE.get(), blockTexture(DFFBlocks.KIWI_PLANKS.get()));
        simpleBlockItem(DFFBlocks.KIWI_FENCE.get(), models().fenceInventory(DFFBlocks.KIWI_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.KIWI_FENCE_GATE.get(), blockTexture(DFFBlocks.KIWI_PLANKS.get()));
        simpleBlockItem(DFFBlocks.KIWI_FENCE_GATE.get(), models().fenceGate(DFFBlocks.KIWI_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.KIWI_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.KIWI_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/kiwi_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/kiwi_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.KIWI_TRAPDOOR.get(), blockTexture(DFFBlocks.KIWI_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.LYCHEE_LOG.get());
        simpleBlock(DFFBlocks.LYCHEE_PLANKS.get());
        simpleBlockItem(DFFBlocks.LYCHEE_PLANKS.get(), models().cubeAll(DFFBlocks.LYCHEE_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.LYCHEE_STAIRS.get(), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.LYCHEE_STAIRS.get(), models().stairs(DFFBlocks.LYCHEE_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.LYCHEE_SLAB.get(), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.LYCHEE_SLAB.get(), models().slab(DFFBlocks.LYCHEE_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()), blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_LYCHEE_SAPLING.get(), models().cross(DFFBlocks.DFF_LYCHEE_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_LYCHEE_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.LYCHEE_FENCE.get(), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.LYCHEE_FENCE.get(), models().fenceInventory(DFFBlocks.LYCHEE_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.LYCHEE_FENCE_GATE.get(), blockTexture(DFFBlocks.LYCHEE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.LYCHEE_FENCE_GATE.get(), models().fenceGate(DFFBlocks.LYCHEE_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.LYCHEE_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.LYCHEE_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/lychee_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/lychee_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.LYCHEE_TRAPDOOR.get(), blockTexture(DFFBlocks.LYCHEE_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.PEAR_LOG.get());
        simpleBlock(DFFBlocks.PEAR_PLANKS.get());
        simpleBlockItem(DFFBlocks.PEAR_PLANKS.get(), models().cubeAll(DFFBlocks.PEAR_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.PEAR_STAIRS.get(), blockTexture(DFFBlocks.PEAR_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PEAR_STAIRS.get(), models().stairs(DFFBlocks.PEAR_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.PEAR_SLAB.get(), blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PEAR_SLAB.get(), models().slab(DFFBlocks.PEAR_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get()), blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_PEAR_SAPLING.get(), models().cross(DFFBlocks.DFF_PEAR_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_PEAR_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.PEAR_FENCE.get(), blockTexture(DFFBlocks.PEAR_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PEAR_FENCE.get(), models().fenceInventory(DFFBlocks.PEAR_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.PEAR_FENCE_GATE.get(), blockTexture(DFFBlocks.PEAR_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PEAR_FENCE_GATE.get(), models().fenceGate(DFFBlocks.PEAR_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.PEAR_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.PEAR_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/pear_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/pear_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.PEAR_TRAPDOOR.get(), blockTexture(DFFBlocks.PEAR_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.POMEGRANATE_LOG.get());
        simpleBlock(DFFBlocks.POMEGRANATE_PLANKS.get());
        simpleBlockItem(DFFBlocks.POMEGRANATE_PLANKS.get(), models().cubeAll(DFFBlocks.POMEGRANATE_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.POMEGRANATE_STAIRS.get(), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.POMEGRANATE_STAIRS.get(), models().stairs(DFFBlocks.POMEGRANATE_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.POMEGRANATE_SLAB.get(), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.POMEGRANATE_SLAB.get(), models().slab(DFFBlocks.POMEGRANATE_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_POMEGRANATE_SAPLING.get(), models().cross(DFFBlocks.DFF_POMEGRANATE_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_POMEGRANATE_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.POMEGRANATE_FENCE.get(), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.POMEGRANATE_FENCE.get(), models().fenceInventory(DFFBlocks.POMEGRANATE_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.POMEGRANATE_FENCE_GATE.get(), blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.POMEGRANATE_FENCE_GATE.get(), models().fenceGate(DFFBlocks.POMEGRANATE_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.POMEGRANATE_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.POMEGRANATE_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/pomegranate_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/pomegranate_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.POMEGRANATE_TRAPDOOR.get(), blockTexture(DFFBlocks.POMEGRANATE_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.CHERRY_LOG.get());
        simpleBlock(DFFBlocks.CHERRY_PLANKS.get());
        simpleBlockItem(DFFBlocks.CHERRY_PLANKS.get(), models().cubeAll(DFFBlocks.CHERRY_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.CHERRY_STAIRS.get(), blockTexture(DFFBlocks.CHERRY_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CHERRY_STAIRS.get(), models().stairs(DFFBlocks.CHERRY_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.CHERRY_SLAB.get(), blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CHERRY_SLAB.get(), models().slab(DFFBlocks.CHERRY_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get()), blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_CHERRY_SAPLING.get(), models().cross(DFFBlocks.DFF_CHERRY_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_CHERRY_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.CHERRY_FENCE.get(), blockTexture(DFFBlocks.CHERRY_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CHERRY_FENCE.get(), models().fenceInventory(DFFBlocks.CHERRY_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.CHERRY_FENCE_GATE.get(), blockTexture(DFFBlocks.CHERRY_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CHERRY_FENCE_GATE.get(), models().fenceGate(DFFBlocks.CHERRY_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.CHERRY_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.CHERRY_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/cherry_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/cherry_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.CHERRY_TRAPDOOR.get(), blockTexture(DFFBlocks.CHERRY_TRAPDOOR.get()), true, "cutout");


        //Update 1.5
        logBlock(DFFBlocks.PASSIONFRUIT_LOG.get());
        simpleBlock(DFFBlocks.PASSIONFRUIT_PLANKS.get());
        simpleBlockItem(DFFBlocks.PASSIONFRUIT_PLANKS.get(), models().cubeAll(DFFBlocks.PASSIONFRUIT_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.PASSIONFRUIT_STAIRS.get(), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PASSIONFRUIT_STAIRS.get(), models().stairs(DFFBlocks.PASSIONFRUIT_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.PASSIONFRUIT_SLAB.get(), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PASSIONFRUIT_SLAB.get(), models().slab(DFFBlocks.PASSIONFRUIT_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_PASSIONFRUIT_SAPLING.get(), models().cross(DFFBlocks.DFF_PASSIONFRUIT_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_PASSIONFRUIT_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.PASSIONFRUIT_FENCE.get(), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PASSIONFRUIT_FENCE.get(), models().fenceInventory(DFFBlocks.PASSIONFRUIT_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.PASSIONFRUIT_FENCE_GATE.get(), blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.PASSIONFRUIT_FENCE_GATE.get(), models().fenceGate(DFFBlocks.PASSIONFRUIT_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.PASSIONFRUIT_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.PASSIONFRUIT_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/passionfruit_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/passionfruit_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.PASSIONFRUIT_TRAPDOOR.get(), blockTexture(DFFBlocks.PASSIONFRUIT_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.DRAGONFRUIT_LOG.get());
        simpleBlock(DFFBlocks.DRAGONFRUIT_PLANKS.get());
        simpleBlockItem(DFFBlocks.DRAGONFRUIT_PLANKS.get(), models().cubeAll(DFFBlocks.DRAGONFRUIT_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.DRAGONFRUIT_STAIRS.get(), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.DRAGONFRUIT_STAIRS.get(), models().stairs(DFFBlocks.DRAGONFRUIT_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.DRAGONFRUIT_SLAB.get(), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.DRAGONFRUIT_SLAB.get(), models().slab(DFFBlocks.DRAGONFRUIT_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_DRAGONFRUIT_SAPLING.get(), models().cross(DFFBlocks.DFF_DRAGONFRUIT_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_DRAGONFRUIT_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.DRAGONFRUIT_FENCE.get(), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.DRAGONFRUIT_FENCE.get(), models().fenceInventory(DFFBlocks.DRAGONFRUIT_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.DRAGONFRUIT_FENCE_GATE.get(), blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.DRAGONFRUIT_FENCE_GATE.get(), models().fenceGate(DFFBlocks.DRAGONFRUIT_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.DRAGONFRUIT_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.DRAGONFRUIT_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/dragonfruit_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/dragonfruit_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.DRAGONFRUIT_TRAPDOOR.get(), blockTexture(DFFBlocks.DRAGONFRUIT_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.WALNUT_LOG.get());
        simpleBlock(DFFBlocks.WALNUT_PLANKS.get());
        simpleBlockItem(DFFBlocks.WALNUT_PLANKS.get(), models().cubeAll(DFFBlocks.WALNUT_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.WALNUT_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.WALNUT_STAIRS.get(), blockTexture(DFFBlocks.WALNUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.WALNUT_STAIRS.get(), models().stairs(DFFBlocks.WALNUT_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.WALNUT_PLANKS.get()), blockTexture(DFFBlocks.WALNUT_PLANKS.get()), blockTexture(DFFBlocks.WALNUT_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.WALNUT_SLAB.get(), blockTexture(DFFBlocks.WALNUT_PLANKS.get()), blockTexture(DFFBlocks.WALNUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.WALNUT_SLAB.get(), models().slab(DFFBlocks.WALNUT_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.WALNUT_PLANKS.get()), blockTexture(DFFBlocks.WALNUT_PLANKS.get()), blockTexture(DFFBlocks.WALNUT_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_WALNUT_SAPLING.get(), models().cross(DFFBlocks.DFF_WALNUT_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_WALNUT_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.WALNUT_FENCE.get(), blockTexture(DFFBlocks.WALNUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.WALNUT_FENCE.get(), models().fenceInventory(DFFBlocks.WALNUT_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.WALNUT_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.WALNUT_FENCE_GATE.get(), blockTexture(DFFBlocks.WALNUT_PLANKS.get()));
        simpleBlockItem(DFFBlocks.WALNUT_FENCE_GATE.get(), models().fenceGate(DFFBlocks.WALNUT_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.WALNUT_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.WALNUT_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/walnut_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/walnut_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.WALNUT_TRAPDOOR.get(), blockTexture(DFFBlocks.WALNUT_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.ALMOND_LOG.get());
        simpleBlock(DFFBlocks.ALMOND_PLANKS.get());
        simpleBlockItem(DFFBlocks.ALMOND_PLANKS.get(), models().cubeAll(DFFBlocks.ALMOND_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.ALMOND_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.ALMOND_STAIRS.get(), blockTexture(DFFBlocks.ALMOND_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ALMOND_STAIRS.get(), models().stairs(DFFBlocks.ALMOND_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.ALMOND_PLANKS.get()), blockTexture(DFFBlocks.ALMOND_PLANKS.get()), blockTexture(DFFBlocks.ALMOND_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.ALMOND_SLAB.get(), blockTexture(DFFBlocks.ALMOND_PLANKS.get()), blockTexture(DFFBlocks.ALMOND_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ALMOND_SLAB.get(), models().slab(DFFBlocks.ALMOND_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.ALMOND_PLANKS.get()), blockTexture(DFFBlocks.ALMOND_PLANKS.get()), blockTexture(DFFBlocks.ALMOND_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_ALMOND_SAPLING.get(), models().cross(DFFBlocks.DFF_ALMOND_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_ALMOND_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.ALMOND_FENCE.get(), blockTexture(DFFBlocks.ALMOND_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ALMOND_FENCE.get(), models().fenceInventory(DFFBlocks.ALMOND_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.ALMOND_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.ALMOND_FENCE_GATE.get(), blockTexture(DFFBlocks.ALMOND_PLANKS.get()));
        simpleBlockItem(DFFBlocks.ALMOND_FENCE_GATE.get(), models().fenceGate(DFFBlocks.ALMOND_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.ALMOND_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.ALMOND_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/almond_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/almond_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.ALMOND_TRAPDOOR.get(), blockTexture(DFFBlocks.ALMOND_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.CASHEW_LOG.get());
        simpleBlock(DFFBlocks.CASHEW_PLANKS.get());
        simpleBlockItem(DFFBlocks.CASHEW_PLANKS.get(), models().cubeAll(DFFBlocks.CASHEW_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.CASHEW_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.CASHEW_STAIRS.get(), blockTexture(DFFBlocks.CASHEW_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CASHEW_STAIRS.get(), models().stairs(DFFBlocks.CASHEW_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.CASHEW_PLANKS.get()), blockTexture(DFFBlocks.CASHEW_PLANKS.get()), blockTexture(DFFBlocks.CASHEW_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.CASHEW_SLAB.get(), blockTexture(DFFBlocks.CASHEW_PLANKS.get()), blockTexture(DFFBlocks.CASHEW_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CASHEW_SLAB.get(), models().slab(DFFBlocks.CASHEW_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.CASHEW_PLANKS.get()), blockTexture(DFFBlocks.CASHEW_PLANKS.get()), blockTexture(DFFBlocks.CASHEW_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_CASHEW_SAPLING.get(), models().cross(DFFBlocks.DFF_CASHEW_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_CASHEW_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.CASHEW_FENCE.get(), blockTexture(DFFBlocks.CASHEW_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CASHEW_FENCE.get(), models().fenceInventory(DFFBlocks.CASHEW_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.CASHEW_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.CASHEW_FENCE_GATE.get(), blockTexture(DFFBlocks.CASHEW_PLANKS.get()));
        simpleBlockItem(DFFBlocks.CASHEW_FENCE_GATE.get(), models().fenceGate(DFFBlocks.CASHEW_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.CASHEW_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.CASHEW_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/cashew_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/cashew_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.CASHEW_TRAPDOOR.get(), blockTexture(DFFBlocks.CASHEW_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.BANANA_LOG.get());
        simpleBlock(DFFBlocks.BANANA_PLANKS.get());
        simpleBlockItem(DFFBlocks.BANANA_PLANKS.get(), models().cubeAll(DFFBlocks.BANANA_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.BANANA_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.BANANA_STAIRS.get(), blockTexture(DFFBlocks.BANANA_PLANKS.get()));
        simpleBlockItem(DFFBlocks.BANANA_STAIRS.get(), models().stairs(DFFBlocks.BANANA_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.BANANA_PLANKS.get()), blockTexture(DFFBlocks.BANANA_PLANKS.get()), blockTexture(DFFBlocks.BANANA_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.BANANA_SLAB.get(), blockTexture(DFFBlocks.BANANA_PLANKS.get()), blockTexture(DFFBlocks.BANANA_PLANKS.get()));
        simpleBlockItem(DFFBlocks.BANANA_SLAB.get(), models().slab(DFFBlocks.BANANA_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.BANANA_PLANKS.get()), blockTexture(DFFBlocks.BANANA_PLANKS.get()), blockTexture(DFFBlocks.BANANA_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_BANANA_SAPLING.get(), models().cross(DFFBlocks.DFF_BANANA_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_BANANA_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.BANANA_FENCE.get(), blockTexture(DFFBlocks.BANANA_PLANKS.get()));
        simpleBlockItem(DFFBlocks.BANANA_FENCE.get(), models().fenceInventory(DFFBlocks.BANANA_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.BANANA_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.BANANA_FENCE_GATE.get(), blockTexture(DFFBlocks.BANANA_PLANKS.get()));
        simpleBlockItem(DFFBlocks.BANANA_FENCE_GATE.get(), models().fenceGate(DFFBlocks.BANANA_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.BANANA_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.BANANA_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/banana_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/banana_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.BANANA_TRAPDOOR.get(), blockTexture(DFFBlocks.BANANA_TRAPDOOR.get()), true, "cutout");

        logBlock(DFFBlocks.OLIVE_LOG.get());
        simpleBlock(DFFBlocks.OLIVE_PLANKS.get());
        simpleBlockItem(DFFBlocks.OLIVE_PLANKS.get(), models().cubeAll(DFFBlocks.OLIVE_PLANKS.getId().getPath(),
                blockTexture(DFFBlocks.OLIVE_PLANKS.get())));
        stairsBlock((StairBlock) DFFBlocks.OLIVE_STAIRS.get(), blockTexture(DFFBlocks.OLIVE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.OLIVE_STAIRS.get(), models().stairs(DFFBlocks.OLIVE_STAIRS.getId().getPath(),
                blockTexture(DFFBlocks.OLIVE_PLANKS.get()), blockTexture(DFFBlocks.OLIVE_PLANKS.get()), blockTexture(DFFBlocks.OLIVE_PLANKS.get())));
        slabBlock((SlabBlock) DFFBlocks.OLIVE_SLAB.get(), blockTexture(DFFBlocks.OLIVE_PLANKS.get()), blockTexture(DFFBlocks.OLIVE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.OLIVE_SLAB.get(), models().slab(DFFBlocks.OLIVE_SLAB.getId().getPath(),
                blockTexture(DFFBlocks.OLIVE_PLANKS.get()), blockTexture(DFFBlocks.OLIVE_PLANKS.get()), blockTexture(DFFBlocks.OLIVE_PLANKS.get())));
        simpleBlock(DFFBlocks.DFF_OLIVE_SAPLING.get(), models().cross(DFFBlocks.DFF_OLIVE_SAPLING.getId().getPath(),
                blockTexture(DFFBlocks.DFF_OLIVE_SAPLING.get())));
        fenceBlock((FenceBlock) DFFBlocks.OLIVE_FENCE.get(), blockTexture(DFFBlocks.OLIVE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.OLIVE_FENCE.get(), models().fenceInventory(DFFBlocks.OLIVE_FENCE.getId().getPath(),
                blockTexture(DFFBlocks.OLIVE_PLANKS.get())));
        fenceGateBlock((FenceGateBlock) DFFBlocks.OLIVE_FENCE_GATE.get(), blockTexture(DFFBlocks.OLIVE_PLANKS.get()));
        simpleBlockItem(DFFBlocks.OLIVE_FENCE_GATE.get(), models().fenceGate(DFFBlocks.OLIVE_FENCE_GATE.getId().getPath(),
                blockTexture(DFFBlocks.OLIVE_PLANKS.get())));
        doorBlockWithRenderType((DoorBlock) DFFBlocks.OLIVE_DOOR.get(), new ResourceLocation(DFFeastsMain.MODID, "block/olive_door_bottom"),
                new ResourceLocation(DFFeastsMain.MODID, "block/olive_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) DFFBlocks.OLIVE_TRAPDOOR.get(), blockTexture(DFFBlocks.OLIVE_TRAPDOOR.get()), true, "cutout");
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(DFFeastsMain.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
