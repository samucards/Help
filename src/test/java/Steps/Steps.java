package Steps;

import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps  {
	
	Metodos a = new Metodos();
	
	@Given("que o usuario inseri um CEP valido {string}")
	public void que_o_usuario_inseri_um_cep_valido(String cep) {
	  a.GetCepValido(cep);
	}

	@When("o servico e consultado")
	public void o_servi_o_e_consultado() {
	 
	}

	@Then("e retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge {string}")
	public void e_retornado_o_cep_logradouro_complemento_bairro_localidade_uf_e_ibge(String cep) {
		a. validacoes();
	}
	@Given("que o usuario inseri um CEP que nao exista na base dos Correios")
	public void que_o_usuario_inseri_um_cep_que_nao_exista_na_base_dos_correios() {
	   
	}

	@Then("e retornada um atributo erro")
	public void e_retornada_um_atributo_erro() {
	    a.Validacaocepinvalido();
	}

	@Given("que o usuario inseri um CEP com formato invalido")
	public void que_o_usuario_inseri_um_cep_com_formato_invalido() {
	  
	}

	@Then("e retornado uma mensagem de erro")
	public void e_retornado_uma_mensagem_de_erro() {
	  
		a.Mensagemerro();
	}
	@When("e  o servico  consultado {string}")
	public void e_o_servico_consultado(String cep) {
		a.consultaCep(cep);
	}
	@Given("que o usuario inseri um CEP que nao exista na base dos Correios {string}")
	public void que_o_usuario_inseri_um_cep_que_nao_exista_na_base_dos_correios(String cep) {
	   a.cepinvalido(cep);
	}
	@Given("que o usuario inseri um CEP com formato invalido {string}")
	public void que_o_usuario_inseri_um_cep_com_formato_invalido(String string) {
	  a.formatoInvalido(string);
	}

}


