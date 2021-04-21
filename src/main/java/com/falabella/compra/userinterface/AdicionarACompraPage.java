package com.falabella.compra.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdicionarACompraPage extends PageObject {


    public static final Target SelectSeguro = Target.the("where do we click Seguro").located(By.xpath("//*[@id='__next']//div/div[1]/div[1]//button/span[contains(.,'Gold Protection')]"));
    public static final Target SelectNoSeguro = Target.the("where do we click No Gracias").located(By.xpath("//*[@id='__next']//div/div/div/div/div/div/div/button[contains(.,'No, gracias')]"));
    public static final Target btnVerBolsaCompra = Target.the("where do we click").located(By.xpath("//*[@id='linkButton']"));
}
