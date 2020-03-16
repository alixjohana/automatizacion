package com.choucair.formacion.definition;

import com.choucair.formacion.steps.CompraVirtualProductoSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraVirtualProductoDefinition {
	
	@Steps
	CompraVirtualProductoSteps compraVirtualProductoSteps;
	
	@Given("^el usuario realiza la busqueda del articulo (.+)$")
    public void el_usuario_realiza_la_busqueda_del_articulo(String articulo) {
		System.out.println(articulo);
		compraVirtualProductoSteps.buscarArticulo(articulo);
    }

	@Given("^lo agrega al carrito de compras$")
	public void lo_agrega_al_carrito_de_compras() {
		compraVirtualProductoSteps.agregarArticuloCarritoCompras();
	}

    @When("^confirma la orden con las credenciales (.+) y (.+)$")
    public void confirma_la_orden_con_las_credenciales_y(String email, String password){
		compraVirtualProductoSteps.verificarResumenCompra();
		compraVirtualProductoSteps.autenticar(email, password);
    }
    
    @And("^selecciona pagar por (.+)$")
    public void selecciona_pagar_por(String metodopago) {
		compraVirtualProductoSteps.diligenciarDatosPago(metodopago);
    }

	@Then("^se confirma la compra$")
	public void se_confirma_la_compra() {
		compraVirtualProductoSteps.verificarConfirmacionCompra();
	}

}
