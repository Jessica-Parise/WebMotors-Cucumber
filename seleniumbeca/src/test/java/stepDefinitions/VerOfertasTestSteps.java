package stepDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.VerOfertas;

public class VerOfertasTestSteps {
    VerOfertas verOfertas = new VerOfertas();

    @Quando("eu clico no botão ver ofertas")
    public void btnVerOferta() {
        verOfertas.clicarVerOfertas();
    }

    @Entao("é redirecionado para a página de ofertas")
    public void verificarPaginaOferta() {
        verOfertas.validarPagina();
    }
}
