package guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Deletecustomer {
	
	public static WebElement clickDeleteCustomer(WebDriver drivers) {
		return drivers.findElement(By.linkText("Delete Customer"));
    		
	}
	public static WebElement DeleteCustomerID(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@name='cusid']"));
	
	}
	public static WebElement clickReset(WebDriver drivers) {
		return drivers.findElement(By.name("res"));
	
	}
	public static WebElement EnterCustomerID(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@name='cusid']"));
	
	}
	public static WebElement DeleteCustomerbuttn(WebDriver drivers) {
		return drivers.findElement(By.name("AccSubmit"));
	}

}

