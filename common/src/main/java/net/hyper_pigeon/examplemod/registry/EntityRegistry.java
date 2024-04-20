package net.hyper_pigeon.examplemod.registry;

import net.hyper_pigeon.examplemod.CommonClass;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class EntityRegistry {


    public static void init(){}

    public static void registerEntityAttributes(BiConsumer<EntityType<? extends LivingEntity>, AttributeSupplier> registrar) {

    }

    private static <T extends Mob> Supplier<EntityType<T>> registerEntity(String name, EntityType.EntityFactory<T> entity, float width, float height, MobCategory mobCategory) {
        return CommonClass.COMMON_PLATFORM.registerEntity(name, () -> EntityType.Builder.of(entity,mobCategory).sized(width, height).build(name));
    }
}
