package com.ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_ScreenShot {
public static void main(String[] args) throws IOException, InterruptedException {
	
	String Address="https://bing.com";
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get(Address);
	Thread.sleep(3000);
	File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(bingScreenShot, new File("./ScreenShots/bingHomePage.png"));
	
	
	driver.quit();
	
}
}
