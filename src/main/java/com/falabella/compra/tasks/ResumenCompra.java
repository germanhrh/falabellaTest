package com.falabella.compra.tasks;

import com.falabella.compra.questions.TotalResumenOK;
import com.falabella.compra.userinterface.AdicionarACompraPage;
import com.falabella.compra.userinterface.ResumenCompraPage;
import com.falabella.compra.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.core.IsEqual.equalTo;

public class ResumenCompra implements Task {

    private String precio;
    private String[] valor;
    public static ResumenCompra Validar() {
        return Tasks.instrumented(ResumenCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(ResumenCompraPage.TotalResumen, isVisible()));
        precio = Constantes.datosResumen.getTotal();
        valor = precio.split("\\.");

        actor.should(seeThat("Displayed ", TotalResumenOK.value(), equalTo(valor[0]))
        );


    }
}
