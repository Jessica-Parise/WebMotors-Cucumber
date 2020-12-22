package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class ValidarElementosHome extends CommonsBasePage {
    WebDriverWait wait;
    Actions builder;

    public ValidarElementosHome() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void validarMenu(){
        String[] elementos = {"Comprar", "Vender", "Serviços", "Ajuda", "Entrar"};

        for (String palavra : elementos) {
            _Driver().getPageSource().contains(palavra);
        }
    }

    public void validarCategorias(){
        String[] categorias = {"Sedans", "SUVs", "Frontier 2020", "Carros para família", "Carros a diesel", "Carros de luxo", "Carros econômicos", "Carros antigos", "Conversíveis", "Carros híbridos"};

        for (String cat : categorias) {
            _Driver().getPageSource().contains(cat);
        }
    }

    public void carrosMaisUsados(){
        String[] carros = {"CIVIC", "COROLLA", "FIT", "GOL", "GOLF", " JETTA", "S10", "PALIO", "HB20", "ECOSPORT"};

        for (String carro : carros) {
            _Driver().getPageSource().contains(carro);
        }

    }

    public void validarSecaoWebmotors(){
        String[] webmotors = {"Financiamento", "Venda seu veículo", "Catálogo de 0KM", "Seguro", "Tabela Fipe"};

        for (String web : webmotors) {
            _Driver().getPageSource().contains(web);
        }
    }

    public void validarPagina() {
        assertEquals(_Driver().getTitle(), "Webmotors | Compre, venda e financie carros usados, novos e motos");
    }
}
