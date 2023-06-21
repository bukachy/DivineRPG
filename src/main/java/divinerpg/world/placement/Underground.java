package divinerpg.world.placement;

import com.mojang.serialization.Codec;

import divinerpg.registries.PlacementModifierRegistry;
import net.minecraft.core.*;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.placement.*;

public class Underground extends PlacementFilter {
	private static final Underground INSTANCE = new Underground();
	public static final Codec<Underground> CODEC = Codec.unit(() -> INSTANCE);
	private Underground() {}
	public static Underground underground() {return INSTANCE;}
	protected boolean shouldPlace(PlacementContext context, RandomSource source, BlockPos pos) {
		return isUnderground(context.getLevel(), pos);
	}
	public static boolean isUnderground(LevelAccessor level, BlockPos pos) {
		MutableBlockPos mut = pos.mutable();
		while(mut.getY() < level.getMaxBuildHeight() - 1) {
			BlockState state = level.getBlockState(mut.move(Direction.UP));
			if(state.isCollisionShapeFullBlock(level, mut) && !state.is(BlockTags.LEAVES)) return level.getBrightness(LightLayer.SKY, mut.below()) < 1;
		}
		return false;
	}
	public PlacementModifierType<?> type() {
		return PlacementModifierRegistry.UNDERGROUND;
	}
}