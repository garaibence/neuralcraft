package neural.craft;

import net.fabricmc.api.ModInitializer;
import neural.craft.item.ModItemGroups;
import neural.craft.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeuralCraft implements ModInitializer {
	public static final String MOD_ID = "neuralcraft";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	}
}