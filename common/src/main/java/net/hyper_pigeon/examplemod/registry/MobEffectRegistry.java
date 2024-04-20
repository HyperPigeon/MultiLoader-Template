package net.hyper_pigeon.examplemod.registry;

import net.hyper_pigeon.examplemod.CommonClass;
import net.minecraft.world.effect.MobEffect;

import java.util.function.Supplier;

public class MobEffectRegistry {
    public static void init() {}

    public static <T extends MobEffect> Supplier<T> registerMobEffect(String name, Supplier<T> mobEffect) {
        return CommonClass.COMMON_PLATFORM.registerMobEffect(name, mobEffect);
    }

}
