package divinerpg.blocks.base;

import net.minecraft.core.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockMod extends Block {

    public BlockMod(float hardness) {
        super(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(hardness, 3.0F).sound(SoundType.STONE));
    }

    public BlockMod(Block.Properties properties) {
        super(properties);
    }

    public BlockMod(float hardness, float resistance) {
        super(Block.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(hardness, resistance).sound(SoundType.STONE));
    }

    public BlockMod(float hardness, float resistance, Material material) {
        super(Block.Properties.of(material, MaterialColor.STONE).strength(hardness, resistance).sound(SoundType.STONE));
    }
    
    public BlockMod(float hardness, float resistance, Material material, SoundType sound) {
        super(Block.Properties.of(material, MaterialColor.STONE).strength(hardness, resistance).sound(sound));
    }
    
    @Override
    public int getFlammability(BlockState state, BlockGetter getter, BlockPos pos, Direction face) {
        if(material == Material.CLOTH_DECORATION) {
            return 60;
        }
        return 0;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter getter, BlockPos pos, Direction face) {
        if(material == Material.CLOTH_DECORATION) {
            return 30;
        }
        return 0;
    }
}
