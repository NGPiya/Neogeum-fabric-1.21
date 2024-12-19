package ch.piyamon.item;

import ch.piyamon.Neogeum;
import ch.piyamon.block.ModBlocks;
import ch.piyamon.item.custom.ModArmorItem;
import ch.piyamon.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.trim.ArmorTrimPatterns;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NEOGEUM = registerItem("neogeum", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum")))));
    public static final Item NEOGEUMSHARD = registerItem("neogeum_shard", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_shard")))));
    public static final Item ROSEQUARTZ = registerItem("rose_quartz", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "rose_quartz")))));
    public static final Item PERFECTROSEQUARTZ = registerItem("perfect_rose_quartz", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "perfect_rose_quartz")))));
    public static final Item CARRUPTIUM = registerItem("carruptium", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "carruptium")))));
    public static final Item MEGA_ARMOR_TRIM_SMITHING_TEMPLATE = registerItem("mega_armor_trim_smithing_template",
            SmithingTemplateItem.of(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "mega_armor_trim_smithing_template")))));

    public static final Item NEOGEUM_SWORD = registerItem("neogeum_sword", new SwordItem(ModToolMaterials.NEOGEUM, 3, -2.4f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_sword")))));
    public static final Item NEOGEUM_PICKAXE = registerItem("neogeum_pickaxe", new PickaxeItem(ModToolMaterials.NEOGEUM, 1, -2.8f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_pickaxe")))));
    public static final Item NEOGEUM_SHOVEL = registerItem("neogeum_shovel", new ShovelItem(ModToolMaterials.NEOGEUM, 1.5f, -3.0f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_shovel")))));
    public static final Item NEOGEUM_AXE = registerItem("neogeum_axe", new AxeItem(ModToolMaterials.NEOGEUM, 6, -3.2f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_axe")))));
    public static final Item NEOGEUM_HOE = registerItem("neogeum_hoe", new HoeItem(ModToolMaterials.NEOGEUM, -4, -3f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_hoe")))));
    public static final Item CARRUPTIUM_SWORD = registerItem("carruptium_sword", new SwordItem(ModToolMaterials.CARRUPTIUM, 3, -2.4f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "carruptium_sword")))));
    public static final Item CARRUPTIUM_PICKAXE = registerItem("carruptium_pickaxe", new PickaxeItem(ModToolMaterials.CARRUPTIUM, 1, -2.8f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "carruptium_pickaxe")))));
    public static final Item CARRUPTIUM_SHOVEL = registerItem("carruptium_shovel", new ShovelItem(ModToolMaterials.CARRUPTIUM, 1.5f, -3.0f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "carruptium_shovel")))));
    public static final Item CARRUPTIUM_AXE = registerItem("carruptium_axe", new AxeItem(ModToolMaterials.CARRUPTIUM, 6, -3.2f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "carruptium_axe")))));
    public static final Item CARRUPTIUM_HOE = registerItem("carruptium_hoe", new HoeItem(ModToolMaterials.CARRUPTIUM, -4, -3f, new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "carruptium_hoe")))));

    public static final Item NEOGEUM_HELMET = registerItem("neogeum_helmet",
            new ArmorItem(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_helmet")))));
    public static final Item NEOGEUM_CHESTPLATE = registerItem("neogeum_chestplate",
            new ArmorItem(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_chestplate")))));
    public static final Item NEOGEUM_LEGGINGS = registerItem("neogeum_leggings",
            new ArmorItem(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_leggings")))));
    public static final Item NEOGEUM_BOOTS = registerItem("neogeum_boots",
            new ArmorItem(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_boots")))));
    public static final Item ROSEQUARTZ_HELMET = registerItem("rose_quartz_helmet",
            new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "rose_quartz_helmet")))));
    public static final Item ROSEQUARTZ_CHESTPLATE = registerItem("rose_quartz_chestplate",
            new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "rose_quartz_chestplate")))));
    public static final Item ROSEQUARTZ_LEGGINGS = registerItem("rose_quartz_leggings",
            new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "rose_quartz_leggings")))));
    public static final Item ROSEQUARTZ_BOOTS = registerItem("rose_quartz_boots",
            new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "rose_quartz_boots")))));

    public static final Item NEOGEUM_POTATO = registerItem("neogeum_potato", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neogeum_potato")))
            .food(ModFoodComponents.NEOGEUM_POTATO, ModFoodComponents.NEOGEUM_POTATO_EFFECT)));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "tomato")))
            .food(ModFoodComponents.TOMATO)));
    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "cheese")))
            .food(ModFoodComponents.CHEESE)));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "tomato_seeds")))));

    public static final Item NEO_MUSIC_DISC = registerItem("neo_music_disc",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, "neo_music_disc")))
                    .jukeboxPlayable(ModSounds.NEO_KEY).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Neogeum.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Neogeum.LOGGER.info("Registering Mod Items for " + Neogeum.MOD_ID);

    }
}