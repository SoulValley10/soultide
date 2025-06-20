package net.soulvalley.soultide.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.impl.discovery.ModResolver;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.soulvalley.soultide.Soultide;

public class ModItems {
    public static final Item SOLIDIFIED_SOUL = registerItem("solidified_soul", new Item(new Item.Settings()));
    public static final Item SOUL_INFUSED_INGOT = registerItem("soul_infused_ingot", new Item(new Item.Settings()));

    public static final Item SOUL_KNIFE = registerItem("soul_knife",
            new SwordItem(ModToolMaterials.SOUL_INFUSED, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SOUL_INFUSED, 1, -1.5f))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Soultide.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Soultide.LOGGER.info("Registering Mod Items for" + Soultide.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SOLIDIFIED_SOUL);
            fabricItemGroupEntries.add(SOUL_INFUSED_INGOT);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SOUL_KNIFE);
        });
    }
}
