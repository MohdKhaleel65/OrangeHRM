package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://bing.com");
		driver.get("http://facebook.com");
		driver.get("http://reliancedigital.in");
		driver.navigate().to("http://livetech.in");
		driver.close();
	
				
	}

}
