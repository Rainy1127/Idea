package net.indevo.idea.datagen;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.indevo.idea.item.ModItems;
import net.indevo.idea.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Idea.MOD_ID);
    }

    @Override
   protected void start() {
//        add("resin_ball_from_stripped_rubber_log", new AddItemModifier(new LootItemCondition[]{
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.STRIPPED_RUBBER_LOG.get()).build(),
//                LootItemRandomChanceCondition.randomChance(0.40f).build() }, ModItems.RESIN_BALL.get()));
//
//        add("resin_ball_from_stripped_rubber_wood", new AddItemModifier(new LootItemCondition[]{
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.STRIPPED_RUBBER_WOOD.get()).build(),
//                LootItemRandomChanceCondition.randomChance(0.40f).build() }, ModItems.RESIN_BALL.get()));
    }
}
