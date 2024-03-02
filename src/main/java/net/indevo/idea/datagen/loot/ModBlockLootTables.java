package net.indevo.idea.datagen.loot;

import net.indevo.idea.block.ModBlocks;
import net.indevo.idea.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());

        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());

        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TITANIUM_BLOCK.get());

        this.dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ALUMINUM_BLOCK.get());

        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.RESONANT_ALLOY_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.ELECTRUM_BLOCK.get());




        this.add(ModBlocks.TIN_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));

        this.add(ModBlocks.TITANIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));
        this.add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));

        this.add(ModBlocks.ALUMINUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));
        this.add(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));

        this.add(ModBlocks.SULFUR_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SULFUR_ORE.get(), ModItems.SULFUR_CRYSTAL.get()));
        this.add(ModBlocks.DEEPSLATE_SULFUR_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SULFUR_ORE.get(), ModItems.SULFUR_CRYSTAL.get()));

        this.dropSelf(ModBlocks.GEM_EMPOWERING_STATION.get());

        this.dropSelf(ModBlocks.RUBBER_LOG.get());
        this.dropSelf(ModBlocks.RUBBER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_RUBBER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_RUBBER_LOG.get());
        this.dropSelf(ModBlocks.RUBBER_PLANKS.get());
        this.dropSelf(ModBlocks.RUBBER_SAPLING.get());

        this.add(ModBlocks.RUBBER_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RUBBER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
