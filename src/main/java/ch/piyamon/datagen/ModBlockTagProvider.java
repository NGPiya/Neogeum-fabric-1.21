package ch.piyamon.datagen;

import ch.piyamon.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.NEOGEUM_BLOCK)
                .add(ModBlocks.NEOGEUM_ORE)
                .add(ModBlocks.ROSEQUARTZ_BLOCK)
                .add(ModBlocks.ROSEQUARTZ_ORE)
                .add(ModBlocks.CARRUPTIUM_BLOCK)
                .add(ModBlocks.CARRUPTIUM_ORE)
                .add(ModBlocks.ROSALITE_BLOCK)
                .add(ModBlocks.ROSALITE_PILLAR)
                .add(ModBlocks.ROSALITE_STAIRS)
                .add(ModBlocks.ROSALITE_SLAB)
                .add(ModBlocks.ROSALITE_LANTERN)
                .add(ModBlocks.ROSALITE_DOOR);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NEOGEUM_ORE)
                .add(ModBlocks.ROSEQUARTZ_ORE)
                .add(ModBlocks.CARRUPTIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.NEOGEUM_BLOCK)
                .add(ModBlocks.ROSEQUARTZ_BLOCK)
                .add(ModBlocks.CARRUPTIUM_BLOCK)
                .add(ModBlocks.ROSALITE_BLOCK)
                .add(ModBlocks.ROSALITE_PILLAR)
                .add(ModBlocks.ROSALITE_STAIRS)
                .add(ModBlocks.ROSALITE_SLAB)
                .add(ModBlocks.ROSALITE_LANTERN)
                .add(ModBlocks.ROSALITE_DOOR)
                .add(ModBlocks.ROSALITE_TRAPDOOR)
                .add(ModBlocks.ROSALITE_GRATE);
    }
}