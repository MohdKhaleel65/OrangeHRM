package signGoogleHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignGoogleHomepage {
	public static void main(String[] args) {
		String ApplicationUrlAddress="https://google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.linkText("Sign in"));
		signin.click();
		/*WebElement signin=driver.findElement(By.partialLinkText("Sign"));
		signin.click();*/
		//driver.close();
		
		
		
		
	}

}
