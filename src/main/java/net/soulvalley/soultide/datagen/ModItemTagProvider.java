package net.soulvalley.soultide.datagen;

import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.soulvalley.soultide.item.ModItems;
import net.soulvalley.soultide.util.ModTags;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.HARVESTS_SOULS)
                .add(ModItems.SOUL_KNIFE)
                .add(ModItems.SOUL_DOUBLE_AXE)
                .add(ModItems.SOUL_SLEDGEHAMMER)
                .add(ModItems.SOUL_GLAIVE)
                .add(ModItems.SOUL_SCYTHE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.SOUL_KNIFE)
                .add(ModItems.SOUL_DOUBLE_AXE)
                .add(ModItems.SOUL_SLEDGEHAMMER)
                .add(ModItems.SOUL_GLAIVE)
                .add(ModItems.SOUL_SCYTHE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.SOUL_SLEDGEHAMMER);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.SOUL_SCYTHE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.SOUL_GLAIVE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.SOUL_DOUBLE_AXE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.SOUL_INFUSED_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.SOUL_INFUSED_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.SOUL_INFUSED_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.SOUL_INFUSED_BOOTS);
    }
}
