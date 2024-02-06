package net.indevo.idea.item;

import net.indevo.idea.Idea;
import net.indevo.idea.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Idea.MOD_ID);

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_ROD = ITEMS.register("tin_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PLATE = ITEMS.register("silver_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ROD = ITEMS.register("silver_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_PLATE = ITEMS.register("titanium_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_ROD = ITEMS.register("titanium_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_GEAR = ITEMS.register("titanium_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ROD = ITEMS.register("aluminum_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_GEAR = ITEMS.register("aluminum_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_CRYSTAL = ITEMS.register("sulfur_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RESIN_BALL = ITEMS.register("resin_ball",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CURED_RUBBER = ITEMS.register("cured_rubber",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ACID_BUCKET = ITEMS.register("acid_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
