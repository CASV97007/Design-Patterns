package com.casv.simuduckapp;

import com.casv.simuduckapp.model.Duck;
import com.casv.simuduckapp.model.ModelDuck;
import com.casv.simuduckapp.model.duck_behaviors.fly.impl.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        /*
         * The first call to performFly() delegates to the flyBehavior object set in the
         * ModelDuck’s constructor, which is a FlyNoWay instance.
         */
        model.performFly();
        model.performQuack();
        /*
         * This invokes the model’s inherited behavior setter method, and...voila! The
         * model suddenly has rocket-powered flying capability!
         */
        model.setFlyBehavior(new FlyRocketPowered());
        /*
         * If it worked, the model duck dynamically changed its flying behavior! You
         * can’t do THAT if the implementation lives inside the duck class.
         */
        model.performFly();
    }
}
