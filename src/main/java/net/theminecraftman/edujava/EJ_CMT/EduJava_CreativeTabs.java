package net.theminecraftman.edujava.EJ_CMT;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theminecraftman.edujava.EJ_Registries.EduJava_ItemClass;
import net.theminecraftman.edujava.EduJava;

public class EduJava_CreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EduJava.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PERIODIC_TABLE = CREATIVE_MODE_TAB.register("periodic_table", () -> CreativeModeTab.builder()
            .title(Component.literal("Periodic Table"))
            .icon(() -> new ItemStack(EduJava_ItemClass.HYDROGEN.get()))
            .displayItems((params, output) -> {
                output.accept(EduJava_ItemClass.HYDROGEN);
                output.accept(EduJava_ItemClass.HELIUM);
                output.accept(EduJava_ItemClass.LITHIUM);
                output.accept(EduJava_ItemClass.BERYLLIUM);
                output.accept(EduJava_ItemClass.BORON);
                output.accept(EduJava_ItemClass.CARBON);
                output.accept(EduJava_ItemClass.NITROGEN);
                output.accept(EduJava_ItemClass.OXYGEN);
                output.accept(EduJava_ItemClass.FLUORINE);
                output.accept(EduJava_ItemClass.NEON);
            })
            .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
