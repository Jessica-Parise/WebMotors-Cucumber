package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pages.MaisInformacoesFooter;

public class MaisInformacoesFooterTestsSteps {
    MaisInformacoesFooter maisInformacoes = new MaisInformacoesFooter();

    @Dado("que eu acesso a pagina inicial da WebMotors")
    public void irAteSite() {
        maisInformacoes.navegarAteSite("https://www.webmotors.com.br/");
    }

    @Quando("eu clico no botão mais informações")
    public void clicarMaisInformacoes(){
        maisInformacoes.btnMaisInformacoes();
    }

    @Então("a página mostra os dados do footer")
    public void verificarElementosFooter() {
        maisInformacoes.verificarElementos();
    }
}
