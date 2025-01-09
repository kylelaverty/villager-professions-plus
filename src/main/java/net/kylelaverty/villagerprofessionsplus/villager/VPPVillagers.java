package net.kylelaverty.villagerprofessionsplus.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.kylelaverty.villagerprofessionsplus.VillagerProfessionsPlusMod;
import net.kylelaverty.villagerprofessionsplus.block.VPPBlocks;
import net.kylelaverty.villagerprofessionsplus.util.VPPReference;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class VPPVillagers {

    public static final String NETHEROGRAPHER_POI_ID = "netherographerpoi";
    public static final RegistryKey<PointOfInterestType> NETHEROGRAPHER_POI_KEY = poiKey(NETHEROGRAPHER_POI_ID);
    public static final PointOfInterestType NETHEROGRAPHER_POI = registerPoi(NETHEROGRAPHER_POI_ID, VPPBlocks.NETHEROGRAPHY_TABLE_BLOCK);

    public static final VillagerProfession NETHEROGRAPHER = registerProfession("netherographer", NETHEROGRAPHER_POI_KEY, SoundEvents.ENTITY_VILLAGER_WORK_CARTOGRAPHER);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type, SoundEvent professionSound) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(VPPReference.MOD_ID, name),
                new VillagerProfession(
                        name,
                        entry -> entry.matchesKey(type),
                        entry -> entry.matchesKey(type),
                        ImmutableSet.of(),
                        ImmutableSet.of(),
                        professionSound)
        );
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(VPPReference.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(VPPReference.MOD_ID, name));
    }

    public static void registerVillagers(){
        VillagerProfessionsPlusMod.LOGGER.info("Registering Villagers for " + VPPReference.MOD_ID);
    }
}
