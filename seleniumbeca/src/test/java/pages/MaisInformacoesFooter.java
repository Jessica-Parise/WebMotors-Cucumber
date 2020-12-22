package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class MaisInformacoesFooter extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public MaisInformacoesFooter() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }


    public void btnMaisInformacoes() {
        aceitarCookies();
        clicarElemento(By.xpath("/html/body/div[1]/footer/div/div[1]/div/span"));
    }

    public void verificarElementos() {
        String[] elementosMaisInformacoes = {"Buscar por regiões", "Marcas mais populares", "Modelos mais populares"
        };

        for (String elemento : elementosMaisInformacoes) {
            _Driver().getPageSource().contains(elemento);

        }
    }
}
