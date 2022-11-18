package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHRM {

public static void main(String[] args) throws InterruptedException {
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.navigate().to(ApplicationUrlAddress);

driver.findElement(By.id("txtUsername")).sendKeys("MohdKhaleel19");

driver.findElement(By.id("txtPassword")).sendKeys("MohdKhaleel@19");

driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.id("welcome")).click();

Thread.sleep(1000);
//driver.findElements(By.linkText("Logout"));

driver.findElementByLinkText("Logout").click();


}
}
