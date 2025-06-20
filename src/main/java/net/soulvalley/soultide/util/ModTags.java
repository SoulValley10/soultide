package net.soulvalley.soultide.util;

import com.jcraft.jorbis.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.soulvalley.soultide.Soultide;

public class ModTags {
    public static class Blocks {

    }
    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Soultide.MOD_ID, name));
        }
    }
}
