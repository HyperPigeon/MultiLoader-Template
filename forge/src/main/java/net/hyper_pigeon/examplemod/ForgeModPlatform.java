package net.hyper_pigeon.examplemod;

import net.hyper_pigeon.examplemod.platform.CommonModPlatform;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.ForgeSpawnEggItem;

import java.util.function.Supplier;

public class ForgeModPlatform implements CommonModPlatform {
    @Override
    public <T extends BlockEntity> Supplier<BlockEntityType<T>> registerBlockEntity(String id, Supplier<BlockEntityType<T>> blockEntityType) {
        return ExampleModForge.BLOCK_ENTITIES.register(id, blockEntityType);
    }

    @Override
    public <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block) {
        return ExampleModForge.BLOCKS.register(id, block);
    }

    @Override
    public <T extends Entity> Supplier<EntityType<T>> registerEntity(String id, Supplier<EntityType<T>> entity) {
        return ExampleModForge.ENTITIES.register(id, entity);
    }

    @Override
    public <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return ExampleModForge.ITEMS.register(id, item);
    }

    @Override
    public <T extends MobEffect> Supplier<T> registerMobEffect(String name, Supplier<T> mobEffect) {
        return ExampleModForge.MOB_EFFECTS.register(name,mobEffect);
    }

    @Override
    public <T extends SoundEvent> Supplier<T> registerSound(String id, Supplier<T> sound) {
        return ExampleModForge.SOUND_EVENTS.register(id, sound);
    }

    @Override
    public <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> tab) {
        return ExampleModForge.CREATIVE_TABS.register(id, tab);
    }

    @Override
    public <E extends Mob> Supplier<SpawnEggItem> makeSpawnEggFor(Supplier<EntityType<E>> entityType, int primaryEggColour, int secondaryEggColour, Item.Properties itemProperties) {
        return () -> new ForgeSpawnEggItem(entityType, primaryEggColour, secondaryEggColour, itemProperties);
    }



    @Override
    public CreativeModeTab.Builder newCreativeTabBuilder() {
        return CreativeModeTab.builder();
    }
}
