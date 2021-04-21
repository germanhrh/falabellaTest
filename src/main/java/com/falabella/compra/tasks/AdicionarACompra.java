package com.falabella.compra.tasks;

import com.falabella.compra.interactions.Esperar;
import com.falabella.compra.models.DatosResumen;
import com.falabella.compra.userinterface.AdicionarACompraPage;
import com.falabella.compra.userinterface.CarritoAgregarPage;
import com.falabella.compra.utils.Constantes;
import com.falabella.compra.utils.ObtenerDigitosEnCadena;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AdicionarACompra implements Task {

    private String precioSeguro;


    public static AdicionarACompra seguro() {
        return Tasks.instrumented(AdicionarACompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AdicionarACompraPage.btnVerBolsaCompra, isVisible()),
                Click.on(AdicionarACompraPage.SelectNoSeguro),
                Esperar.milisegundos(1000),
                Click.on(AdicionarACompraPage.SelectSeguro),
                Esperar.milisegundos(1000)
        );

        precioSeguro = ObtenerDigitosEnCadena.getNumero(AdicionarACompraPage.SelectSeguro.resolveFor(actor).getText());
        Constantes.datosResumen.setValorSeguro(Double.parseDouble(precioSeguro));

        actor.attemptsTo(
                Click.on(AdicionarACompraPage.btnVerBolsaCompra)
        );

    }
}
