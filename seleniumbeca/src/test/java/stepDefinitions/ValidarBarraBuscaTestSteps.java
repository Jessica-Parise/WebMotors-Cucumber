package stepDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ValidarBarraBusca;

public class ValidarBarraBuscaTestSteps {
    ValidarBarraBusca barraBusca = new ValidarBarraBusca();

    @Quando("eu clicar na barra de busca e pesquisar o produto")
    public void clicarBarraBusca() {
        barraBusca.pesquisar();
    }

    @Entao("o usuário será redirecionado para o item pesquisado")
    public void redirecionarPesquisa() {
        barraBusca.redirecionarBusca();
    }
}