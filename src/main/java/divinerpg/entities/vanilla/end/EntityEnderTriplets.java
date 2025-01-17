package divinerpg.entities.vanilla.end;

import divinerpg.entities.base.EntityDivineFlyingMob;
import divinerpg.entities.projectile.fireball.EntityEnderTripletsFireball;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.*;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.Vec3;

public class EntityEnderTriplets extends EntityDivineFlyingMob implements RangedAttackMob {
    public EntityEnderTriplets(EntityType<? extends EntityDivineFlyingMob> type, Level worldIn) {
        super(type, worldIn, 18F);
    }
    @Override
    public boolean fireImmune() {
        return true;
    }
    @Override
    protected float getSoundVolume() {
        return 10F;
    }
    @Override
    protected SoundEvent getAmbientSound() {
    	return SoundEvents.PARROT_IMITATE_GHAST;
    }
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.GHAST_SCREAM;
    }
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.GHAST_DEATH;
    }
    @Override
    public int getMaxSpawnClusterSize() {
    	return 1;
    }
    @Override
    public boolean isMaxGroupSizeReached(int i) {
    	return i > 1;
    }
    @Override
    public boolean isAggressive() {
        return true;
    }
    @Override
    protected void registerGoals() {
        super.registerGoals();
        goalSelector.addGoal(2, new RangedAttackGoal(this, 1.0D, 40, 64.0F));
    }
    @Override
    public void performRangedAttack(LivingEntity entity, float range) {
        if(isAlive()) {
            if(getTarget() != null) {
                Vec3 vector3d = this.getViewVector(1.0F);
                double d0 = getTarget().getX() - (getX() + vector3d.x * 4D);
                double d1 = getTarget().getY(.5) - (.5 + getY(.5));
                double d2 = getTarget().getZ() - (getZ() + vector3d.z * 4D);
                double d3 = (double) Math.sqrt(d0 * d0 + d2 * d2);
                EntityEnderTripletsFireball shot = new EntityEnderTripletsFireball(level(), this, d0, d1, d2);
                shot.shoot(d0, d1 + d3 * .2D, d2, 3.3F, .2F);
                if(!level().isClientSide()) level().addFreshEntity(shot);
                playSound(SoundEvents.FOX_TELEPORT);
            }
        }
    }
    public static boolean enderTripletSpawnRule(EntityType<? extends Entity> e, ServerLevelAccessor l, MobSpawnType t, BlockPos p, RandomSource r) {
		return p.getY() > 60;
	}
}
