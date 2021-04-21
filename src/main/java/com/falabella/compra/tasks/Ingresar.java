package com.falabella.compra.tasks;

import com.falabella.compra.interactions.Esperar;
import com.falabella.compra.userinterface.IngresarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Ingresar implements Task {

    public static Ingresar falabellaPage() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues("falabella").into(IngresarPage.ImputBuscar).thenHit(Keys.ENTER),
                Click.on(IngresarPage.Linkfalabella)
        );
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();
        actor.attemptsTo(
        Esperar.milisegundos(2000));

    }
}
