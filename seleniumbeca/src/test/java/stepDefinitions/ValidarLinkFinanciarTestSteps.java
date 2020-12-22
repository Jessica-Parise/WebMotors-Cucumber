package stepDefinitions;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ValidarLinkFinanciar;

public class ValidarLinkFinanciarTestSteps {
    ValidarLinkFinanciar link = new ValidarLinkFinanciar();

    @Quando("eu clico no link financiar")
    public void clicarLinkFinanciar(){
        link.navegarAteLinkFinanciar();
    }

    @Então("a página é redirecionada e muda o titulo")
    public void verificarTituloFinanciar() {
        link.verificarTitulo();
    }
}
