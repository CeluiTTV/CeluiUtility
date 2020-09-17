package com.celui.celuiutility.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TungstenBlock extends Block {

    public TungstenBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(50.0f, 6000.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3) // What is needed to mine it 0 = wood 1 = stone/gold 2 = iron and 3 = diamond
                .harvestTool(ToolType.PICKAXE)

        );
    }
}
