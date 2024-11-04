package divinerpg.entities.projectile;

import divinerpg.registries.BlockRegistry;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.*;

public class EntityWildwoodLog extends DivineThrowable {
	public EntityWildwoodLog(EntityType<? extends ThrowableProjectile> type, Level world) {
		super(type, world);
	}
	public EntityWildwoodLog(EntityType<? extends ThrowableProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}
	@Override
	protected void onHitEntity(EntityHitResult result) {
		if(tickCount > 1) {
			if(result.getEntity() != null) result.getEntity().hurt(result.getEntity().level().damageSources().thrown(this, getOwner()), 8.0F);
			if(!level().isClientSide()) {
				level().addFreshEntity(new ItemEntity(level(), xo, yo, zo, new ItemStack(getBlock())));
				kill();
			}
		}
	}
	@Override
	protected void onHitBlock(BlockHitResult p_230299_1_) {
		if(tickCount > 1) {
			if(!level().isClientSide()) {
				level().addFreshEntity(new ItemEntity(level(), xo, yo, zo, new ItemStack(getBlock())));
				kill();
			}
		}
	}
	public static Block getBlock() {
		return BlockRegistry.wildwoodLog.get();
	}
}