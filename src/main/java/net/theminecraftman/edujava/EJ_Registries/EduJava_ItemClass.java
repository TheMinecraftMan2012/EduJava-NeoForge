package net.theminecraftman.edujava.EJ_Registries;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theminecraftman.edujava.EduJava;

public class EduJava_ItemClass
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EduJava.MOD_ID);

    public static final DeferredItem<BlockItem> HYDROGEN = ITEMS.registerSimpleBlockItem("hydrogen", EduJava_BlockClass.HYDROGEN, new Item.Properties());
    public static final DeferredItem<BlockItem> HELIUM = ITEMS.registerSimpleBlockItem("helium", EduJava_BlockClass.HELIUM, new Item.Properties());
    public static final DeferredItem<BlockItem> LITHIUM = ITEMS.registerSimpleBlockItem("lithium", EduJava_BlockClass.LITHIUM, new Item.Properties());
    public static final DeferredItem<BlockItem> BERYLLIUM = ITEMS.registerSimpleBlockItem("beryllium", EduJava_BlockClass.BERYLLIUM, new Item.Properties());
    public static final DeferredItem<BlockItem> BORON = ITEMS.registerSimpleBlockItem("boron", EduJava_BlockClass.BORON, new Item.Properties());
    public static final DeferredItem<BlockItem> CARBON = ITEMS.registerSimpleBlockItem("carbon", EduJava_BlockClass.CARBON, new Item.Properties());
    public static final DeferredItem<BlockItem> NITROGEN = ITEMS.registerSimpleBlockItem("nitrogen", EduJava_BlockClass.NITROGEN, new Item.Properties());
    public static final DeferredItem<BlockItem> OXYGEN = ITEMS.registerSimpleBlockItem("oxygen", EduJava_BlockClass.OXYGEN, new Item.Properties());
    public static final DeferredItem<BlockItem> FLUORINE = ITEMS.registerSimpleBlockItem("fluorine", EduJava_BlockClass.FLUORINE, new Item.Properties());
    public static final DeferredItem<BlockItem> NEON = ITEMS.registerSimpleBlockItem("neon", EduJava_BlockClass.NEON, new Item.Properties());

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
