package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/CalculadoraCalorias.feature", tags = "@Scenario1")
//@CucumberOptions (features = "src/test/resources/features/demo.feature", tags = "@Scenario2")
public class RunnerTags {

}
