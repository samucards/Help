package tests;

import Elementos.elementos;
import Metodos.metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {

	elementos El = new elementos();
	metodos Met = new metodos();

	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		Met.abrirSite(site, "CHROME");

	}

	@When("^e pesquise o produto$")
	public void e_pesquise_o_produto() throws Throwable {
		Met.prencher(El.getCampoDePesquisa(), "panela");
		Met.pausa(5000);
		Met.clicar(El.getLupaDePesquisa());
		Met.pausa(4000);
		Met.clicar(El.getProduto());
		Met.pausa(4000);
		Met.clicar(El.getBtnComprar());
		Met.pausa(4000);
		Met.clicar(El.getBtnContinuar());
		
		
		
	}

	@Then("^conclua minha compra$")
	public void conclua_minha_compra() throws Throwable {

	}

}
