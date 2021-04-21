package com.falabella.compra.stepsdefinitions;

import com.falabella.compra.models.DatosResumen;
import com.falabella.compra.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ResumenCompraStepsDefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que un cliente abre la pagina de google$")
    public void queUnClienteAbreLaPaginaDeGoogle() {
        OnStage.theActor("Cliente").wasAbleTo(OpenUp.google());
    }

    @When("^busca e ingresa a la pagina de falabella$")
    public void buscaEIngresaALaPaginaDeFalabella() {
        OnStage.theActor("Cliente").wasAbleTo(Ingresar.falabellaPage());
    }

    @When("^ingresa el nombre de un articulo en el buscador y presiona enter$")
    public void ingresaElNombreDeUnArticuloEnElBuscadorYPresionaEnter() {
        OnStage.theActor("Cliente").wasAbleTo(Buscar.Articulo());
    }

    @When("^selecciona y agrega un articulo al carrito de compras$")
    public void seleccionaYAgregaUnArticuloAlCarritoDeCompras() {
        OnStage.theActor("Cliente").wasAbleTo(CarritoAgregar.articulo());
    }

    @When("^adiciona un seguro para el articulo en la compra$")
    public void adicionaUnSeguroParaElArticuloEnLaCompra() {
        OnStage.theActor("Cliente").wasAbleTo(AdicionarACompra.seguro());
    }

    @Then("^valido la correcta generacion del resumen de la compra$")
    public void validoLaCorrectaGeneracionDelResumenDeLaCompra() {
        OnStage.theActor("Cliente").wasAbleTo(ResumenCompra.Validar());

    }

}
