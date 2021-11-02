
@tag
Feature: 

Scenario: Consulta CEP valido
Given que o usuario inseri um CEP valido "04863020"
When e  o servico  consultado "04863020"
Then e retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge "04863020"


Scenario: Consulta CEP inexistente
Given que o usuario inseri um CEP que nao exista na base dos Correios "00000000"
When o servico e consultado
Then e retornada um atributo erro


Scenario: Consulta CEP com formato invalido 
Given que o usuario inseri um CEP com formato invalido "0000000"
When o servico e consultado
Then e retornado uma mensagem de erro 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
