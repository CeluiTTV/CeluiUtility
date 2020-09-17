package com.celui.celuiutility.util;

import com.celui.celuiutility.Celui;
import com.celui.celuiutility.armor.ModArmorMaterial;
import com.celui.celuiutility.blocks.BlockItemBase;
import com.celui.celuiutility.blocks.RobotCasing;
import com.celui.celuiutility.blocks.TungstenBlock;
import com.celui.celuiutility.blocks.TungstenOre;
import com.celui.celuiutility.items.ItemBase;
import com.celui.celuiutility.items.TungstenApple;
import com.celui.celuiutility.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Celui.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Celui.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items Only
    public static final RegistryObject<Item> TABLET = ITEMS.register("tablet", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_WIRE = ITEMS.register("tungsten_wire", ItemBase::new);
    public static final RegistryObject<TungstenApple> TUNGSTEN_APPLE = ITEMS.register("tungsten_apple", TungstenApple::new);


    // Tools Only
    public static final RegistryObject<SwordItem> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword", () ->
            new SwordItem(ModItemTier.TUNGSTEN, 3, -1.0F, new Item.Properties().group(Celui.TAB)));

    public static final RegistryObject<AxeItem> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", () ->
            new AxeItem(ModItemTier.TUNGSTEN, 2, -2.0F, new Item.Properties().group(Celui.TAB)));

    public static final RegistryObject<PickaxeItem> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", () ->
            new PickaxeItem(ModItemTier.TUNGSTEN, 1, -2.4F, new Item.Properties().group(Celui.TAB)));

    public static final RegistryObject<ShovelItem> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel", () ->
            new ShovelItem(ModItemTier.TUNGSTEN, 0, -2.4F, new Item.Properties().group(Celui.TAB)));

    public static final RegistryObject<HoeItem> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", () ->
            new HoeItem(ModItemTier.TUNGSTEN, -3, -1.0F, new Item.Properties().group(Celui.TAB)));

    //public static final RegistryObject<BowItem> TUNGSTEN_BOW = ITEMS.register("tungsten_bow", () ->
    //        new BowItem(new Item.Properties().group(Celui.TAB)));

    //public static final RegistryObject<ArrowEntity> TUNGSTEN_ARROW = ITEMS.register("tungsten_arrow", () ->
    //        new ArrowEntity(, new Item.Properties().group(Celui.TAB)));

    // Armor Only
    public static final RegistryObject<ArmorItem> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet", () ->
            new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.HEAD, new Item.Properties().group(Celui.TAB)));

    public static final RegistryObject<ArmorItem> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate", () ->
            new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.CHEST, new Item.Properties().group(Celui.TAB)));

    public static final RegistryObject<ArmorItem> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings", () ->
            new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.LEGS, new Item.Properties().group(Celui.TAB)));

    public static final RegistryObject<ArmorItem> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", () ->
            new ArmorItem(ModArmorMaterial.TUNGSTEN, EquipmentSlotType.FEET, new Item.Properties().group(Celui.TAB)));

    // Blocks Only
    public static final RegistryObject<Block> ROBOT_CASING = BLOCKS.register("robot_casing", RobotCasing::new);
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", TungstenBlock::new);
    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", TungstenOre::new);

    // Block Items
    public static final RegistryObject<Item> ROBOT_CASING_ITEM = ITEMS.register("robot_casing", () -> new BlockItemBase(ROBOT_CASING.get()));
    public static final RegistryObject<Item> TUNGSTEN_BLOCK_ITEM = ITEMS.register("tungsten_block", () -> new BlockItemBase(TUNGSTEN_BLOCK.get()));
    public static final RegistryObject<Item> TUNGSTEN_ORE_ITEM = ITEMS.register("tungsten_ore", () -> new BlockItemBase(TUNGSTEN_ORE.get()));

}
