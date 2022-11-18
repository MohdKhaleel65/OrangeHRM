package com.BrowserAutomation;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("google.com");
		
	}

}
