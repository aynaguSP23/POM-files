package guru99.pages;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Addcustomer {
	
	public static WebElement clickAddCustomer(WebDriver drivers) {
		return drivers.findElement(By.linkText("New Customer"));

	}
    public static WebElement customerName(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@type='text']"));

   }
    
    public static List<WebElement> genderSelect(WebDriver drivers) {
    	return drivers.findElements(By.xpath("//input[@type='radio']"));
    	}
    public static WebElement dateOfBirth(WebDriver drivers) {
		return drivers.findElement(By.name("dob"));
}
   public static WebElement  addressOfCustomer(WebDriver drivers) {
	   return drivers.findElement(By.name("addr"));
   }
   public static WebElement addCity(WebDriver drivers) {
	   return drivers.findElement(By.name("city"));
   }
   public static WebElement addState(WebDriver drivers) {
	   return drivers.findElement(By.xpath("//input[@name='state']"));
   }
   public static WebElement addPincode(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@name='pinno']"));

	   
   }
   public static WebElement addMObileNo(WebDriver drivers) {
		return drivers.findElement(By.name("telephoneno"));

   }
   public static WebElement addEmail(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@name='emailid']"));

   }
   public static WebElement Submitbutn(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@value='Submit']"));
   }
   
    
}
