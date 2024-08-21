package net.cebularz.fortresstrial.item;

import net.cebularz.fortresstrial.FortressTrial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FortressTrialItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FortressTrial.MOD_ID);

    public static final RegistryObject<Item> WITHER_SCEPTER = ITEMS.register("wither_scepter",
            () -> new WitherScepter(new Item.Properties().durability(8).rarity(Rarity.RARE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
