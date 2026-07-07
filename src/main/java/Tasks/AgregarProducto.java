package Tasks;

import Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AgregarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomePage.PRODUCTO_SAMSUNG),
                Click.on(HomePage.BTN_ADD_CART)
        );


        new WebDriverWait(
                BrowseTheWeb.as(actor).getDriver(),
                Duration.ofSeconds(5)
        )
                .until(ExpectedConditions.alertIsPresent());


        BrowseTheWeb.as(actor)
                .getDriver()
                .switchTo()
                .alert()
                .accept();

    }


    public static Performable ahora() {

        return new AgregarProducto();

    }

}