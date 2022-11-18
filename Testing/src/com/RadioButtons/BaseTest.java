package com.RadioButtons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	@BeforeTest
	public void setUp() 
	{
		String ApplicationUrlAddress="https://echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver","./DriverFiles1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
@AfterTest
public void tearDown()
{
	driver.close();
}
}
