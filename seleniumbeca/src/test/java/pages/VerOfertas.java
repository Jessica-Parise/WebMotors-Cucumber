package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class VerOfertas extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public VerOfertas() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void clicarVerOfertas(){
        clicarElemento(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a"));
    }

    public void validarPagina() {
        assertTrue("URL não contém garagem", wait.until(ExpectedConditions.urlContains("verofertas")));
    }
}
