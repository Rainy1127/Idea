package net.indevo.idea.fluid;

import net.indevo.idea.Idea;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidsTypes {
    public static final ResourceLocation ACID_STILL_RL = new ResourceLocation(Idea.MOD_ID, "block/acid_still");
    public static final ResourceLocation ACID_FLOWING_RL = new ResourceLocation(Idea.MOD_ID,"block/acid_flow");
    public static final ResourceLocation ACID_OVERLAY_RL = new ResourceLocation(Idea.MOD_ID, "block/acid_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Idea.MOD_ID);

    public static final RegistryObject<FluidType> ACID_FLUID_TYPE = registerFluidType("acid_fluid",
            new BaseFluidType(ACID_STILL_RL, ACID_FLOWING_RL, ACID_OVERLAY_RL, 0xA1E038D0,
                    new Vector3f(224f / 255f, 56f / 255f, 208f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));

    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
