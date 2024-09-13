package ch.piyamon.datagen;

import ch.piyamon.block.ModBlocks;
import ch.piyamon.block.custom.TomatoCropBlock;
import ch.piyamon.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NEOGEUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NEOGEUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSEQUARTZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSEQUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CARRUPTIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CARRUPTIUM_ORE);
        BlockStateModelGenerator.BlockTexturePool RosaliteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSALITE_BLOCK);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.ROSALITE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        RosaliteTexturePool.stairs(ModBlocks.ROSALITE_STAIRS);
        RosaliteTexturePool.slab(ModBlocks.ROSALITE_SLAB);
        blockStateModelGenerator.registerLantern(ModBlocks.ROSALITE_LANTERN);
        blockStateModelGenerator.registerDoor(ModBlocks.ROSALITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ROSALITE_TRAPDOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSALITE_GRATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSALITE_LAMP);

        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NEOGEUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEOGEUMSHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSEQUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.PERFECTROSEQUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARRUPTIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEOGEUM_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEOGEUM_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEOGEUM_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEOGEUM_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEOGEUM_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARRUPTIUM_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARRUPTIUM_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARRUPTIUM_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARRUPTIUM_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARRUPTIUM_HOE, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEOGEUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEOGEUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEOGEUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NEOGEUM_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSEQUARTZ_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSEQUARTZ_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSEQUARTZ_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSEQUARTZ_BOOTS));
        itemModelGenerator.register(ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEOGEUMPOTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEO_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
    }
}