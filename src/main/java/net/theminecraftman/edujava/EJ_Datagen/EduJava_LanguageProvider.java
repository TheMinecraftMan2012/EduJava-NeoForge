package net.theminecraftman.edujava.EJ_Datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.theminecraftman.edujava.EJ_Registries.EduJava_BlockClass;
import net.theminecraftman.edujava.EduJava;

public class EduJava_LanguageProvider extends LanguageProvider
{
    public EduJava_LanguageProvider(PackOutput output)
    {
        super(output, EduJava.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations()
    {
        blockTranslation(EduJava_BlockClass.HYDROGEN, "Hydrogen");
        blockTranslation(EduJava_BlockClass.HELIUM, "Helium");
        blockTranslation(EduJava_BlockClass.LITHIUM, "Lithium");
        blockTranslation(EduJava_BlockClass.BERYLLIUM, "Beryllium");
        blockTranslation(EduJava_BlockClass.BORON, "Boron");
        blockTranslation(EduJava_BlockClass.CARBON, "Carbon");
        blockTranslation(EduJava_BlockClass.NITROGEN, "Nitrogen");
        blockTranslation(EduJava_BlockClass.OXYGEN, "Oxygen");
        blockTranslation(EduJava_BlockClass.FLUORINE, "Fluorine");
        blockTranslation(EduJava_BlockClass.NEON, "Neon");
    }

    private void blockTranslation(DeferredBlock<?> block, String name)
    {
        String objectID = "block." + block.getId();
        objectID = objectID.replace(":", ".");

        add(objectID, name);
    }
}
