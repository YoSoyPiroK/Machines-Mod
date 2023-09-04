package net.pirok.machinesmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MachinesMod implements ModInitializer {
	public static final String MOD_ID = "machines-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("machines-mod");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}