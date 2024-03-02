package net.indevo.idea.datagen;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Idea.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);

        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);

        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_TITANIUM_BLOCK);

        blockWithItem(ModBlocks.ALUMINUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ALUMINUM_ORE);
        blockWithItem(ModBlocks.RAW_ALUMINUM_BLOCK);
        blockWithItem(ModBlocks.ALUMINUM_BLOCK);

//        blockWithItem(ModBlocks.STEEL_BLOCK);
//        blockWithItem(ModBlocks.RESONANT_ALLOY_BLOCK);
//        blockWithItem(ModBlocks.BRONZE_BLOCK);
//        blockWithItem(ModBlocks.ELECTRUM_BLOCK);

//        blockWithItem(ModBlocks.COPPER_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.IRON_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.DIAMOND_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.REDSTONE_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.COAL_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.GOLD_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.LAPIS_LAZULI_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.EMERALD_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.TIN_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.SILVER_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.SULFUR_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.TITANIUM_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.ALUMINUM_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.FIRMAMENT_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.LAVA_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.WATER_BEDROCK_VEIN);
//        blockWithItem(ModBlocks.OIL_BEDROCK_VEIN);

        blockWithItem(ModBlocks.SULFUR_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SULFUR_ORE);

        logBlock(((RotatedPillarBlock) ModBlocks.RUBBER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.RUBBER_WOOD.get()), blockTexture(ModBlocks.RUBBER_LOG.get()), blockTexture(ModBlocks.RUBBER_LOG.get()));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_RUBBER_LOG.get(), new ResourceLocation(Idea.MOD_ID, "block/stripped_rubber_log"),
                new ResourceLocation(Idea.MOD_ID, "block/stripped_rubber_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_RUBBER_WOOD.get(), new ResourceLocation(Idea.MOD_ID, "block/stripped_rubber_log"),
                new ResourceLocation(Idea.MOD_ID, "block/stripped_rubber_log"));

        blockItem(ModBlocks.RUBBER_LOG);
        blockItem(ModBlocks.RUBBER_WOOD);
        blockItem(ModBlocks.STRIPPED_RUBBER_LOG);
        blockItem(ModBlocks.STRIPPED_RUBBER_WOOD);

        blockWithItem(ModBlocks.RUBBER_PLANKS);

        leavesBlock(ModBlocks.RUBBER_LEAVES);
        saplingBlock(ModBlocks.RUBBER_SAPLING);

        horizontalBlock(ModBlocks.GEM_EMPOWERING_STATION.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/gem_empowering_station")));
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Idea.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
