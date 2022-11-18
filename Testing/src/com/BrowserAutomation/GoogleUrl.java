package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleUrl {
	public static void main(String[] args) {
		
	String applicationUrlAddress="https://google.com";
	
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get(applicationUrlAddress);
	
	String expected_GoogleHomePageAddress="google.com";
System.out.println("The Expected google home page url address is : "+expected_GoogleHomePageAddress);
	
	String actual_GoogleHomePageAddress=driver.getCurrentUrl();
System.out.println("The actual google home page url address is : "+actual_GoogleHomePageAddress);

if(actual_GoogleHomePageAddress.contains(expected_GoogleHomePageAddress))
{
System.out.println("google home page url address Matched :-"+"PASS");

}
else
{
System.out.println("google home page url address not matched :-"+"FAIL");

}
driver.quit();

		}
}




