package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import elementos.ElementosWeb;

public class HomePage {

	Metodos metodos = new Metodos();
	
	
	public void abrirConta(By elemento) throws IOException {
		
		metodos.esperarClicavel(elemento, "aguardar o botão criar conta");
		metodos.clicar(elemento, "clicando em criar conta");
		
	}
	

}
