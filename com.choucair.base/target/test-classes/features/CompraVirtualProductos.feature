#Author: adiaz@choucairtesting.com
@Regresion
Feature: Compra Virtual de Productos
  El usuario desea poder realizar la compra virtual de un producto

  @Escenario1
  Scenario Outline: Compra virtual de un producto 
    Given el usuario realiza la busqueda del articulo <articulo>
    And lo agrega al carrito de compras
    When confirma la orden con las credenciales <email> y <password>
    And selecciona pagar por <metodoPago>
    Then se confirma la compra

    Examples: 
      | articulo	|	email									|	password	| metodoPago	|
      | Blouse		|choucairdemo@gmail.com	|	Ch0ucair	|	bank				|
      | Blouse		|choucairdemo@gmail.com	|	Ch0ucair	|	check				|