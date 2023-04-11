package guru9.seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import guru99.pages.Addcustomer;
import guru99.pages.Deletecustomer;
import guru99.pages.Editcustomer;
import guru99.pages.LoginPage;
import guru99.pages.LogoutPage;

public class Guru99Base  {
	  
	//protected RemoteWebDriver drivers;
	
	@Test
	
	public void startApp(){
	
       System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
       ChromeDriver drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drivers.get("https://demo.guru99.com/V1/index.php");
		//For LoginPage
		LoginPage.enterUserName(drivers).sendKeys("mngr485460");
		LoginPage.enterUserPassword(drivers).sendKeys("UtysYbE");
		LoginPage.clickLogin(drivers).click();
		
		//Add new customer
		
		Addcustomer.clickAddCustomer(drivers).click();
		Addcustomer.customerName(drivers).sendKeys("Suganya");
		Addcustomer.genderSelect(drivers).get(1).click();
		Addcustomer.dateOfBirth(drivers).sendKeys("05/23/1998");
		Addcustomer.addressOfCustomer(drivers).sendKeys("No.74,Middle street,Silamalai,theni");
		Addcustomer.addCity(drivers).sendKeys("Theni");
		Addcustomer.addState(drivers).sendKeys("Tamilnadu");
		Addcustomer.addPincode(drivers).sendKeys("625528");
		Addcustomer.addMObileNo(drivers).sendKeys("9659942918");
		Addcustomer.addEmail(drivers).sendKeys("sugan146895@gmail.com");
		Addcustomer.Submitbutn(drivers).click();
		drivers.navigate().back();
		
		
		// Edit customer 
		Editcustomer.clickEdidCustomer(drivers).click();
		Editcustomer.clickCustomerID(drivers).sendKeys("mngr345678");
		Editcustomer.clickSubmit(drivers).click();
		drivers.navigate().back();
		//Delete customer
		
		Deletecustomer.clickDeleteCustomer(drivers).click();
		Deletecustomer.DeleteCustomerID(drivers).sendKeys("mnngr456790");
		Deletecustomer.clickReset(drivers).click();
		Deletecustomer.EnterCustomerID(drivers).sendKeys("mngr454380");
		Deletecustomer.DeleteCustomerbuttn(drivers).click();
		drivers.navigate().back();
		
		//LOG out
		LogoutPage.clickLogOut(drivers).click();
		
		drivers.quit();
}
}	
