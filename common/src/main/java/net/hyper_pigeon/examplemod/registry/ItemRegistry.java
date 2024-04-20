package net.hyper_pigeon.examplemod.registry;

import net.hyper_pigeon.examplemod.CommonClass;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public final class ItemRegistry {

    public static void init(){}

    private static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return CommonClass.COMMON_PLATFORM.registerItem(id, item);
    }
}
