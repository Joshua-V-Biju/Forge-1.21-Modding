package net.mrnone.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrnone.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> VOIDHEART_CORE = ITEMS.register("voidheart_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STORM_SHARD = ITEMS.register("storm_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }

}
