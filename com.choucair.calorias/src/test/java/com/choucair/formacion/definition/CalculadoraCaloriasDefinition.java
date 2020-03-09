package com.choucair.formacion.definition;

import com.choucair.formacion.steps.CalculadoraCaloriasSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CalculadoraCaloriasDefinition {
	
	@Steps
	CalculadoraCaloriasSteps calculadoraCaloriasSteps;
	
	@Given("^el usuario ingresa a la calculadora$")
    public void elUsuarioIngresaALaCalculadora()  {
		calculadoraCaloriasSteps.abrirCalculadora();

    }
	
    @When("^diligencia el formulario con los siguientes datos (.+), (.+), (.+), (.+), (.+)$")
    public void diligenciaElFormularioConLosSiguientesDatos(String sexo, String altura, String peso, String edad, String nivelactividad) {
//    	System.out.println("Dato"+sexo);
//    	System.out.println("Dato"+altura);
//    	System.out.println("Dato"+peso);
//    	System.out.println("Dato"+edad);
//    	System.out.println("Dato"+nivelactividad);
    	calculadoraCaloriasSteps.ingresarDatos(sexo, altura, peso, edad, nivelactividad);
    }
	
    @Then("^verifica el calculo de calorias$")
    public void verificaElCalculoDeCalorias() {
    	calculadoraCaloriasSteps.verificar();
    }

}
