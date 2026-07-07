package Tasks;

import Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrAlCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(HomePage.BTN_CART)

        );

    }

    public static Performable ahora() {

        return new IrAlCarrito();

    }

}