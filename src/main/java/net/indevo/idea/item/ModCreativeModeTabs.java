package net.indevo.idea.item;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Idea.MOD_ID);

    public static final RegistryObject<CreativeModeTab> IDEA_TAB = CREATIVE_MODE_TABS.register("idea_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_TIN.get()))
                    .title(Component.translatable("creativetab.idea_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.TIN_DUST.get());
                        output.accept(ModItems.TIN_GEAR.get());
                        output.accept(ModItems.TIN_ROD.get());
                        output.accept(ModItems.TIN_NUGGET.get());
                        output.accept(ModItems.TIN_PLATE.get());

                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.SILVER_DUST.get());
                        output.accept(ModItems.SILVER_PLATE.get());
                        output.accept(ModItems.SILVER_ROD.get());
                        output.accept(ModItems.SILVER_GEAR.get());
                        output.accept(ModItems.SILVER_NUGGET.get());

                        output.accept(ModItems.TITANIUM_INGOT.get());
                        output.accept(ModItems.RAW_TITANIUM.get());
                        output.accept(ModItems.TITANIUM_DUST.get());
                        output.accept(ModItems.TITANIUM_PLATE.get());
                        output.accept(ModItems.TITANIUM_ROD.get());
                        output.accept(ModItems.TITANIUM_GEAR.get());
                        output.accept(ModItems.TITANIUM_NUGGET.get());

                        output.accept(ModItems.ALUMINUM_INGOT.get());
                        output.accept(ModItems.RAW_ALUMINUM.get());
                        output.accept(ModItems.ALUMINUM_DUST.get());
                        output.accept(ModItems.ALUMINUM_PLATE.get());
                        output.accept(ModItems.ALUMINUM_ROD.get());
                        output.accept(ModItems.ALUMINUM_GEAR.get());
                        output.accept(ModItems.ALUMINUM_NUGGET.get());

                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.STEEL_DUST.get());
                        output.accept(ModItems.STEEL_PLATE.get());
                        output.accept(ModItems.STEEL_ROD.get());
                        output.accept(ModItems.STEEL_GEAR.get());
                        output.accept(ModItems.STEEL_NUGGET.get());

                        output.accept(ModItems.RESONANT_ALLOY_INGOT.get());
                        output.accept(ModItems.RESONANT_ALLOY_DUST.get());
                        output.accept(ModItems.RESONANT_ALLOY_PLATE.get());
                        output.accept(ModItems.RESONANT_ALLOY_ROD.get());
                        output.accept(ModItems.RESONANT_ALLOY_GEAR.get());
                        output.accept(ModItems.RESONANT_ALLOY_NUGGET.get());

                        output.accept(ModItems.BRONZE_INGOT.get());
                        output.accept(ModItems.BRONZE_DUST.get());
                        output.accept(ModItems.BRONZE_PLATE.get());
                        output.accept(ModItems.BRONZE_ROD.get());
                        output.accept(ModItems.BRONZE_GEAR.get());
                        output.accept(ModItems.BRONZE_NUGGET.get());

                        output.accept(ModItems.ELECTRUM_INGOT.get());
                        output.accept(ModItems.ELECTRUM_DUST.get());
                        output.accept(ModItems.ELECTRUM_PLATE.get());
                        output.accept(ModItems.ELECTRUM_ROD.get());
                        output.accept(ModItems.ELECTRUM_GEAR.get());
                        output.accept(ModItems.ELECTRUM_NUGGET.get());

                        output.accept(ModItems.SULFUR_CRYSTAL.get());
                        output.accept(ModItems.SULFUR_DUST.get());

                        output.accept(ModItems.RESIN_BALL.get());

                        output.accept(ModItems.RUBBER.get());
                        output.accept(ModItems.CURED_RUBBER.get());

                        output.accept(ModItems.ACID_BUCKET.get());


                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.RAW_TIN_BLOCK.get());

                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(ModBlocks.SILVER_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());

                        output.accept(ModBlocks.TITANIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        output.accept(ModBlocks.TITANIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_TITANIUM_BLOCK.get());


                        output.accept(ModBlocks.ALUMINUM_BLOCK.get());
                        output.accept(ModBlocks.ALUMINUM_ORE.get());
                        output.accept(ModBlocks.RAW_ALUMINUM_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get());

                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.RESONANT_ALLOY_BLOCK.get());
                        output.accept(ModBlocks.BRONZE_BLOCK.get());
                        output.accept(ModBlocks.ELECTRUM_BLOCK.get());

                        output.accept(ModBlocks.COPPER_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.IRON_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.DIAMOND_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.REDSTONE_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.COAL_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.GOLD_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.LAPIS_LAZULI_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.EMERALD_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.TIN_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.SILVER_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.SULFUR_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.TITANIUM_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.ALUMINUM_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.FIRMAMENT_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.LAVA_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.WATER_BEDROCK_VEIN.get());
                        output.accept(ModBlocks.OIL_BEDROCK_VEIN.get());

                        output.accept(ModBlocks.RUBBER_LOG.get());
                        output.accept(ModBlocks.RUBBER_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_RUBBER_LOG.get());
                        output.accept(ModBlocks.STRIPPED_RUBBER_WOOD.get());

                        output.accept(ModBlocks.RUBBER_PLANKS.get());
                        output.accept(ModBlocks.RUBBER_LEAVES.get());

                        output.accept(ModBlocks.RUBBER_SAPLING.get());


                        output.accept(ModBlocks.GEM_EMPOWERING_STATION.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
