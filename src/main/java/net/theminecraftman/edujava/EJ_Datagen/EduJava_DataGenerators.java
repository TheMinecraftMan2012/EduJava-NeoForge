package net.theminecraftman.edujava.EJ_Datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.theminecraftman.edujava.EduJava;

@EventBusSubscriber(modid = EduJava.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class EduJava_DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new EduJava_BlockStateProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new EduJava_ItemModelProvider(output, existingFileHelper));

        generator.addProvider(event.includeClient(), new EduJava_LanguageProvider(output));
    }
}
