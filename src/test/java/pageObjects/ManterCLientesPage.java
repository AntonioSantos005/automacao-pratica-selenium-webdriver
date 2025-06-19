package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import utils.Web;

public class ManterCLientesPage {
	
	public void cadastrarCLientes() {
		Web.driver.findElement(By.xpath("//button[.='Cadastrar cliente']")).click();
		
	}
	
	public void validarCadastroSucesso() {
		assertEquals("Registro inserido com sucesso, aguarde você está sendo redirecionado ...", Web.driver.findElement(By.xpath("//div[.='Registro inserido com sucesso, aguarde você está sendo redirecionado ...']")).getText());
				
	}

}
