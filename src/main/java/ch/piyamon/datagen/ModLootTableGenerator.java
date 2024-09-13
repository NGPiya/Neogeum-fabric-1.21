package ch.piyamon.datagen;

import ch.piyamon.block.ModBlocks;
import ch.piyamon.block.custom.TomatoCropBlock;
import ch.piyamon.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.io.DataOutput;
import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.NEOGEUM_BLOCK);
        addDrop(ModBlocks.NEOGEUM_ORE, multipleOreDrops(ModBlocks.NEOGEUM_ORE, ModItems.NEOGEUMSHARD, 1, 3));
        addDrop(ModBlocks.ROSEQUARTZ_BLOCK);
        addDrop(ModBlocks.ROSEQUARTZ_ORE, multipleOreDrops(ModBlocks.ROSEQUARTZ_ORE, ModItems.ROSEQUARTZ, 1, 3));
        addDrop(ModBlocks.CARRUPTIUM_BLOCK);
        addDrop(ModBlocks.CARRUPTIUM_ORE, multipleOreDrops(ModBlocks.CARRUPTIUM_ORE, ModItems.CARRUPTIUM, 1, 3));
        addDrop(ModBlocks.ROSALITE_BLOCK);
        addDrop(ModBlocks.ROSALITE_PILLAR);
        addDrop(ModBlocks.ROSALITE_STAIRS);
        addDrop(ModBlocks.ROSALITE_SLAB);
        addDrop(ModBlocks.ROSALITE_LANTERN);
        addDrop(ModBlocks.ROSALITE_DOOR, doorDrops(ModBlocks.ROSALITE_DOOR));
        addDrop(ModBlocks.ROSALITE_TRAPDOOR);
        addDrop(ModBlocks.ROSALITE_GRATE);
        addDrop(ModBlocks.ROSALITE_LAMP);

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(TomatoCropBlock.AGE, 5));
        this.addDrop(ModBlocks.TOMATO_CROP, this.cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder));

    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}