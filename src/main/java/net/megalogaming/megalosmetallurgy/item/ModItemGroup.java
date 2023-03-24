package net.megalogaming.megalosmetallurgy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup METALLURGY;
    public static ItemGroup ALLOYS;
    public static ItemGroup HOPLOLOGY;

    public static void registerItemGroups(){
        METALLURGY = FabricItemGroup.builder(new Identifier(MegalosMetallurgy.MOD_ID, "metallurgy")).displayName(Text.translatable("itemgroup.metallurgy")).icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT)).build();
        ALLOYS = FabricItemGroup.builder(new Identifier(MegalosMetallurgy.MOD_ID, "alloys")).displayName(Text.translatable("itemgroup.alloys")).icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT)).build();
        HOPLOLOGY = FabricItemGroup.builder(new Identifier(MegalosMetallurgy.MOD_ID, "hoplology")).displayName(Text.translatable("itemgroup.hoplology")).icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT)).build();
    }
}
