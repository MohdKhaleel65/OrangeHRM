package textOfElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextofIndia_googleHomepage {
	
	public static void main(String[] args) {
		
		String applicationAddress="https://google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationAddress);
		driver.manage().window().maximize();//Maximizing the browser window
		WebElement IndiaElement=driver.findElement(By.className("uU7dJb"));
		String IndiaElement_Text=IndiaElement.getText();
		System.out.println("The text of element India is- "+IndiaElement_Text);
		//WebElement inputfield=driver.findElement(By.name("q"));
		//inputfield.sendKeys("facebook");
		//WebElement enter=driver.findElement(By.name("btnK"));
		//enter.click();
		//driver.close();
		
	}

}
