package net.indevo.idea.fluid;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.indevo.idea.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Idea.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_ACID = FLUIDS.register("acid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ACID = FLUIDS.register("flowing_acid_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ACID_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties ACID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidsTypes.ACID_FLUID_TYPE, SOURCE_ACID,FLOWING_ACID)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.ACID_BLOCK).bucket(ModItems.ACID_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
