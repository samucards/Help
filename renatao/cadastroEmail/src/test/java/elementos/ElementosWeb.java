package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// ***********************************************************
	// ELEMENTOS WEB ENCAPSULADOS
	// ***********************************************************

	private By criarConta = By.cssSelector("body > header > div > div > div.mobile-cta > div > div > div > a > span");
	private By memberName = By.id("MemberName");	
	private By btnProximo = By.id("iSignupAction");
	private By passoword = By.name("Password");
	private By nome = By.name("FirstName");
	private By sobrenome = By.id("LastName");
	private By btnProximo1 =  By.id("iSignupAction");
	private By dia = By.id("BirthDay");
	private By mes = By.id("BirthMonth");
	private By ano = By.id("BirthYear");
	private By BtnProximo2 = By.id("iSignupAction");
	private By btnProximo3 = By.xpath("/html/body/canvas");

	// ***********************************************************
	// MÉTODOS DE ACESSO
	// ***********************************************************

	
	public By getCriarConta() {
		return criarConta;
	}


	public By getBtnProximo3() {
		return btnProximo3;
	}


	public By getMes() {
		return mes;
	}


	public By getAno() {
		return ano;
	}


	public By getBtnProximo2() {
		return BtnProximo2;
	}


	public By getDia() {
		return dia;
	}


	public By getBtnProximo1() {
		return btnProximo1;
	}


	public By getNome() {
		return nome;
	}


	public By getSobrenome() {
		return sobrenome;
	}


	public By getPassoword() {
		return passoword;
	}


	public By getMemberName() {
		return memberName;
	}


	public By getBtnProximo() {
		return btnProximo;
	}
	
	
	

}
