package guru99.pages;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class LoginPage  {
	
   
	//public LoginPage(RemoteWebDriver drivers)
	//{
	//this .drivers = drivers;
	//}
	//RemoteWebDriver drivers=null; 
		public  static WebElement enterUserName(WebDriver drivers){
		return drivers.findElement(By.xpath("//input[@name='uid']"));
		
		
	}
    public static WebElement enterUserPassword(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@name='password']"));
		
}
	public static WebElement  clickLogin(WebDriver drivers) {
		return drivers.findElement(By.xpath("//input[@name='btnLogin']"));
		
}
	
	
	
}
