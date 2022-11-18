package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OHRMLogin {
	public static void main(String[] args) throws InterruptedException {
		
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");
WebDriver driver;


driver= new ChromeDriver();
driver.get(ApplicationUrlAddress);
//driver.findElement(By.id("txtUsername")).sendKeys("MohdKhaleel19");
WebElement Username=driver.findElement(By.id("txtUsername"));
 Username.sendKeys("MohdKhaleel19");
 WebElement password=driver.findElement(By.name("txtPassword"));
 password.sendKeys("MohdKhaleel@19");
 WebElement login=driver.findElement(By.className("button"));
 login.click();
 WebElement welcome=driver.findElement(By.id("welcome"));
 welcome.click();
 Thread.sleep(10000);
 WebElement logout=driver.findElement(By.linkText("Logout"));
 logout.click();
 
 System.out.println("pass");
 
 
 


	}
}
