package net.mrnone.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.IEventBusEngine;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrnone.tutorialmod.TutorialMod;
import net.mrnone.tutorialmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NEONVOID_ITEMS_TAB = CREATIVE_MODE_TABS.register("neonvoid_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STORM_SHARD.get()))
                    .title(Component.translatable("creativetab.tutorialmod.neonvoid_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STORM_SHARD.get());
                        output.accept(ModItems.VOIDHEART_CORE.get());
                        output.accept(ModItems.PLATINUM_INGOT.get());
                        output.accept(ModItems.RAW_PLATINUM.get());

                    }).build());


    public static final RegistryObject<CreativeModeTab> NEONVOID_BLOCKS_TAB = CREATIVE_MODE_TABS.register("neonvoid_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.STORMSHARD_BLOCK.get()))
                    .withTabsBefore(NEONVOID_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.neonvoid_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.STORMSHARD_BLOCK.get());
                        output.accept(ModBlocks.VOIDHEART_BEACON.get());
                        output.accept(ModBlocks.PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.PLATINUM_ORE.get());
                        output.accept(ModBlocks.PLATINUM_DEEPSLATE_ORE.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
