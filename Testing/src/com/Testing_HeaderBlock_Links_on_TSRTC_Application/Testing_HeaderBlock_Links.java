package com.Testing_HeaderBlock_Links_on_TSRTC_Application;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_HeaderBlock_Links {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String ApplicationUrlAddress="https://www.tsrtconline.in";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		
		driver.manage().window().maximize();
		
		WebElement headerblock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>headerBlockLinks=headerblock.findElements(By.tagName("a"));
		
		int tsrtcHeaderBlocklinksCount=headerBlockLinks.size();
		
		System.out.println("The number of links on TSRTC header block are - "+tsrtcHeaderBlocklinksCount);
		
		for(int i=0;i<tsrtcHeaderBlocklinksCount;i++)
		{
			String headerblock_linkname=headerBlockLinks.get(i).getText();
			
			System.out.println(i+" "+headerblock_linkname);
			//testing the element
			
			headerBlockLinks.get(i).click();

			

			// getting the title of the navigated  web page
			String webPageTitle=driver.getTitle();
			System.out.println(webPageTitle);
			
			//get the Url of navigated page
			String webPageUrlAddress=driver.getCurrentUrl();
			System.out.println(webPageUrlAddress);
			//since the driver focus is navigated to webpage
			// we need to get back to previous page.
			//coming back to the previous page
			Thread.sleep(3000);
			
			

			driver.navigate().back();
			// identify the header block again
			headerblock=driver.findElement(By.className("menu-wrap"));
			
			headerBlockLinks=headerblock.findElements(By.tagName("a"));
			
			
		}
		driver.quit();
		}

}
