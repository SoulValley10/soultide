package net.soulvalley.soultide.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.impl.discovery.ModResolver;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.soulvalley.soultide.Soultide;

import java.util.List;

public class ModItems {
    public static final Item SOLIDIFIED_SOUL = registerItem("solidified_soul", new Item(new Item.Settings()));
    public static final Item SOUL_INFUSED_INGOT = registerItem("soul_infused_ingot", new Item(new Item.Settings()));

    public static final Item SOUL_KNIFE = registerItem("soul_knife",
            new SwordItem(ModToolMaterials.SOUL_INFUSED, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SOUL_INFUSED, 1, -1.8f))));

    public static final Item SOUL_DOUBLE_AXE = registerItem("soul_double_axe",
            new AxeItem(ModToolMaterials.SOUL_INFUSED, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SOUL_INFUSED, 6, -3.2f))));

    public static final Item SOUL_SLEDGEHAMMER = registerItem("soul_sledgehammer",
            new PickaxeItem(ModToolMaterials.SOUL_INFUSED, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SOUL_INFUSED, 9, -3.5f))));

    public static final Item SOUL_GLAIVE = registerItem("soul_glaive",
            new ShovelItem(ModToolMaterials.SOUL_INFUSED, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SOUL_INFUSED, 4, -2.5f))));

    public static final Item SOUL_SCYTHE = registerItem("soul_scythe",
            new HoeItem(ModToolMaterials.SOUL_INFUSED, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SOUL_INFUSED, 5, -2.8f))));

    public static final Item SOUL_UPGRADE_SMITHING_TEMPLATE = registerItem("soul_upgrade_smithing_template", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.soultide.soul_template.tooltip.1"));
            tooltip.add(Text.translatable("tooltip.soultide.soul_template.tooltip.2"));
            tooltip.add(Text.translatable("tooltip.soultide.soul_template.tooltip.3"));
            tooltip.add(Text.translatable("tooltip.soultide.soul_template.tooltip.4"));
            tooltip.add(Text.translatable("tooltip.soultide.soul_template.tooltip.5"));
            tooltip.add(Text.translatable("tooltip.soultide.soul_template.tooltip.6"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item SOUL_INFUSED_HELMET = registerItem("soul_infused_helmet",
            new ArmorItem(ModArmorMaterials.SOUL_INFUSED_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item SOUL_INFUSED_CHESTPLATE = registerItem("soul_infused_chestplate",
            new ArmorItem(ModArmorMaterials.SOUL_INFUSED_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item SOUL_INFUSED_LEGGINGS = registerItem("soul_infused_leggings",
            new ArmorItem(ModArmorMaterials.SOUL_INFUSED_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item SOUL_INFUSED_BOOTS = registerItem("soul_infused_boots",
            new ArmorItem(ModArmorMaterials.SOUL_INFUSED_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static final Item SOUL_EYE = registerItem("soul_eye", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Soultide.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Soultide.LOGGER.info("Registering Mod Items for" + Soultide.MOD_ID);
    }
}
