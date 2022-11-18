package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_TestNG_Login {
	WebDriver driver;
	
	@BeforeTest
	public void OHRMApplicationLaunch()
	{

		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");

driver= new ChromeDriver();
driver.get(ApplicationUrlAddress);
driver.manage().window().maximize();	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void LoginTest()
	{
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.clear();
		 Username.sendKeys("MohdKhaleel19");
		 
		 WebElement Password=driver.findElement(By.name("txtPassword"));
		 Password.clear();
		 Password.sendKeys("MohdKhaleel@19");
		 
		 WebElement login=driver.findElement(By.className("button"));
		 login.click();

	}
	
	@Test(priority=2)
	public void welcomeAdminTest() throws InterruptedException
	{
		
		 WebElement welcome=driver.findElement(By.id("welcome"));
		 welcome.click();
		 

	}
	@Test(priority=3)
	public void LogoutTest()  
	{
		//Thread.sleep(10000);
		WebElement logout=driver.findElement(By.linkText("Logout"));
		 logout.click();

	}
	@AfterTest
	public void OHRMApplicationClose()
	{
		driver.close();
	}

}
