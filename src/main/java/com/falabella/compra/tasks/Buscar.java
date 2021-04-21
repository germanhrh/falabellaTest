package com.falabella.compra.tasks;

import com.falabella.compra.interactions.Esperar;
import com.falabella.compra.userinterface.BuscarPage;
import com.falabella.compra.userinterface.IngresarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class Buscar implements Task {

    public static Buscar Articulo() {
        return Tasks.instrumented(Buscar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(BuscarPage.InputBuscar,isEnable()),
                Enter.keyValues("Celular").into(BuscarPage.InputBuscar).thenHit(Keys.ENTER),
                Esperar.milisegundos(1000),
                Click.on(BuscarPage.InputPaginaDos)
        );



    }
}
