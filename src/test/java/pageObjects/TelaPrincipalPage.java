package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import utils.Web;

public class TelaPrincipalPage {
	
	
	public void validarTelaPrincipal() {
		assertEquals("Gerenciar Clientes", Web.driver.findElement(By.xpath("//p[.='Gerenciar Clientes']")).getText());
		
	}
	
	
	public void clicarGerenciarClientes() {
		Web.driver.findElement(By.xpath("//a[@href='../../Scripts/View/tela_manterclientes.php']")).click();;
		
	}

}
