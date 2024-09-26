package ch.piyamon;

import ch.piyamon.block.ModBlocks;
import ch.piyamon.datagen.ModRecipeGenerator;
import ch.piyamon.item.ModItemGroups;
import ch.piyamon.item.ModItems;
import ch.piyamon.sound.ModSounds;
import ch.piyamon.util.ModLootTableModifiers;
import ch.piyamon.villager.ModVillagers;
import ch.piyamon.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Neogeum implements ModInitializer {
	public static final String MOD_ID = "neogeum";
    public static final Logger LOGGER = LoggerFactory.getLogger("neogeum");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModSounds.registerSounds();
		ModWorldGeneration.generateModWorldGeneration();
		ModVillagers.registerVillagers();

		TradeOfferHelper.registerVillagerOffers(ModVillagers.CHEESEMAKER, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.DIAMOND, 6),
					new ItemStack(ModItems.NEOGEUM, 19), 4, 1, 0.04f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 2),
					new ItemStack(ModItems.CHEESE, 3), 16, 8, 0.04f));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.CHEESEMAKER, 2, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 2),
					new ItemStack(ModItems.CHEESE, 3), 16, 8, 0.04f));
		});
	}
}