package com.badooga.quark.block;

import com.badooga.quark.Quark;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class QuarkBlocks {

    public static final Block DUSKBOUND_BLOCK = registerBlock(
        "duskbound_block",
        new Block(FabricBlockSettings.create().strength(1.5f, 6f))
    );
    public static final Block DUSKBOUND_LAMP = registerBlock(
        "duskbound_lamp",
        new Block(FabricBlockSettings.create().strength(1.5f, 6f).luminance(15))
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Quark.MODID, name), block);
    };

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
            Registries.ITEM,
            new Identifier(Quark.MODID, name),
            new BlockItem(block, new FabricItemSettings())
        );
    };

    public static void registerModBlocks() {
        Quark.LOGGER.info("Registering blocks" + Quark.MODID);
    }
}
