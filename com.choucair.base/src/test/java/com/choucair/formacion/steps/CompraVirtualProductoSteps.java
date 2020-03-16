package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.CarroComprasPage;
import com.choucair.formacion.pageobjects.OrdenPage;

import net.thucydides.core.annotations.Step;

public class CompraVirtualProductoSteps {
	
	OrdenPage ordenPage;
	CarroComprasPage carroComprasPage;

	@Step
	public void buscarArticulo(String articulo) {
		ordenPage.open();
		ordenPage.buscarArticulo(articulo);
	}

	@Step
	public void agregarArticuloCarritoCompras() {
		ordenPage.agregarArticuloCarritoCompras();
	}

	@Step
	public void verificarResumenCompra() {
		carroComprasPage.verificarResumenCompra();
	}

	@Step
	public void autenticar(String email, String password) {
		carroComprasPage.autenticar(email, password);
	}

	@Step
	public void diligenciarDatosPago(String metodopago) {
		carroComprasPage.diligenciarDatosPago(metodopago);
	}

	@Step
	public void verificarConfirmacionCompra() {
		carroComprasPage.verificarConfirmacionCompra();
	}

}
