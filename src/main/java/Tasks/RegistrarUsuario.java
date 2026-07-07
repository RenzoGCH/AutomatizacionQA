package Tasks;

import Pages.HomePage;
import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class RegistrarUsuario implements Task {

    private final String username;
    private final String password;


    public RegistrarUsuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

                Click.on(HomePage.BTN_SING_UP),
                Enter.theValue(username).into(HomePage.REGISTER),
                Enter.theValue(password).into(HomePage.PASS_WORD),
                Click.on(HomePage.BIN_REGISTER)

        );


    }
    public static Performable withData(String username, String password){
        return new RegistrarUsuario(username,password);

    }
}
