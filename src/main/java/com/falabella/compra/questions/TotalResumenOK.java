package com.falabella.compra.questions;

import com.falabella.compra.userinterface.ResumenCompraPage;
import com.falabella.compra.utils.ObtenerDigitosEnCadena;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TotalResumenOK implements Question<String> {

    public static Question<String> value()
    {
        return new TotalResumenOK();
    }

    @Override
    public String answeredBy(Actor actor) {

        return ObtenerDigitosEnCadena.getNumero(ResumenCompraPage.TotalResumen.resolveFor(actor).getText());
    }
}
