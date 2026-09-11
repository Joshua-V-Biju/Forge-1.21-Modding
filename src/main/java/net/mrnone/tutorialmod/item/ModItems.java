package net.mrnone.tutorialmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrnone.tutorialmod.TutorialMod;
import net.mrnone.tutorialmod.item.custom.ChiselItem;
import net.mrnone.tutorialmod.item.custom.FuelItem;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> VOIDHEART_CORE = ITEMS.register("voidheart_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STORM_SHARD = ITEMS.register("storm_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> STORMDUST_DONUT = ITEMS.register("stormdust_donut", () -> new Item(new Item.Properties().food(ModFoodProperties.STORMDUST_DONUT)));

    public static final RegistryObject<Item> NOVA_CORE = ITEMS.register("nova_core", () -> new FuelItem(new Item.Properties(),30000){
        @Override
        public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
            pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.nova_core"));

            super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        }
    });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }

}
