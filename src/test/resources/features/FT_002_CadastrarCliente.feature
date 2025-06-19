#language: pt
#encoding: UTF-8

Funcionalidade: FT_002_CadastrarCliente

@CE_001_LoginValidarCamposObrigatorios @FT001_CE001
Cenario: cadastrar cliente passo a passo
	Dado que acessei o sistema
	Quando realizar login
	E acessar a tela de manter clientes
	E clicar na opcao de cadastrar clientes
	E informar o nome do cliente
	E informar o cpf do cliente
	E informar o rg do cliente
	E informar a data de nascimento do cliente
	E informar o sexo do cliente
	E informar o telefone do cliente
	E informar o endereco do cliente
	E informar o email do cliente
	E salvar
	Entao o sistema apresenta a mensagem de sucesso
	
	
@CE_001_LoginValidarCamposObrigatorios @FT001_CE001
Cenario: cadastrar cliente direto
	Dado que acessei o sistema
	Quando realizar login
	
	E cadastrar um cliente
	Entao o sistema apresenta a mensagem de sucesso
	
	

 