package com.falabella.compra.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Esperar implements Interaction {

    public long milisegundos;

    public Esperar(long tiempo) {
        this.milisegundos = tiempo;
    }

    public static Esperar milisegundos(long tiempo) {
        return Tasks.instrumented(Esperar.class, tiempo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
