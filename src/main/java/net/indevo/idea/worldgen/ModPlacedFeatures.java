package net.indevo.idea.worldgen;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> RUBBER_PLACED_KEY = registerKey("rubber_placed");

    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> SULFUR_ORE_PLACED_KEY = registerKey("sulfur_ore_placed");
    public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");

    public static final ResourceKey<PlacedFeature> COPPER_BEDROCK_VEIN_PLACED_KEY = registerKey("copper_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> IRON_BEDROCK_VEIN_PLACED_KEY = registerKey("iron_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> DIAMOND_BEDROCK_VEIN_PLACED_KEY = registerKey("diamond_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> REDSTONE_BEDROCK_VEIN_PLACED_KEY = registerKey("redstone_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> COAL_BEDROCK_VEIN_PLACED_KEY = registerKey("coal_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> GOLD_BEDROCK_VEIN_PLACED_KEY = registerKey("gold_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> LAPIS_LAZULI_BEDROCK_VEIN_PLACED_KEY = registerKey("lapis_lazuli_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> EMERALD_BEDROCK_VEIN_PLACED_KEY = registerKey("emerald_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> TIN_BEDROCK_VEIN_PLACED_KEY = registerKey("tin_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> SILVER_BEDROCK_VEIN_PLACED_KEY = registerKey("silver_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> SULFUR_BEDROCK_VEIN_PLACED_KEY = registerKey("sulfur_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> TITANIUM_BEDROCK_VEIN_PLACED_KEY = registerKey("titanium_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> ALUMINUM_BEDROCK_VEIN_PLACED_KEY = registerKey("alumium_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> FIRMAMENT_BEDROCK_VEIN_PLACED_KEY = registerKey("firmament_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> LAVA_BEDROCK_VEIN_PLACED_KEY = registerKey("lava_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> WATER_BEDROCK_VEIN_PLACED_KEY = registerKey("water_bedrock_vein_placed");
    public static final ResourceKey<PlacedFeature> OIL_BEDROCK_VEIN_PLACED_KEY = registerKey("oil_bedrock_vein_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, RUBBER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBBER_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.RUBBER_SAPLING.get()));


        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(18,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(255))));

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SIVLER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(24))));

        register(context, SULFUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SULFUR_ORE_KEY),
                ModOrePlacement.commonOrePlacement(20,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(184))));

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, ALUMINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ALUMINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, COPPER_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COPPER_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, IRON_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_IRON_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, DIAMOND_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_DIAMOND_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, REDSTONE_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_REDSTONE_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, COAL_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COAL_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, GOLD_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GOLD_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, LAPIS_LAZULI_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LAPIS_LAZULI_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, EMERALD_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_EMERALD_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, TIN_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, SILVER_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, SULFUR_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SULFUR_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, TITANIUM_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITANIUM_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, ALUMINUM_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ALUMINUM_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, FIRMAMENT_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_FIRMAMENT_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, LAVA_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LAVA_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, WATER_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_WATER_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, OIL_BEDROCK_VEIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_OIL_BEDROCK_VEIN_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Idea.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
