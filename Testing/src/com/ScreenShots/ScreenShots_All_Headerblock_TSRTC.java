package com.ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots_All_Headerblock_TSRTC {
	public static void main(String[] args) throws IOException, InterruptedException {

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
			Thread.sleep(2000);
			
			//screen shot of all links page
			//for multiple screen shots on different pages - make changes in path n name
			File driverScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(driverScreenShot, new File("./TSRTC_Screen_shots/"+headerblock_linkname+".png"));
			

			driver.navigate().back();
			// identify the header block again
			headerblock=driver.findElement(By.className("menu-wrap"));
			
			headerBlockLinks=headerblock.findElements(By.tagName("a"));

		}
		driver.quit();
		
	}
}
