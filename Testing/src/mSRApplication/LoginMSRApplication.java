package mSRApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMSRApplication {
public static void main(String[] args) {
	
	String applicationUrlAddress="https://demo.openmrs.org/openmrs/login.htm";
	
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("Admin123");
	driver.findElement(By.id("togglePassword")).click();
	driver.findElement(By.id("Inpatient Ward")).click();
	driver.findElement(By.id("loginButton")).click();
	
	driver.findElementByClassName("logout").click();
	
}
}
