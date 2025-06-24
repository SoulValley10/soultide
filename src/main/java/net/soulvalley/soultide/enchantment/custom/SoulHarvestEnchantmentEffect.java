package net.soulvalley.soultide.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.soulvalley.soultide.item.ModItems;

public record SoulHarvestEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<SoulHarvestEnchantmentEffect> CODEC = MapCodec.unit(SoulHarvestEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity target, Vec3d pos) {
        if (!(target instanceof LivingEntity victim)) return;

        if (!victim.isRemoved() && victim.isDead()) {
            float baseChance = 0.05f; // 5% chance at level 1
            float chance = baseChance * level; // e.g. 10% at level 2, 15% at level 3, etc.

            if (world.getRandom().nextFloat() <= chance) {
                ItemStack soulStack = new ItemStack(ModItems.SOLIDIFIED_SOUL);
                ItemEntity drop = new ItemEntity(world, victim.getX(), victim.getY(), victim.getZ(), soulStack);
                world.spawnEntity(drop);
            }
        }
    }


    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
