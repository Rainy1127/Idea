package net.indevo.idea.datagen.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.indevo.idea.Idea;
import net.indevo.idea.recipe.GemEmpoweringRecipe;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class GemEmpoweringRecipeBuilder implements RecipeBuilder {
    private final Item result;
    private final Ingredient ingredient;
    private final int count;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();

    public GemEmpoweringRecipeBuilder(ItemLike ingredient, ItemLike result, int count) {
        this.ingredient = Ingredient.of(ingredient);
        this.result = result.asItem();
        this.count = count;
    }

    @Override
    public RecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger) {
        this.advancement.m_138386_(pCriterionName, pCriterionTrigger);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String pGroupName) {
        return this;
    }

    @Override
    public Item getResult() {
        return result;
    }

    @Override
    public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ResourceLocation pRecipe) {
        this.advancement.parent(new ResourceLocation("recipes/root"))
                .m_138386_("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipe))
                .rewards(AdvancementRewards.Builder.recipe(pRecipe)).requirements(RequirementsStrategy.f_15979_);

        pFinishedRecipeConsumer.accept(new Result(pRecipe, this.result, this.count, this.ingredient,
                this.advancement, new ResourceLocation(pRecipe.getNamespace(), "recipes/"
                + pRecipe.getPath())));

    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final Ingredient ingredient;
        private final int count;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation pId, Item pResult, int pCount, Ingredient ingredient, Advancement.Builder pAdvancement,
                      ResourceLocation pAdvancementId) {
            this.id = pId;
            this.result = pResult;
            this.count = pCount;
            this.ingredient = ingredient;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            JsonArray jsonarray = new JsonArray();
            jsonarray.add(ingredient.toJson());

            pJson.add("ingredients", jsonarray);
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
            if (this.count > 1) {
                jsonobject.addProperty("count", this.count);
            }

            pJson.add("output", jsonobject);
        }

        @Override
        public ResourceLocation m_6445_() {
            return new ResourceLocation(Idea.MOD_ID,
                    ForgeRegistries.ITEMS.getKey(this.result).getPath() + "_from_gem_empowering");
        }

        @Override
        public RecipeSerializer<?> m_6637_() {
            return GemEmpoweringRecipe.Serializer.INSTANCE;
        }

        @javax.annotation.Nullable
        public JsonObject m_5860_() {
            return this.advancement.m_138400_();
        }

        @javax.annotation.Nullable
        public ResourceLocation m_6448_() {
            return this.advancementId;
        }
    }
}
