package com.Inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	String Address="https://www.timeanddate.com/worldclock";
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get(Address);
		driver.manage().window().maximize();
	}
	public void applicationClose()
	{
		driver.close();

	}

}
