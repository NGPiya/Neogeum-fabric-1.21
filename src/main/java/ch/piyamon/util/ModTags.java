package ch.piyamon.util;

import ch.piyamon.Neogeum;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModTags {
    public static class BLOCKS {
        public static final TagKey<Block> INCORRECT_FOR_NEOGEUM_TOOL = createTag("incorrect_for_neogeum_tool");
        public static final TagKey<Block> INCORRECT_FOR_CARRUPTIUM_TOOL = createTag("incorrect_for_carruptium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Neogeum.MOD_ID, name));
        }
    }

    public static class ITEMS {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Neogeum.MOD_ID, name));
        }
    }
}