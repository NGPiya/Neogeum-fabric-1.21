package ch.piyamon.datagen;

import ch.piyamon.Neogeum;
import ch.piyamon.block.ModBlocks;
import ch.piyamon.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> NEOGEUM_SMELTABLES = List.of(ModBlocks.NEOGEUM_ORE);
        List<ItemConvertible> ROSE_QUARTZ_SMELTABLES = List.of(ModBlocks.ROSEQUARTZ_ORE);
        List<ItemConvertible> CARRUPTIUM_SMELTABLES = List.of(ModBlocks.CARRUPTIUM_ORE);

        offerSmelting(exporter, NEOGEUM_SMELTABLES, RecipeCategory.MISC, ModItems.NEOGEUM, 0.2f, 100, "neogeum");
        offerSmelting(exporter, ROSE_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.ROSEQUARTZ, 0.2f, 100, "rose_quartz");
        offerSmelting(exporter, CARRUPTIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CARRUPTIUM, 0.2f, 100, "carruptium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CARRUPTIUM, RecipeCategory.MISC, ModBlocks.CARRUPTIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUMSHARD)
                .pattern("A")
                .input('A', ModItems.NEOGEUM)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_shard_from_neogeum"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.NEOGEUMSHARD)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_from_shards"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM)
                .pattern("A")
                .input('A', ModBlocks.NEOGEUM_BLOCK)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_from_block"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.NEOGEUM_BLOCK)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.NEOGEUM)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSEQUARTZ)
                .pattern("A")
                .input('A', ModItems.PERFECTROSEQUARTZ)
                .criterion(hasItem(ModItems.ROSEQUARTZ), conditionsFromItem(ModItems.ROSEQUARTZ))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "rose_quartz_from_perfect"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PERFECTROSEQUARTZ)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ROSEQUARTZ)
                .criterion(hasItem(ModItems.ROSEQUARTZ), conditionsFromItem(ModItems.ROSEQUARTZ))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "perfect_from_rose_quartz"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSEQUARTZ)
                .pattern("A")
                .input('A', ModBlocks.ROSEQUARTZ_BLOCK)
                .criterion(hasItem(ModItems.PERFECTROSEQUARTZ), conditionsFromItem(ModItems.ROSEQUARTZ))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "perfect_from_block"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ROSEQUARTZ_BLOCK)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.PERFECTROSEQUARTZ)
                .criterion(hasItem(ModItems.ROSEQUARTZ), conditionsFromItem(ModItems.ROSEQUARTZ))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "rose_quartz_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .input('A', ModItems.NEOGEUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_SHOVEL)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ModItems.NEOGEUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_PICKAXE)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ModItems.NEOGEUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_AXE)
                .pattern("AA ")
                .pattern("AB ")
                .pattern(" B ")
                .input('A', ModItems.NEOGEUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_HOE)
                .pattern("AA ")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ModItems.NEOGEUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_hoe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CARRUPTIUM_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .input('A', ModItems.CARRUPTIUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.CARRUPTIUM), conditionsFromItem(ModItems.CARRUPTIUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "carruptium_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CARRUPTIUM_SHOVEL)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ModItems.CARRUPTIUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.CARRUPTIUM), conditionsFromItem(ModItems.CARRUPTIUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "carruptium_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CARRUPTIUM_PICKAXE)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ModItems.CARRUPTIUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.CARRUPTIUM), conditionsFromItem(ModItems.CARRUPTIUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "carruptium_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CARRUPTIUM_AXE)
                .pattern("AA ")
                .pattern("AB ")
                .pattern(" B ")
                .input('A', ModItems.CARRUPTIUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.CARRUPTIUM), conditionsFromItem(ModItems.CARRUPTIUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "carruptium_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CARRUPTIUM_HOE)
                .pattern("AA ")
                .pattern(" B ")
                .pattern(" B ")
                .input('A', ModItems.CARRUPTIUM)
                .input('B', Items.STICK)
                .criterion(hasItem(ModItems.CARRUPTIUM), conditionsFromItem(ModItems.CARRUPTIUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "carruptium_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .input('A', ModItems.NEOGEUM)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.NEOGEUM)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.NEOGEUM)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEOGEUM_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.NEOGEUM)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_boots"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSEQUARTZ_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .input('A', ModItems.PERFECTROSEQUARTZ)
                .criterion(hasItem(ModItems.ROSEQUARTZ), conditionsFromItem(ModItems.ROSEQUARTZ))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "rose_quartz_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSEQUARTZ_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.PERFECTROSEQUARTZ)
                .criterion(hasItem(ModItems.ROSEQUARTZ), conditionsFromItem(ModItems.ROSEQUARTZ))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "rose_quartz_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSEQUARTZ_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.PERFECTROSEQUARTZ)
                .criterion(hasItem(ModItems.ROSEQUARTZ), conditionsFromItem(ModItems.ROSEQUARTZ))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "rose_quartz_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSEQUARTZ_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.PERFECTROSEQUARTZ)
                .criterion(hasItem(ModItems.ROSEQUARTZ), conditionsFromItem(ModItems.ROSEQUARTZ))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "rose_quartz_boots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE, 2)
                .pattern("BAB")
                .pattern("BCB")
                .pattern("BBB")
                .input('A', ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE)
                .input('C', ModBlocks.ROSALITE_BLOCK)
                .input('B', Items.DIAMOND)
                .criterion(hasItem(ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE), conditionsFromItem(ModItems.MEGA_ARMOR_TRIM_SMITHING_TEMPLATE))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "mega_armor_trim_smithing_template"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.NEOGEUMPOTATO)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', ModItems.NEOGEUM)
                .input('B', Items.POTATO)
                .criterion(hasItem(ModItems.NEOGEUM), conditionsFromItem(ModItems.NEOGEUM))
                .offerTo(exporter, Identifier.of(Neogeum.MOD_ID, "neogeum_potato"));


    }
}