package guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Editcustomer {
	
	public static WebElement clickEdidCustomer(WebDriver drivers) {
		return drivers.findElement(By.linkText("Edit Customer"));
		
	}
	public static WebElement clickCustomerID(WebDriver drivers) {
		return drivers.findElement(By.name("cusid"));
		
	}
	public static WebElement clickSubmit(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@type='submit']"));
		
	}

}
