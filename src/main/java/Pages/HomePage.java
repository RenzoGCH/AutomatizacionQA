package Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {

    public static final Target BTN_SING_UP = Target.the("Boton para hacer el Registro")
            .located(By.id("signin2"));
    public static final Target REGISTER = Target.the("Campo de Registro")
            .located(By.id("sign-username"));
    public static final Target PASS_WORD= Target.the("Campo de Contrasena")
            .located(By.id("sign-password"));
    public static final Target BIN_REGISTER= Target.the("Boton para Registrar")
            .located(By.xpath("//button[text()='Sign up']"));

    //Producto Samsung Galaxy S6
    public static final Target PRODUCTO_SAMSUNG =
            Target.the("Producto Samsung")
                    .located(By.linkText("Samsung galaxy s6"));

    //Botón Add to cart
    public static final Target BTN_ADD_CART =
            Target.the("Agregar al carrito")
                    .located(By.linkText("Add to cart"));

    //Menú Cart
    public static final Target BTN_CART =
            Target.the("Carrito")
                    .located(By.id("cartur"));

    //Producto dentro del carrito
    public static final Target PRODUCTO_CARRITO =
            Target.the("Producto del carrito")
                    .located(By.xpath("//tbody/tr/td[2]"));

}
