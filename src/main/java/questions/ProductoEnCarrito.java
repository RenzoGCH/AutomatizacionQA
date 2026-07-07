package questions;


import Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ProductoEnCarrito implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(HomePage.PRODUCTO_CARRITO)
                .answeredBy(actor);

    }

    public static ProductoEnCarrito nombre(){

        return new ProductoEnCarrito();

    }

}