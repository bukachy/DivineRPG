package divinerpg.blocks.base;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.*;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.*;
import net.minecraft.world.phys.BlockHitResult;
import javax.annotation.Nullable;

public class BlockModMobCage extends BlockMod {
	public final ResourceLocation type, spawnItem;
	protected final BlockPos relativePos;
	public BlockModMobCage(Properties properties, ResourceLocation type, @Nullable ResourceLocation spawnItem, @Nullable BlockPos relativePos) {
		super(properties.pushReaction(PushReaction.BLOCK));
		this.type = type;
		this.spawnItem = spawnItem;
		this.relativePos = relativePos;
	}
	public BlockModMobCage(ResourceLocation type, ResourceLocation spawnItem) {
		super(Properties.ofFullCopy(Blocks.SPAWNER).noOcclusion().pushReaction(PushReaction.BLOCK));
		this.type = type;
		this.spawnItem = spawnItem;
		relativePos = null;
	}
	public BlockModMobCage(ResourceLocation type, ResourceLocation spawnItem, MapColor color) {
		super(Properties.ofFullCopy(Blocks.SPAWNER).noOcclusion().pushReaction(PushReaction.BLOCK).mapColor(color));
		this.type = type;
		this.spawnItem = spawnItem;
		relativePos = null;
	}
	public BlockModMobCage(ResourceLocation type, @Nullable ResourceLocation spawnItem, MapColor color, @Nullable BlockPos relativePos) {
		super(Properties.ofFullCopy(Blocks.SPAWNER).noOcclusion().pushReaction(PushReaction.BLOCK).mapColor(color));
		this.type = type;
		this.spawnItem = spawnItem;
		this.relativePos = relativePos;
	}
	@Override public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
		if(!level.isClientSide && !player.isCreative()) BuiltInRegistries.ENTITY_TYPE.get(type).spawn((ServerLevel) level, null, player, relativePos == null ? pos : pos.offset(relativePos), MobSpawnType.MOB_SUMMONED, true, false);
		return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
	}
	@Override public ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
		ItemStack item = player.getItemInHand(hand);
		if(!player.getCooldowns().isOnCooldown(item.getItem()) && (spawnItem == null || item.is(BuiltInRegistries.ITEM.get(spawnItem)))) {
			if (!(spawnItem == null || player.isCreative())) item.shrink(1);
			player.getCooldowns().addCooldown(item.getItem(), 40);
			if(!level.isClientSide) BuiltInRegistries.ENTITY_TYPE.get(type).spawn((ServerLevel) level, null, player, relativePos == null ? pos : pos.offset(relativePos), MobSpawnType.MOB_SUMMONED, true, false);
			return ItemInteractionResult.SUCCESS;
		} return ItemInteractionResult.FAIL;
	}
}