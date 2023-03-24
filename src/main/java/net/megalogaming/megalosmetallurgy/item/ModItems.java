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
    //Metallurgy - Dust
    public static final Item ALUMINIUM_DUST = registerItem("aluminium_dust", new Item( new FabricItemSettings()));


    //Alloy - Ingots
    public static final Item AA_INGOT = registerItem("aa_ingot", new Item( new FabricItemSettings()));
    //Alloy - Nuggets
    public static final Item AA_NUGGET = registerItem("aa_nugget", new Item( new FabricItemSettings()));
    //Alloy - Dust
    public static final Item AA_DUST = registerItem("aa_dust", new Item( new FabricItemSettings()));


    //Hoplology

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MegalosMetallurgy.MOD_ID, name), item);

    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.METALLURGY, ALUMINIUM_INGOT);
    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        MegalosMetallurgy.LOGGER.info("Registering Mod Items for " + MegalosMetallurgy.MOD_ID);

        addItemsToItemGroup();
    }
}
