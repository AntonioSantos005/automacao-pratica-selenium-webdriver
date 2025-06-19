package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import utils.Web;

public class CadastrarClientePage {
	
	public void informarNome() {
		Web.driver.findElement(By.id("nome")).sendKeys("teste sem factory");

	}
	
	public void informarCpf() {
		Web.driver.findElement(By.id("cpf")).sendKeys("44444444444");

	}
	
	public void informarRg() {
		Web.driver.findElement(By.id("rg")).sendKeys("222222222");

	}
	
	public void informarDataNascimento() {
		Web.driver.findElement(By.id("nascimento")).sendKeys("26051994");

	}
	
	public void informarSexo() {
		Web.driver.findElement(By.xpath("//option[.='Masculino']")).click();;

	}
	
	public void informarTelefone() {
		Web.driver.findElement(By.id("telefone")).sendKeys("61993452728");

	}
	
	public void informarEndereco() {
		Web.driver.findElement(By.id("endereco")).sendKeys("rua sem factory");

	}
	
	public void informarEmail() {
		Web.driver.findElement(By.id("email")).sendKeys("email@semfactory.com");

	}
	
	public void clicarSalvar() {
		Web.driver.findElement(By.xpath("//button[.='Salvar']")).click();

	}	
	
	public void cadastrarCliente() {
		informarNome();
		informarCpf();
		informarRg();
		informarDataNascimento();
		informarSexo();
		informarTelefone();
		informarEndereco();
		informarEmail();
		clicarSalvar();		
	}
	
}
