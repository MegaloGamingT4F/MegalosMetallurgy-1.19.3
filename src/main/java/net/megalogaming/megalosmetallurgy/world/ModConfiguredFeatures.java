package net.megalogaming.megalosmetallurgy.world;

import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.megalogaming.megalosmetallurgy.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    //Overworld
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALCIUM_ORE_KEY = registerKey("calcium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CINNABAR_ORE_KEY = registerKey("cinnabar_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGNESIUM_ORE_KEY = registerKey("magnesium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OSMIUM_ORE_KEY = registerKey("osmium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILICON_ORE_KEY = registerKey("silicon_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SODIUM_ORE_KEY = registerKey("sodium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZINC_ORE_KEY = registerKey("zinc_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZIRCONIUM_ORE_KEY = registerKey("zirconium_ore");

    //Deepslate
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_ANTIMONY_ORE_KEY = registerKey("deepslate_antimony_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_BISMUTH_ORE_KEY = registerKey("deepslate_bismuth_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_CADMIUM_ORE_KEY = registerKey("deepslate_cadmium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_CHROMIUM_ORE_KEY = registerKey("deepslate_chromium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_COBALT_ORE_KEY = registerKey("deepslate_cobalt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_GALLIUM_ORE_KEY = registerKey("deepslate_gallium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_IRIDIUM_ORE_KEY = registerKey("deepslate_iridium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_MANGANESE_ORE_KEY = registerKey("deepslate_manganese_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_MOLYBDENUM_ORE_KEY = registerKey("deepslate_molybdenum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_PALLADIUM_ORE_KEY = registerKey("deepslate_palladium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_POTASSIUM_ORE_KEY = registerKey("deepslate_potassium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_RUTHENIUM_ORE_KEY = registerKey("deepslate_ruthenium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_THALLIUM_ORE_KEY = registerKey("deepslate_thallium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_TUNGSTEN_ORE_KEY = registerKey("deepslate_tungsten_ore");

    //Netherrack
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_ARSENIC_ORE_KEY = registerKey("netherrack_arsenic_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_BARIUM_ORE_KEY = registerKey("netherrack_barium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_BERYLLIUM_ORE_KEY = registerKey("netherrack_beryllium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_CAESIUM_ORE_KEY = registerKey("netherrack_caesium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_GERMANIUM_ORE_KEY = registerKey("netherrack_germanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_HAFNIUM_ORE_KEY = registerKey("netherrack_hafnium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_INDIUM_ORE_KEY = registerKey("netherrack_indium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_NIOBIUM_ORE_KEY = registerKey("netherrack_niobium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_PHOSPHORUS_ORE_KEY = registerKey("netherrack_phosphorus_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_RHENIUM_ORE_KEY = registerKey("netherrack_rhenium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_RHODIUM_ORE_KEY = registerKey("netherrack_rhodium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_SELENIUM_ORE_KEY = registerKey("netherrack_selenium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_TECHNETIUM_ORE_KEY = registerKey("netherrack_technetium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHERRACK_TELLURIUM_ORE_KEY = registerKey("netherrack_tellurium_ore");

    //Enstone
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_LITHIUM_ORE_KEY = registerKey("end_lithium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_RUBIDIUM_ORE_KEY = registerKey("end_rubidium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_SCANDIUM_ORE_KEY = registerKey("end_scandium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_STRONTIUM_ORE_KEY = registerKey("end_strontium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_TANTALUM_ORE_KEY = registerKey("end_tantalum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_VANADIUM_ORE_KEY = registerKey("end_vanadium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_YTTRIUM_ORE_KEY = registerKey("end_yttrium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

        //Overworld
        List<OreFeatureConfig.Target> overworldMetallurgyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ALUMINIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CALCIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.CINNABAR_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.LEAD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MAGNESIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.NICKEL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.OSMIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.PLATINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.SILICON_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.SODIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TIN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TITANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ZINC_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ZIRCONIUM_ORE.getDefaultState()));
        //Deepslate

        List<OreFeatureConfig.Target> deepslateMetallurgyOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_ANTIMONY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_BISMUTH_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_CADMIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_CHROMIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_COBALT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_GALLIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_IRIDIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_MANGANESE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_MOLYBDENUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_RUTHENIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_PALLADIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_POTASSIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_THALLIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.getDefaultState()));
        //Netherrack

        List<OreFeatureConfig.Target> netherMetallurgyOres =
                List.of(OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_ARSENIC_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_BARIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_BERYLLIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_CAESIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_GERMANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_HAFNIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_INDIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_NIOBIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_PHOSPHORUS_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_RHENIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_RHODIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_SELENIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_TECHNETIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHERRACK_TELLURIUM_ORE.getDefaultState()));
        //Endstone

        List<OreFeatureConfig.Target> endMetallurgyOres =
                List.of(OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_LITHIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_RUBIDIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_SCANDIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_STRONTIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_RUBIDIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_TANTALUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_VANADIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_YTTRIUM_ORE.getDefaultState()));

        //OVERWORLD
        register(context, ALUMINIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, CALCIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, CINNABAR_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, LEAD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, MAGNESIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, NICKEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, OSMIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, SILICON_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, SODIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, ZINC_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));
        register(context, ZIRCONIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMetallurgyOres, 9));

        //DEEPSLATE
        register(context, DEEPSLATE_ANTIMONY_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_BISMUTH_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_CADMIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_CHROMIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_GALLIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_IRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_MANGANESE_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_MOLYBDENUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_PALLADIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_POTASSIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_RUTHENIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_THALLIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));
        register(context, DEEPSLATE_TUNGSTEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateMetallurgyOres, 9));

        //NETHERRACK
        register(context, NETHERRACK_ARSENIC_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_BARIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_BERYLLIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_CAESIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_GERMANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_HAFNIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_INDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_NIOBIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_PHOSPHORUS_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_RHENIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_RHODIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_SELENIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_TECHNETIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));
        register(context, NETHERRACK_TELLURIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherMetallurgyOres, 9));

        //ENDSTONE
        register(context, END_LITHIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endMetallurgyOres, 9));
        register(context, END_RUBIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endMetallurgyOres, 9));
        register(context, END_SCANDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endMetallurgyOres, 9));
        register(context, END_STRONTIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endMetallurgyOres, 9));
        register(context, END_TANTALUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endMetallurgyOres, 9));
        register(context, END_VANADIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endMetallurgyOres, 9));
        register(context, END_YTTRIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endMetallurgyOres, 9));

    }

    private static RegistryKey<ConfiguredFeature<?,?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MegalosMetallurgy.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
