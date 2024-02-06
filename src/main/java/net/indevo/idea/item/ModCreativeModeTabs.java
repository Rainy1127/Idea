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


                        output.accept(ModBlocks.GEM_EMPOWERING_STATION.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
