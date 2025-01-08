package neural.craft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import neural.craft.NeuralCraft;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;

public class ModItems {
    public static final Item NEURAL_NETWORK = registerItem("neural_network",
            new Item(new Item.Settings()
                    .maxCount(1)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NeuralCraft.MOD_ID, "neural_network")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NeuralCraft.MOD_ID, name), item);
    }

    public static void registerItems() {
        NeuralCraft.LOGGER.info("Registering Items for " + NeuralCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(entries -> {
            entries.add(NEURAL_NETWORK);
        });
    }
}
