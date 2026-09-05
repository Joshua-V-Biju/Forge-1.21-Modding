package net.mrnone.tutorialmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrnone.tutorialmod.TutorialMod;
import net.mrnone.tutorialmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> STORMSHARD_BLOCK = registerBlock("stormshard_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> VOIDHEART_BEACON = registerBlock("voidheart_beacon",
            () -> new Block(BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(.5f).requiresCorrectToolForDrops().sound(SoundType.LODESTONE)));

    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(.4f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),BlockBehaviour.Properties.of().strength(.4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PLATINUM_DEEPSLATE_ORE = registerBlock("platinum_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(2,4),BlockBehaviour.Properties.of().strength(.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
    }


}
