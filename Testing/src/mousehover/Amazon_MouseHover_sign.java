package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_MouseHover_sign {
public static void main(String[] args) {
	
	String Address="https://amazon.in";
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get(Address);
	driver.manage().window().maximize();
	WebElement hello_signIn=driver.findElement(By.id("nav-link-accountList"));
	Actions action=new Actions(driver);
	action.moveToElement(hello_signIn).build().perform();
	
	WebElement your_orders=driver.findElement(By.linkText("Your Orders"));
	
	your_orders.click();
	WebElement email_1=driver.findElement(By.id("ap_email"));
	email_1.sendKeys("mohdKhaleel");
	

}
}
