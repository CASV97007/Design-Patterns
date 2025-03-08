package com.casv.simuduckapp;

import com.casv.simuduckapp.model.MallardDuck;
import com.casv.simuduckapp.model.RedHeadDuck;

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
        MallardDuck duck = new MallardDuck();
        duck.quack();
        duck.swim();
        duck.display();
        RedHeadDuck duck2 = new RedHeadDuck();
        duck2.quack();
        duck2.swim();
        duck2.display();

    }

}