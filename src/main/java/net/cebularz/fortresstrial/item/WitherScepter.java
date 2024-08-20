package net.cebularz.fortresstrial.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WitherScepter extends Item {

    public WitherScepter(Properties pProperties) {
        super(pProperties);
    }
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, @NotNull Player pPlayer, @NotNull InteractionHand pUsedHand) {
        ItemStack item = pPlayer.getItemInHand(pUsedHand);
        if (pPlayer instanceof Player) {
            if (!pPlayer.isCreative()){
                pPlayer.getCooldowns().addCooldown(this, 10);}
                item.hurtAndBreak(1, pPlayer, LivingEntity.getSlotForHand(pUsedHand));
            Vec3 vec3 = new Vec3(0,0,0);

            for(int i =0;i<5;i++) {
                WitherSkull witherskull = new WitherSkull(pPlayer.level(), pPlayer, vec3);
                witherskull.setOwner(pPlayer);

                witherskull.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.5F, 5.0F);
                pPlayer.level().addFreshEntity(witherskull);
            }
            pPlayer.playSound(SoundEvents.WITHER_SHOOT, 1f, 1f);
        }
        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pUsedHand);
    }
}
