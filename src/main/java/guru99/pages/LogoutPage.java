package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	
	public static WebElement clickLogOut(WebDriver drivers) {
		
		return drivers.findElement(By.linkText("Log out"));

	}

}
