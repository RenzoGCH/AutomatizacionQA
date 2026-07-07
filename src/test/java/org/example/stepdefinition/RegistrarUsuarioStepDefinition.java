package org.example.stepdefinition;

import Tasks.NavigateTo;
import Tasks.RegistrarUsuario;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegistrarUsuarioStepDefinition {
    @Given("el {actor} esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @When("se registra con un nombre de usuario {string} y contrasenia {string}")
    public void seRegistraConUnNombreDeUsuarioYContrasenia(String usuario, String password) {
        // Write code here that turns the phrase above into concrete actions

        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.withData(usuario,password));
    }

    @Then("se realiza el registro de manera exitosa")
    public void seRealizaElRegistroDeManeraExitosa() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("EXITOSO");
    }


}
