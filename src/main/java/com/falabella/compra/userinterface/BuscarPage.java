package com.falabella.compra.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarPage extends PageObject {

    public static final Target InputBuscar = Target.the("where do we write the search").located(By.xpath("//*[contains(@class,'d-none d-lg-block')]//input[@data-testid='input-search-box']"));
    public static final Target InputPaginaDos = Target.the("where do we write the search").located(By.xpath("//*[@id='testId-pagination-top-button2']"));


}
