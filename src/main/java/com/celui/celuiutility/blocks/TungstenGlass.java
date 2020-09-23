package com.celui.celuiutility.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TungstenGlass extends Block {

    public TungstenGlass() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(20.0f, 600.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2) // What is needed to mine it 0 = wood 1 = stone/gold 2 = iron and 3 = diamond
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
