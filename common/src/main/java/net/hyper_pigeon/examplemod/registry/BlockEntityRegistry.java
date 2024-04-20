package net.hyper_pigeon.examplemod.registry;

import net.hyper_pigeon.examplemod.CommonClass;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import java.util.function.Supplier;

public class BlockEntityRegistry {
    public static void init() {}

    private static <T extends BlockEntity> Supplier<BlockEntityType<T>> registerBlockEntity(String id, Supplier<BlockEntityType<T>> blockEntity) {
        return CommonClass.COMMON_PLATFORM.registerBlockEntity(id, blockEntity);
    }
}
