package ch.piyamon.item;

import ch.piyamon.Neogeum;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.trim.ArmorTrimPattern;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Optional;

public class ModTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> KAUPEN = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Neogeum.MOD_ID, "mega"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context, ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE, KAUPEN);
    }

    private static void register(Registerable<ArmorTrimPattern> context, Item item, RegistryKey<ArmorTrimPattern> key) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(), Registries.ITEM.getEntry(item),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);

        context.register(key, trimPattern);
    }
}
