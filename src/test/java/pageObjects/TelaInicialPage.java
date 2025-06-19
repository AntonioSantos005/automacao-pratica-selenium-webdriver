package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Web;

public class TelaInicialPage {

	//ELEMENTOS
	
	
	public void clicarBotaoLogin() {
		WebElement botaoLogin = Web.driver.findElement(By.linkText("Login"));
		botaoLogin.click();
	}	

}
