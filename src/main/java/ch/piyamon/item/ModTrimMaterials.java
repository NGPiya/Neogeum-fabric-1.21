package ch.piyamon.item;

import net.minecraft.item.*;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.item.trim.ArmorTrimMaterials;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;
import java.util.Optional;

public class ModTrimMaterials extends ArmorTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> NEOGEUM = of("neogeum");
    public static final RegistryKey<ArmorTrimMaterial> ROSEQUARTZ = of("rose_quartz");

    public static void bootstrap(Registerable<ArmorTrimMaterial> registry) {
        register(registry, NEOGEUM, ModItems.NEOGEUMSHARD, Style.EMPTY.withColor(5549560), 0.85F, Map.of(ModArmorMaterials.NEOGEUM_ARMOR_MATERIAL, "neogeum_darker"));
        register(registry, ROSEQUARTZ, ModItems.ROSEQUARTZ, Style.EMPTY.withColor(14504844), 0.95F, Map.of(ModArmorMaterials.ROSE_QUARTZ_ARMOR_MATERIAL, "rose_quartz_darker"));
    }

    public static Optional<RegistryEntry.Reference<ArmorTrimMaterial>> get(RegistryWrapper.WrapperLookup registriesLookup, ItemStack stack) {
        return registriesLookup.getWrapperOrThrow(RegistryKeys.TRIM_MATERIAL)
                .streamEntries()
                .filter(recipe -> stack.itemMatches(((ArmorTrimMaterial)recipe.value()).ingredient()))
                .findFirst();
    }

    private static void register(Registerable<ArmorTrimMaterial> registry, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex) {
        register(registry, key, ingredient, style, itemModelIndex, Map.of());
    }

    private static void register(
            Registerable<ArmorTrimMaterial> registry,
            RegistryKey<ArmorTrimMaterial> key,
            Item ingredient,
            Style style,
            float itemModelIndex,
            Map<RegistryEntry<ArmorMaterial>, String> overrideArmorMaterials
    ) {
        ArmorTrimMaterial armorTrimMaterial = ArmorTrimMaterial.of(
                key.getValue().getPath(),
                ingredient,
                itemModelIndex,
                Text.translatable(Util.createTranslationKey("trim_material", key.getValue())).fillStyle(style),
                overrideArmorMaterials
        );
        registry.register(key, armorTrimMaterial);
    }

    private static RegistryKey<ArmorTrimMaterial> of(String id) {
        return RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.ofVanilla(id));
    }
}
