package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkVender extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public LinkVender() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void navegarAteLinkVender() {
        clicarElemento(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[1]/h2[2]/a"));
        navegar();
    }

    public void verificarTituloVender() {
        verificarTitulo("Venda seu carro usado ou seminovo na Webmotors");
    }
}
