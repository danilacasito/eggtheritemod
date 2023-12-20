package com.elordenador.eggtherite;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.elordenador.eggtherite.materials.EggtheriteMaterial;

public class EggTheriteMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("eggtheritemod");
	public static final Item EGGTHERITE_SCRAP = new Item(new FabricItemSettings());
	public static final Item EGGTHERITE_INGOT = new Item(new FabricItemSettings());
	public static final EggtheriteMaterial  EGGMT = new EggtheriteMaterial(EGGTHERITE_INGOT);
	public static final ToolItem EGGTHERITE_PICKAXE = new PickaxeItem(EGGMT, 1, -2.8F, new FabricItemSettings());
	public static final ToolItem EGGTHERITE_AXE = new AxeItem(EGGMT, 1, -2.8F, new FabricItemSettings());

	private static final ItemGroup EGGTHERITE_GROUP = FabricItemGroup.builder().icon(() -> new ItemStack(EGGTHERITE_SCRAP)).displayName(Text.translatable("itemGroup.eggtheritemod.eggtheriteGroup")).entries((content, entries) -> {
		entries.add(EGGTHERITE_SCRAP);
		entries.add(EGGTHERITE_INGOT);
		entries.add(EGGTHERITE_PICKAXE);
		entries.add(EGGTHERITE_AXE);
	}).build();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registries.ITEM, new Identifier("eggtheritemod", "eggtherite_scrap"), EGGTHERITE_SCRAP);
		Registry.register(Registries.ITEM, new Identifier("eggtheritemod", "eggtherite_ingot"), EGGTHERITE_INGOT);
		Registry.register(Registries.ITEM, new Identifier("eggtheritemod", "eggtherite_pickaxe"), EGGTHERITE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier("eggtheritemod", "eggtherite_axe"), EGGTHERITE_AXE);
		Registry.register(Registries.ITEM_GROUP, new Identifier("eggtheritemod", "eggtherite_group"), EGGTHERITE_GROUP);
		
	}
}