package net.megalogaming.megalosmetallurgy.world;

import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = registerKey("aluminium_ore_placed");
    public static final RegistryKey<PlacedFeature> CINNABAR_ORE_PLACED_KEY = registerKey("cinnabar_ore_placed");
    public static final RegistryKey<PlacedFeature> CALCIUM_ORE_PLACED_KEY = registerKey("calcium_ore_placed");
    public static final RegistryKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final RegistryKey<PlacedFeature> MAGNESIUM_ORE_PLACED_KEY = registerKey("magnesium_ore_placed");
    public static final RegistryKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final RegistryKey<PlacedFeature> OSMIUM_ORE_PLACED_KEY = registerKey("osmium_ore_placed");
    public static final RegistryKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> SILICON_ORE_PLACED_KEY = registerKey("silicon_ore_placed");
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final RegistryKey<PlacedFeature> SODIUM_ORE_PLACED_KEY = registerKey("sodium_ore_placed");
    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
    public static final RegistryKey<PlacedFeature> ZIRCONIUM_ORE_PLACED_KEY = registerKey("zirconium_ore_placed");

    //Deepslate

    public static final RegistryKey<PlacedFeature> DEEPSLATE_ANTIMONY_ORE_PLACED_KEY = registerKey("deepslate_antimony_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_BISMUTH_ORE_PLACED_KEY = registerKey("deepslate_bismuth_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_CADMIUM_ORE_PLACED_KEY = registerKey("deepslate_cadmium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_CHROMIUM_ORE_PLACED_KEY = registerKey("deepslate_chromium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_COBALT_ORE_PLACED_KEY = registerKey("deepslate_cobalt_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_GALLIUM_ORE_PLACED_KEY = registerKey("deepslate_gallium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_IRIDIUM_ORE_PLACED_KEY = registerKey("deepslate_iridium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_MANGANESE_ORE_PLACED_KEY = registerKey("deepslate_manganese_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_MOLYBDENUM_ORE_PLACED_KEY = registerKey("deepslate_molybdenum_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_PALLADIUM_ORE_PLACED_KEY = registerKey("deepslate_palladium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_POTASSIUM_ORE_PLACED_KEY = registerKey("deepslate_potassium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_RUTHENIUM_ORE_PLACED_KEY = registerKey("deepslate_ruthenium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_THALLIUM_ORE_PLACED_KEY = registerKey("deepslate_thallium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_TUNGSTEN_ORE_PLACED_KEY = registerKey("deepslate_tungsten_ore_placed");

    //Netherrack
    public static final RegistryKey<PlacedFeature> NETHERRACK_ARSENIC_ORE_PLACED_KEY = registerKey("netherrack_arsenic_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_BARIUM_ORE_PLACED_KEY = registerKey("netherrack_barium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_BERYLLIUM_ORE_PLACED_KEY = registerKey("netherrack_beryllium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_CAESIUM_ORE_PLACED_KEY = registerKey("netherrack_caesium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_GERMANIUM_ORE_PLACED_KEY = registerKey("netherrack_germanium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_HAFNIUM_ORE_PLACED_KEY = registerKey("netherrack_hafnium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_INDIUM_ORE_PLACED_KEY = registerKey("netherrack_indium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_NIOBIUM_ORE_PLACED_KEY = registerKey("netherrack_niobium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_PHOSPHORUS_ORE_PLACED_KEY = registerKey("netherrack_phosphorus_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_RHENIUM_ORE_PLACED_KEY = registerKey("netherrack_rhenium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_RHODIUM_ORE_PLACED_KEY = registerKey("netherrack_rhodium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_SELENIUM_ORE_PLACED_KEY = registerKey("netherrack_selenium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_TECHNETIUM_ORE_PLACED_KEY = registerKey("netherrack_technetium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_TELLURIUM_ORE_PLACED_KEY = registerKey("netherrack_tellurium_ore_placed");

    //Endstone
    public static final RegistryKey<PlacedFeature> END_LITHIUM_ORE_PLACED_KEY = registerKey("end_lithium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_RUBIDIUM_ORE_PLACED_KEY = registerKey("end_rubidium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_SCANDIUM_ORE_PLACED_KEY = registerKey("end_scandium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_STRONTIUM_ORE_PLACED_KEY = registerKey("end_strontium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_TANTALUM_ORE_PLACED_KEY = registerKey("end_tantalum_ore_placed");
    public static final RegistryKey<PlacedFeature> END_VANADIUM_ORE_PLACED_KEY = registerKey("end_vanadium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_YTTRIUM_ORE_PLACED_KEY = registerKey("end_yttrium_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        //Overworld
        register(context, ALUMINIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALUMINIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, CALCIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CALCIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, CINNABAR_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CINNABAR_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, LEAD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, MAGNESIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGNESIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NICKEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, OSMIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.OSMIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, SILICON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILICON_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, SILVER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, SODIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SODIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, TIN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, ZINC_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ZINC_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, ZIRCONIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ZIRCONIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        //Deepslate
        register(context, DEEPSLATE_ANTIMONY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_ANTIMONY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_BISMUTH_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_BISMUTH_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_CADMIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_CADMIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_CHROMIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_CHROMIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_COBALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_COBALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_GALLIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_GALLIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_IRIDIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_IRIDIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_MANGANESE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_MANGANESE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_MOLYBDENUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_MOLYBDENUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_PALLADIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_PALLADIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_POTASSIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_POTASSIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_RUTHENIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_RUTHENIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_THALLIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_THALLIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, DEEPSLATE_TUNGSTEN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_TUNGSTEN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        //Netherrack
        register(context, NETHERRACK_ARSENIC_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_ARSENIC_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_BARIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_BARIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_BERYLLIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_BERYLLIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_CAESIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_CAESIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_GERMANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_GERMANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_HAFNIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_HAFNIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_INDIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_INDIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_NIOBIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_NIOBIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_PHOSPHORUS_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_PHOSPHORUS_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_RHENIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_RHENIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_RHODIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_RHODIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_SELENIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_SELENIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_TECHNETIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_TECHNETIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, NETHERRACK_TELLURIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHERRACK_TELLURIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        //Endstone
        register(context, END_LITHIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_LITHIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, END_RUBIDIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_RUBIDIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, END_SCANDIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_SCANDIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, END_STRONTIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_STRONTIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, END_TANTALUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_TANTALUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, END_VANADIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_VANADIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, END_YTTRIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_YTTRIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    }
    public static RegistryKey<PlacedFeature> registerKey(String name){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MegalosMetallurgy.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers){
        register(context, key, configuration, List.of(modifiers));
    }
}
