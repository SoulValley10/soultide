package net.soulvalley.soultide.enchantment;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.soulvalley.soultide.Soultide;
import net.soulvalley.soultide.enchantment.custom.SoulHarvestEnchantmentEffect;

public class ModEnchantmentEffects {
    public static final MapCodec<? extends EnchantmentEntityEffect> SOUL_HARVESTER =
            registerEntityEffect("soul_harvester", SoulHarvestEnchantmentEffect.CODEC);

    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(Soultide.MOD_ID), codec);
    }

    public static void registerEnchantmentEffects() {
        Soultide.LOGGER.info("Registering enchantment effects for " + Soultide.MOD_ID);
    }
}
