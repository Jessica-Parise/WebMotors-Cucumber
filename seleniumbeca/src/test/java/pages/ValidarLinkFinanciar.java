package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidarLinkFinanciar extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public ValidarLinkFinanciar() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void navegarAteLinkFinanciar() {
        clicarElemento(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[1]/h2[3]/a"));
        navegar();
    }

    public void verificarTitulo() {
        verificarTitulo("Financiamento de Veículos: Saiba + e veja parcelas | Webmotors");
    }
}
