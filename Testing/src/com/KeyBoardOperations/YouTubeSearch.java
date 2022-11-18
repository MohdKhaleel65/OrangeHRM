package com.KeyBoardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YouTubeSearch {
	WebDriver driver;
	String ApplicationUrl="https://youtube.com";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(ApplicationUrl);
		driver.manage().window().maximize();
	}
@Test
public void searchTest() throws InterruptedException
{
	 WebElement search=driver.findElement(By.name("search_query"));
	 search.sendKeys("koi chand rakh");
	 Thread.sleep(10000);
	 Actions action=new Actions(driver);
	action.sendKeys(Keys.ENTER).build().perform();
}
}
