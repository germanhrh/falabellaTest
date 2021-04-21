package com.falabella.compra.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ResumenCompraPage extends PageObject {

    public static final Target TotalResumen = Target.the("where do we validate TotalResumen").located(By.xpath("//*[@id='root']//form/div/div/div/p/span[contains(@class,'sub-totals__value')]"));
}
