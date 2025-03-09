package com.casv.simuduckapp.model;

/*Implementacion incorrecta por que el pato de goma, no puede volar, es ilógico hacer que herede del de Duck */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        log.warning("Looks like rubberduck");
    }
    /*
     * Caso mal formado,para que este pato no haga nada en la acción de volar
     * tendría que sobreescribirse sin implementacion concreta, y así con todas las
     * nuevas clases que hereden de Duck
     */

    @Override
    public void fly() {
        // no hacer nada
    }
}
