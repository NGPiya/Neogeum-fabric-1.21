package ch.piyamon.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.item.trim.ArmorTrimPatterns;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Optional;

public class ModTrimPatterns extends ArmorTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> MEGA = of("mega");


    public static void bootstrap(Registerable<ArmorTrimPattern> registry) {
        register(registry, ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE, MEGA);

    }

    public static Optional<RegistryEntry.Reference<ArmorTrimPattern>> get(RegistryWrapper.WrapperLookup registriesLookup, ItemStack stack) {
        return registriesLookup.getWrapperOrThrow(RegistryKeys.TRIM_PATTERN)
                .streamEntries()
                .filter(pattern -> stack.itemMatches(((ArmorTrimPattern)pattern.value()).templateItem()))
                .findFirst();
    }

    public static void register(Registerable<ArmorTrimPattern> registry, Item template, RegistryKey<ArmorTrimPattern> key) {
        ArmorTrimPattern armorTrimPattern = new ArmorTrimPattern(
                key.getValue(), Registries.ITEM.getEntry(template), Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false
        );
        registry.register(key, armorTrimPattern);
    }

    private static RegistryKey<ArmorTrimPattern> of(String id) {
        return RegistryKey.of(RegistryKeys.TRIM_PATTERN, Identifier.ofVanilla(id));
    }
}
