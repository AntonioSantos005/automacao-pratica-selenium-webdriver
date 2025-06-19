package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
	public static WebDriver driver;
	
    public static WebDriver createChrome(){
        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "D:\\Dantas\\Automacao\\ChromeDrive\\chromedriver.exe"); //@FixMethodOrder(MethodSorters.NAME_ASCENDING)
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //  Navegando para a página do Taskit
        driver.get("https://locgames-antonio-dantas.c9users.io/Scripts/View/");

        driver.findElement(By.xpath("//a[@class='solid fat info button']")).click();

        return driver;
    }
}
