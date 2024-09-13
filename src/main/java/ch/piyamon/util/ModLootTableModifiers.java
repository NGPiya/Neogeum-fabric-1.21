package ch.piyamon.util;

import ch.piyamon.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (Blocks.TALL_GRASS.getLootTableKey() == key && source.isBuiltin()) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS));

                tableBuilder.pool(pool);
            }});

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (Blocks.SHORT_GRASS.getLootTableKey() == key && source.isBuiltin()) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS));

                tableBuilder.pool(pool);
            }});

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (Blocks.FERN.getLootTableKey() == key && source.isBuiltin()) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS));

                tableBuilder.pool(pool);
            }});
    }
}
