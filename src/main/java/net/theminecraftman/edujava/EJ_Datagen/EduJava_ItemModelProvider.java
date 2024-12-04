package net.theminecraftman.edujava.EJ_Datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theminecraftman.edujava.EJ_Registries.EduJava_ItemClass;
import net.theminecraftman.edujava.EduJava;

public class EduJava_ItemModelProvider extends ItemModelProvider
{
    public EduJava_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, EduJava.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        basicItem(EduJava_ItemClass.HYDROGEN.get());
        basicItem(EduJava_ItemClass.HELIUM.get());
        basicItem(EduJava_ItemClass.LITHIUM.get());
        basicItem(EduJava_ItemClass.BERYLLIUM.get());
        basicItem(EduJava_ItemClass.BORON.get());
        basicItem(EduJava_ItemClass.CARBON.get());
        basicItem(EduJava_ItemClass.NITROGEN.get());
        basicItem(EduJava_ItemClass.OXYGEN.get());
        basicItem(EduJava_ItemClass.FLUORINE.get());
        basicItem(EduJava_ItemClass.NEON.get());
    }
}
