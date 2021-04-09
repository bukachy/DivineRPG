package divinerpg.items.vanilla;

import divinerpg.items.base.*;
import divinerpg.registries.*;
import net.minecraft.block.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

import java.util.*;

public class ItemHordeHorn extends ItemBossSpawner {

    public ItemHordeHorn(String name) {
        super(name, "message.ayeraco_horde", x -> Objects.equals(x, DimensionType.END_LOCATION));
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        ActionResultType result = super.useOn(context);

            BlockPos pos = context.getClickedPos();
            Direction facing = context.getClickedFace();
            World world = context.getLevel();
            PlayerEntity player = context.getPlayer();
            pos = pos.offset(facing.getStepX(), facing.getStepY()+1, facing.getStepZ());
            if (world.getBlockState(pos) == Blocks.AIR.defaultBlockState()) {
                world.playSound(null, pos, SoundRegistry.AYERACO_SPAWN, SoundCategory.MASTER, 20.0F, 1.0F);
                world.setBlock(pos.below(), BlockRegistry.ayeracoSpawn.defaultBlockState(), 0);

                if (!player.isCreative()) {
                    player.getMainHandItem().shrink(1);
                }
            }
        return result;
    }
}