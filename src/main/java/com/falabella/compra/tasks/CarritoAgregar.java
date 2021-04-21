package com.falabella.compra.tasks;

import com.falabella.compra.interactions.Esperar;
import com.falabella.compra.models.DatosResumen;
import com.falabella.compra.userinterface.CarritoAgregarPage;
import com.falabella.compra.utils.Constantes;
import com.falabella.compra.utils.ObtenerDigitosEnCadena;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CarritoAgregar implements Task {


    private String precio;
    private DatosResumen datosResumen;

    public static CarritoAgregar articulo() {
        return Tasks.instrumented(CarritoAgregar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CarritoAgregarPage.LinkArticuloElegido, isVisible()),
                MoveMouse.to(CarritoAgregarPage.LinkArticuloElegido),
                Click.on(CarritoAgregarPage.btnAgragar));
        actor.attemptsTo(
                Esperar.milisegundos(1000),
                WaitUntil.the(CarritoAgregarPage.LblPrecio, isVisible())
        );


        precio = ObtenerDigitosEnCadena.getNumero(CarritoAgregarPage.LblPrecio.resolveFor(actor).getText());
        Constantes.datosResumen.setPrecio(Double.parseDouble(precio));

        actor.attemptsTo(
                Click.on(CarritoAgregarPage.BtnAgregarALaBolsa)
        );
    }
}
