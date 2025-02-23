package net.hyper_pigeon.examplemod;

import net.fabricmc.api.ModInitializer;
import net.hyper_pigeon.examplemod.platform.CommonModPlatform;

import java.util.ServiceLoader;

public class ExampleModFabric implements ModInitializer {

    public static final CommonModPlatform COMMON_PLATFORM = ServiceLoader.load(CommonModPlatform.class).findFirst().orElseThrow();
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
