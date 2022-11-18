package com.Assignment.On.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_Assignment_Khaleel {
	public static void main(String[] args) throws InterruptedException {
		
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver;


		driver= new ChromeDriver();
		driver.navigate().to(ApplicationUrlAddress);
		driver.manage().window().maximize();

		String expected_OrangeHrmUrlAddress="orangehrm-4.2.0.1";
		
		System.out.println("The Expected Orange HRM Home page url address is : "+expected_OrangeHrmUrlAddress);
				
		String actual_OrangeHrmUrlAddress=driver.getCurrentUrl();
		
		System.out.println("The Actual Orange HRM Home page url address is : "+actual_OrangeHrmUrlAddress);

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
		
		WebElement loginpanel=driver.findElement(By.id("logInPanelHeading"));
		String loginpanel_Text=loginpanel.getText();
		System.out.println("The text of login element is - "+loginpanel_Text);
		
		
		WebElement Username=driver.findElement(By.id("txtUsername"));
		 Username.sendKeys("MohdKhaleel19");
		 WebElement password=driver.findElement(By.name("txtPassword"));
		 password.sendKeys("MohdKhaleel@19");
		 WebElement login=driver.findElement(By.className("button"));
		 login.click();
		 
		 WebElement adminelement=driver.findElement(By.linkText("Admin"));
		 String admin_text=adminelement.getText();
		 System.out.println("the Text of Login Element is - "+admin_text);
		 
		 WebElement PIM1=driver.findElement(By.linkText("PIM"));
		 Actions action=new Actions(driver);
		 action.moveToElement(PIM1).build().perform();
		 
		 WebElement Add_Employee=driver.findElement(By.linkText("Add Employee"));
		 Add_Employee.click();
		 WebElement First_Name=driver.findElement(By.id("firstName"));
		 First_Name.sendKeys("Khaleel");
		 
		 WebElement middle_name=driver.findElement(By.id("middleName"));
		 middle_name.sendKeys("Ali");
		 WebElement last_name=driver.findElement(By.id("lastName"));
		 last_name.sendKeys("Sayeed");
		 WebElement Employee_Id=driver.findElement(By.id("employeeId"));
		  String Id=Employee_Id.getAttribute("value");
		  System.out.println("the new Employee ID is - "+Id);
		WebElement save_Details=driver.findElement(By.id("btnSave"));
		save_Details.click();
		
		String Expected_FirstName="Khaleel";
		 System.out.println("the expected first name is - "+Expected_FirstName);
		 WebElement actual_name=driver.findElement(By.id("personal_txtEmpFirstName"));
		 String actual_Firstname=actual_name.getAttribute("value");
		 System.out.println("the actual first name is - "+actual_Firstname);
		 
		 if(actual_Firstname.equals(Expected_FirstName))
		 {
			 System.out.println("First name - matched");
	
		 }
		 else
		 {
			 System.out.println("first name - not matched");
		 }
		 String expected_middleName="Ali";
		 System.out.println("the expected middle name is - "+expected_middleName);
		 WebElement actual_middlename=driver.findElement(By.id("personal_txtEmpMiddleName"));
		 String actual_middleNAME=actual_middlename.getAttribute("value");
		 System.out.println("the actual middle name is - "+actual_middleNAME);
		 
		 if(actual_middleNAME.equals(expected_middleName))
		 {
			 System.out.println("Middle name - matched");
	
		 }
		 else
		 {
			 System.out.println("Middle name - not matched");
		 }
		 String expected_lastName="Sayeed";
		 System.out.println("the expected Last name is - "+expected_lastName);
		 WebElement actual_Lname=driver.findElement(By.id("personal_txtEmpLastName"));
		 String actual_LastNAME=actual_Lname.getAttribute("value");
		 System.out.println("the actual Last name is - "+actual_LastNAME);
		 
		 if(actual_LastNAME.equals(expected_lastName))
		 {
			 System.out.println("Last name - matched");
	
		 }
		 else
		 {
			 System.out.println("Last name - not matched");
		 }
		 
		 WebElement welcome_admin=driver.findElement(By.id("welcome"));
		 welcome_admin.click();
		 
		 Thread.sleep(10000);
		 
		 WebElement logout=driver.findElement(By.linkText("Logout"));
		 logout.click();
		 
		 driver.close();
		 }

}
