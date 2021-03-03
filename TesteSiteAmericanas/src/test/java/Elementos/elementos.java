package Elementos;

import org.openqa.selenium.By;

public class elementos {
	
	
	
	// ELEMENTOS DA PAGINA 
	
	private By campoDePesquisa = By.name("conteudo");
	
	private By lupaDePesquisa = By.xpath("/html/body/header/div[2]/div[2]/div[1]/div[2]/form/div/button[2]");
	
	private By produto = By.xpath("/html/body/div/div/div/div[3]/div[3]/div[1]/div/a/span[1]");
	
	private By btnComprar = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/a");
	
	private By btnSegundo = By.id("buy-button");
	
	private By campoDeEmail = By.id("email-input");
	
	private By campoDeSenha = By.name("password");
	
	private By btnContinuar = By.id("login-button");
   
	
	// PONTEIROS E SETAS 
	
	
	public By getCampoDePesquisa() {
		return campoDePesquisa;
	}

	public void setCampoDePesquisa(By campoDePesquisa) {
		this.campoDePesquisa = campoDePesquisa;
	}

	public By getLupaDePesquisa() {
		return lupaDePesquisa;
	}

	public void setLupaDePesquisa(By lupaDePesquisa) {
		this.lupaDePesquisa = lupaDePesquisa;
	}

	public By getProduto() {
		return produto;
	}

	public void setProduto(By produto) {
		this.produto = produto;
	}

	public By getBtnComprar() {
		return btnComprar;
	}

	public void setBtnComprar(By btnComprar) {
		this.btnComprar = btnComprar;
	}

	public By getBtnSegundo() {
		return btnSegundo;
	}

	public void setBtnSegundo(By btnSegundo) {
		this.btnSegundo = btnSegundo;
	}

	public By getCampoDeEmail() {
		return campoDeEmail;
	}

	public void setCampoDeEmail(By campoDeEmail) {
		this.campoDeEmail = campoDeEmail;
	}

	public By getCampoDeSenha() {
		return campoDeSenha;
	}

	public void setCampoDeSenha(By campoDeSenha) {
		this.campoDeSenha = campoDeSenha;
	}

	public By getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(By btnContinuar) {
		this.btnContinuar = btnContinuar;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
