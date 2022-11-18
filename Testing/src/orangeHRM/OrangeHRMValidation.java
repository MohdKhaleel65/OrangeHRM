package orangeHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMValidation {
	
	public static void main(String[] args) {
		
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
				
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(ApplicationUrlAddress);
				
		String expected_OrangeHrmUrlAddress="orangehrm-4.2.0.1";
		
		System.out.println("The Expected Orange HRM Home page url address is : "+expected_OrangeHrmUrlAddress);
				
		String actual_OrangeHrmUrlAddress=driver.getCurrentUrl();
		
		System.out.println("The actual Orange HRM Home page url address is : "+actual_OrangeHrmUrlAddress);
		if(actual_OrangeHrmUrlAddress.contains(expected_OrangeHrmUrlAddress))
			
		{
		System.out.println("Orange HRM Url Address MATCHED:-"+"PASS");
		}
		else
		{
		System.out.println("Orange HRM Url Address NOT MATCHED:-"+"FAIL");
		}
				
		String expected_OrangeHrmTitle="OrangeHRM";
				
		System.out.println("the expected title of the Orange HRM page is :"+expected_OrangeHrmTitle);
				

		String actual_OrangeHrmTitle=driver.getTitle();
				
		System.out.println("the actual title of the Orange HRM page is :"+actual_OrangeHrmTitle);
		
		if(actual_OrangeHrmTitle.equals(expected_OrangeHrmTitle))
		{
		System.out.println("Title MATCHED - PASS");
		}
		else
		{
		System.out.println("Tille NOT MATCHED - FAIL");
		}
		driver.quit();

	}

}
