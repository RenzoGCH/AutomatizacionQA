package Pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target LINK_CART =
            Target.the("Carrito")
                    .located(By.id("cartur"));

    public static final Target BTN_ADD =
            Target.the("Agregar al carrito")
                    .located(By.linkText("Add to cart"));

    public static final Target PRODUCTO =
            Target.the("Producto del carrito")
                    .located(By.xpath("//tbody/tr/td[2]"));

}