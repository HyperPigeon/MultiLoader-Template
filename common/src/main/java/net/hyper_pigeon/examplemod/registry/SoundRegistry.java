package net.hyper_pigeon.examplemod.registry;

import net.hyper_pigeon.examplemod.CommonClass;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class SoundRegistry {
    public static void init() {}

    private static <T extends SoundEvent> Supplier<T> registerSound(String id, Supplier<T> sound) {
        return CommonClass.COMMON_PLATFORM.registerSound(id, sound);
    }
}
