package pageObjects;

import org.openqa.selenium.By;

import utils.Web;

public class LoginPage {
	
	public void digitarEmail() {
		Web.driver.findElement(By.id("inputEmail")).sendKeys("dantas.sousa@gmail.com");
		
	}
	
	public void digitarSenha() {
		Web.driver.findElement(By.id("inputPassword")).sendKeys("teste123");		

	}
	
	public void clicarLogar() {
		Web.driver.findElement(By.xpath("//button[.='Sign in']")).click();		
	}
	
	public void realizarLogin() {
		digitarEmail();
		digitarSenha();
		clicarLogar();
		
	}
	
	

}
