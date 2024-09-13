package ch.piyamon.item;

import ch.piyamon.Neogeum;
import ch.piyamon.block.ModBlocks;
import ch.piyamon.item.custom.ModArmorItem;
import ch.piyamon.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.trim.ArmorTrimPatterns;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NEOGEUM = registerItem("neogeum", new Item(new Item.Settings()));
    public static final Item NEOGEUMSHARD = registerItem("neogeum_shard", new Item(new Item.Settings()));
    public static final Item ROSEQUARTZ = registerItem("rose_quartz", new Item(new Item.Settings()));
    public static final Item PERFECTROSEQUARTZ = registerItem("perfect_rose_quartz", new Item(new Item.Settings()));
    public static final Item CARRUPTIUM = registerItem("carruptium", new Item(new Item.Settings()));
    public static final Item MEGA_ARMOR_TRIM_SMITHING_TEMPLATE = registerItem("mega_armor_trim_smithing_template", SmithingTemplateItem.of(ModTrimPatterns.MEGA));

    public static final Item NEOGEUM_SWORD = registerItem("neogeum_sword",
            new SwordItem(ModToolMaterials.NEOGEUM,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NEOGEUM, 3, -2.4f))));
    public static final Item NEOGEUM_PICKAXE = registerItem("neogeum_pickaxe",
            new PickaxeItem(ModToolMaterials.NEOGEUM,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.NEOGEUM, 1, -2.8f))));
    public static final Item NEOGEUM_SHOVEL = registerItem("neogeum_shovel",
            new ShovelItem(ModToolMaterials.NEOGEUM,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.NEOGEUM, 1.5f, -3.0f))));
    public static final Item NEOGEUM_AXE = registerItem("neogeum_axe",
            new AxeItem(ModToolMaterials.NEOGEUM,
                    new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.NEOGEUM, 6, -3.2f))));
    public static final Item NEOGEUM_HOE = registerItem("neogeum_hoe",
            new HoeItem(ModToolMaterials.NEOGEUM,
                    new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CARRUPTIUM, -4, -3f))));
    public static final Item CARRUPTIUM_SWORD = registerItem("carruptium_sword",
            new SwordItem(ModToolMaterials.CARRUPTIUM,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CARRUPTIUM, 3, -2.4f))));
    public static final Item CARRUPTIUM_PICKAXE = registerItem("carruptium_pickaxe",
            new PickaxeItem(ModToolMaterials.CARRUPTIUM,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CARRUPTIUM, 1, -2.8f))));
    public static final Item CARRUPTIUM_SHOVEL = registerItem("carruptium_shovel",
            new ShovelItem(ModToolMaterials.CARRUPTIUM,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CARRUPTIUM, 1.5f, -3.0f))));
    public static final Item CARRUPTIUM_AXE = registerItem("carruptium_axe",
            new AxeItem(ModToolMaterials.CARRUPTIUM,
                    new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CARRUPTIUM, 6, -3.2f))));
    public static final Item CARRUPTIUM_HOE = registerItem("carruptium_hoe",
            new HoeItem(ModToolMaterials.CARRUPTIUM,
                    new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CARRUPTIUM, -4, -3f))));

    public static final Item NEOGEUM_HELMET = registerItem("neogeum_helmet",
            new ArmorItem(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item NEOGEUM_CHESTPLATE = registerItem("neogeum_chestplate",
            new ArmorItem(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item NEOGEUM_LEGGINGS = registerItem("neogeum_leggings",
            new ArmorItem(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item NEOGEUM_BOOTS = registerItem("neogeum_boots",
            new ArmorItem(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));
    public static final Item ROSEQUARTZ_HELMET = registerItem("rose_quartz_helmet",
            new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item ROSEQUARTZ_CHESTPLATE = registerItem("rose_quartz_chestplate",
            new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item ROSEQUARTZ_LEGGINGS = registerItem("rose_quartz_leggings",
            new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item ROSEQUARTZ_BOOTS = registerItem("rose_quartz_boots",
            new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item NEOGEUMPOTATO = registerItem("neogeum_potato", new Item(new Item.Settings().food(ModFoodComponents.NEOGEUMPOTATO)));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()));

    public static final Item NEO_MUSIC_DISC = registerItem("neo_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.NEO_KEY).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Neogeum.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(NEOGEUM);
    }

    public static void registerModItems() {
        Neogeum.LOGGER.info("Registering Mod Items for " + Neogeum.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}