package com.NoOfElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_And_Links {
	public static void main(String[] args) {
		
		String address="http://facebook.com";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to(address);
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int links_length=Links.size();
		System.out.println("the no of links on the fb page are : "+links_length);
		for (int i=0;i<Links.size();i++)
		{
			System.out.println(i+" "+Links.get(i).getText());
			
		}
		driver.quit();
		
		
	}

}
