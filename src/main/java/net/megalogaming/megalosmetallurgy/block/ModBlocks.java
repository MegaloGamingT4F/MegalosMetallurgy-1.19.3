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

    //Metallurgy - Raw
    public static final Block RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_ANTIMONY_BLOCK = registerBlock("raw_antimony_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_ARSENIC_BLOCK = registerBlock("raw_arsenic_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_BARIUM_BLOCK = registerBlock("raw_barium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_BERYLLIUM_BLOCK = registerBlock("raw_beryllium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_BISMUTH_BLOCK = registerBlock("raw_bismuth_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_CADMIUM_BLOCK = registerBlock("raw_cadmium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_CAESIUM_BLOCK = registerBlock("raw_caesium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_CALCIUM_BLOCK = registerBlock("raw_calcium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_CHROMIUM_BLOCK = registerBlock("raw_chromium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_CINNABAR_BLOCK = registerBlock("raw_cinnabar_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_GALLIUM_BLOCK = registerBlock("raw_gallium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_GERMANIUM_BLOCK = registerBlock("raw_germanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_HAFNIUM_BLOCK = registerBlock("raw_hafnium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_INDIUM_BLOCK = registerBlock("raw_indium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_IRIDIUM_BLOCK = registerBlock("raw_iridium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_LITHIUM_BLOCK = registerBlock("raw_lithium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_MAGNESIUM_BLOCK = registerBlock("raw_magnesium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_MANGANESE_BLOCK = registerBlock("raw_manganese_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_MOLYBDENUM_BLOCK = registerBlock("raw_molybdenum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_NIOBIUM_BLOCK = registerBlock("raw_niobium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_PALLADIUM_BLOCK = registerBlock("raw_palladium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_PHOSPHORUS_BLOCK = registerBlock("raw_phosphorus_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_POTASSIUM_BLOCK = registerBlock("raw_potassium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_RHENIUM_BLOCK = registerBlock("raw_rhenium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_RHODIUM_BLOCK = registerBlock("raw_rhodium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_RUBIDIUM_BLOCK = registerBlock("raw_rubidium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_RUTHENIUM_BLOCK = registerBlock("raw_ruthenium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_SCANDIUM_BLOCK = registerBlock("raw_scandium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_SELENIUM_BLOCK = registerBlock("raw_selenium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_SILICON_BLOCK = registerBlock("raw_silicon_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_SODIUM_BLOCK = registerBlock("raw_sodium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_STRONTIUM_BLOCK = registerBlock("raw_strontium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_TANTALUM_BLOCK = registerBlock("raw_tantalum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_TECHNETIUM_BLOCK = registerBlock("raw_technetium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_TELLurIUM_BLOCK = registerBlock("raw_tellurium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_THALLIUM_BLOCK = registerBlock("raw_thallium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_VANADIUM_BLOCK = registerBlock("raw_vanadium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_YTTRIUM_BLOCK = registerBlock("raw_yttrium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_ZINC_BLOCK = registerBlock("raw_zinc_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RAW_ZIRCONIUM_BLOCK = registerBlock("raw_zirconium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);

    //Metallurgy - Block
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block ANTIMONY_BLOCK = registerBlock("antimony_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block ARSENIC_BLOCK = registerBlock("arsenic_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block BARIUM_BLOCK = registerBlock("barium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block BERYLLIUM_BLOCK = registerBlock("beryllium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block BISMUTH_BLOCK = registerBlock("bismuth_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block CADMIUM_BLOCK = registerBlock("cadmium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block CAESIUM_BLOCK = registerBlock("caesium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block CALCIUM_BLOCK = registerBlock("calcium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block CHROMIUM_BLOCK = registerBlock("chromium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block CINNABAR_BLOCK = registerBlock("cinnabar_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block GALLIUM_BLOCK = registerBlock("gallium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block GERMANIUM_BLOCK = registerBlock("germanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block HAFNIUM_BLOCK = registerBlock("hafnium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block INDIUM_BLOCK = registerBlock("indium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block IRIDIUM_BLOCK = registerBlock("iridium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block LITHIUM_BLOCK = registerBlock("lithium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block MAGNESIUM_BLOCK = registerBlock("magnesium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block MANGANESE_BLOCK = registerBlock("manganese_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block MOLYBDENUM_BLOCK = registerBlock("molybdenum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block NICKEL_BLOCK = registerBlock("nickel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block NIOBIUM_BLOCK = registerBlock("niobium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block OSMIUM_BLOCK = registerBlock("osmium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block PALLADIUM_BLOCK = registerBlock("palladium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block PHOSPHORUS_BLOCK = registerBlock("phosphorus_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block POTASSIUM_BLOCK = registerBlock("potassium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RHENIUM_BLOCK = registerBlock("rhenium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RHODIUM_BLOCK = registerBlock("rhodium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RUBIDIUM_BLOCK = registerBlock("rubidium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block RUTHENIUM_BLOCK = registerBlock("ruthenium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block SCANDIUM_BLOCK = registerBlock("scandium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block SELENIUM_BLOCK = registerBlock("selenium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block SILICON_BLOCK = registerBlock("silicon_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block SODIUM_BLOCK = registerBlock("sodium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block STRONTIUM_BLOCK = registerBlock("strontium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block TANTALUM_BLOCK = registerBlock("tantalum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block TECHNETIUM_BLOCK = registerBlock("technetium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block TELLURIUM_BLOCK = registerBlock("tellurium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block THALLIUM_BLOCK = registerBlock("thallium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block TUNGSTEN_BLOCK = registerBlock("" +"tungsten_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block VANADIUM_BLOCK = registerBlock("vanadium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block YTTRIUM_BLOCK = registerBlock("yttrium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block ZINC_BLOCK = registerBlock("zinc_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);
    public static final Block ZIRCONIUM_BLOCK = registerBlock("zirconium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.METALLURGY);

    //Alloys - Blocks
    public static final Block AA_BLOCK = registerBlock("aa_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block AILI_BLOCK = registerBlock("aili_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ALNICO_BLOCK = registerBlock("alnico_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ALUSCA_BLOCK = registerBlock("alusca_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BIRMA_BLOCK = registerBlock("birma_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block DURALUMIN_BLOCK = registerBlock("duralumin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HIDUMINIUM_BLOCK = registerBlock("hidminium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HINDALIUM_BLOCK = registerBlock("hindlium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HYDRONALIUM_BLOCK = registerBlock("hydronalium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ITALMA_BLOCK = registerBlock("italma_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MAGNALIUM_BLOCK = registerBlock("magnalium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NAMBE_BLOCK = registerBlock("nambe_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NITIAL_BLOCK = registerBlock("nitial_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SILUMIN_BLOCK = registerBlock("silumin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block YALLOY_BLOCK = registerBlock("yalloy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block LOCKALLOY_BLOCK = registerBlock("lockalloy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BISMANOL_BLOCK = registerBlock("bismanol_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CERROSAFE_BLOCK = registerBlock("cerrosafe_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ROSEMETAL_BLOCK = registerBlock("rosemetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block WOODSMETAL_BLOCK = registerBlock("woodsmetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CHROMHYD_BLOCK = registerBlock("chromhyd_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CRNIWTI_BLOCK = registerBlock("crniwti_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERROCHROME_BLOCK = registerBlock("ferrochrome_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NICHROME_BLOCK = registerBlock("nichrome_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ELGILOY_BLOCK = registerBlock("elgiloy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MEGALLIUM_BLOCK = registerBlock("megallium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block STELLITE_BLOCK = registerBlock("stellite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TALONITE_BLOCK = registerBlock("talonite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ULTIMET_BLOCK = registerBlock("ultimet_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block VITALLIUM_BLOCK = registerBlock("vitallium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ALUBRO_BLOCK = registerBlock("alubro_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ARSBRO_BLOCK = registerBlock("arsbro_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ARSCOP_BLOCK = registerBlock("arscop_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BELLMETAL_BLOCK = registerBlock("bellmetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BERYLCOPPER_BLOCK = registerBlock("berylcopper_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BILLON_BLOCK = registerBlock("billon_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BRASS_BLOCK = registerBlock("brass_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CALAMINE_BLOCK = registerBlock("calamine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CHISIL_BLOCK = registerBlock("chisil_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CUNIFE_BLOCK = registerBlock("cunife_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CONSTANTAN_BLOCK = registerBlock("constantan_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block COPHYD_BLOCK = registerBlock("cophyd_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block COPTUNG_BLOCK = registerBlock("coptung_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CORINTHIAN_BLOCK = registerBlock("corinthian_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CUPRONICKEL_BLOCK = registerBlock("cupronickel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CUSIL_BLOCK = registerBlock("cusil_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CYMBAL_BLOCK = registerBlock("cymbal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block DEVARDA_BLOCK = registerBlock("devarda_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block DUTCHMETAL_BLOCK = registerBlock("dutchmetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FLORENTINE_BLOCK = registerBlock("florentine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GILDMETAL_BLOCK = registerBlock("gildmetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GLUCYDUR_BLOCK = registerBlock("glucydur_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GUANIN_BLOCK = registerBlock("guanin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GUNMETAL_BLOCK = registerBlock("gunmetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HEPATIZON_BLOCK = registerBlock("hepatizon_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MANGANIN_BLOCK = registerBlock("manganin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MELCHIOR_BLOCK = registerBlock("melchior_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MUNTZ_BLOCK = registerBlock("muntz_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NICKSILVER_BLOCK = registerBlock("nicksilver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NORDIC_BLOCK = registerBlock("nordic_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ORMOLU_BLOCK = registerBlock("ormolu_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block PINCHBECK_BLOCK = registerBlock("pinchbeck_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block PRINCEMETAL_BLOCK = registerBlock("princemetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block PHOSPHOR_BLOCK = registerBlock("phosphor_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SHAKUDO_BLOCK = registerBlock("shakudo_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SILBRO_BLOCK = registerBlock("silbro_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SPECULUM_BLOCK = registerBlock("speculum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TOMBAC_BLOCK = registerBlock("tombac_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TUMBAGA_BLOCK = registerBlock("tumbaga_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block WHIBRO_BLOCK = registerBlock("whibro_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ALGA_BLOCK = registerBlock("alga_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GALFENOL_BLOCK = registerBlock("galfenol_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GALINSTAN_BLOCK = registerBlock("galinstan_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ANTANIUM_BLOCK = registerBlock("antanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block COLORGOLD_BLOCK = registerBlock("colorgold_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CROWNGOLD_BLOCK = registerBlock("crowngold_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block RHODITE_BLOCK = registerBlock("rhodite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ROSEGOLD_BLOCK = registerBlock("rosegold_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block WHITEGOLD_BLOCK = registerBlock("whitegold_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FIELDSMETAL_BLOCK = registerBlock("fieldsmetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ELINVAR_BLOCK = registerBlock("elinvar_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERNICO_BLOCK = registerBlock("fernico_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block INVAR_BLOCK = registerBlock("invar_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CASTIRON_BLOCK = registerBlock("castiron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block PIGIRON_BLOCK = registerBlock("pigiron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block IROHYD_BLOCK = registerBlock("irohyd_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block KANTHAL_BLOCK = registerBlock("kanthal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block KOVAR_BLOCK = registerBlock("kovar_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SPIEGEL_BLOCK = registerBlock("spegel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block STABALLOY_BLOCK = registerBlock("staballoy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BULAT_BLOCK = registerBlock("bulat_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CHROMOLY_BLOCK = registerBlock("chromoly_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CRUCIBLE_BLOCK = registerBlock("crucible_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block DAMASCUS_BLOCK = registerBlock("damascus_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block DUCOL_BLOCK = registerBlock("ducol_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HADFIELD_BLOCK = registerBlock("hadfield_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HIGHSPEED_BLOCK = registerBlock("highspeed_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HSLA_BLOCK = registerBlock("hsla_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MARAGING_BLOCK = registerBlock("maraging_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MUSHET_BLOCK = registerBlock("mushet_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block REYNOLDS_BLOCK = registerBlock("reynolds_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SILISTEEL_BLOCK = registerBlock("silisteel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SPRINGSTEEL_BLOCK = registerBlock("springsteel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block STAINLESS_BLOCK = registerBlock("stainless_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TOOLSTEEL_BLOCK = registerBlock("toolsteel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block WEATHERING_BLOCK = registerBlock("weathering_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block WOOTZ_BLOCK = registerBlock("wootz_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MOLBDOCHALKOS_BLOCK = registerBlock("molbdochalkos_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SOLDER_BLOCK = registerBlock("solder_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TERNE_BLOCK = registerBlock("terne_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TYPEMETAL_BLOCK = registerBlock("typemetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ELEKTRON_BLOCK = registerBlock("elektron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MAGNOX_BLOCK = registerBlock("magnox_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TMGALZN_BLOCK = registerBlock("tmgalzn_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MNFZ_BLOCK = registerBlock("mnfz_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MNSZ_BLOCK = registerBlock("mnsz_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block AMALGAM_BLOCK = registerBlock("amalgam_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ASHTADHATU_BLOCK = registerBlock("ashtadhatu_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ALUMEL_BLOCK = registerBlock("alumel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BRIGHTRAY_BLOCK = registerBlock("brightray_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block CHROMEL_BLOCK = registerBlock("chromel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GERSIL_BLOCK = registerBlock("gersil_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HASTELLOY_BLOCK = registerBlock("hastelloy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block INCONEL_BLOCK = registerBlock("inconel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block INCONELSES_BLOCK = registerBlock("inconelses_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MONEL_BLOCK = registerBlock("monel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NICKCARB_BLOCK = registerBlock("nickcarb_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NICROSIL_BLOCK = registerBlock("nicrosil_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NIMONIC_BLOCK = registerBlock("nimonic_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NISIL_BLOCK = registerBlock("nisil_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NITINOL_BLOCK = registerBlock("nitinol_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block MUMETAL_BLOCK = registerBlock("mumetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block PERMALLOY_BLOCK = registerBlock("permalloy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SUPERMALLOY_BLOCK = registerBlock("supermalloy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NICHYD_BLOCK = registerBlock("nichyd_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block COINSILVER_BLOCK = registerBlock("coinsilver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block KLI_BLOCK = registerBlock("kli_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block NAK_BLOCK = registerBlock("nak_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block PSEUDO_BLOCK = registerBlock("pseudo_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SCANHYD_BLOCK = registerBlock("scanhyd_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ARGSTERSIL_BLOCK = registerBlock("arstersil_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BRITSIL_BLOCK = registerBlock("britsil_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block DORE_BLOCK = registerBlock("dore_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block DYMALLOY_BLOCK = registerBlock("dymalloy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GOLOID_BLOCK = registerBlock("goloid_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block PLATSTER_BLOCK = registerBlock("platster_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SHIBUICHI_BLOCK = registerBlock("shibuichi_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block STERLING_BLOCK = registerBlock("sterling_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TIBETSIL_BLOCK = registerBlock("tibetsil_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SALFV_BLOCK = registerBlock("salfv_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BETAC_BLOCK = registerBlock("betac_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block GUMMETAL_BLOCK = registerBlock("gummetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TITANHYD_BLOCK = registerBlock("titanhyd_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TITANNIT_BLOCK = registerBlock("titannit_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block TITANGOLD_BLOCK = registerBlock("titangold_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BABBITT_BLOCK = registerBlock("babbitt_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block BRITANNIUM_BLOCK = registerBlock("britannium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block PEWTER_BLOCK = registerBlock("pewter_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block QUEENS_BLOCK = registerBlock("queens_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block WHIMETAL_BLOCK = registerBlock("whimetal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ZAMAK_BLOCK = registerBlock("zamak_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ZIRCALOY_BLOCK = registerBlock("zircaloy_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block HAUSLER_BLOCK = registerBlock("hausler_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block ANTHRACITE_BLOCK = registerBlock("anthracite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block WROUGHT_BLOCK = registerBlock("wrought_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block COPNIC_BLOCK = registerBlock("copnic_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block SILSTEEL_BLOCK = registerBlock("silsteel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERROMAGNES_BLOCK = registerBlock("ferromagnes_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERROMANGA_BLOCK = registerBlock("ferromanga_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERROMOLYBD_BLOCK = registerBlock("ferromolybd_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERRONICKEL_BLOCK = registerBlock("ferronickel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERROPHOSPHORUS_BLOCK = registerBlock("ferrophosphorus_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERROSILICON_BLOCK = registerBlock("ferrosilicon_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERROTITANIUM_BLOCK = registerBlock("ferrotitanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ALLOYS);
    public static final Block FERROVANADIUM_BLOCK = registerBlock("ferrovanadium_block",
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
