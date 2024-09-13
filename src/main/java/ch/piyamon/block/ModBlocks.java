package ch.piyamon.block;

import ch.piyamon.Neogeum;
import ch.piyamon.block.custom.TomatoCropBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block NEOGEUM_BLOCK = registerBlock("neogeum_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresTool().strength(5.0F, 6.0F)));
    public static final Block NEOGEUM_ORE = registerBlock("neogeum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).strength(3.0F, 3.0F)));
    public static final Block ROSEQUARTZ_BLOCK = registerBlock("rose_quartz_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresTool().strength(5.0F, 6.0F)));
    public static final Block ROSEQUARTZ_ORE = registerBlock("rose_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).strength(3.0F, 3.0F)));
    public static final Block CARRUPTIUM_BLOCK = registerBlock("carruptium_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_TEAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresTool().strength(5.0F, 6.0F)));
    public static final Block CARRUPTIUM_ORE = registerBlock("carruptium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).strength(3.0F, 3.0F)));

    public static final Block ROSALITE_BLOCK = registerBlock("rosalite_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.RAW_IRON_PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.5F, 6.0F)));
    public static final PillarBlock ROSALITE_PILLAR = (PillarBlock) registerBlock("rosalite_pillar",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.RAW_IRON_PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.5F, 6.0F)));
    public static final Block ROSALITE_STAIRS = registerBlock("rosalite_stairs",
            new StairsBlock(ModBlocks.ROSALITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ROSALITE_SLAB = registerBlock("rosalite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6F).requiresTool()));

    public static final Block TOMATO_CROP = registerBlockWithoutBlockItem("tomato_crop",
            new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Block ROSALITE_LANTERN = registerBlock("rosalite_lantern",
            new LanternBlock(
                    AbstractBlock.Settings.create().mapColor(MapColor.RAW_IRON_PINK).solid().requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance(state -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ROSALITE_DOOR = registerBlock("rosalite_door",
            new DoorBlock(
                    BlockSetType.COPPER, AbstractBlock.Settings.create().mapColor(ModBlocks.ROSALITE_BLOCK.getDefaultMapColor()).strength(3.0F, 6.0F).nonOpaque().requiresTool().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ROSALITE_TRAPDOOR = registerBlock("rosalite_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.create().mapColor(ModBlocks.ROSALITE_BLOCK.getDefaultMapColor()).strength(3.0F, 6.0F).requiresTool().nonOpaque().allowsSpawning(Blocks::never)));
    public static final Block ROSALITE_GRATE = registerBlock("rosalite_grate",
            new GrateBlock(AbstractBlock.Settings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER_GRATE).mapColor(MapColor.RAW_IRON_PINK).nonOpaque().requiresTool().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block ROSALITE_LAMP = registerBlock("rosalite_lamp",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).luminance(state -> 15).solidBlock(Blocks::never)
            )
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Neogeum.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Neogeum.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Neogeum.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Neogeum.LOGGER.info("Registering Mod Blocks for " + Neogeum.MOD_ID);
    }
}