package net.indevo.idea.datagen;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper ){
        super(output, lookupProvider, Idea.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider ){
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),

                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),

                        ModBlocks.TITANIUM_BLOCK.get(),
                        ModBlocks.RAW_TITANIUM_BLOCK.get(),
                        ModBlocks.TITANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),

                        ModBlocks.ALUMINUM_BLOCK.get(),
                        ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                        ModBlocks.ALUMINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),

                        ModBlocks.SULFUR_ORE.get(),
                        ModBlocks.DEEPSLATE_SULFUR_ORE.get());




        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),

                        ModBlocks.SULFUR_ORE.get(),
                        ModBlocks.DEEPSLATE_SULFUR_ORE.get());



        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),

                        ModBlocks.TITANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                        ModBlocks.TITANIUM_BLOCK.get(),
                        ModBlocks.RAW_TITANIUM_BLOCK.get(),

                        ModBlocks.ALUMINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                        ModBlocks.ALUMINUM_BLOCK.get(),
                        ModBlocks.RAW_ALUMINUM_BLOCK.get());


    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
