package argent_matter.gcys.forge;

import argent_matter.gcys.GregicalitySpace;
import argent_matter.gcys.client.data.GcysParticleProviders;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = GregicalitySpace.MOD_ID, value = Dist.CLIENT)
public class GregicalitySpaceForgeEventClient {

    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        GcysParticleProviders.init();
        GcysParticleProviders.PARTICLES.forEach(event::register);
    }

}
