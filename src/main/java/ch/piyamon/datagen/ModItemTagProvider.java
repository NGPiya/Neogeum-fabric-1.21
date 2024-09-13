package ch.piyamon.datagen;

import ch.piyamon.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.NEOGEUM_HELMET,
                        ModItems.NEOGEUM_CHESTPLATE,
                        ModItems.NEOGEUM_LEGGINGS,
                        ModItems.NEOGEUM_BOOTS,
                        ModItems.ROSEQUARTZ_HELMET,
                        ModItems.ROSEQUARTZ_CHESTPLATE,
                        ModItems.ROSEQUARTZ_LEGGINGS,
                        ModItems.ROSEQUARTZ_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.NEOGEUMSHARD)
                .add(ModItems.ROSEQUARTZ);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.NEOGEUM_HELMET,
                        ModItems.NEOGEUM_CHESTPLATE,
                        ModItems.NEOGEUM_LEGGINGS,
                        ModItems.NEOGEUM_BOOTS,
                        ModItems.ROSEQUARTZ_HELMET,
                        ModItems.ROSEQUARTZ_CHESTPLATE,
                        ModItems.ROSEQUARTZ_LEGGINGS,
                        ModItems.ROSEQUARTZ_BOOTS,
                        ModItems.NEOGEUM_SHOVEL,
                        ModItems.NEOGEUM_PICKAXE,
                        ModItems.NEOGEUM_AXE,
                        ModItems.NEOGEUM_HOE,
                        ModItems.CARRUPTIUM_SHOVEL,
                        ModItems.CARRUPTIUM_PICKAXE,
                        ModItems.CARRUPTIUM_AXE,
                        ModItems.CARRUPTIUM_HOE,
                        ModItems.NEOGEUM_SWORD,
                        ModItems.CARRUPTIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.NEOGEUM_HELMET,
                        ModItems.NEOGEUM_CHESTPLATE,
                        ModItems.NEOGEUM_LEGGINGS,
                        ModItems.NEOGEUM_BOOTS,
                        ModItems.ROSEQUARTZ_HELMET,
                        ModItems.ROSEQUARTZ_CHESTPLATE,
                        ModItems.ROSEQUARTZ_LEGGINGS,
                        ModItems.ROSEQUARTZ_BOOTS);
        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.NEOGEUM_HELMET,
                        ModItems.NEOGEUM_CHESTPLATE,
                        ModItems.NEOGEUM_LEGGINGS,
                        ModItems.NEOGEUM_BOOTS,
                        ModItems.ROSEQUARTZ_HELMET,
                        ModItems.ROSEQUARTZ_CHESTPLATE,
                        ModItems.ROSEQUARTZ_LEGGINGS,
                        ModItems.ROSEQUARTZ_BOOTS);
        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.NEOGEUM_SHOVEL,
                        ModItems.NEOGEUM_PICKAXE,
                        ModItems.NEOGEUM_AXE,
                        ModItems.NEOGEUM_HOE,
                        ModItems.CARRUPTIUM_SHOVEL,
                        ModItems.CARRUPTIUM_PICKAXE,
                        ModItems.CARRUPTIUM_AXE,
                        ModItems.CARRUPTIUM_HOE);
        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(ModItems.NEOGEUM_SWORD,
                        ModItems.CARRUPTIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(ModItems.NEOGEUM_SWORD,
                        ModItems.CARRUPTIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.NEOGEUM_BOOTS,
                        ModItems.ROSEQUARTZ_BOOTS);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.NEOGEUM_HELMET,
                        ModItems.ROSEQUARTZ_HELMET);
    }
}