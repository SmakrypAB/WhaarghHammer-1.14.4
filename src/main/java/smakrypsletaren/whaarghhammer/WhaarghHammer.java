package smakrypsletaren.whaarghhammer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import smakrypsletaren.whaarghhammer.config.Config;
import smakrypsletaren.whaarghhammer.lists.ArmourMaterialList;
import smakrypsletaren.whaarghhammer.lists.BlockList;
import smakrypsletaren.whaarghhammer.lists.ItemList;
import smakrypsletaren.whaarghhammer.lists.ToolMaterialList;
import smakrypsletaren.whaarghhammer.world.OreGeneration;

@Mod("whaarghhammer")
public class WhaarghHammer 
{
	public static WhaarghHammer instance;
	public static final String modid = "whaarghhammer";
	public static final Logger logger = LogManager.getLogger(modid);
	
	public WhaarghHammer() 
	{
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.server_config);
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.client_config);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		Config.loadConfig(Config.client_config, FMLPaths.CONFIGDIR.get().resolve("whaarghhammer-client.toml").toString());
		Config.loadConfig(Config.server_config, FMLPaths.CONFIGDIR.get().resolve("whaarghhammer-server.toml").toString());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) 
	{
		OreGeneration.setupOreGeneration();		
		
		logger.info("Setup method registered");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) 
	{
		
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegsitryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(
					ItemList.tutorial_item = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_item")),
					
					ItemList.tutorial_axe = new AxeItem(ToolMaterialList.tutorial, -1.0f, 6.0f, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_axe")),
					ItemList.tutorial_hoe = new HoeItem(ToolMaterialList.tutorial, 6.0f, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_hoe")),
					ItemList.tutorial_pickaxe = new PickaxeItem(ToolMaterialList.tutorial, -2, 6.0f, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_pickaxe")),
					ItemList.tutorial_shovel = new ShovelItem(ToolMaterialList.tutorial, -1.0f, 6.0f, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_shovel")),
					ItemList.tutorial_sword = new SwordItem(ToolMaterialList.tutorial, 0, 6.0f, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_sword")),
					
					ItemList.tutorial_helmet = new ArmorItem(ArmourMaterialList.tutorial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_helmet")),
					ItemList.tutorial_chestplate = new ArmorItem(ArmourMaterialList.tutorial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_chestplate")),
					ItemList.tutorial_leggings = new ArmorItem(ArmourMaterialList.tutorial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_leggings")),
					ItemList.tutorial_boots = new ArmorItem(ArmourMaterialList.tutorial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_boots")),
					
					ItemList.tutorial_block = new BlockItem(BlockList.tutorial_block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.tutorial_block.getRegistryName()),
					ItemList.tutorial_ore1 = new BlockItem(BlockList.tutorial_ore1, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.tutorial_ore1.getRegistryName()),
					ItemList.tutorial_ore2 = new BlockItem(BlockList.tutorial_ore2, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.tutorial_ore2.getRegistryName()),
					ItemList.tutorial_ore3 = new BlockItem(BlockList.tutorial_ore3, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.tutorial_ore3.getRegistryName())
			);
			
			logger.info("Items Registered.");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(
					BlockList.tutorial_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)).setRegistryName(location("tutorial_block")),
					BlockList.tutorial_ore1 = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)).setRegistryName(location("tutorial_ore1")),
					BlockList.tutorial_ore2 = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)).setRegistryName(location("tutorial_ore2")),
					BlockList.tutorial_ore3 = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)).setRegistryName(location("tutorial_ore3"))
			);
			
			logger.info("Blocks Registered.");
		}
		
		private static ResourceLocation location(String name) 
		{
			return new ResourceLocation(modid, name);
		}
	}
	
} 