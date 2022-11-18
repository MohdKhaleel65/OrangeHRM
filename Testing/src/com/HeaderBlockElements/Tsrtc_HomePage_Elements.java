package com.HeaderBlockElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_HomePage_Elements {
	public static void main(String[] args) {
		
		String applicationUrlAddress="https://www.tsrtconline.in";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.navigate().to(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		List<WebElement>tsrtclinks=driver.findElements(By.tagName("a"));
		
		int tsrtclinksCount=tsrtclinks.size();
		
		System.out.println("The number of links on TSRTC page are - "+tsrtclinksCount);
		
		for( int i=0;i<tsrtclinksCount;i++)
		{
		System.out.println(i+" "+tsrtclinks.get(i).getText());
		
		}
		
		driver.quit();
		
	}

}
