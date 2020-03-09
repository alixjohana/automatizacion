package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.CalculadoraCaloriasPage;

import net.thucydides.core.annotations.Step;

public class CalculadoraCaloriasSteps {
	
	CalculadoraCaloriasPage calculadoraCaloriasPage;
	
	@Step
	public void abrirCalculadora() {
		calculadoraCaloriasPage.open();
	}

	@Step
	public void ingresarDatos(String sexo, String altura, String peso, String edad, String nivelactividad) {
		calculadoraCaloriasPage.seleccionarSexo(sexo);
		calculadoraCaloriasPage.ingresarAltura(altura);
		calculadoraCaloriasPage.ingresarPeso(peso);
		calculadoraCaloriasPage.ingresarEdad(edad);
		calculadoraCaloriasPage.seleccionarNivelActividad(nivelactividad);
		calculadoraCaloriasPage.calcular();
	}

	@Step
	public void verificar() {
		calculadoraCaloriasPage.calculoExitoso();
	}

}
