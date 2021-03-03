package tests;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ContaMicrosoft;
import pages.HomePage;
import pages.Metodos;

public class Steps extends Metodos {

	Metodos metodos = new Metodos();
	HomePage hp = new HomePage();
	ElementosWeb el = new ElementosWeb();
	HomePage cotacao = new HomePage();
	ContaMicrosoft cm = new ContaMicrosoft();

	@Dado("que esteja no site {string}")
	public void que_esteja_no_site(String appUrl) throws IOException, InterruptedException {
		metodos.abrirNavegador(appUrl, "CHROME", "acessando o site");
		hp.abrirConta(el.getCriarConta());
		cm.criarConta("renato.prova.entrevista");
		metodos.pausa(3000, "pauser");
		metodos.preencher(el.getPassoword(), "fc230978", "preenchendo senha");
		metodos.clicar(el.getBtnProximo(), "clicando no botao proximo");
	}

	@Quando("os dados obrigatorios validados")
	public void os_dados_obrigatorios_validados() throws IOException, InterruptedException {
		metodos.pausa(3000, "pausa para preencher");
		metodos.preencher(el.getNome(), "Renato", " Nome");
		metodos.preencher(el.getSobrenome(), "Gonçalves", " Nome");
		metodos.clicar(el.getBtnProximo1(), "clicando no botao proximo");
		metodos.pausa(3000, "pausa para preencher");
		metodos.selecionarComboTexto(el.getDia(), "12", "selecionando dia do nascimento");
		metodos.selecionarComboTexto(el.getMes(), "setembro", "selecionando dia do nascimento");
		metodos.selecionarComboTexto(el.getAno(), "1973", "selecionando dia do nascimento");
        metodos.clicar(el.getBtnProximo2(), "botao proximo");
	    metodos.pausa(10000, "pausa ");
	   
	}

	@Entao("email cadastrado com sucesso")
	public void email_cadastrado_com_sucesso() throws IOException {
		
		String Evidencia = null;
		metodos.screnShoot("./printEvidencia/" + Evidencia + ".png");
		metodos.fecharBrowser("fechando navegador");

	}

}
