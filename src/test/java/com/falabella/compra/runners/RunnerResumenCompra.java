package com.falabella.compra.runners;

import cucumber.api.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ResumenCompra.feature",
        tags = "@ResumenCompra",
        glue = "com.falabella.compra.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)


public class RunnerResumenCompra {

}
