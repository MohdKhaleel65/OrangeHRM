package orangeHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Title {
	public static void main(String[] args) {
		
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		
		String expected_OrangeHrmUrlAddress="orangehrm-4.2.0.1";
		System.out.println("The Expected Orange HRM Home page url address is : "+expected_OrangeHrmUrlAddress);
		
		String actual_OrangeHrmUrlAddress=driver.getCurrentUrl();
		System.out.println("The actual Orange HRM Home page url address is : "+actual_OrangeHrmUrlAddress);
		
    String expected_OrangeHrmTitle="OrangeHRM";
		
		System.out.println("the expected title of the Orange HRM page is :"+expected_OrangeHrmTitle);
		

		String actual_OrangeHrmTitle=driver.getTitle();
		
		System.out.println("the actual title of the Orange HRM page is :"+actual_OrangeHrmTitle);
		
		driver.quit();
		
	}


	}


