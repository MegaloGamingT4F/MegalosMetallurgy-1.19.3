package net.megalogaming.megalosmetallurgy.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.megalogaming.megalosmetallurgy.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    //Metallurgy - Ore
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block CINNABAR_ORE = registerBlock("cinnabar_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block CALCIUM_ORE = registerBlock("calcium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block MAGNESIUM_ORE = registerBlock("magnesium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block OSMIUM_ORE = registerBlock("osmium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block SILICON_ORE = registerBlock("silicon_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block SODIUM_ORE = registerBlock("sodium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block ZINC_ORE = registerBlock("zinc_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block ZIRCONIUM_ORE = registerBlock("zirconium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);

    //Metallurgy - Deepslate Ore
    public static final Block DEEPSLATE_ANTIMONY_ORE = registerBlock("deepslate_antimony_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_BISMUTH_ORE = registerBlock("deepslate_bismuth_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_CADMIUM_ORE = registerBlock("deepslate_cadmium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_CHROMIUM_ORE = registerBlock("deepslate_chromium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_GALLIUM_ORE = registerBlock("deepslate_gallium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_IRIDIUM_ORE = registerBlock("deepslate_iridium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_MANGANESE_ORE = registerBlock("deepslate_manganese_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_MOLYBDENUM_ORE = registerBlock("deepslate_molybdenum_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_PALLADIUM_ORE = registerBlock("deepslate_palladium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_POTASSIUM_ORE = registerBlock("deepslate_potassium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_RUTHENIUM_ORE = registerBlock("deepslate_ruthenium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_THALLIUM_ORE = registerBlock("deepslate_thallium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);

    //Metallurgy - Nether Ore
    public static final Block NETHERRACK_ARSENIC_ORE = registerBlock("netherrack_arsenic_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_BARIUM_ORE = registerBlock("netherrack_barium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_BERYLLIUM_ORE = registerBlock("netherrack_beryllium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_CAESIUM_ORE = registerBlock("netherrack_caesium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_GERMANIUM_ORE = registerBlock("netherrack_germanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_HAFNIUM_ORE = registerBlock("netherrack_hafnium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_INDIUM_ORE = registerBlock("netherrack_indium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_NIOBIUM_ORE = registerBlock("netherrack_niobium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_PHOSPHORUS_ORE = registerBlock("netherrack_phosphorus_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_RHENIUM_ORE = registerBlock("netherrack_rhenium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_RHODIUM_ORE = registerBlock("netherrack_rhodium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_SELENIUM_ORE = registerBlock("netherrack_selenium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_TECHNETIUM_ORE = registerBlock("netherrack_technetium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block NETHERRACK_TELLURIUM_ORE = registerBlock("netherrack_tellurium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);

    //Metallurgy - End Ore
    public static final Block END_LITHIUM_ORE = registerBlock("end_lithium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block END_RUBIDIUM_ORE = registerBlock("end_rubidium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block END_SCANDIUM_ORE = registerBlock("end_scandium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block END_STRONTIUM_ORE = registerBlock("end_strontium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block END_TANTALUM_ORE = registerBlock("end_tantalum_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block END_VANADIUM_ORE = registerBlock("end_vanadium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);
    public static final Block END_YTTRIUM_ORE = registerBlock("end_yttrium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.METALLURGY);

    //Metallurgy - Block
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);

    //Alloys - Blocks
    public static final Block AA_BLOCK = registerBlock("aa_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registries.BLOCK, new Identifier(MegalosMetallurgy.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(MegalosMetallurgy.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks(){
        MegalosMetallurgy.LOGGER.info("Registering ModBlocks for " + MegalosMetallurgy.MOD_ID);
    }
}
