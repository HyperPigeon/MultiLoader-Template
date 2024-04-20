package net.hyper_pigeon.examplemod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.hyper_pigeon.examplemod.client.CommonClientClass;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class ExampleModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CommonClientClass.registerRenderers(EntityRendererRegistry::register, BlockEntityRenderers::register);
    }
}
