package net.hyper_pigeon.examplemod.registry;

import net.hyper_pigeon.examplemod.CommonClass;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class BlockRegistry {
    public static void init() {}

    private static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block) {
        return CommonClass.COMMON_PLATFORM.registerBlock(id, block);
    }
}
