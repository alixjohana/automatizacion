package com.choucair.formacion.pageobjects;

import static org.junit.Assert.assertTrue;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com")
public class OrdenPage extends PageObject{
	
	@FindBy(id="search_query_top")
	public WebElementFacade campoSearch;
	
	@FindBy(name = "submit_search")
	public WebElementFacade btnSearch;
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li/div")
	public WebElementFacade resultadoBusqueda;
	
	@FindBy(id = "add_to_cart")
	public WebElementFacade btnAddToCart;
	
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
	public WebElementFacade tituloResumenCompra;
	
	@FindBy(className = "btn btn-default button button-medium")
	public WebElementFacade btnProceedToCheckout;

	
	public void buscarArticulo(String articulo) {
		campoSearch.click();
		campoSearch.clear();
		campoSearch.sendKeys(articulo);
		btnSearch.click();
		resultadoBusqueda.click();
	}
	
	public void agregarArticuloCarritoCompras() {
		btnAddToCart.click();
		String mensajeConfirmacion = "Product successfully added to your shopping cart";
		assertTrue(tituloResumenCompra.getText().equals(mensajeConfirmacion));
		btnProceedToCheckout.click();
	}

}
