package stepsFuncional;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.LoginPage;
import pageObjects.TelaInicialPage;
import pageObjects.TelaPrincipalPage;
import utils.Web;

public class FT_001_RealizarLoginSteps {	
	TelaInicialPage telaInicialPage = new TelaInicialPage();
	LoginPage loginPage = new LoginPage();
	TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage();
	
	@Dado("que acessei o sistema")
	public void que_acessei_o_sistema() {
		Web.createChrome();
	}
	
	@Quando("clicar em login")
	public void clicar_em_login() {
		telaInicialPage.clicarBotaoLogin();
	}

	@Quando("informar o email")
	public void informar_o_email() {
	    loginPage.digitarEmail();
	}

	@Quando("informar a senha")
	public void informar_a_senha() {
	    loginPage.digitarSenha();
	}

	@Quando("clicar em entrar")
	public void clicar_em_entrar() {
	    loginPage.clicarLogar();
	}

	@Entao("o sistema apresenta a tela principal")
	public void o_sistema_apresenta_a_tela_principal() {
	    telaPrincipalPage.validarTelaPrincipal();
	}

	@Quando("^realizar login$")
	public void realizarLogin() throws Throwable {
		telaInicialPage.clicarBotaoLogin();
		loginPage.realizarLogin();
	}

}
