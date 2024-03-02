package net.indevo.idea.datagen;

import net.indevo.idea.Idea;
import net.indevo.idea.block.ModBlocks;
import net.indevo.idea.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Idea.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.TIN_ROD);
        simpleItem(ModItems.TIN_GEAR);
        simpleItem(ModItems.TIN_DUST);
        simpleItem(ModItems.TIN_NUGGET);
        simpleItem(ModItems.TIN_PLATE);

        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.SILVER_DUST);
        simpleItem(ModItems.SILVER_PLATE);
        simpleItem(ModItems.SILVER_ROD);
        simpleItem(ModItems.SILVER_GEAR);
        simpleItem(ModItems.SILVER_NUGGET);

        simpleItem(ModItems.TITANIUM_INGOT);
        simpleItem(ModItems.RAW_TITANIUM);
        simpleItem(ModItems.TITANIUM_DUST);
        simpleItem(ModItems.TITANIUM_PLATE);
        simpleItem(ModItems.TITANIUM_ROD);
        simpleItem(ModItems.TITANIUM_GEAR);
        simpleItem(ModItems.TITANIUM_NUGGET);

        simpleItem(ModItems.ALUMINUM_INGOT);
        simpleItem(ModItems.RAW_ALUMINUM);
        simpleItem(ModItems.ALUMINUM_DUST);
        simpleItem(ModItems.ALUMINUM_PLATE);
        simpleItem(ModItems.ALUMINUM_ROD);
        simpleItem(ModItems.ALUMINUM_GEAR);
        simpleItem(ModItems.ALUMINUM_NUGGET);

//        simpleItem(ModItems.STEEL_INGOT);
//        simpleItem(ModItems.STEEL_DUST);
//        simpleItem(ModItems.STEEL_PLATE);
//        simpleItem(ModItems.STEEL_ROD);
//        simpleItem(ModItems.STEEL_GEAR);
//        simpleItem(ModItems.STEEL_NUGGET);
//
//        simpleItem(ModItems.RESONANT_ALLOY_INGOT);
//        simpleItem(ModItems.RESONANT_ALLOY_DUST);
//        simpleItem(ModItems.RESONANT_ALLOY_PLATE);
//        simpleItem(ModItems.RESONANT_ALLOY_ROD);
//        simpleItem(ModItems.RESONANT_ALLOY_GEAR);
//        simpleItem(ModItems.RESONANT_ALLOY_NUGGET);
//
//        simpleItem(ModItems.BRONZE_INGOT);
//        simpleItem(ModItems.BRONZE_DUST);
//        simpleItem(ModItems.BRONZE_PLATE);
//        simpleItem(ModItems.BRONZE_ROD);
//        simpleItem(ModItems.BRONZE_GEAR);
//        simpleItem(ModItems.BRONZE_NUGGET);
//
//        simpleItem(ModItems.ELECTRUM_INGOT);
//        simpleItem(ModItems.ELECTRUM_DUST);
//        simpleItem(ModItems.ELECTRUM_PLATE);
//        simpleItem(ModItems.ELECTRUM_ROD);
//        simpleItem(ModItems.ELECTRUM_GEAR);
//        simpleItem(ModItems.ELECTRUM_NUGGET);

        simpleItem(ModItems.SULFUR_CRYSTAL);
        simpleItem(ModItems.SULFUR_DUST);

        simpleItem(ModItems.RESIN_BALL);

        simpleItem(ModItems.ACID_BUCKET);

        complexBlock(ModBlocks.GEM_EMPOWERING_STATION.get());

        saplingItem(ModBlocks.RUBBER_SAPLING);
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(Idea.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Idea.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Idea.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Idea.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(Idea.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttomItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(Idea.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(Idea.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Idea.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Idea.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Idea.MOD_ID, "block/" + item.getId().getPath()));
    }
}
