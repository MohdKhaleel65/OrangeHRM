package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class BingValidation {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		//navigate to bing home page
		driver.get("http://bing.com");
		
		
		String expected_bingTitle="Bing";
		System.out.println("the expected title of the bing home page is :"+expected_bingTitle);
		
		//identify the title of bing home page
		String actual_bingTitle=driver.getTitle();
		
		System.out.println("the actual title of the bing home page is :"+actual_bingTitle);
		
		if (actual_bingTitle.equals(expected_bingTitle))
		{
			System.out.println("Title matched - PASS");
		}
		else
		{
			System.out.println("Title not matched - FAIL");
		}
		
		driver.quit();
	}

}
