package com.casv.simuduckapp;

import com.casv.simuduckapp.model.DecoyDuck;
import com.casv.simuduckapp.model.Duck;
import com.casv.simuduckapp.model.MallardDuck;
import com.casv.simuduckapp.model.RedHeadDuck;
import com.casv.simuduckapp.model.RubberDuck;

/**
 * The game can show a large variety of
 * duck species swimming and making quacking sounds. The initial
 * designers of the system used standard OO techniques and created
 * one Duck superclass from which all other duck types inherit.
 * 
 * @author Christan
 */
public class SimUDuck {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        Duck redheaDuck = new RedHeadDuck();
        redheaDuck.display();
        redheaDuck.performFly();
        redheaDuck.performQuack();
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }

}