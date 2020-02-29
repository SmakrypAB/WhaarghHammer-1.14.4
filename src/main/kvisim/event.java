package kvisim.advancements.atest;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.IForgeRegistryModifiable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityPickupEventHandler {
    @SubscribeEvent
    public static void itemPickup(EntityItemPickupEvent event) {
        String unlocalizedName = event.getItem().getItem().getUnlocalizedName();
        System.out.format("picked up: %s%n", unlocalizedName);
        
    }
}
