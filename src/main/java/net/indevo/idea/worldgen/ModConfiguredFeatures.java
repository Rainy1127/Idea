package net.indevo.idea.worldgen;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.indevo.idea.util.ModBlockTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBBER_KEY = registerKey("rubber");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SIVLER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SULFUR_ORE_KEY = registerKey("sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINUM_ORE_KEY = registerKey("aluminum_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COPPER_BEDROCK_VEIN_KEY = registerKey("copper_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IRON_BEDROCK_VEIN_KEY = registerKey("iron_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DIAMOND_BEDROCK_VEIN_KEY = registerKey("diamond_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_REDSTONE_BEDROCK_VEIN_KEY = registerKey("redstone_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COAL_BEDROCK_VEIN_KEY = registerKey("coal_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GOLD_BEDROCK_VEIN_KEY = registerKey("gold_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAPIS_LAZULI_BEDROCK_VEIN_KEY = registerKey("lapis_lazuli_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EMERALD_BEDROCK_VEIN_KEY = registerKey("emerald_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_BEDROCK_VEIN_KEY = registerKey("tin_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_BEDROCK_VEIN_KEY = registerKey("silver_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SULFUR_BEDROCK_VEIN_KEY = registerKey("sulfur_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_BEDROCK_VEIN_KEY = registerKey("titanium_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINUM_BEDROCK_VEIN_KEY = registerKey("aluminum_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FIRMAMENT_BEDROCK_VEIN_KEY = registerKey("firmament_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_WATER_BEDROCK_VEIN_KEY = registerKey("water_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAVA_BEDROCK_VEIN_KEY = registerKey("lava_bedrock_vein");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OIL_BEDROCK_VEIN_KEY = registerKey("oil_bedrock_vein");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest bedrockReplaceables = new TagMatchTest(ModBlockTags.BEDROCK_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 6));

        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SIVLER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 5));

        List<OreConfiguration.TargetBlockState> overworldSulfurOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SULFUR_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SULFUR_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 4));

        List<OreConfiguration.TargetBlockState> overworldTitaniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.TITANIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 3));

        List<OreConfiguration.TargetBlockState> overworldAluminumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.ALUMINUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ALUMINUM_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 6));

        List<OreConfiguration.TargetBlockState> overworldCopperVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.COPPER_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_COPPER_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldCopperVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldIronVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.IRON_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_IRON_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldIronVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldDiamondVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.DIAMOND_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_DIAMOND_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldDiamondVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldRedstoneVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.REDSTONE_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_REDSTONE_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldRedstoneVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldCoalVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.COAL_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_COAL_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldCoalVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldGoldVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.GOLD_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_GOLD_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldGoldVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldLapisLazuliVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.LAPIS_LAZULI_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_LAPIS_LAZULI_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldLapisLazuliVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldEmeraldVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.EMERALD_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_EMERALD_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldEmeraldVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldTinVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.TIN_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_TIN_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldTinVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldSilverVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.SILVER_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_SILVER_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldSilverVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldSulfurVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.SULFUR_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_SULFUR_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldSulfurVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldTitaniumVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.TITANIUM_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_TITANIUM_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldTitaniumVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldAluminumVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.ALUMINUM_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_ALUMINUM_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldAluminumVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldFirmamentVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.FIRMAMENT_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_FIRMAMENT_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldFirmamentVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldLavaVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.LAVA_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_LAVA_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldLavaVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldWaterVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.WATER_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_WATER_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldWaterVeins, 6));

        List<OreConfiguration.TargetBlockState> overworldOilVeins = List.of(OreConfiguration.target(bedrockReplaceables,
                        ModBlocks.OIL_BEDROCK_VEIN.get().defaultBlockState()));

        register(context, OVERWORLD_OIL_BEDROCK_VEIN_KEY, Feature.ORE, new OreConfiguration(overworldOilVeins, 6));



        register(context, RUBBER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RUBBER_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.RUBBER_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Idea.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
