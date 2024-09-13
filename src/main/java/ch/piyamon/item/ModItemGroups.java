package ch.piyamon.item;

import ch.piyamon.Neogeum;
import ch.piyamon.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NEOGEUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Neogeum.MOD_ID, "neogeum"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.neogeum"))
                    .icon(() -> new ItemStack(ModItems.NEOGEUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.NEOGEUMSHARD);
                        entries.add(ModItems.NEOGEUM);
                        entries.add(ModItems.ROSEQUARTZ);
                        entries.add(ModItems.PERFECTROSEQUARTZ);
                        entries.add(ModItems.CARRUPTIUM);
                        entries.add(ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE);

                        entries.add(ModItems.NEOGEUM_SWORD);
                        entries.add(ModItems.NEOGEUM_SHOVEL);
                        entries.add(ModItems.NEOGEUM_PICKAXE);
                        entries.add(ModItems.NEOGEUM_AXE);
                        entries.add(ModItems.NEOGEUM_HOE);
                        entries.add(ModItems.CARRUPTIUM_SWORD);
                        entries.add(ModItems.CARRUPTIUM_SHOVEL);
                        entries.add(ModItems.CARRUPTIUM_PICKAXE);
                        entries.add(ModItems.CARRUPTIUM_AXE);
                        entries.add(ModItems.CARRUPTIUM_HOE);

                        entries.add(ModItems.NEOGEUM_HELMET);
                        entries.add(ModItems.NEOGEUM_CHESTPLATE);
                        entries.add(ModItems.NEOGEUM_LEGGINGS);
                        entries.add(ModItems.NEOGEUM_BOOTS);
                        entries.add(ModItems.ROSEQUARTZ_HELMET);
                        entries.add(ModItems.ROSEQUARTZ_CHESTPLATE);
                        entries.add(ModItems.ROSEQUARTZ_LEGGINGS);
                        entries.add(ModItems.ROSEQUARTZ_BOOTS);

                        entries.add(ModItems.NEOGEUMPOTATO);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);

                        entries.add(ModItems.NEO_MUSIC_DISC);

                        entries.add(ModBlocks.NEOGEUM_BLOCK);
                        entries.add(ModBlocks.NEOGEUM_ORE);
                        entries.add(ModBlocks.ROSEQUARTZ_BLOCK);
                        entries.add(ModBlocks.ROSEQUARTZ_ORE);
                        entries.add(ModBlocks.CARRUPTIUM_BLOCK);
                        entries.add(ModBlocks.CARRUPTIUM_ORE);
                        entries.add(ModBlocks.ROSALITE_BLOCK);
                        entries.add(ModBlocks.ROSALITE_PILLAR);
                        entries.add(ModBlocks.ROSALITE_STAIRS);
                        entries.add(ModBlocks.ROSALITE_SLAB);
                        entries.add(ModBlocks.ROSALITE_LANTERN);
                        entries.add(ModBlocks.ROSALITE_DOOR);
                        entries.add(ModBlocks.ROSALITE_TRAPDOOR);
                        entries.add(ModBlocks.ROSALITE_GRATE);
                        entries.add(ModBlocks.ROSALITE_LAMP);

                    }).build());

    public static void registerItemGroups() {
        Neogeum.LOGGER.info("Registering Item Groups for " + Neogeum.MOD_ID);
    }
}