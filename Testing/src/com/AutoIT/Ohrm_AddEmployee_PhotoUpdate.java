package com.AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ohrm_AddEmployee_PhotoUpdate {
	
	WebDriver driver;
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(ApplicationUrlAddress);
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
	public void PIM_Test() throws IOException
	{
		WebElement PIM1=driver.findElement(By.linkText("PIM"));
		 Actions action=new Actions(driver);
		 action.moveToElement(PIM1).build().perform();
		 
		 WebElement Add_Employee=driver.findElement(By.linkText("Add Employee"));
		 Add_Employee.click();
		 WebElement First_Name=driver.findElement(By.id("firstName"));
		 First_Name.sendKeys("Osman");
		 action.sendKeys(Keys.TAB).build().perform();
		 action.sendKeys("Ali").build().perform();
		 action.sendKeys(Keys.TAB).build().perform();
		 action.sendKeys("Sayeed").build().perform();
		 
		 WebElement empId=driver.findElement(By.xpath("//*[@id='employeeId']"));
		 String employeeId=empId.getAttribute("value");
		 System.out.println("The Employee ID is :"+employeeId);
		 //action.sendKeys(Keys.TAB).build().perform();
		 //action.sendKeys(Keys.CLEAR).build().perform();
		// action.sendKeys(Keys.BACK_SPACE).build().perform();
		 //action.sendKeys("06112022").build().perform();
		 java.lang.Runtime.getRuntime().exec("C:\\Users\\Mohd Khaleel\\OneDrive\\Pictures");
		 
		 
		 
}
}