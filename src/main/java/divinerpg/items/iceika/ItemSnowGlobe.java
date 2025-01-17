package divinerpg.items.iceika;

import divinerpg.DivineRPG;
import divinerpg.blocks.base.PortalBlock;
import divinerpg.items.base.ItemMod;
import divinerpg.registries.*;
import net.minecraft.core.*;
import net.minecraft.core.Direction.Axis;
import net.minecraft.sounds.*;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class ItemSnowGlobe extends ItemMod {
    public ItemSnowGlobe() {super(new Properties().stacksTo(1));}
    @Override public InteractionResult useOn(UseOnContext context) {
        Direction facing = context.getClickedFace();
        BlockPos pos = context.getClickedPos(), location = pos.relative(facing);
        Level worldIn = context.getLevel();
        Player player = context.getPlayer();
        if(!player.mayUseItemAt(pos, facing, player.getItemInHand(context.getHand()))) return InteractionResult.FAIL;
        BlockState block = worldIn.getBlockState(pos);
        PortalBlock portal = (PortalBlock)BlockRegistry.iceikaPortal.get();
        if(!block.is(portal.frameTag)) portal = null;
        if(portal != null) {
            if(!worldIn.isClientSide()) {
                Axis axis = portal.checkForFrame(worldIn, location);
                if(axis != null) {
                    PortalBlock.spreadBlock(worldIn, portal.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_AXIS, axis), location, Blocks.AIR, axis);
                    worldIn.playSound(player, location, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1, player.getRandom().nextFloat() * .4F + .8F);
                    return InteractionResult.SUCCESS;
                }
            } if(BaseFireBlock.canBePlacedAt(worldIn, location, facing.getOpposite())) {
                worldIn.playSound(player, location, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1, player.getRandom().nextFloat() * .4F + .8F);
                worldIn.setBlock(location, BlockRegistry.iceikaFire.get().defaultBlockState(), 0);
                return InteractionResult.SUCCESS;
            }
        } return InteractionResult.FAIL;
    }
}