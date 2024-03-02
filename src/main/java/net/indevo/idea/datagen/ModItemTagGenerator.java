package net.indevo.idea.datagen;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, Idea.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.RUBBER_LOG.get().asItem())
                .add(ModBlocks.RUBBER_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_RUBBER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_RUBBER_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.RUBBER_PLANKS.get().asItem());

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
