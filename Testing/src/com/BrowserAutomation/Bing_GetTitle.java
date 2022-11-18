package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_GetTitle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		//navigate to bing home page
		driver.get("http://bing.com");
		
		//identify the title of bing home page
		String actual_bingTitle=driver.getTitle();
		
		System.out.println("the actual title of the bing home page is :"+actual_bingTitle);
		
		driver.quit();
		
	}

}
