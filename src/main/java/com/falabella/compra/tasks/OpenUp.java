package com.falabella.compra.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import com.falabella.compra.userinterface.GooglePage;


public class OpenUp  implements Task {

    private GooglePage googlePage;

    public static OpenUp google() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googlePage));
    }
}
