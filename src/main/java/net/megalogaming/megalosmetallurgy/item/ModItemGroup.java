package net.megalogaming.megalosmetallurgy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.megalogaming.megalosmetallurgy.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup METALLURGY;
    public static ItemGroup ALLOYS;
    public static ItemGroup HOPLOLOGY;

    public static void registerItemGroups(){
        METALLURGY = FabricItemGroup.builder(new Identifier(MegalosMetallurgy.MOD_ID, "metallurgy")).displayName(Text.literal("Megalo's Metallurgy")).icon(() -> new ItemStack(ModBlocks.ALUMINIUM_ORE)).build();
        ALLOYS = FabricItemGroup.builder(new Identifier(MegalosMetallurgy.MOD_ID, "alloys")).displayName(Text.literal("Megalo's Alloys")).icon(() -> new ItemStack(ModItems.AA_INGOT)).build();
        HOPLOLOGY = FabricItemGroup.builder(new Identifier(MegalosMetallurgy.MOD_ID, "hoplology")).displayName(Text.literal("Megalo's Hoplology")).icon(() -> new ItemStack(ModItems.AA_INGOT)).build();
    }
}
