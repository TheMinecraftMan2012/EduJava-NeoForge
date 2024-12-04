package net.theminecraftman.edujava.EJ_Registries;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theminecraftman.edujava.EduJava;

public class EduJava_BlockClass
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EduJava.MOD_ID);

    public static final DeferredBlock<Block> HYDROGEN = BLOCKS.registerSimpleBlock("hydrogen", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> HELIUM = BLOCKS.registerSimpleBlock("helium", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> LITHIUM = BLOCKS.registerSimpleBlock("lithium", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> BERYLLIUM = BLOCKS.registerSimpleBlock("beryllium", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> BORON = BLOCKS.registerSimpleBlock("boron", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> CARBON = BLOCKS.registerSimpleBlock("carbon", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> NITROGEN = BLOCKS.registerSimpleBlock("nitrogen", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> OXYGEN = BLOCKS.registerSimpleBlock("oxygen", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> FLUORINE = BLOCKS.registerSimpleBlock("fluorine", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> NEON = BLOCKS.registerSimpleBlock("neon", BlockBehaviour.Properties.of());

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
