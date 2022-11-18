package attributeOfGoogleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_of_Sign_inElement_inGoogle {
	public static void main(String[] args) {
		String Address="https://google.com";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver;

		driver=new ChromeDriver();
		driver.get(Address);
		WebElement signIn=driver.findElement(By.linkText("Sign in"));
		String sign_attribute_href=signIn.getAttribute("href");
		System.out.println("the attribute of href is :"+sign_attribute_href);
		String sign_attribute_class=signIn.getAttribute("class");
		System.out.println("the attribute of class is : "+sign_attribute_class);
		String sign_Text=signIn.getText();
		System.out.println("the text of sign in is :"+sign_Text);
		
		signIn.click();

		driver.close();
		
		
		
		
		
	}

}
