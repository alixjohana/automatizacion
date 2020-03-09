#Author: adiaz@choucairtesting.com
@Regresion
Feature: Calculadora de calorias
  El usuario desea poder realizar el calculo de calorias

  @Scenario1
  Scenario Outline: Calculo de calorias
    Given el usuario ingresa a la calculadora
    When diligencia el formulario con los siguientes datos <sexo>, <altura>, <peso>, <edad>, <nivelActividad>
    Then verifica el calculo de calorias

    Examples: 
      | sexo		| altura | peso 	| edad 	| nivelActividad																			|
      | Hombre	|	170		 | 80		 	|	32		| Poco activo: ejercicio 1-3 veces por semana					|
      | Mujer		| 164		 | 67			|	28		|	Medianamente activo: ejercicio 3-5 veces por semana	|
