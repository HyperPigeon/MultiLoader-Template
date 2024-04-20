package net.hyper_pigeon.examplemod;

import net.hyper_pigeon.examplemod.client.CommonClientClass;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExampleModNeoforgeClient {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        CommonClientClass.registerRenderers(event::registerEntityRenderer, event::registerBlockEntityRenderer);
    }
}
