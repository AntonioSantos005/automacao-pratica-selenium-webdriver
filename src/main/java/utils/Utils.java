package utils;

import org.openqa.selenium.support.PageFactory;

public class Utils {
	
	public static <T> T Na(Class<T> classe) {
        return PageFactory.initElements(Web.driver, classe);
    }

}
