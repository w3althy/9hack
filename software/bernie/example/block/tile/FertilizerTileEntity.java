package software.bernie.example.block.tile;

import net.minecraft.tileentity.TileEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class FertilizerTileEntity extends TileEntity implements IAnimatable {
   private final AnimationFactory manager = new AnimationFactory(this);

   private <E extends TileEntity & IAnimatable> PlayState predicate(AnimationEvent<E> event) {
      event.getController().transitionLengthTicks = 0.0D;
      if (((TileEntity)event.getAnimatable()).func_145831_w().func_72896_J()) {
         event.getController().setAnimation((new AnimationBuilder()).addAnimation("fertilizer.animation.deploy", true).addAnimation("fertilizer.animation.idle", true));
      } else {
         event.getController().setAnimation((new AnimationBuilder()).addAnimation("Botarium.anim.deploy", true).addAnimation("Botarium.anim.idle", true));
      }

      return PlayState.CONTINUE;
   }

   public void registerControllers(AnimationData data) {
      data.addAnimationController(new AnimationController(this, "controller", 0.0F, this::predicate));
   }

   public AnimationFactory getFactory() {
      return this.manager;
   }
}
