#language: pt
#encoding: UTF-8

Funcionalidade: FT_001_RealizarLogin

@CE_001_LoginValidarCamposObrigatorios @FT001_CE001
Cenario: Login passo a passo
	Dado que acessei o sistema
	Quando clicar em login
	E informar o email
	E informar a senha
	E clicar em entrar
	Entao o sistema apresenta a tela principal
	
	
@CE_001_LoginValidarCamposObrigatorios @FT001_CE001
Cenario: Login direto
	Dado que acessei o sistema
	Quando realizar login
	Entao o sistema apresenta a tela principal
	
	

 