package net.theminecraftman.edujava.EJ_Datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theminecraftman.edujava.EJ_Registries.EduJava_BlockClass;
import net.theminecraftman.edujava.EduJava;

public class EduJava_BlockStateProvider extends BlockStateProvider
{
    public EduJava_BlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, EduJava.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlock(EduJava_BlockClass.HYDROGEN.get());
        simpleBlock(EduJava_BlockClass.HELIUM.get());
        simpleBlock(EduJava_BlockClass.LITHIUM.get());
        simpleBlock(EduJava_BlockClass.BERYLLIUM.get());
        simpleBlock(EduJava_BlockClass.BORON.get());
        simpleBlock(EduJava_BlockClass.CARBON.get());
        simpleBlock(EduJava_BlockClass.NITROGEN.get());
        simpleBlock(EduJava_BlockClass.OXYGEN.get());
        simpleBlock(EduJava_BlockClass.FLUORINE.get());
        simpleBlock(EduJava_BlockClass.NEON.get());
    }
}
