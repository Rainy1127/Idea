package net.indevo.idea.block;

import net.indevo.idea.Idea;
import net.indevo.idea.block.custom.GemEmpoweringStationBlock;
import net.indevo.idea.block.custom.ModFlammableRotatedPillarBlock;
import net.indevo.idea.fluid.ModFluids;
import net.indevo.idea.item.ModItems;
import net.indevo.idea.worldgen.tree.RubberTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Idea.MOD_ID);

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> RESONANT_ALLOY_BLOCK = registerBlock("resonant_alloy_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final RegistryObject<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SULFUR_ORE = registerBlock("deepslate_sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)
                    .strength(3.0F, 3.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GEM_EMPOWERING_STATION = registerBlock("gem_empowering_station",
            () -> new GemEmpoweringStationBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> RUBBER_LOG = registerBlock("rubber_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> RUBBER_WOOD = registerBlock("rubber_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_RUBBER_LOG = registerBlock("stripped_rubber_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_RUBBER_WOOD = registerBlock("stripped_rubber_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> RUBBER_PLANKS = registerBlock("rubber_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> RUBBER_LEAVES = registerBlock("rubber_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> RUBBER_SAPLING = registerBlock("rubber_sapling",
            () -> new SaplingBlock(new RubberTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<LiquidBlock> ACID_BLOCK = BLOCKS.register("acid_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ACID, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));

    public static final RegistryObject<Block> COPPER_BEDROCK_VEIN = registerBlock("copper_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> IRON_BEDROCK_VEIN = registerBlock("iron_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> DIAMOND_BEDROCK_VEIN = registerBlock("diamond_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> REDSTONE_BEDROCK_VEIN = registerBlock("redstone_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> COAL_BEDROCK_VEIN = registerBlock("coal_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> GOLD_BEDROCK_VEIN = registerBlock("gold_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> LAPIS_LAZULI_BEDROCK_VEIN = registerBlock("lapis_lazuli_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> EMERALD_BEDROCK_VEIN = registerBlock("emerald_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> TIN_BEDROCK_VEIN = registerBlock("tin_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> SILVER_BEDROCK_VEIN = registerBlock("silver_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> SULFUR_BEDROCK_VEIN = registerBlock("sulfur_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> TITANIUM_BEDROCK_VEIN = registerBlock("titanium_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> ALUMINUM_BEDROCK_VEIN = registerBlock("aluminum_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> FIRMAMENT_BEDROCK_VEIN = registerBlock("firmament_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> OIL_BEDROCK_VEIN = registerBlock("oil_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> LAVA_BEDROCK_VEIN = registerBlock("lava_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));
    public static final RegistryObject<Block> WATER_BEDROCK_VEIN = registerBlock("water_bedrock_vein",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)
                    .strength(-1.0F, 3600000.0F).noLootTable()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
