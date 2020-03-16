package com.choucair.formacion.pageobjects;

import static org.junit.Assert.assertTrue;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarroComprasPage extends PageObject{
	
	@FindBy(id="cart_title")
	public WebElementFacade tituloCarritoCompras;
	
	@FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]/span")
	public WebElementFacade btnProceedToCheckout;
	
	@FindBy(id="email")
	public WebElementFacade campoEmail;
	
	@FindBy(id="passwd")
	public WebElementFacade campoPassword;
	
	@FindBy(id="SubmitLogin")
	public WebElementFacade btnSingIn;
	
	@FindBy(name = "processAddress")
	public WebElementFacade btnProceedToCheckout2;
	
	@FindBy(name = "processCarrier")
	public WebElementFacade btnProceedToCheckout3;
	
	@FindBy(id = "cgv")
	public WebElementFacade checkboxAgree;
	
	@FindBy(className = "bankwire")
	public WebElementFacade payByBank;
	
	@FindBy(className = "cheque")
	public WebElementFacade payByCheck;
	
	@FindBy(className = "button btn btn-default button-medium")
	public WebElementFacade btnIConfirmMyOrder;
	
	@FindBy(id = "step_end")
	public WebElementFacade pestañaPayment;
	
	@FindBy(className = "page-heading")
	public WebElementFacade tituloPayment;
	
	@FindBy(className = "page-subheading")
	public WebElementFacade subtituloPayment;
	
	public void verificarResumenCompra() {
		String tituloCarrito = "SHOPPING-CART SUMMARY";
		assertTrue(tituloCarritoCompras.getText().equals(tituloCarrito));
		btnProceedToCheckout.click();		
	}

	public void autenticar(String email, String password) {
		campoEmail.click();
		campoEmail.clear();
		campoEmail.sendKeys(email);
		campoPassword.click();
		campoPassword.clear();
		campoPassword.sendKeys(password);
		btnSingIn.click();
		btnProceedToCheckout2.click();
		checkboxAgree.click();
		btnProceedToCheckout3.click();
	}


	public void diligenciarDatosPago(String metodopago) {
		
		if (metodopago == "bank") {
			payByBank.click();
			btnIConfirmMyOrder.click();
			
		}else if (metodopago == "check") {
			payByCheck.click();
			btnIConfirmMyOrder.click();
			
		}else {
			System.out.println("No se reconoce metodo de pago");
		}
	}


	public void verificarConfirmacionCompra() {
		String tituloConfirmacion = "ORDER CONFIRMATION";
		String subtituloConfirmacion = "YOUR CHECK MUST INCLUDE:";
		
		assertTrue(tituloPayment.getText().equals(tituloConfirmacion));
		assertTrue(subtituloPayment.getText().equals(subtituloConfirmacion));
		assertTrue(pestañaPayment.isEnabled());
		
	}

}
