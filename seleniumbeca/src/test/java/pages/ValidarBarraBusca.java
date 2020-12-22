package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidarBarraBusca extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public ValidarBarraBusca() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void pesquisar() {
        preencherTextoElemento(By.className("SearchBar__input"), "Jetta");
    }

    public void redirecionarBusca() {
        if (_Driver().getPageSource().contains("Jetta")) {
            By locatorResultado = By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/div/div/div/div/a");

            WebDriverWait wait = new WebDriverWait(_Driver(), 15);
            wait.until(ExpectedConditions.elementToBeClickable(locatorResultado));

            WebElement resultado = _Driver().findElement(locatorResultado);
            resultado.click();

        }
    }
}
