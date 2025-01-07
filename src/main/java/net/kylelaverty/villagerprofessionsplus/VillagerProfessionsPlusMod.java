package net.kylelaverty.villagerprofessionsplus;

import net.fabricmc.api.ModInitializer;

import net.kylelaverty.villagerprofessionsplus.block.ModBlocks;
import net.kylelaverty.villagerprofessionsplus.util.VPPReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VillagerProfessionsPlusMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(VPPReference.MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModBlocks.registerModBlocks();
	}
}