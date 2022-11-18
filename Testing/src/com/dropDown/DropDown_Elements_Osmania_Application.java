package com.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Elements_Osmania_Application {
	public static void main(String[] args) {
		
		String ApplicationUrlAddress="https://www.osmania.ac.in";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		
		driver=new ChromeDriver();
		
		driver.navigate().to(ApplicationUrlAddress);
		driver.manage().window().maximize();
		WebElement selectlanguage=driver.findElement(By.id("gtranslate_selector"));
		//System.out.println("hello");
		List<WebElement>selectlanguageList=selectlanguage.findElements(By.tagName("option"));
		int selectLanguagelistCount=selectlanguageList.size();
		System.out.println("The number of elements in Select language DropDown are - "+selectLanguagelistCount);
		
		for(int i=0;i<selectLanguagelistCount;i++)
		{
			String selectlanguagedListNames=selectlanguageList.get(i).getText();
				System.out.println(i+" "+selectlanguagedListNames);
		}
		
		driver.quit();
		
	}
	
	
	
	
	

}
