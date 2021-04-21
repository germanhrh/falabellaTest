package com.falabella.compra.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarPage extends PageObject {

    public static final Target ImputBuscar = Target.the("where do we write the search").located(By.xpath("//input[@title='Buscar']"));
    public static final Target Linkfalabella = Target.the("where do we clic link falabella").located(By.xpath("//a[@href='https://www.falabella.com.co/falabella-co/']"));

}
