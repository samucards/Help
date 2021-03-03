#language: pt
#Author: Renato Vargas
@allTest
Funcionalidade: Validar cadastro de e-mail
  Eu como usuario quero acessar o site para realizar cadastro de emails

      
   @positivos
  Cenario: cadastrar um novo email valido
    Dado que esteja no site "https://outlook.live.com/owa/" 
    Quando os dados obrigatorios validados
		Entao email cadastrado com sucesso

