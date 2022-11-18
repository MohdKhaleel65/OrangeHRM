package com.HeaderBlockElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_HeaderBlock_Elements {
	public static void main(String[] args) {
		String ApplicationUrlAddress="https://www.tsrtconline.in";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(ApplicationUrlAddress);
		driver.manage().window().maximize();
		
		WebElement headerblock=driver.findElement(By.className("menu"));
		List<WebElement>headerBlockLinks=headerblock.findElements(By.tagName("a"));
		
		int tsrtcHeaderBlocklinksCount=headerBlockLinks.size();
		System.out.println("The number of links on TSRTC header block are - "+tsrtcHeaderBlocklinksCount);
		for(int i=0;i<tsrtcHeaderBlocklinksCount;i++)
		{
			String headerblock_linkname=headerBlockLinks.get(i).getText();
			System.out.println(i+" "+headerblock_linkname);
		}
		driver.quit();
		
		
		
		
		
	}

}
