package com.falabella.compra.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoAgregarPage extends PageObject {

    public static final Target LinkArticuloElegido = Target.the("where do we select Articulo").located(By.xpath("//*[@id='testId-searchResults-products']/div[2]/div"));
    public static final Target btnAgragar = Target.the("where do we click agregar").located(By.xpath("//*[@id='testId-searchResults-products']/div[2]/div//div[contains(.,'Agregar a la Bolsa')]"));
    public static final Target BtnAgregarALaBolsa = Target.the("where do we click agregar a la bolsa").located(By.xpath("//*[@id='buttonForCustomers']/button"));
    public static final Target LblPrecio = Target.the("where do we click agregar a la bolsa").located(By.xpath("//ol/li[2]/div/span[contains(@class, 'normal')]"));

}