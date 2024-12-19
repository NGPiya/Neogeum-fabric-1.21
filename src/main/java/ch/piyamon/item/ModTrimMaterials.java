package ch.piyamon.item;

import ch.piyamon.Neogeum;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.EquipmentModels;
import net.minecraft.item.equipment.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> NEOGEUM = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(Neogeum.MOD_ID, "neogeum"));
    public static final RegistryKey<ArmorTrimMaterial> ROSE_QUARTZ = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(Neogeum.MOD_ID, "rose_quartz"));


    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, NEOGEUM, Registries.ITEM.getEntry(ModItems.NEOGEUM), Style.EMPTY.withColor(5549560), 0.85F, Map.of(ModArmorMaterials.NEOGEUM, "neogeum_darker"));
        register(registerable, ROSE_QUARTZ, Registries.ITEM.getEntry(ModItems.ROSEQUARTZ), Style.EMPTY.withColor(TextColor.parse("5549560").getOrThrow()), 0.95F);
        register(registerable, NEOGEUM, Registries.ITEM.getEntry(ModItems.NEOGEUM), Style.EMPTY.withColor(5549560), 0.85F, Map.of(EquipmentModels.DIAMOND, "diamond_darker"));
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
