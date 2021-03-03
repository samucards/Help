package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import elementos.ElementosWeb;

public class ContaMicrosoft {

	Metodos metodos = new Metodos();
	ElementosWeb el= new ElementosWeb();

	public void criarConta(String email) throws IOException {

		metodos.preencher(el.getMemberName(), email, "preenchendo o e-mail");
		metodos.esperarClicavel(el.getBtnProximo(), "esperando o botão prox ser clicavel");
		metodos.clicar(el.getBtnProximo(), "após preecher o email cliquei em prox");

	}

}
