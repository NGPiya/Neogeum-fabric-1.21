package ch.piyamon.item;

import ch.piyamon.Neogeum;
import ch.piyamon.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiConsumer;

public class ModArmorMaterials {
    public static final ArmorMaterial NEOGEUM_ARMOR_MATERIAL = new ArmorMaterial(500, (Util.make(new EnumMap<>(EquipmentType.class), map -> {
                map.put(EquipmentType.BOOTS, 4);
                map.put(EquipmentType.LEGGINGS, 7);
                map.put(EquipmentType.CHESTPLATE, 9);
                map.put(EquipmentType.HELMET, 4);
                map.put(EquipmentType.BODY, 11);
            })), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, ModTags.ITEMS.NEOGEUM_REPAIR,
                    Identifier.of(Neogeum.MOD_ID, "neogeum"));

    public static final ArmorMaterial ROSE_QUARTZ_ARMOR_MATERIAL = new ArmorMaterial(500, (Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 4);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 4);
        map.put(EquipmentType.BODY, 11);
    })), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, ModTags.ITEMS.ROSE_QUARTZ_REPAIR,
            Identifier.of(Neogeum.MOD_ID, "perfect_rose_quartz"));

    Identifier NEOGEUM = Identifier.ofVanilla("neogeum");

    static void accept(BiConsumer<Identifier, EquipmentModel> equipmentModelBiConsumer) {
        equipmentModelBiConsumer.accept(NEOGEUM, buildHumanoid("chainmail"));

    private static EquipmentModel buildHumanoid(String path) {
        return EquipmentModel.builder().addHumanoidLayers(Identifier.ofVanilla(path)).build();
    }
}