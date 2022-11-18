package com.HeaderBlockElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueLabs_HeaderBlock {

	public static void main(String[] args) {
		String addressUrl="https://www.valuelabs.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to(addressUrl);
		driver.manage().window().maximize();
		//header block of value labs
		//common property is id="navbarSupportContent"
		WebElement headerblock=driver.findElement(By.id("navbarSupportedContent"));
		
		List<WebElement>headerblockLinks=headerblock.findElements(By.tagName("a"));
		
		//List<WebElement>links=driver.findElements(By.tagName("a"));
		int linksCount=headerblockLinks.size();
		System.out.println("the length of the value lab link is - "+linksCount);
		for(int i=0;i<linksCount;i++)
			
		{
			if(headerblockLinks.get(i).isDisplayed())
			
			{
			String headerblocklinkName=headerblockLinks.get(i).getText();
			System.out.println(i+" "+headerblocklinkName);
		}
		}
		driver.quit();
		
		
		

	}

}
