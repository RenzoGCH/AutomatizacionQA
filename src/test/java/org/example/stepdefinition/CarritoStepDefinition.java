package org.example.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.actors.OnStage;
import questions.ProductoEnCarrito;
import Tasks.AgregarProducto;
import Tasks.IrAlCarrito;
import static org.hamcrest.Matchers.equalTo;

public class CarritoStepDefinition {

    @When("agrega un producto al carrito")
    public void agregaProducto(){

        OnStage.theActorInTheSpotlight().attemptsTo(

                AgregarProducto.ahora()

        );

    }
    @When("ingresa al carrito")
    public void entraAlCarrito(){

        OnStage.theActorInTheSpotlight().attemptsTo(

                IrAlCarrito.ahora()

        );

    }

    @Then("visualiza el producto {string}")
    public void validaProducto(String producto){

        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        ProductoEnCarrito.nombre(),
                        equalTo(producto)
                )
        );
    }


}