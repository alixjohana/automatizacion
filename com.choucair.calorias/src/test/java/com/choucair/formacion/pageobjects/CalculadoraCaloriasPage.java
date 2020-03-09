package com.choucair.formacion.pageobjects;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.caloriasdiarias.es/")
public class CalculadoraCaloriasPage extends PageObject{
	
	@FindBy(id="sexo")
	public WebElementFacade selecSexo;
	
	@FindBy(id="altura")
	public WebElementFacade txtAltura;
	
	@FindBy(id="peso")
	public WebElementFacade txtPeso;
	
	@FindBy(id="edad")
	public WebElementFacade txtEdad;
	
	@FindBy(id="nivelActividad")
	public WebElementFacade selecNivelActividad;
	
	@FindBy(xpath="//*[@id='formulario1']/fieldset/table/tbody/tr/td/div/input")
	public WebElementFacade btnCalcular;
	
	@FindBy(xpath="//*[@id=\"resultado1\"]")
	public WebElementFacade resultadoKcal;
	
	public void seleccionarSexo(String sexo) {
//		System.out.println(sexo);
		selecSexo.click();
		selecSexo.selectByVisibleText(sexo);
	}
	public void ingresarAltura (String altura) {
		txtAltura.click();
		txtAltura.clear();
		txtAltura.sendKeys(altura);
	}
	public void ingresarPeso (String peso) {
		txtPeso.click();
		txtPeso.clear();
		txtPeso.sendKeys(peso);
	}
	public void ingresarEdad (String edad) {
		txtEdad.click();
		txtEdad.clear();
		txtEdad.sendKeys(edad);
	}
	public void seleccionarNivelActividad(String nivelActividad) {
		selecNivelActividad.click();
		selecNivelActividad.selectByVisibleText(nivelActividad);
	}
	public void calcular() {
		btnCalcular.click();
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {}
		new Actions(getDriver()).moveToElement(resultadoKcal).perform();
		Serenity.takeScreenshot();
		
	}
	public void calculoExitoso() {
//		System.out.println(resultadoKcal.getTextValue());
//		System.out.println(resultadoKcal.getTextValue().equals(""));
//		System.out.println(resultadoKcal.getTextValue().isEmpty());
//		System.out.println(resultadoKcal.getTextValue().equals("NaN"));
		assertFalse(resultadoKcal.getTextValue().equals(""));
		assertFalse(resultadoKcal.getTextValue().isEmpty());
		assertFalse(resultadoKcal.getTextValue().equals("NaN"));
	}
	

}
