package xyz.tcbuildmc.minecraft.mod.blockycooking.registry.block;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.block.Block;
import net.minecraft.registry.tag.TagKey;

public final class FlammableRegistry {
    @ExpectPlatform
    public static void register(Block block, FlammableRegistry.Entry entry) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void register(TagKey<Block> blockTag, FlammableRegistry.Entry entry) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void unregister(Block block) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void unregister(TagKey<Block> blockTag) {
        throw new AssertionError();
    }

    public record Entry(int burnChance, int spreadChance) {
        public static final FlammableRegistry.Entry EMPTY = new FlammableRegistry.Entry(0, 0);

        public boolean isEmpty() {
            return this == FlammableRegistry.Entry.EMPTY;
        }
    }
}
