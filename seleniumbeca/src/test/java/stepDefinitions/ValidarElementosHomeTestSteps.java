package stepDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ValidarElementosHome;
import pages.VerOfertas;

public class ValidarElementosHomeTestSteps {
    ValidarElementosHome elementosHome = new ValidarElementosHome();

    @Quando("eu verifico os itens na tela")
    public void verificarElementos() {
        elementosHome.validarMenu();
        elementosHome.validarCategorias();
        elementosHome.carrosMaisUsados();
        elementosHome.validarSecaoWebmotors();
    }

    @Entao("deve conter todos os itens")
    public void verificarPaginaHome() {
        elementosHome.validarPagina();
    }
}
