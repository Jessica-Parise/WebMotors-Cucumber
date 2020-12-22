package stepDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LinkVender;

public class LinkVenderTestSteps {
    LinkVender linkVender = new LinkVender();

    @Quando("eu clicar no link de vender")
    public void navegarLinkVender() {
        linkVender.navegarAteLinkVender();
    }

    @Entao("o usuário será redirecionado e deve contar na página o titulo respectivamente")
    public void verificarPagina() {
        linkVender.verificarTituloVender();
    }
}
