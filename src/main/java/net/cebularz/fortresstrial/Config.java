package net.cebularz.fortresstrial;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = FortressTrial.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{






    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {

    }
}
