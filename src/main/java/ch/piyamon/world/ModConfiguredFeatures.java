package ch.piyamon.world;

import ch.piyamon.Neogeum;
import ch.piyamon.block.ModBlocks;
import ch.piyamon.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> NEOGEUM_ORE_KEY = registerKey("neogeum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROSEQUARTZ_ORE_KEY = registerKey("rose_quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CARRUPTIUM_ORE_KEY = registerKey("carruptium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new BlockMatchRuleTest(Blocks.BASALT);



        List<OreFeatureConfig.Target> overworldNeogeumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ROSEQUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.CARRUPTIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherNeogeumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NEOGEUM_ORE.getDefaultState()));


        register(context, NEOGEUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherNeogeumOres,6));
        register(context, ROSEQUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNeogeumOres,3));
        register(context, CARRUPTIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNeogeumOres,3));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Neogeum.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}