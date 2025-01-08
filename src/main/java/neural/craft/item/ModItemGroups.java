package neural.craft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import neural.craft.NeuralCraft;

public class ModItemGroups {
    public static final ItemGroup NEURAL_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NeuralCraft.MOD_ID, "neural_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.NEURAL_NETWORK))
                    .displayName(Text.translatable("itemgroup.neuralcraft.neural_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NEURAL_NETWORK);
                    })

                    .build());

    public static void registerItemGroups() {
        NeuralCraft.LOGGER.info("Registering Item Groups for " + NeuralCraft.MOD_ID);
    }
}
