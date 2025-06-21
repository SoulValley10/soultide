package net.soulvalley.soultide.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.soulvalley.soultide.Soultide;

public class ModItemGroups {
    public static final ItemGroup SOULTIDE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Soultide.MOD_ID, "soultide_items_"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SOUL_INFUSED_INGOT))
                    .displayName(Text.translatable("itemgroup.soultide.soultide_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SOUL_INFUSED_INGOT);
                        entries.add(ModItems.SOUL_KNIFE);
                        entries.add(ModItems.SOLIDIFIED_SOUL);
                        entries.add(ModItems.SOUL_INFUSED_HELMET);
                        entries.add(ModItems.SOUL_INFUSED_CHESTPLATE);
                        entries.add(ModItems.SOUL_INFUSED_LEGGINGS);
                        entries.add(ModItems.SOUL_INFUSED_BOOTS);
                        entries.add(ModItems.SOUL_EYE);

                    })

                    .build());


    public static void registerItemGroups() {
        Soultide.LOGGER.info("Registering Item Groups for " + Soultide.MOD_ID);
    }
}
