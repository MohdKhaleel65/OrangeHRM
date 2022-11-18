package com.RedffiiAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAccount {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		String UrlAddress="http://register.rediff.com/register/register.php?FormName=user_details";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");
	driver =new ChromeDriver();
	driver.get(UrlAddress);
	driver.manage().window().maximize();
	}
	
	@Test
	public void UserName_Test()
	{
		//WebElement FullName=driver.findElement(By.name("name72d7746e"));
		//WebElement FullName=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
		WebElement FullName=driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
		WebElement Login=driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
		FullName.sendKeys(" Hello Khaleel ");		
		Login.sendKeys("khaleel@65");
	}
@AfterTest
public void tearDown()
{
	//driver.close();
}
}
