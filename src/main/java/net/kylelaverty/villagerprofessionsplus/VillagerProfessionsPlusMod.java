package net.kylelaverty.villagerprofessionsplus;

import net.fabricmc.api.ModInitializer;

import net.kylelaverty.villagerprofessionsplus.block.VPPBlocks;
import net.kylelaverty.villagerprofessionsplus.util.VPPReference;
import net.kylelaverty.villagerprofessionsplus.villager.VPPJobs;
import net.kylelaverty.villagerprofessionsplus.villager.VPPVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VillagerProfessionsPlusMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(VPPReference.MOD_ID);

	@Override
	public void onInitialize() {
		VPPBlocks.registerModBlocks();
		VPPVillagers.registerVillagers();
		VPPJobs.registerTrades();
	}
}