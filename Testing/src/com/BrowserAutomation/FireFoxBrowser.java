package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	FirefoxDriver firefox = new FirefoxDriver();
	
	//System.out.println(firefox);
	firefox.quit();
	
	
	
	}

}
