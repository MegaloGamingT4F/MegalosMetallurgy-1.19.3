package net.megalogaming.megalosmetallurgy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Metallurgy - Raw
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item( new FabricItemSettings()));
    public static final Item RAW_ANTIMONY = registerItem("raw_antimony", new Item( new FabricItemSettings()));
    public static final Item RAW_ARSENIC = registerItem("raw_arsenic", new Item( new FabricItemSettings()));
    public static final Item RAW_BARIUM = registerItem("raw_barium", new Item( new FabricItemSettings()));
    public static final Item RAW_BERYLLIUM = registerItem("raw_beryllium", new Item( new FabricItemSettings()));
    public static final Item RAW_BISMUTH = registerItem("raw_bismuth", new Item( new FabricItemSettings()));
    public static final Item RAW_CADMIUM = registerItem("raw_cadmium", new Item( new FabricItemSettings()));
    public static final Item RAW_CAESIUM = registerItem("raw_caesium", new Item( new FabricItemSettings()));
    public static final Item RAW_CALCIUM = registerItem("raw_calcium", new Item( new FabricItemSettings()));
    public static final Item RAW_CHROMIUM = registerItem("raw_chromium", new Item( new FabricItemSettings()));
    public static final Item RAW_CINNABAR = registerItem("raw_cinnabar", new Item( new FabricItemSettings()));
    public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item( new FabricItemSettings()));
    public static final Item RAW_GALLIUM = registerItem("raw_gallium", new Item( new FabricItemSettings()));
    public static final Item RAW_GERMANIUM = registerItem("raw_germanium", new Item( new FabricItemSettings()));
    public static final Item RAW_HAFNIUM = registerItem("raw_hafnium", new Item( new FabricItemSettings()));
    public static final Item RAW_INDIUM = registerItem("raw_indium", new Item( new FabricItemSettings()));
    public static final Item RAW_IRIDIUM = registerItem("raw_iridium", new Item( new FabricItemSettings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item( new FabricItemSettings()));
    public static final Item RAW_LITHIUM = registerItem("raw_lithium", new Item( new FabricItemSettings()));
    public static final Item RAW_MAGNESIUM = registerItem("raw_magnesium", new Item( new FabricItemSettings()));
    public static final Item RAW_MANGANESE = registerItem("raw_manganese", new Item( new FabricItemSettings()));
    public static final Item RAW_MOLYBDENUM = registerItem("raw_molybdenum", new Item( new FabricItemSettings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item( new FabricItemSettings()));
    public static final Item RAW_NIOBIUM = registerItem("raw_niobium", new Item( new FabricItemSettings()));
    public static final Item RAW_OSMIUM = registerItem("raw_osmium", new Item( new FabricItemSettings()));
    public static final Item RAW_PALLADIUM = registerItem("raw_palladium", new Item( new FabricItemSettings()));
    public static final Item RAW_PHOSPHORUS = registerItem("raw_phosphorus", new Item( new FabricItemSettings()));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item( new FabricItemSettings()));
    public static final Item RAW_POTASSIUM = registerItem("raw_potassium", new Item( new FabricItemSettings()));
    public static final Item RAW_RHENIUM = registerItem("raw_rhenium", new Item( new FabricItemSettings()));
    public static final Item RAW_RHODIUM = registerItem("raw_rhodium", new Item( new FabricItemSettings()));
    public static final Item RAW_RUBIDIUM = registerItem("raw_rubidium", new Item( new FabricItemSettings()));
    public static final Item RAW_RUTHENIUM = registerItem("raw_ruthenium", new Item( new FabricItemSettings()));
    public static final Item RAW_SCANDIUM = registerItem("raw_scandium", new Item( new FabricItemSettings()));
    public static final Item RAW_SELENIUM = registerItem("raw_selenium", new Item( new FabricItemSettings()));
    public static final Item RAW_SILICON = registerItem("raw_silicon", new Item( new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item( new FabricItemSettings()));
    public static final Item RAW_SODIUM = registerItem("raw_sodium", new Item( new FabricItemSettings()));
    public static final Item RAW_STRONTIUM = registerItem("raw_strontium", new Item( new FabricItemSettings()));
    public static final Item RAW_TANTALUM = registerItem("raw_tantalum", new Item( new FabricItemSettings()));
    public static final Item RAW_TECHNETIUM = registerItem("raw_technetium", new Item( new FabricItemSettings()));
    public static final Item RAW_TELLURIUM = registerItem("raw_tellurium", new Item( new FabricItemSettings()));
    public static final Item RAW_THALLIUM = registerItem("raw_thallium", new Item( new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item( new FabricItemSettings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item( new FabricItemSettings()));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item( new FabricItemSettings()));
    public static final Item RAW_VANADIUM = registerItem("raw_vanadium", new Item( new FabricItemSettings()));
    public static final Item RAW_YTTRIUM = registerItem("raw_yttrium", new Item( new FabricItemSettings()));
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item( new FabricItemSettings()));
    public static final Item RAW_ZIRCONIUM = registerItem("raw_zirconium", new Item( new FabricItemSettings()));

    //Metallurgy - Ingot
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item( new FabricItemSettings()));
    public static final Item ANTIMONY_INGOT = registerItem("antimony_ingot", new Item( new FabricItemSettings()));
    public static final Item ARSENIC_INGOT = registerItem("arsenic_ingot", new Item( new FabricItemSettings()));
    public static final Item BARIUM_INGOT = registerItem("barium_ingot", new Item( new FabricItemSettings()));
    public static final Item BERYLLIUM_INGOT = registerItem("beryllium_ingot", new Item( new FabricItemSettings()));
    public static final Item BISMUTH_INGOT = registerItem("bismuth_ingot", new Item( new FabricItemSettings()));
    public static final Item CADMIUM_INGOT = registerItem("cadmium_ingot", new Item( new FabricItemSettings()));
    public static final Item CAESIUM_INGOT = registerItem("caesium_ingot", new Item( new FabricItemSettings()));
    public static final Item CALCIUM_INGOT = registerItem("calcium_ingot", new Item( new FabricItemSettings()));
    public static final Item CHROMIUM_INGOT = registerItem("chromium_ingot", new Item( new FabricItemSettings()));
    public static final Item CINNABAR_INGOT = registerItem("cinnabar_ingot", new Item( new FabricItemSettings()));
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item( new FabricItemSettings()));
    public static final Item GALLIUM_INGOT = registerItem("gallium_ingot", new Item( new FabricItemSettings()));
    public static final Item GERMANIUM_INGOT = registerItem("germanium_ingot", new Item( new FabricItemSettings()));
    public static final Item HAFNIUM_INGOT = registerItem("hafnium_ingot", new Item( new FabricItemSettings()));
    public static final Item INDIUM_INGOT = registerItem("indium_ingot", new Item( new FabricItemSettings()));
    public static final Item IRIDIUM_INGOT = registerItem("iridium_ingot", new Item( new FabricItemSettings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item( new FabricItemSettings()));
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item( new FabricItemSettings()));
    public static final Item MAGNESIUM_INGOT = registerItem("magnesium_ingot", new Item( new FabricItemSettings()));
    public static final Item MANGANESE_INGOT = registerItem("manganese_ingot", new Item( new FabricItemSettings()));
    public static final Item MOLYBDENUM_INGOT = registerItem("molybdenum_ingot", new Item( new FabricItemSettings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item( new FabricItemSettings()));
    public static final Item NIOBIUM_INGOT = registerItem("niobium_ingot", new Item( new FabricItemSettings()));
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot", new Item( new FabricItemSettings()));
    public static final Item PALLADIUM_INGOT = registerItem("palladium_ingot", new Item( new FabricItemSettings()));
    public static final Item PHOSPHORUS_INGOT = registerItem("phosphorus_ingot", new Item( new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item( new FabricItemSettings()));
    public static final Item POTASSIUM_INGOT = registerItem("potassium_ingot", new Item( new FabricItemSettings()));
    public static final Item RHENIUM_INGOT = registerItem("rhenium_ingot", new Item( new FabricItemSettings()));
    public static final Item RHODIUM_INGOT = registerItem("rhodium_ingot", new Item( new FabricItemSettings()));
    public static final Item RUBIDIUM_INGOT = registerItem("rubidium_ingot", new Item( new FabricItemSettings()));
    public static final Item RUTHENIUM_INGOT = registerItem("ruthenium_ingot", new Item( new FabricItemSettings()));
    public static final Item SCANDIUM_INGOT = registerItem("scandium_ingot", new Item( new FabricItemSettings()));
    public static final Item SELENIUM_INGOT = registerItem("selenium_ingot", new Item( new FabricItemSettings()));
    public static final Item SILICON_INGOT = registerItem("silicon_ingot", new Item( new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item( new FabricItemSettings()));
    public static final Item SODIUM_INGOT = registerItem("sodium_ingot", new Item( new FabricItemSettings()));
    public static final Item STRONTIUM_INGOT = registerItem("strontium_ingot", new Item( new FabricItemSettings()));
    public static final Item TANTALUM_INGOT = registerItem("tantalum_ingot", new Item( new FabricItemSettings()));
    public static final Item TECHNETIUM_INGOT = registerItem("technetium_ingot", new Item( new FabricItemSettings()));
    public static final Item TELLURIUM_INGOT = registerItem("tellurium_ingot", new Item( new FabricItemSettings()));
    public static final Item THALLIUM_INGOT = registerItem("thallium_ingot", new Item( new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item( new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item( new FabricItemSettings()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item( new FabricItemSettings()));
    public static final Item VANADIUM_INGOT = registerItem("vanadium_ingot", new Item( new FabricItemSettings()));
    public static final Item YTTRIUM_INGOT = registerItem("yttrium_ingot", new Item( new FabricItemSettings()));
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item( new FabricItemSettings()));
    public static final Item ZIRCONIUM_INGOT = registerItem("zirconium_ingot", new Item( new FabricItemSettings()));

    //Metallurgy - Nugget
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget", new Item( new FabricItemSettings()));
    public static final Item ANTIMONY_NUGGET = registerItem("antimony_nugget", new Item( new FabricItemSettings()));
    public static final Item ARSENIC_NUGGET = registerItem("arsenic_nugget", new Item( new FabricItemSettings()));
    public static final Item BARIUM_NUGGET = registerItem("barium_nugget", new Item( new FabricItemSettings()));
    public static final Item BERYLLIUM_NUGGET = registerItem("beryllium_nugget", new Item( new FabricItemSettings()));
    public static final Item BISMUTH_NUGGET = registerItem("bismuth_nugget", new Item( new FabricItemSettings()));
    public static final Item CADMIUM_NUGGET = registerItem("cadmium_nugget", new Item( new FabricItemSettings()));
    public static final Item CAESIUM_NUGGET = registerItem("caesium_nugget", new Item( new FabricItemSettings()));
    public static final Item CALCIUM_NUGGET = registerItem("calcium_nugget", new Item( new FabricItemSettings()));
    public static final Item CHROMIUM_NUGGET = registerItem("chromium_nugget", new Item( new FabricItemSettings()));
    public static final Item CINNABAR_NUGGET = registerItem("cinnabar_nugget", new Item( new FabricItemSettings()));
    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget", new Item( new FabricItemSettings()));
    public static final Item GALLIUM_NUGGET = registerItem("gallium_nugget", new Item( new FabricItemSettings()));
    public static final Item GERMANIUM_NUGGET = registerItem("germanium_nugget", new Item( new FabricItemSettings()));
    public static final Item HAFNIUM_NUGGET = registerItem("hafnium_nugget", new Item( new FabricItemSettings()));
    public static final Item INDIUM_NUGGET = registerItem("indium_nugget", new Item( new FabricItemSettings()));
    public static final Item IRIDIUM_NUGGET = registerItem("iridium_nugget", new Item( new FabricItemSettings()));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item( new FabricItemSettings()));
    public static final Item LITHIUM_NUGGET = registerItem("lithium_nugget", new Item( new FabricItemSettings()));
    public static final Item MAGNESIUM_NUGGET = registerItem("magnesium_nugget", new Item( new FabricItemSettings()));
    public static final Item MANGANESE_NUGGET = registerItem("manganese_nugget", new Item( new FabricItemSettings()));
    public static final Item MOLYBDENUM_NUGGET = registerItem("molybdenum_nugget", new Item( new FabricItemSettings()));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item( new FabricItemSettings()));
    public static final Item NIOBIUM_NUGGET = registerItem("niobium_nugget", new Item( new FabricItemSettings()));
    public static final Item OSMIUM_NUGGET = registerItem("osmium_nugget", new Item( new FabricItemSettings()));
    public static final Item PALLADIUM_NUGGET = registerItem("palladium_nugget", new Item( new FabricItemSettings()));
    public static final Item PHOSPHORUS_NUGGET = registerItem("phosphorus_nugget", new Item( new FabricItemSettings()));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", new Item( new FabricItemSettings()));
    public static final Item POTASSIUM_NUGGET = registerItem("potassium_nugget", new Item( new FabricItemSettings()));
    public static final Item RHENIUM_NUGGET = registerItem("rhenium_nugget", new Item( new FabricItemSettings()));
    public static final Item RHODIUM_NUGGET = registerItem("rhodium_nugget", new Item( new FabricItemSettings()));
    public static final Item RUBIDIUM_NUGGET = registerItem("rubidium_nugget", new Item( new FabricItemSettings()));
    public static final Item RUTHENIUM_NUGGET = registerItem("ruthenium_nugget", new Item( new FabricItemSettings()));
    public static final Item SCANDIUM_NUGGET = registerItem("scandium_nugget", new Item( new FabricItemSettings()));
    public static final Item SELENIUM_NUGGET = registerItem("selenium_nugget", new Item( new FabricItemSettings()));
    public static final Item SILICON_NUGGET = registerItem("silicon_nugget", new Item( new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item( new FabricItemSettings()));
    public static final Item SODIUM_NUGGET = registerItem("sodium_nugget", new Item( new FabricItemSettings()));
    public static final Item STRONTIUM_NUGGET = registerItem("strontium_nugget", new Item( new FabricItemSettings()));
    public static final Item TANTALUM_NUGGET = registerItem("tantalum_nugget", new Item( new FabricItemSettings()));
    public static final Item TECHNETIUM_NUGGET = registerItem("technetium_nugget", new Item( new FabricItemSettings()));
    public static final Item TELLURIUM_NUGGET = registerItem("tellurium_nugget", new Item( new FabricItemSettings()));
    public static final Item THALLIUM_NUGGET = registerItem("thallium_nugget", new Item( new FabricItemSettings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item( new FabricItemSettings()));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item( new FabricItemSettings()));
    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget", new Item( new FabricItemSettings()));
    public static final Item VANADIUM_NUGGET = registerItem("vanadium_nugget", new Item( new FabricItemSettings()));
    public static final Item YTTRIUM_NUGGET = registerItem("yttrium_nugget", new Item( new FabricItemSettings()));
    public static final Item ZINC_NUGGET = registerItem("zinc_nugget", new Item( new FabricItemSettings()));
    public static final Item ZIRCONIUM_NUGGET = registerItem("zirconium_nugget", new Item( new FabricItemSettings()));

    //Metallurgy - Dust
    public static final Item ALUMINIUM_DUST = registerItem("aluminium_dust", new Item( new FabricItemSettings()));
    public static final Item ANTIMONY_DUST = registerItem("antimony_dust", new Item( new FabricItemSettings()));
    public static final Item ARSENIC_DUST = registerItem("arsenic_dust", new Item( new FabricItemSettings()));
    public static final Item BARIUM_DUST = registerItem("barium_dust", new Item( new FabricItemSettings()));
    public static final Item BERYLLIUM_DUST = registerItem("beryllium_dust", new Item( new FabricItemSettings()));
    public static final Item BISMUTH_DUST = registerItem("bismuth_dust", new Item( new FabricItemSettings()));
    public static final Item CADMIUM_DUST = registerItem("cadmium_dust", new Item( new FabricItemSettings()));
    public static final Item CAESIUM_DUST = registerItem("caesium_dust", new Item( new FabricItemSettings()));
    public static final Item CALCIUM_DUST = registerItem("calcium_dust", new Item( new FabricItemSettings()));
    public static final Item CHROMIUM_DUST = registerItem("chromium_dust", new Item( new FabricItemSettings()));
    public static final Item CINNABAR_DUST = registerItem("cinnabar_dust", new Item( new FabricItemSettings()));
    public static final Item COBALT_DUST = registerItem("cobalt_dust", new Item( new FabricItemSettings()));
    public static final Item GALLIUM_DUST = registerItem("gallium_dust", new Item( new FabricItemSettings()));
    public static final Item GERMANIUM_DUST = registerItem("germanium_dust", new Item( new FabricItemSettings()));
    public static final Item HAFNIUM_DUST = registerItem("hafnium_dust", new Item( new FabricItemSettings()));
    public static final Item INDIUM_DUST = registerItem("indium_dust", new Item( new FabricItemSettings()));
    public static final Item IRIDIUM_DUST = registerItem("iridium_dust", new Item( new FabricItemSettings()));
    public static final Item LEAD_DUST = registerItem("lead_dust", new Item( new FabricItemSettings()));
    public static final Item LITHIUM_DUST = registerItem("lithium_dust", new Item( new FabricItemSettings()));
    public static final Item MAGNESIUM_DUST = registerItem("magnesium_dust", new Item( new FabricItemSettings()));
    public static final Item MANGANESE_DUST = registerItem("manganese_dust", new Item( new FabricItemSettings()));
    public static final Item MOLYBDENUM_DUST = registerItem("molybdenum_dust", new Item( new FabricItemSettings()));
    public static final Item NICKEL_DUST = registerItem("nickel_dust", new Item( new FabricItemSettings()));
    public static final Item NIOBIUM_DUST = registerItem("niobium_dust", new Item( new FabricItemSettings()));
    public static final Item OSMIUM_DUST = registerItem("osmium_dust", new Item( new FabricItemSettings()));
    public static final Item PALLADIUM_DUST = registerItem("palladium_dust", new Item( new FabricItemSettings()));
    public static final Item PHOSPHORUS_DUST = registerItem("phosphorus_dust", new Item( new FabricItemSettings()));
    public static final Item PLATINUM_DUST = registerItem("platinum_dust", new Item( new FabricItemSettings()));
    public static final Item POTASSIUM_DUST = registerItem("potassium_dust", new Item( new FabricItemSettings()));
    public static final Item RHENIUM_DUST = registerItem("rhenium_dust", new Item( new FabricItemSettings()));
    public static final Item RHODIUM_DUST = registerItem("rhodium_dust", new Item( new FabricItemSettings()));
    public static final Item RUBIDIUM_DUST = registerItem("rubidium_dust", new Item( new FabricItemSettings()));
    public static final Item RUTHENIUM_DUST = registerItem("ruthenium_dust", new Item( new FabricItemSettings()));
    public static final Item SCANDIUM_DUST = registerItem("scandium_dust", new Item( new FabricItemSettings()));
    public static final Item SELENIUM_DUST = registerItem("selenium_dust", new Item( new FabricItemSettings()));
    public static final Item SILICON_DUST = registerItem("silicon_dust", new Item( new FabricItemSettings()));
    public static final Item SILVER_DUST = registerItem("silver_dust", new Item( new FabricItemSettings()));
    public static final Item SODIUM_DUST = registerItem("sodium_dust", new Item( new FabricItemSettings()));
    public static final Item STRONTIUM_DUST = registerItem("strontium_dust", new Item( new FabricItemSettings()));
    public static final Item TANTALUM_DUST = registerItem("tantalum_dust", new Item( new FabricItemSettings()));
    public static final Item TECHNETIUM_DUST = registerItem("technetium_dust", new Item( new FabricItemSettings()));
    public static final Item TELLURIUM_DUST = registerItem("tellurium_dust", new Item( new FabricItemSettings()));
    public static final Item THALLIUM_DUST = registerItem("thallium_dust", new Item( new FabricItemSettings()));
    public static final Item TIN_DUST = registerItem("tin_dust", new Item( new FabricItemSettings()));
    public static final Item TITANIUM_DUST = registerItem("titanium_dust", new Item( new FabricItemSettings()));
    public static final Item TUNGSTEN_DUST = registerItem("tungsten_dust", new Item( new FabricItemSettings()));
    public static final Item VANADIUM_DUST = registerItem("vanadium_dust", new Item( new FabricItemSettings()));
    public static final Item YTTRIUM_DUST = registerItem("yttrium_dust", new Item( new FabricItemSettings()));
    public static final Item ZINC_DUST = registerItem("zinc_dust", new Item( new FabricItemSettings()));
    public static final Item ZIRCONIUM_DUST = registerItem("zirconium_dust", new Item( new FabricItemSettings()));


    //Alloy - Ingots
    public static final Item AA_INGOT = registerItem("aa_ingot", new Item( new FabricItemSettings()));
    public static final Item AILI_INGOT = registerItem("aili_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ALNICO_INGOT = registerItem("alnico_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ALUSCA_INGOT = registerItem("alusca_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BIRMA_INGOT = registerItem("birma_ingot",
            new Item(new FabricItemSettings()));
    public static final Item DURALUMIN_INGOT = registerItem("duralumin_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HIDUMINIUM_INGOT = registerItem("hiduminium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HINDALIUM_INGOT = registerItem("hindalium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HYDRONALIUM_INGOT = registerItem("hydronalium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ITALMA_INGOT = registerItem("italma_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MAGNALIUM_INGOT = registerItem("magnalium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NAMBE_INGOT = registerItem("nambe_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NITIAL_INGOT = registerItem("nitial_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SILUMIN_INGOT = registerItem("silumin_ingot",
            new Item(new FabricItemSettings()));
    public static final Item YALLOY_INGOT = registerItem("yalloy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item LOCKALLOY_INGOT = registerItem("lockalloy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BISMANOL_INGOT = registerItem("bismanol_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CERROSAFE_INGOT = registerItem("cerrosafe_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ROSEMETAL_INGOT = registerItem("rosemetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item WOODSMETAL_INGOT = registerItem("woodsmetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CHROMHYD_INGOT = registerItem("chromhyd_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CRNIWTI_INGOT = registerItem("crniwti_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERROCHROME_INGOT = registerItem("ferrochrome_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NICHROME_INGOT = registerItem("nichrome_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ELGILOY_INGOT = registerItem("elgiloy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MEGALLIUM_INGOT = registerItem("megallium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item STELLITE_INGOT = registerItem("stellite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TALONITE_INGOT = registerItem("talonite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ULTIMET_INGOT = registerItem("ultimet_ingot",
            new Item(new FabricItemSettings()));
    public static final Item VITALLIUM_INGOT = registerItem("vitallium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ALUBRO_INGOT = registerItem("alubro_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ARSBRO_INGOT = registerItem("arsbro_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ARSCOP_INGOT = registerItem("arscop_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BELLMETAL_INGOT = registerItem("bellmetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BERYLCOPPER_INGOT = registerItem("berylcopper_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BILLON_INGOT = registerItem("billon_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BRASS_INGOT = registerItem("brass_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CALAMINE_INGOT = registerItem("calamine_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CHISIL_INGOT = registerItem("chisil_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CUNIFE_INGOT = registerItem("cunife_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CONSTANTAN_INGOT = registerItem("constantan_ingot",
            new Item(new FabricItemSettings()));
    public static final Item COPHYD_INGOT = registerItem("cophyd_ingot",
            new Item(new FabricItemSettings()));
    public static final Item COPTUNG_INGOT = registerItem("coptung_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CORINTHIAN_INGOT = registerItem("corinthian_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CUPRONICKEL_INGOT = registerItem("cupronickel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CUSIL_INGOT = registerItem("cusil_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CYMBAL_INGOT = registerItem("cymbal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item DEVARDA_INGOT = registerItem("devarda_ingot",
            new Item(new FabricItemSettings()));
    public static final Item DUTCHMETAL_INGOT = registerItem("dutchmetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FLORENTINE_INGOT = registerItem("florentine_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GILDMETAL_INGOT = registerItem("gildmetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GLUCYDUR_INGOT = registerItem("glucydur_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GUANIN_INGOT = registerItem("guanin_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GUNMETAL_INGOT = registerItem("gunmetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HEPATIZON_INGOT = registerItem("hepatizon_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MANGANIN_INGOT = registerItem("manganin_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MELCHIOR_INGOT = registerItem("melchior_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MUNTZ_INGOT = registerItem("muntzmetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NICKSILVER_INGOT = registerItem("nicksilver_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NORDIC_INGOT = registerItem("nordic_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ORMOLU_INGOT = registerItem("ormolu_ingot",
            new Item(new FabricItemSettings()));
    public static final Item PINCHBECK_INGOT = registerItem("pinchbeck_ingot",
            new Item(new FabricItemSettings()));
    public static final Item PRINCEMETAL_INGOT = registerItem("princemetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item PHOSPHOR_INGOT = registerItem("phosphor_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SHAKUDO_INGOT = registerItem("shakudo_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SILBRO_INGOT = registerItem("silbro_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SPECULUM_INGOT = registerItem("speculum_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TOMBAC_INGOT = registerItem("tombac_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TUMBAGA_INGOT = registerItem("tumbaga_ingot",
            new Item(new FabricItemSettings()));
    public static final Item WHIBRO_INGOT = registerItem("whibro_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ALGA_INGOT = registerItem("alga_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GALFENOL_INGOT = registerItem("galfenol_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GALINSTAN_INGOT = registerItem("galinstan_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ANTANIUM_INGOT = registerItem("antanium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item COLORGOLD_INGOT = registerItem("colorgold_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CROWNGOLD_INGOT = registerItem("crowngold_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RHODITE_INGOT = registerItem("rhodite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ROSEGOLD_INGOT = registerItem("rosegold_ingot",
            new Item(new FabricItemSettings()));
    public static final Item WHITEGOLD_INGOT = registerItem("whitegold_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FIELDSMETAL_INGOT = registerItem("fieldsmetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ELINVAR_INGOT = registerItem("elinvar_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERNICO_INGOT = registerItem("fernico_ingot",
            new Item(new FabricItemSettings()));
    public static final Item INVAR_INGOT = registerItem("invar_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CASTIRON_INGOT = registerItem("castiron_ingot",
            new Item(new FabricItemSettings()));
    public static final Item PIGIRON_INGOT = registerItem("pigiron_ingot",
            new Item(new FabricItemSettings()));
    public static final Item IROHYD_INGOT = registerItem("irohyd_ingot",
            new Item(new FabricItemSettings()));
    public static final Item KANTHAL_INGOT = registerItem("kanthal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item KOVAR_INGOT = registerItem("kovar_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SPIEGEL_INGOT = registerItem("spiegel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item STABALLOY_INGOT = registerItem("staballoy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BULAT_INGOT = registerItem("bulat_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CHROMOLY_INGOT = registerItem("chromoly_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CRUCIBLE_INGOT = registerItem("crucible_ingot",
            new Item(new FabricItemSettings()));
    public static final Item DAMASCUS_INGOT = registerItem("damascus_ingot",
            new Item(new FabricItemSettings()));
    public static final Item DUCOL_INGOT = registerItem("ducol_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HADFIELD_INGOT = registerItem("hadfield_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HIGHSPEED_INGOT = registerItem("highspeed_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HSLA_INGOT = registerItem("hsla_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MARAGING_INGOT = registerItem("maraging_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MUSHET_INGOT = registerItem("mushet_ingot",
            new Item(new FabricItemSettings()));
    public static final Item REYNOLDS_INGOT = registerItem("reynolds_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SILISTEEL_INGOT = registerItem("silisteel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SPRINGSTEEL_INGOT = registerItem("springsteel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item STAINLESS_INGOT = registerItem("stainless_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TOOLSTEEL_INGOT = registerItem("toolsteel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item WEATHERING_INGOT = registerItem("weathering_ingot",
            new Item(new FabricItemSettings()));
    public static final Item WOOTZ_INGOT = registerItem("wootz_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MOLYBDOCHALKOS_INGOT = registerItem("molybdochalkos_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SOLDER_INGOT = registerItem("solder_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TERNE_INGOT = registerItem("terne_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TYPEMETAL_INGOT = registerItem("typemetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ELEKTRON_INGOT = registerItem("elektron_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MAGNOX_INGOT = registerItem("magnox_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TMGALZN_INGOT = registerItem("tmgalzn_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MNFZ_INGOT = registerItem("mnfz_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MNSZ_INGOT = registerItem("mnsz_ingot",
            new Item(new FabricItemSettings()));
    public static final Item AMALGAM_INGOT = registerItem("amalgam_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ASHTADHATU_INGOT = registerItem("ashtadhatu_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ALUMEL_INGOT = registerItem("alumel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BRIGHTRAY_INGOT = registerItem("brightray_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CHROMEL_INGOT = registerItem("chromel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GERSIL_INGOT = registerItem("gersil_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HASTELLOY_INGOT = registerItem("hastelloy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item INCONEL_INGOT = registerItem("inconel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item INCONELSES_INGOT = registerItem("inconelses_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MONEL_INGOT = registerItem("monel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NICKCARB_INGOT = registerItem("nickcarb_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NICROSIL_INGOT = registerItem("nicrosil_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NIMONIC_INGOT = registerItem("nimonic_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NISIL_INGOT = registerItem("nisil_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NITINOL_INGOT = registerItem("nitinol_ingot",
            new Item(new FabricItemSettings()));
    public static final Item MUMETAL_INGOT = registerItem("mumetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item PERMALLOY_INGOT = registerItem("permalloy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SUPERMALLOY_INGOT = registerItem("supermalloy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NICHYD_INGOT = registerItem("nichyd_ingot",
            new Item(new FabricItemSettings()));
    public static final Item COINSILVER_INGOT = registerItem("coinsilver_ingot",
            new Item(new FabricItemSettings()));
    public static final Item KLI_INGOT = registerItem("kli_ingot",
            new Item(new FabricItemSettings()));
    public static final Item NAK_INGOT = registerItem("nak_ingot",
            new Item(new FabricItemSettings()));
    public static final Item PSEUDO_INGOT = registerItem("pseudo_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SCANHYD_INGOT = registerItem("scanhyd_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ARGSTERSIL_INGOT = registerItem("argstersil_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BRITSIL_INGOT = registerItem("britsil_ingot",
            new Item(new FabricItemSettings()));
    public static final Item DORE_INGOT = registerItem("dore_ingot",
            new Item(new FabricItemSettings()));
    public static final Item DYMALLOY_INGOT = registerItem("dymalloy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GOLOID_INGOT = registerItem("goloid_ingot",
            new Item(new FabricItemSettings()));
    public static final Item PLATSTER_INGOT = registerItem("platster_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SHIBUICHI_INGOT = registerItem("shibuichi_ingot",
            new Item(new FabricItemSettings()));
    public static final Item STERLING_INGOT = registerItem("sterling_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TIBETSIL_INGOT = registerItem("tibetsil_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SALFV_INGOT = registerItem("salfv_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BETAC_INGOT = registerItem("betac_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GUMMETAL_INGOT = registerItem("gummetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TITANHYD_INGOT = registerItem("titanhyd_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TITANNIT_INGOT = registerItem("titannit_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TITANGOLD_INGOT = registerItem("titangold_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BABBITT_INGOT = registerItem("babbitt_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BRITANNIUM_INGOT = registerItem("britannium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item PEWTER_INGOT = registerItem("pewter_ingot",
            new Item(new FabricItemSettings()));
    public static final Item QUEENS_INGOT = registerItem("queens_ingot",
            new Item(new FabricItemSettings()));
    public static final Item WHIMETAL_INGOT = registerItem("whimetal_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ZAMAK_INGOT = registerItem("zamak_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ZIRCALOY_INGOT = registerItem("zircaloy_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HAUSLER_INGOT = registerItem("hausler_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ANTHRACITE_INGOT = registerItem("anthracite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item WROUGHT_INGOT = registerItem("wrought_ingot",
            new Item(new FabricItemSettings()));
    public static final Item COPNIC_INGOT = registerItem("copnic_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SILSTEEL_INGOT = registerItem("silsteel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERROMAGNES_INGOT = registerItem("ferromagnes_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERROMANGA_INGOT = registerItem("ferromanga_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERROMOLYBD_INGOT = registerItem("ferromolybd_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERRONICKEL_INGOT = registerItem("ferronickel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERROPHOSPHORUS_INGOT = registerItem("ferrophosphorus_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERROSILICON_INGOT = registerItem("ferrosilicon_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERROTITANIUM_INGOT = registerItem("ferrotitanium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FERROVANADIUM_INGOT = registerItem("ferrovanadium_ingot",
            new Item(new FabricItemSettings()));

    //Alloy - Nuggets
    public static final Item AA_NUGGET = registerItem("aa_nugget", new Item( new FabricItemSettings()));
    public static final Item AILI_NUGGET = registerItem("aili_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ALNICO_NUGGET = registerItem("alnico_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ALUSCA_NUGGET = registerItem("alusca_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BIRMA_NUGGET = registerItem("birma_nugget",
            new Item(new FabricItemSettings()));
    public static final Item DURALUMIN_NUGGET = registerItem("duralumin_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HIDUMINIUM_NUGGET = registerItem("hiduminium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HINDALIUM_NUGGET = registerItem("hindalium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HYDRONALIUM_NUGGET = registerItem("hydronalium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ITALMA_NUGGET = registerItem("italma_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MAGNALIUM_NUGGET = registerItem("magnalium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NAMBE_NUGGET = registerItem("nambe_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NITIAL_NUGGET = registerItem("nitial_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SILUMIN_NUGGET = registerItem("silumin_nugget",
            new Item(new FabricItemSettings()));
    public static final Item YALLOY_NUGGET = registerItem("yalloy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item LOCKALLOY_NUGGET = registerItem("lockalloy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BISMANOL_NUGGET = registerItem("bismanol_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CERROSAFE_NUGGET = registerItem("cerrosafe_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ROSEMETAL_NUGGET = registerItem("rosemetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item WOODSMETAL_NUGGET = registerItem("woodsmetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CHROMHYD_NUGGET = registerItem("chromhyd_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CRNIWTI_NUGGET = registerItem("crniwti_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERROCHROME_NUGGET = registerItem("ferrochrome_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NICHROME_NUGGET = registerItem("nichrome_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ELGILOY_NUGGET = registerItem("elgiloy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MEGALLIUM_NUGGET = registerItem("megallium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item STELLITE_NUGGET = registerItem("stellite_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TALONITE_NUGGET = registerItem("talonite_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ULTIMET_NUGGET = registerItem("ultimet_nugget",
            new Item(new FabricItemSettings()));
    public static final Item VITALLIUM_NUGGET = registerItem("vitallium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ALUBRO_NUGGET = registerItem("alubro_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ARSBRO_NUGGET = registerItem("arsbro_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ARSCOP_NUGGET = registerItem("arscop_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BELLMETAL_NUGGET = registerItem("bellmetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BERYLCOPPER_NUGGET = registerItem("berylcopper_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BILLON_NUGGET = registerItem("billon_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BRASS_NUGGET = registerItem("brass_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CALAMINE_NUGGET = registerItem("calamine_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CHISIL_NUGGET = registerItem("chisil_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CUNIFE_NUGGET = registerItem("cunife_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CONSTANTAN_NUGGET = registerItem("constantan_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COPHYD_NUGGET = registerItem("cophyd_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COPTUNG_NUGGET = registerItem("coptung_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CORINTHIAN_NUGGET = registerItem("corinthian_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CUPRONICKEL_NUGGET = registerItem("cupronickel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CUSIL_NUGGET = registerItem("cusil_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CYMBAL_NUGGET = registerItem("cymbal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item DEVARDA_NUGGET = registerItem("devarda_nugget",
            new Item(new FabricItemSettings()));
    public static final Item DUTCHMETAL_NUGGET = registerItem("dutchmetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FLORENTINE_NUGGET = registerItem("florentine_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GILDMETAL_NUGGET = registerItem("gildmetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GLUCYDUR_NUGGET = registerItem("glucydur_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GUANIN_NUGGET = registerItem("guanin_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GUNMETAL_NUGGET = registerItem("gunmetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HEPATIZON_NUGGET = registerItem("hepatizon_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MANGANIN_NUGGET = registerItem("manganin_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MELCHIOR_NUGGET = registerItem("melchior_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MUNTZ_NUGGET = registerItem("muntzmetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NICKSILVER_NUGGET = registerItem("nicksilver_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NORDIC_NUGGET = registerItem("nordic_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ORMOLU_NUGGET = registerItem("ormolu_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PINCHBECK_NUGGET = registerItem("pinchbeck_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PRINCEMETAL_NUGGET = registerItem("princemetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PHOSPHOR_NUGGET = registerItem("phosphor_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SHAKUDO_NUGGET = registerItem("shakudo_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SILBRO_NUGGET = registerItem("silbro_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SPECULUM_NUGGET = registerItem("speculum_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TOMBAC_NUGGET = registerItem("tombac_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TUMBAGA_NUGGET = registerItem("tumbaga_nugget",
            new Item(new FabricItemSettings()));
    public static final Item WHIBRO_NUGGET = registerItem("whibro_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ALGA_NUGGET = registerItem("alga_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GALFENOL_NUGGET = registerItem("galfenol_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GALINSTAN_NUGGET = registerItem("galinstan_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ANTANIUM_NUGGET = registerItem("antanium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COLORGOLD_NUGGET = registerItem("colorgold_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CROWNGOLD_NUGGET = registerItem("crowngold_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_NUGGET = registerItem("electrum_nugget",
            new Item(new FabricItemSettings()));
    public static final Item RHODITE_NUGGET = registerItem("rhodite_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ROSEGOLD_NUGGET = registerItem("rosegold_nugget",
            new Item(new FabricItemSettings()));
    public static final Item WHITEGOLD_NUGGET = registerItem("whitegold_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FIELDSMETAL_NUGGET = registerItem("fieldsmetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ELINVAR_NUGGET = registerItem("elinvar_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERNICO_NUGGET = registerItem("fernico_nugget",
            new Item(new FabricItemSettings()));
    public static final Item INVAR_NUGGET = registerItem("invar_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CASTIRON_NUGGET = registerItem("castiron_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PIGIRON_NUGGET = registerItem("pigiron_nugget",
            new Item(new FabricItemSettings()));
    public static final Item IROHYD_NUGGET = registerItem("irohyd_nugget",
            new Item(new FabricItemSettings()));
    public static final Item KANTHAL_NUGGET = registerItem("kanthal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item KOVAR_NUGGET = registerItem("kovar_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SPIEGEL_NUGGET = registerItem("spiegel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item STABALLOY_NUGGET = registerItem("staballoy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BULAT_NUGGET = registerItem("bulat_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CHROMOLY_NUGGET = registerItem("chromoly_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CRUCIBLE_NUGGET = registerItem("crucible_nugget",
            new Item(new FabricItemSettings()));
    public static final Item DAMASCUS_NUGGET = registerItem("damascus_nugget",
            new Item(new FabricItemSettings()));
    public static final Item DUCOL_NUGGET = registerItem("ducol_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HADFIELD_NUGGET = registerItem("hadfield_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HIGHSPEED_NUGGET = registerItem("highspeed_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HSLA_NUGGET = registerItem("hsla_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MARAGING_NUGGET = registerItem("maraging_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MUSHET_NUGGET = registerItem("mushet_nugget",
            new Item(new FabricItemSettings()));
    public static final Item REYNOLDS_NUGGET = registerItem("reynolds_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SILISTEEL_NUGGET = registerItem("silisteel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SPRINGSTEEL_NUGGET = registerItem("springsteel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item STAINLESS_NUGGET = registerItem("stainless_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TOOLSTEEL_NUGGET = registerItem("toolsteel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item WEATHERING_NUGGET = registerItem("weathering_nugget",
            new Item(new FabricItemSettings()));
    public static final Item WOOTZ_NUGGET = registerItem("wootz_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MOLYBDOCHALKOS_NUGGET = registerItem("molybdochalkos_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SOLDER_NUGGET = registerItem("solder_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TERNE_NUGGET = registerItem("terne_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TYPEMETAL_NUGGET = registerItem("typemetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ELEKTRON_NUGGET = registerItem("elektron_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MAGNOX_NUGGET = registerItem("magnox_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TMGALZN_NUGGET = registerItem("tmgalzn_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MNFZ_NUGGET = registerItem("mnfz_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MNSZ_NUGGET = registerItem("mnsz_nugget",
            new Item(new FabricItemSettings()));
    public static final Item AMALGAM_NUGGET = registerItem("amalgam_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ASHTADHATU_NUGGET = registerItem("ashtadhatu_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ALUMEL_NUGGET = registerItem("alumel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BRIGHTRAY_NUGGET = registerItem("brightray_nugget",
            new Item(new FabricItemSettings()));
    public static final Item CHROMEL_NUGGET = registerItem("chromel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GERSIL_NUGGET = registerItem("gersil_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HASTELLOY_NUGGET = registerItem("hastelloy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item INCONEL_NUGGET = registerItem("inconel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item INCONELSES_NUGGET = registerItem("inconelses_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MONEL_NUGGET = registerItem("monel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NICKCARB_NUGGET = registerItem("nickcarb_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NICROSIL_NUGGET = registerItem("nicrosil_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NIMONIC_NUGGET = registerItem("nimonic_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NISIL_NUGGET = registerItem("nisil_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NITINOL_NUGGET = registerItem("nitinol_nugget",
            new Item(new FabricItemSettings()));
    public static final Item MUMETAL_NUGGET = registerItem("mumetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PERMALLOY_NUGGET = registerItem("permalloy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SUPERMALLOY_NUGGET = registerItem("supermalloy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NICHYD_NUGGET = registerItem("nichyd_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COINSILVER_NUGGET = registerItem("coinsilver_nugget",
            new Item(new FabricItemSettings()));
    public static final Item KLI_NUGGET = registerItem("kli_nugget",
            new Item(new FabricItemSettings()));
    public static final Item NAK_NUGGET = registerItem("nak_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PSEUDO_NUGGET = registerItem("pseudo_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SCANHYD_NUGGET = registerItem("scanhyd_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ARGSTERSIL_NUGGET = registerItem("argstersil_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BRITSIL_NUGGET = registerItem("britsil_nugget",
            new Item(new FabricItemSettings()));
    public static final Item DORE_NUGGET = registerItem("dore_nugget",
            new Item(new FabricItemSettings()));
    public static final Item DYMALLOY_NUGGET = registerItem("dymalloy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GOLOID_NUGGET = registerItem("goloid_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PLATSTER_NUGGET = registerItem("platster_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SHIBUICHI_NUGGET = registerItem("shibuichi_nugget",
            new Item(new FabricItemSettings()));
    public static final Item STERLING_NUGGET = registerItem("sterling_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TIBETSIL_NUGGET = registerItem("tibetsil_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SALFV_NUGGET = registerItem("salfv_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BETAC_NUGGET = registerItem("betac_nugget",
            new Item(new FabricItemSettings()));
    public static final Item GUMMETAL_NUGGET = registerItem("gummetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TITANHYD_NUGGET = registerItem("titanhyd_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TITANNIT_NUGGET = registerItem("titannit_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TITANGOLD_NUGGET = registerItem("titangold_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BABBITT_NUGGET = registerItem("babbitt_nugget",
            new Item(new FabricItemSettings()));
    public static final Item BRITANNIUM_NUGGET = registerItem("britannium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PEWTER_NUGGET = registerItem("pewter_nugget",
            new Item(new FabricItemSettings()));
    public static final Item QUEENS_NUGGET = registerItem("queens_nugget",
            new Item(new FabricItemSettings()));
    public static final Item WHIMETAL_NUGGET = registerItem("whimetal_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ZAMAK_NUGGET = registerItem("zamak_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ZIRCALOY_NUGGET = registerItem("zircaloy_nugget",
            new Item(new FabricItemSettings()));
    public static final Item HAUSLER_NUGGET = registerItem("hausler_nugget",
            new Item(new FabricItemSettings()));
    public static final Item ANTHRACITE_NUGGET = registerItem("anthracite_nugget",
            new Item(new FabricItemSettings()));
    public static final Item WROUGHT_NUGGET = registerItem("wrought_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COPNIC_NUGGET = registerItem("copnic_nugget",
            new Item(new FabricItemSettings()));
    public static final Item SILSTEEL_NUGGET = registerItem("silsteel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERROMAGNES_NUGGET = registerItem("ferromagnes_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERROMANGA_NUGGET = registerItem("ferromanga_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERROMOLYBD_NUGGET = registerItem("ferromolybd_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERRONICKEL_NUGGET = registerItem("ferronickel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERROPHOSPHORUS_NUGGET = registerItem("ferrophosphorus_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERROSILICON_NUGGET = registerItem("ferrosilicon_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERROTITANIUM_NUGGET = registerItem("ferrotitanium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item FERROVANADIUM_NUGGET = registerItem("ferrovanadium_nugget",
            new Item(new FabricItemSettings()));

    //Alloy - Dust
    public static final Item AA_DUST = registerItem("aa_dust",
            new Item( new FabricItemSettings()));
    public static final Item AILI_DUST = registerItem("aili_dust",
            new Item(new FabricItemSettings()));
    public static final Item ALNICO_DUST = registerItem("alnico_dust",
            new Item(new FabricItemSettings()));
    public static final Item ALUSCA_DUST = registerItem("alusca_dust",
            new Item(new FabricItemSettings()));
    public static final Item BIRMA_DUST = registerItem("birma_dust",
            new Item(new FabricItemSettings()));
    public static final Item DURALUMIN_DUST = registerItem("duralumin_dust",
            new Item(new FabricItemSettings()));
    public static final Item HIDUMINIUM_DUST = registerItem("hiduminium_dust",
            new Item(new FabricItemSettings()));
    public static final Item HINDALIUM_DUST = registerItem("hindalium_dust",
            new Item(new FabricItemSettings()));
    public static final Item HYDRONALIUM_DUST = registerItem("hydronalium_dust",
            new Item(new FabricItemSettings()));
    public static final Item ITALMA_DUST = registerItem("italma_dust",
            new Item(new FabricItemSettings()));
    public static final Item MAGNALIUM_DUST = registerItem("magnalium_dust",
            new Item(new FabricItemSettings()));
    public static final Item NAMBE_DUST = registerItem("nambe_dust",
            new Item(new FabricItemSettings()));
    public static final Item NITIAL_DUST = registerItem("nitial_dust",
            new Item(new FabricItemSettings()));
    public static final Item SILUMIN_DUST = registerItem("silumin_dust",
            new Item(new FabricItemSettings()));
    public static final Item YALLOY_DUST = registerItem("yalloy_dust",
            new Item(new FabricItemSettings()));
    public static final Item LOCKALLOY_DUST = registerItem("lockalloy_dust",
            new Item(new FabricItemSettings()));
    public static final Item BISMANOL_DUST = registerItem("bismanol_dust",
            new Item(new FabricItemSettings()));
    public static final Item CERROSAFE_DUST = registerItem("cerrosafe_dust",
            new Item(new FabricItemSettings()));
    public static final Item ROSEMETAL_DUST = registerItem("rosemetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item WOODSMETAL_DUST = registerItem("woodsmetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item CHROMHYD_DUST = registerItem("chromhyd_dust",
            new Item(new FabricItemSettings()));
    public static final Item CRNIWTI_DUST = registerItem("crniwti_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERROCHROME_DUST = registerItem("ferrochrome_dust",
            new Item(new FabricItemSettings()));
    public static final Item NICHROME_DUST = registerItem("nichrome_dust",
            new Item(new FabricItemSettings()));
    public static final Item ELGILOY_DUST = registerItem("elgiloy_dust",
            new Item(new FabricItemSettings()));
    public static final Item MEGALLIUM_DUST = registerItem("megallium_dust",
            new Item(new FabricItemSettings()));
    public static final Item STELLITE_DUST = registerItem("stellite_dust",
            new Item(new FabricItemSettings()));
    public static final Item TALONITE_DUST = registerItem("talonite_dust",
            new Item(new FabricItemSettings()));
    public static final Item ULTIMET_DUST = registerItem("ultimet_dust",
            new Item(new FabricItemSettings()));
    public static final Item VITALLIUM_DUST = registerItem("vitallium_dust",
            new Item(new FabricItemSettings()));
    public static final Item ALUBRO_DUST = registerItem("alubro_dust",
            new Item(new FabricItemSettings()));
    public static final Item ARSBRO_DUST = registerItem("arsbro_dust",
            new Item(new FabricItemSettings()));
    public static final Item ARSCOP_DUST = registerItem("arscop_dust",
            new Item(new FabricItemSettings()));
    public static final Item BELLMETAL_DUST = registerItem("bellmetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item BERYLCOPPER_DUST = registerItem("berylcopper_dust",
            new Item(new FabricItemSettings()));
    public static final Item BILLON_DUST = registerItem("billon_dust",
            new Item(new FabricItemSettings()));
    public static final Item BRASS_DUST = registerItem("brass_dust",
            new Item(new FabricItemSettings()));
    public static final Item BRONZE_DUST = registerItem("bronze_dust",
            new Item(new FabricItemSettings()));
    public static final Item CALAMINE_DUST = registerItem("calamine_dust",
            new Item(new FabricItemSettings()));
    public static final Item CHISIL_DUST = registerItem("chisil_dust",
            new Item(new FabricItemSettings()));
    public static final Item CUNIFE_DUST = registerItem("cunife_dust",
            new Item(new FabricItemSettings()));
    public static final Item CONSTANTAN_DUST = registerItem("constantan_dust",
            new Item(new FabricItemSettings()));
    public static final Item COPHYD_DUST = registerItem("cophyd_dust",
            new Item(new FabricItemSettings()));
    public static final Item COPTUNG_DUST = registerItem("coptung_dust",
            new Item(new FabricItemSettings()));
    public static final Item CORINTHIAN_DUST = registerItem("corinthian_dust",
            new Item(new FabricItemSettings()));
    public static final Item CUPRONICKEL_DUST = registerItem("cupronickel_dust",
            new Item(new FabricItemSettings()));
    public static final Item CUSIL_DUST = registerItem("cusil_dust",
            new Item(new FabricItemSettings()));
    public static final Item CYMBAL_DUST = registerItem("cymbal_dust",
            new Item(new FabricItemSettings()));
    public static final Item DEVARDA_DUST = registerItem("devarda_dust",
            new Item(new FabricItemSettings()));
    public static final Item DUTCHMETAL_DUST = registerItem("dutchmetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item FLORENTINE_DUST = registerItem("florentine_dust",
            new Item(new FabricItemSettings()));
    public static final Item GILDMETAL_DUST = registerItem("gildmetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item GLUCYDUR_DUST = registerItem("glucydur_dust",
            new Item(new FabricItemSettings()));
    public static final Item GUANIN_DUST = registerItem("guanin_dust",
            new Item(new FabricItemSettings()));
    public static final Item GUNMETAL_DUST = registerItem("gunmetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item HEPATIZON_DUST = registerItem("hepatizon_dust",
            new Item(new FabricItemSettings()));
    public static final Item MANGANIN_DUST = registerItem("manganin_dust",
            new Item(new FabricItemSettings()));
    public static final Item MELCHIOR_DUST = registerItem("melchior_dust",
            new Item(new FabricItemSettings()));
    public static final Item MUNTZ_DUST = registerItem("muntzmetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item NICKSILVER_DUST = registerItem("nicksilver_dust",
            new Item(new FabricItemSettings()));
    public static final Item NORDIC_DUST = registerItem("nordic_dust",
            new Item(new FabricItemSettings()));
    public static final Item ORMOLU_DUST = registerItem("ormolu_dust",
            new Item(new FabricItemSettings()));
    public static final Item PINCHBECK_DUST = registerItem("pinchbeck_dust",
            new Item(new FabricItemSettings()));
    public static final Item PRINCEMETAL_DUST = registerItem("princemetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item PHOSPHOR_DUST = registerItem("phosphor_dust",
            new Item(new FabricItemSettings()));
    public static final Item SHAKUDO_DUST = registerItem("shakudo_dust",
            new Item(new FabricItemSettings()));
    public static final Item SILBRO_DUST = registerItem("silbro_dust",
            new Item(new FabricItemSettings()));
    public static final Item SPECULUM_DUST = registerItem("speculum_dust",
            new Item(new FabricItemSettings()));
    public static final Item TOMBAC_DUST = registerItem("tombac_dust",
            new Item(new FabricItemSettings()));
    public static final Item TUMBAGA_DUST = registerItem("tumbaga_dust",
            new Item(new FabricItemSettings()));
    public static final Item WHIBRO_DUST = registerItem("whibro_dust",
            new Item(new FabricItemSettings()));
    public static final Item ALGA_DUST = registerItem("alga_dust",
            new Item(new FabricItemSettings()));
    public static final Item GALFENOL_DUST = registerItem("galfenol_dust",
            new Item(new FabricItemSettings()));
    public static final Item GALINSTAN_DUST = registerItem("galinstan_dust",
            new Item(new FabricItemSettings()));
    public static final Item ANTANIUM_DUST = registerItem("antanium_dust",
            new Item(new FabricItemSettings()));
    public static final Item COLORGOLD_DUST = registerItem("colorgold_dust",
            new Item(new FabricItemSettings()));
    public static final Item CROWNGOLD_DUST = registerItem("crowngold_dust",
            new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_DUST = registerItem("electrum_dust",
            new Item(new FabricItemSettings()));
    public static final Item RHODITE_DUST = registerItem("rhodite_dust",
            new Item(new FabricItemSettings()));
    public static final Item ROSEGOLD_DUST = registerItem("rosegold_dust",
            new Item(new FabricItemSettings()));
    public static final Item WHITEGOLD_DUST = registerItem("whitegold_dust",
            new Item(new FabricItemSettings()));
    public static final Item FIELDSMETAL_DUST = registerItem("fieldsmetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item ELINVAR_DUST = registerItem("elinvar_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERNICO_DUST = registerItem("fernico_dust",
            new Item(new FabricItemSettings()));
    public static final Item INVAR_DUST = registerItem("invar_dust",
            new Item(new FabricItemSettings()));
    public static final Item CASTIRON_DUST = registerItem("castiron_dust",
            new Item(new FabricItemSettings()));
    public static final Item PIGIRON_DUST = registerItem("pigiron_dust",
            new Item(new FabricItemSettings()));
    public static final Item IROHYD_DUST = registerItem("irohyd_dust",
            new Item(new FabricItemSettings()));
    public static final Item KANTHAL_DUST = registerItem("kanthal_dust",
            new Item(new FabricItemSettings()));
    public static final Item KOVAR_DUST = registerItem("kovar_dust",
            new Item(new FabricItemSettings()));
    public static final Item SPIEGEL_DUST = registerItem("spiegel_dust",
            new Item(new FabricItemSettings()));
    public static final Item STABALLOY_DUST = registerItem("staballoy_dust",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_DUST = registerItem("steel_dust",
            new Item(new FabricItemSettings()));
    public static final Item BULAT_DUST = registerItem("bulat_dust",
            new Item(new FabricItemSettings()));
    public static final Item CHROMOLY_DUST = registerItem("chromoly_dust",
            new Item(new FabricItemSettings()));
    public static final Item CRUCIBLE_DUST = registerItem("crucible_dust",
            new Item(new FabricItemSettings()));
    public static final Item DAMASCUS_DUST = registerItem("damascus_dust",
            new Item(new FabricItemSettings()));
    public static final Item DUCOL_DUST = registerItem("ducol_dust",
            new Item(new FabricItemSettings()));
    public static final Item HADFIELD_DUST = registerItem("hadfield_dust",
            new Item(new FabricItemSettings()));
    public static final Item HIGHSPEED_DUST = registerItem("highspeed_dust",
            new Item(new FabricItemSettings()));
    public static final Item HSLA_DUST = registerItem("hsla_dust",
            new Item(new FabricItemSettings()));
    public static final Item MARAGING_DUST = registerItem("maraging_dust",
            new Item(new FabricItemSettings()));
    public static final Item MUSHET_DUST = registerItem("mushet_dust",
            new Item(new FabricItemSettings()));
    public static final Item REYNOLDS_DUST = registerItem("reynolds_dust",
            new Item(new FabricItemSettings()));
    public static final Item SILISTEEL_DUST = registerItem("silisteel_dust",
            new Item(new FabricItemSettings()));
    public static final Item SPRINGSTEEL_DUST = registerItem("springsteel_dust",
            new Item(new FabricItemSettings()));
    public static final Item STAINLESS_DUST = registerItem("stainless_dust",
            new Item(new FabricItemSettings()));
    public static final Item TOOLSTEEL_DUST = registerItem("toolsteel_dust",
            new Item(new FabricItemSettings()));
    public static final Item WEATHERING_DUST = registerItem("weathering_dust",
            new Item(new FabricItemSettings()));
    public static final Item WOOTZ_DUST = registerItem("wootz_dust",
            new Item(new FabricItemSettings()));
    public static final Item MOLYBDOCHALKOS_DUST = registerItem("molybdochalkos_dust",
            new Item(new FabricItemSettings()));
    public static final Item SOLDER_DUST = registerItem("solder_dust",
            new Item(new FabricItemSettings()));
    public static final Item TERNE_DUST = registerItem("terne_dust",
            new Item(new FabricItemSettings()));
    public static final Item TYPEMETAL_DUST = registerItem("typemetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item ELEKTRON_DUST = registerItem("elektron_dust",
            new Item(new FabricItemSettings()));
    public static final Item MAGNOX_DUST = registerItem("magnox_dust",
            new Item(new FabricItemSettings()));
    public static final Item TMGALZN_DUST = registerItem("tmgalzn_dust",
            new Item(new FabricItemSettings()));
    public static final Item MNFZ_DUST = registerItem("mnfz_dust",
            new Item(new FabricItemSettings()));
    public static final Item MNSZ_DUST = registerItem("mnsz_dust",
            new Item(new FabricItemSettings()));
    public static final Item AMALGAM_DUST = registerItem("amalgam_dust",
            new Item(new FabricItemSettings()));
    public static final Item ASHTADHATU_DUST = registerItem("ashtadhatu_dust",
            new Item(new FabricItemSettings()));
    public static final Item ALUMEL_DUST = registerItem("alumel_dust",
            new Item(new FabricItemSettings()));
    public static final Item BRIGHTRAY_DUST = registerItem("brightray_dust",
            new Item(new FabricItemSettings()));
    public static final Item CHROMEL_DUST = registerItem("chromel_dust",
            new Item(new FabricItemSettings()));
    public static final Item GERSIL_DUST = registerItem("gersil_dust",
            new Item(new FabricItemSettings()));
    public static final Item HASTELLOY_DUST = registerItem("hastelloy_dust",
            new Item(new FabricItemSettings()));
    public static final Item INCONEL_DUST = registerItem("inconel_dust",
            new Item(new FabricItemSettings()));
    public static final Item INCONELSES_DUST = registerItem("inconelses_dust",
            new Item(new FabricItemSettings()));
    public static final Item MONEL_DUST = registerItem("monel_dust",
            new Item(new FabricItemSettings()));
    public static final Item NICKCARB_DUST = registerItem("nickcarb_dust",
            new Item(new FabricItemSettings()));
    public static final Item NICROSIL_DUST = registerItem("nicrosil_dust",
            new Item(new FabricItemSettings()));
    public static final Item NIMONIC_DUST = registerItem("nimonic_dust",
            new Item(new FabricItemSettings()));
    public static final Item NISIL_DUST = registerItem("nisil_dust",
            new Item(new FabricItemSettings()));
    public static final Item NITINOL_DUST = registerItem("nitinol_dust",
            new Item(new FabricItemSettings()));
    public static final Item MUMETAL_DUST = registerItem("mumetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item PERMALLOY_DUST = registerItem("permalloy_dust",
            new Item(new FabricItemSettings()));
    public static final Item SUPERMALLOY_DUST = registerItem("supermalloy_dust",
            new Item(new FabricItemSettings()));
    public static final Item NICHYD_DUST = registerItem("nichyd_dust",
            new Item(new FabricItemSettings()));
    public static final Item COINSILVER_DUST = registerItem("coinsilver_dust",
            new Item(new FabricItemSettings()));
    public static final Item KLI_DUST = registerItem("kli_dust",
            new Item(new FabricItemSettings()));
    public static final Item NAK_DUST = registerItem("nak_dust",
            new Item(new FabricItemSettings()));
    public static final Item PSEUDO_DUST = registerItem("pseudo_dust",
            new Item(new FabricItemSettings()));
    public static final Item SCANHYD_DUST = registerItem("scanhyd_dust",
            new Item(new FabricItemSettings()));
    public static final Item ARGSTERSIL_DUST = registerItem("argstersil_dust",
            new Item(new FabricItemSettings()));
    public static final Item BRITSIL_DUST = registerItem("britsil_dust",
            new Item(new FabricItemSettings()));
    public static final Item DORE_DUST = registerItem("dore_dust",
            new Item(new FabricItemSettings()));
    public static final Item DYMALLOY_DUST = registerItem("dymalloy_dust",
            new Item(new FabricItemSettings()));
    public static final Item GOLOID_DUST = registerItem("goloid_dust",
            new Item(new FabricItemSettings()));
    public static final Item PLATSTER_DUST = registerItem("platster_dust",
            new Item(new FabricItemSettings()));
    public static final Item SHIBUICHI_DUST = registerItem("shibuichi_dust",
            new Item(new FabricItemSettings()));
    public static final Item STERLING_DUST = registerItem("sterling_dust",
            new Item(new FabricItemSettings()));
    public static final Item TIBETSIL_DUST = registerItem("tibetsil_dust",
            new Item(new FabricItemSettings()));
    public static final Item SALFV_DUST = registerItem("salfv_dust",
            new Item(new FabricItemSettings()));
    public static final Item BETAC_DUST = registerItem("betac_dust",
            new Item(new FabricItemSettings()));
    public static final Item GUMMETAL_DUST = registerItem("gummetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item TITANHYD_DUST = registerItem("titanhyd_dust",
            new Item(new FabricItemSettings()));
    public static final Item TITANNIT_DUST = registerItem("titannit_dust",
            new Item(new FabricItemSettings()));
    public static final Item TITANGOLD_DUST = registerItem("titangold_dust",
            new Item(new FabricItemSettings()));
    public static final Item BABBITT_DUST = registerItem("babbitt_dust",
            new Item(new FabricItemSettings()));
    public static final Item BRITANNIUM_DUST = registerItem("britannium_dust",
            new Item(new FabricItemSettings()));
    public static final Item PEWTER_DUST = registerItem("pewter_dust",
            new Item(new FabricItemSettings()));
    public static final Item QUEENS_DUST = registerItem("queens_dust",
            new Item(new FabricItemSettings()));
    public static final Item WHIMETAL_DUST = registerItem("whimetal_dust",
            new Item(new FabricItemSettings()));
    public static final Item ZAMAK_DUST = registerItem("zamak_dust",
            new Item(new FabricItemSettings()));
    public static final Item ZIRCALOY_DUST = registerItem("zircaloy_dust",
            new Item(new FabricItemSettings()));
    public static final Item HAUSLER_DUST = registerItem("hausler_dust",
            new Item(new FabricItemSettings()));
    public static final Item ANTHRACITE_DUST = registerItem("anthracite_dust",
            new Item(new FabricItemSettings()));
    public static final Item WROUGHT_DUST = registerItem("wrought_dust",
            new Item(new FabricItemSettings()));
    public static final Item COPNIC_DUST = registerItem("copnic_dust",
            new Item(new FabricItemSettings()));
    public static final Item SILSTEEL_DUST = registerItem("silsteel_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERROMAGNES_DUST = registerItem("ferromagnes_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERROMANGA_DUST = registerItem("ferromanga_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERROMOLYBD_DUST = registerItem("ferromolybd_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERRONICKEL_DUST = registerItem("ferronickel_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERROPHOSPHORUS_DUST = registerItem("ferrophosphorus_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERROSILICON_DUST = registerItem("ferrosilicon_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERROTITANIUM_DUST = registerItem("ferrotitanium_dust",
            new Item(new FabricItemSettings()));
    public static final Item FERROVANADIUM_DUST = registerItem("ferrovanadium_dust",
            new Item(new FabricItemSettings()));


    //Hoplology

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MegalosMetallurgy.MOD_ID, name), item);

    }

    public static void addItemsToItemGroup(){
        //Metallurgy - Raw
        addToItemGroup(ModItemGroup.METALLURGY, RAW_ALUMINIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_ANTIMONY);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_ARSENIC);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_BARIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_BERYLLIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_BISMUTH);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_CADMIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_CAESIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_CALCIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_CHROMIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_CINNABAR);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_COBALT);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_GALLIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_GERMANIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_HAFNIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_INDIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_IRIDIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_LEAD);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_LITHIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_MAGNESIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_MANGANESE);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_MOLYBDENUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_NICKEL);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_NIOBIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_OSMIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_PALLADIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_PHOSPHORUS);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_PLATINUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_POTASSIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_RHENIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_RHODIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_RUBIDIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_RUTHENIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_SCANDIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_SELENIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_SILICON);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_SILVER);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_SODIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_STRONTIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_TANTALUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_TECHNETIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_TELLURIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_THALLIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_TIN);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_TITANIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_TUNGSTEN);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_VANADIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_YTTRIUM);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_ZINC);
        addToItemGroup(ModItemGroup.METALLURGY, RAW_ZIRCONIUM);

        //Metallurgy - Ingot
        addToItemGroup(ModItemGroup.METALLURGY, ALUMINIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, ANTIMONY_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, ARSENIC_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, BARIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, BERYLLIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, BISMUTH_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, CADMIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, CAESIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, CALCIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, CHROMIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, CINNABAR_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, COBALT_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, GALLIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, GERMANIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, HAFNIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, INDIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, IRIDIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, LEAD_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, LITHIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, MAGNESIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, MANGANESE_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, MOLYBDENUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, NICKEL_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, NIOBIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, OSMIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, PALLADIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, PHOSPHORUS_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, PLATINUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, POTASSIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, RHENIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, RHODIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, RUBIDIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, RUTHENIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, SCANDIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, SELENIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, SILICON_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, SILVER_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, SODIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, STRONTIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, TANTALUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, TECHNETIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, TELLURIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, THALLIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, TIN_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, TITANIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, TUNGSTEN_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, VANADIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, YTTRIUM_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, ZINC_INGOT);
        addToItemGroup(ModItemGroup.METALLURGY, ZIRCONIUM_INGOT);

        //Metallurgy - Nugget
        addToItemGroup(ModItemGroup.METALLURGY, ALUMINIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, ANTIMONY_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, ARSENIC_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, BARIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, BERYLLIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, BISMUTH_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, CADMIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, CAESIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, CALCIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, CHROMIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, CINNABAR_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, COBALT_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, GALLIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, GERMANIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, HAFNIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, INDIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, IRIDIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, LEAD_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, LITHIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, MAGNESIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, MANGANESE_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, MOLYBDENUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, NICKEL_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, NIOBIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, OSMIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, PALLADIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, PHOSPHORUS_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, PLATINUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, POTASSIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, RHENIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, RHODIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, RUBIDIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, RUTHENIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, SCANDIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, SELENIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, SILICON_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, SILVER_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, SODIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, STRONTIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, TANTALUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, TECHNETIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, TELLURIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, THALLIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, TIN_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, TITANIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, TUNGSTEN_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, VANADIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, YTTRIUM_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, ZINC_NUGGET);
        addToItemGroup(ModItemGroup.METALLURGY, ZIRCONIUM_NUGGET);

        //Metallurgy - Dust
        addToItemGroup(ModItemGroup.METALLURGY, ALUMINIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, ANTIMONY_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, ARSENIC_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, BARIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, BERYLLIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, BISMUTH_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, CADMIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, CAESIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, CALCIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, CHROMIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, CINNABAR_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, COBALT_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, GALLIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, GERMANIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, HAFNIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, INDIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, IRIDIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, LEAD_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, LITHIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, MAGNESIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, MANGANESE_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, MOLYBDENUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, NICKEL_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, NIOBIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, OSMIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, PALLADIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, PHOSPHORUS_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, PLATINUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, POTASSIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, RHENIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, RHODIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, RUBIDIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, RUTHENIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, SCANDIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, SELENIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, SILICON_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, SILVER_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, SODIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, STRONTIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, TANTALUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, TECHNETIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, TELLURIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, THALLIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, TIN_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, TITANIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, TUNGSTEN_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, VANADIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, YTTRIUM_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, ZINC_DUST);
        addToItemGroup(ModItemGroup.METALLURGY, ZIRCONIUM_DUST);

        //Alloy - Ingot
        addToItemGroup(ModItemGroup.ALLOYS, AA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, AILI_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ALNICO_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ALUSCA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BIRMA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, DURALUMIN_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HIDUMINIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HINDALIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HYDRONALIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ITALMA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MAGNALIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NAMBE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NITIAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SILUMIN_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, YALLOY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BISMANOL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CERROSAFE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ROSEMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, WOODSMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMHYD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CRNIWTI_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERROCHROME_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NICHROME_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ELGILOY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MEGALLIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, STELLITE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TALONITE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ULTIMET_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, VITALLIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ALUBRO_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ARSBRO_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ARSCOP_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BELLMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BERYLCOPPER_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BILLON_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BRASS_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BRONZE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CALAMINE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CHISIL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CUNIFE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CONSTANTAN_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, COPHYD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, COPTUNG_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CORINTHIAN_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CUPRONICKEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CUSIL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CYMBAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, DEVARDA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, DUTCHMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FLORENTINE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GILDMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GLUCYDUR_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GUANIN_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GUNMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HEPATIZON_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MANGANIN_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MELCHIOR_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MUNTZ_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NICKSILVER_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NORDIC_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ORMOLU_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, PINCHBECK_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, PRINCEMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, PHOSPHOR_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SHAKUDO_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SILBRO_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SPECULUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TOMBAC_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TUMBAGA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, WHIBRO_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ALGA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GALFENOL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GALINSTAN_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ANTANIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, COLORGOLD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CROWNGOLD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ELECTRUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, RHODITE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ROSEGOLD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, WHITEGOLD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FIELDSMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ELINVAR_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERNICO_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, INVAR_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CASTIRON_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, PIGIRON_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, IROHYD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, KANTHAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, KOVAR_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SPIEGEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, STABALLOY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, STEEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BULAT_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMOLY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CRUCIBLE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, DAMASCUS_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, DUCOL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HADFIELD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HIGHSPEED_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HSLA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MARAGING_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MUSHET_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, REYNOLDS_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SILISTEEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SPRINGSTEEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, STAINLESS_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TOOLSTEEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, WEATHERING_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, WOOTZ_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MOLYBDOCHALKOS_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SOLDER_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TERNE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TYPEMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ELEKTRON_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MAGNOX_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TMGALZN_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MNFZ_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MNSZ_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, AMALGAM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ASHTADHATU_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ALUMEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BRIGHTRAY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GERSIL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HASTELLOY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, INCONEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, INCONELSES_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MONEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NICKCARB_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NICROSIL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NIMONIC_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NISIL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NITINOL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, MUMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, PERMALLOY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SUPERMALLOY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NICHYD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, COINSILVER_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, KLI_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, NAK_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, PSEUDO_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SCANHYD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ARGSTERSIL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BRITSIL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, DORE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, DYMALLOY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GOLOID_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, PLATSTER_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SHIBUICHI_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, STERLING_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TIBETSIL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SALFV_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BETAC_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, GUMMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TITANHYD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TITANNIT_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, TITANGOLD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BABBITT_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, BRITANNIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, PEWTER_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, QUEENS_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, WHIMETAL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ZAMAK_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ZIRCALOY_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, HAUSLER_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, ANTHRACITE_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, WROUGHT_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, COPNIC_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, SILSTEEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMAGNES_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMANGA_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMOLYBD_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERRONICKEL_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERROPHOSPHORUS_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERROSILICON_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERROTITANIUM_INGOT);
        addToItemGroup(ModItemGroup.ALLOYS, FERROVANADIUM_INGOT);
        
        //Alloy - Nugget
        addToItemGroup(ModItemGroup.ALLOYS, AA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, AILI_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ALNICO_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ALUSCA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BIRMA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, DURALUMIN_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HIDUMINIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HINDALIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HYDRONALIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ITALMA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MAGNALIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NAMBE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NITIAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SILUMIN_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, YALLOY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BISMANOL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CERROSAFE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ROSEMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, WOODSMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMHYD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CRNIWTI_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERROCHROME_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NICHROME_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ELGILOY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MEGALLIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, STELLITE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TALONITE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ULTIMET_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, VITALLIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ALUBRO_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ARSBRO_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ARSCOP_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BELLMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BERYLCOPPER_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BILLON_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BRASS_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BRONZE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CALAMINE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CHISIL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CUNIFE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CONSTANTAN_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, COPHYD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, COPTUNG_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CORINTHIAN_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CUPRONICKEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CUSIL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CYMBAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, DEVARDA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, DUTCHMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FLORENTINE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GILDMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GLUCYDUR_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GUANIN_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GUNMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HEPATIZON_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MANGANIN_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MELCHIOR_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MUNTZ_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NICKSILVER_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NORDIC_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ORMOLU_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, PINCHBECK_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, PRINCEMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, PHOSPHOR_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SHAKUDO_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SILBRO_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SPECULUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TOMBAC_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TUMBAGA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, WHIBRO_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ALGA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GALFENOL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GALINSTAN_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ANTANIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, COLORGOLD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CROWNGOLD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ELECTRUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, RHODITE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ROSEGOLD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, WHITEGOLD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FIELDSMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ELINVAR_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERNICO_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, INVAR_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CASTIRON_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, PIGIRON_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, IROHYD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, KANTHAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, KOVAR_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SPIEGEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, STABALLOY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, STEEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BULAT_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMOLY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CRUCIBLE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, DAMASCUS_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, DUCOL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HADFIELD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HIGHSPEED_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HSLA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MARAGING_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MUSHET_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, REYNOLDS_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SILISTEEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SPRINGSTEEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, STAINLESS_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TOOLSTEEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, WEATHERING_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, WOOTZ_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MOLYBDOCHALKOS_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SOLDER_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TERNE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TYPEMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ELEKTRON_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MAGNOX_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TMGALZN_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MNFZ_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MNSZ_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, AMALGAM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ASHTADHATU_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ALUMEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BRIGHTRAY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GERSIL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HASTELLOY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, INCONEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, INCONELSES_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MONEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NICKCARB_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NICROSIL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NIMONIC_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NISIL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NITINOL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, MUMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, PERMALLOY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SUPERMALLOY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NICHYD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, COINSILVER_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, KLI_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, NAK_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, PSEUDO_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SCANHYD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ARGSTERSIL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BRITSIL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, DORE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, DYMALLOY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GOLOID_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, PLATSTER_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SHIBUICHI_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, STERLING_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TIBETSIL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SALFV_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BETAC_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, GUMMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TITANHYD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TITANNIT_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, TITANGOLD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BABBITT_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, BRITANNIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, PEWTER_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, QUEENS_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, WHIMETAL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ZAMAK_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ZIRCALOY_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, HAUSLER_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, ANTHRACITE_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, WROUGHT_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, COPNIC_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, SILSTEEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMAGNES_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMANGA_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMOLYBD_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERRONICKEL_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERROPHOSPHORUS_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERROSILICON_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERROTITANIUM_NUGGET);
        addToItemGroup(ModItemGroup.ALLOYS, FERROVANADIUM_NUGGET);
        
        //Alloy - Dust
        addToItemGroup(ModItemGroup.ALLOYS, AA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, AILI_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ALNICO_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ALUSCA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BIRMA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, DURALUMIN_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HIDUMINIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HINDALIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HYDRONALIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ITALMA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MAGNALIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NAMBE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NITIAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SILUMIN_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, YALLOY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BISMANOL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CERROSAFE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ROSEMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, WOODSMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMHYD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CRNIWTI_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERROCHROME_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NICHROME_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ELGILOY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MEGALLIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, STELLITE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TALONITE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ULTIMET_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, VITALLIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ALUBRO_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ARSBRO_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ARSCOP_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BELLMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BERYLCOPPER_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BILLON_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BRASS_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BRONZE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CALAMINE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CHISIL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CUNIFE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CONSTANTAN_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, COPHYD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, COPTUNG_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CORINTHIAN_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CUPRONICKEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CUSIL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CYMBAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, DEVARDA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, DUTCHMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FLORENTINE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GILDMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GLUCYDUR_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GUANIN_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GUNMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HEPATIZON_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MANGANIN_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MELCHIOR_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MUNTZ_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NICKSILVER_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NORDIC_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ORMOLU_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, PINCHBECK_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, PRINCEMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, PHOSPHOR_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SHAKUDO_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SILBRO_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SPECULUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TOMBAC_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TUMBAGA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, WHIBRO_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ALGA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GALFENOL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GALINSTAN_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ANTANIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, COLORGOLD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CROWNGOLD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ELECTRUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, RHODITE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ROSEGOLD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, WHITEGOLD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FIELDSMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ELINVAR_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERNICO_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, INVAR_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CASTIRON_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, PIGIRON_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, IROHYD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, KANTHAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, KOVAR_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SPIEGEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, STABALLOY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, STEEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BULAT_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMOLY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CRUCIBLE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, DAMASCUS_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, DUCOL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HADFIELD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HIGHSPEED_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HSLA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MARAGING_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MUSHET_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, REYNOLDS_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SILISTEEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SPRINGSTEEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, STAINLESS_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TOOLSTEEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, WEATHERING_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, WOOTZ_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MOLYBDOCHALKOS_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SOLDER_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TERNE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TYPEMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ELEKTRON_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MAGNOX_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TMGALZN_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MNFZ_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MNSZ_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, AMALGAM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ASHTADHATU_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ALUMEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BRIGHTRAY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, CHROMEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GERSIL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HASTELLOY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, INCONEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, INCONELSES_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MONEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NICKCARB_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NICROSIL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NIMONIC_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NISIL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NITINOL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, MUMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, PERMALLOY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SUPERMALLOY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NICHYD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, COINSILVER_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, KLI_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, NAK_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, PSEUDO_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SCANHYD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ARGSTERSIL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BRITSIL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, DORE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, DYMALLOY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GOLOID_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, PLATSTER_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SHIBUICHI_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, STERLING_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TIBETSIL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SALFV_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BETAC_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, GUMMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TITANHYD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TITANNIT_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, TITANGOLD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BABBITT_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, BRITANNIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, PEWTER_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, QUEENS_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, WHIMETAL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ZAMAK_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ZIRCALOY_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, HAUSLER_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, ANTHRACITE_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, WROUGHT_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, COPNIC_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, SILSTEEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMAGNES_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMANGA_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERROMOLYBD_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERRONICKEL_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERROPHOSPHORUS_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERROSILICON_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERROTITANIUM_DUST);
        addToItemGroup(ModItemGroup.ALLOYS, FERROVANADIUM_DUST);

        //Tools
        //Armour

    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        MegalosMetallurgy.LOGGER.info("Registering Mod Items for " + MegalosMetallurgy.MOD_ID);

        addItemsToItemGroup();
    }
}
