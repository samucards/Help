package Metodos;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.Matchers.is;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;

import io.cucumber.core.backend.Container;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Metodos {

	private String url;
	private Response response;

	public void setUrl(String url) {
		this.url = url;

	}

	public void GetCepValido(String cep) {
		response = RestAssured.request(Method.GET, "https://viacep.com.br/ws/" + cep + "/json/");
		System.out.println(response.getBody().asString());
	}

	public void consultaCep(String cep) {
		response = given().when().get("https://viacep.com.br/ws/" + cep + "/json/");

		System.out.println("Retorno do status code: " + response.statusCode());
	}

	public void validacoes() {
		response.then().statusCode(200).body("cep", is("04863-020")).body("logradouro", is("Rua Uva Natal"))
				.body("complemento", is("")).body("bairro", is("Vila Natal")).body("localidade", is("São Paulo"))
				.body("uf", is("SP")).body("ibge", is("3550308"));

	}

	public void cepinvalido(String cep) {
		response = RestAssured.request(Method.GET, "https://viacep.com.br/ws/" + cep + "/json/");
		System.out.println(response.getBody().asString());

	}

	public void consultarservico() {
		response = given().when().get("https://viacep.com.br/ws/00000000/json/");
		System.out.println("Retorno do status code: " + response.statusCode());

	}

	public void Validacaocepinvalido() {
		response.then().statusCode(200).body("erro", is(true));

	}

	public void formatoInvalido(String cep) {
		response = RestAssured.request(Method.GET, "https://viacep.com.br/ws/" + cep + "/json/");
		System.out.println(response.getBody().asString());

	}

	public void Mensagemerro() {
		response.then().statusCode(400);

	}
}
