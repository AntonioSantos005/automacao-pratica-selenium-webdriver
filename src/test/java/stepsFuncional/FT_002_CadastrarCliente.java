package stepsFuncional;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.CadastrarClientePage;
import pageObjects.ManterCLientesPage;
import pageObjects.TelaPrincipalPage;
import utils.Web;

public class FT_002_CadastrarCliente {
	
	TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage();
	ManterCLientesPage manterCLientesPage = new ManterCLientesPage();
	CadastrarClientePage cadastrarClientePage = new CadastrarClientePage();
	
	@Quando("acessar a tela de manter clientes")
	public void acessar_a_tela_de_manter_clientes() {
	    telaPrincipalPage.clicarGerenciarClientes();
	}

	@Quando("clicar na opcao de cadastrar clientes")
	public void clicar_na_opcao_de_cadastrar_clientes() {
	    manterCLientesPage.cadastrarCLientes();
	}

	@Quando("informar o nome do cliente")
	public void informar_o_nome_do_cliente() {
		cadastrarClientePage.informarNome();
	}

	@Quando("informar o cpf do cliente")
	public void informar_o_cpf_do_cliente() {
	    cadastrarClientePage.informarCpf();
	}

	@Quando("informar o rg do cliente")
	public void informar_o_rg_do_cliente() {
	    cadastrarClientePage.informarRg();
	}

	@Quando("informar a data de nascimento do cliente")
	public void informar_a_data_de_nascimento_do_cliente() {
	    cadastrarClientePage.informarDataNascimento();
	}

	@Quando("informar o sexo do cliente")
	public void informar_o_sexo_do_cliente() {
	    cadastrarClientePage.informarSexo();
	}

	@Quando("informar o telefone do cliente")
	public void informar_o_telefone_do_cliente() {
	    cadastrarClientePage.informarTelefone();
	}

	@Quando("informar o endereco do cliente")
	public void informar_o_endereco_do_cliente() {
	    cadastrarClientePage.informarEndereco();
	}

	@Quando("informar o email do cliente")
	public void informar_o_email_do_cliente() {
	    cadastrarClientePage.informarEmail();
	}

	@Quando("salvar")
	public void salvar() {
	    cadastrarClientePage.clicarSalvar();
	}

	@Entao("o sistema apresenta a mensagem de sucesso")
	public void o_sistema_apresenta_a_mensagem_de_sucesso() {
	    manterCLientesPage.validarCadastroSucesso();
	}

	@Quando("cadastrar um cliente")
	public void cadastrar_um_cliente() {
		telaPrincipalPage.clicarGerenciarClientes();
		manterCLientesPage.cadastrarCLientes();
	    cadastrarClientePage.cadastrarCliente();
	}

}
