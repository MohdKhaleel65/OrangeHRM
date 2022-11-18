package com.Excel_On_ORHM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployee_OHRM_Excel {
	public static void main(String[] args) throws IOException, InterruptedException {
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver;


		driver= new ChromeDriver();
		driver.navigate().to(ApplicationUrlAddress);
		driver.manage().window().maximize();
		
		FileInputStream file= new FileInputStream("./src/com/Excel_Files/Ohrm_Data.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);		
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		
		String name=sheet.getRow(0).getCell(1).getStringCellValue();
		WebElement Username=driver.findElement(By.id("txtUsername"));
		 Username.sendKeys(name);
		 
		
		 String PW=sheet.getRow(1).getCell(1).getStringCellValue();
		 WebElement password=driver.findElement(By.name("txtPassword"));
		 password.sendKeys(PW);
		 
		 WebElement login=driver.findElement(By.className("button"));
		 login.click();
		 
		 WebElement PIM1=driver.findElement(By.linkText("PIM"));
		 Actions action=new Actions(driver);
		 action.moveToElement(PIM1).build().perform();
		 
		 WebElement Add_Employee=driver.findElement(By.linkText("Add Employee"));
		 Add_Employee.click();
		 String FirstName=sheet.getRow(3).getCell(1).getStringCellValue();
		 WebElement First_Name=driver.findElement(By.id("firstName"));
		 First_Name.sendKeys(FirstName);
		 
		 String MiddleName=sheet.getRow(4).getCell(1).getStringCellValue();
		 WebElement middle_name=driver.findElement(By.id("middleName"));
		 middle_name.sendKeys(MiddleName);
		 
		 String LastName=sheet.getRow(5).getCell(1).getStringCellValue();
		 WebElement last_name=driver.findElement(By.id("lastName"));
		 last_name.sendKeys(LastName);
		 WebElement Employee_Id=driver.findElement(By.id("employeeId"));
		  String Id=Employee_Id.getAttribute("value");
		  sheet.createRow(6).createCell(1).setCellValue(Id);
		  
		WebElement save_Details=driver.findElement(By.id("btnSave"));
		save_Details.click();
		
		String Expected_FirstName=sheet.getRow(3).getCell(1).getStringCellValue();
		 
		 WebElement actual_nameElement=driver.findElement(By.id("personal_txtEmpFirstName"));
		 String actual_Firstname=actual_nameElement.getAttribute("value");
		sheet.createRow(7).createCell(1).setCellValue(actual_Firstname);
		 
		 if(actual_Firstname.equals(Expected_FirstName))
		 {
	sheet.createRow(8).createCell(1).setCellValue("Matched");
		 }
		 else
		 {
				sheet.createRow(8).createCell(1).setCellValue("Not-Matched");

		 }
		
		 String expected_middle_Name=sheet.getRow(4).getCell(1).getStringCellValue();
		 
		 WebElement actual_middleName_Element=driver.findElement(By.id("personal_txtEmpMiddleName"));
		 String actual_middle_NAME=actual_middleName_Element.getAttribute("value");
		 sheet.createRow(9).createCell(1).setCellValue(actual_middle_NAME);
		 
		 if(actual_middle_NAME.equals(expected_middle_Name))
		 {
			 
			 sheet.createRow(10).createCell(1).setCellValue("Matched");
		 }
		 else
		 {
			 sheet.createRow(10).createCell(1).setCellValue("Not-Matched");
		 }
		 
		 String expected_lastName=sheet.getRow(5).getCell(1).getStringCellValue();
		 
		 WebElement actualLastName_Element=driver.findElement(By.id("personal_txtEmpLastName"));
		 String actual_LastNAME=actualLastName_Element.getAttribute("value");
		 sheet.createRow(11).createCell(1).setCellValue(actual_LastNAME);
		  if(actual_LastNAME.equals(expected_lastName))
		 {
			  sheet.createRow(12).createCell(1).setCellValue("Matched");
	
		 }
		 else
		 {
			 sheet.createRow(12).createCell(1).setCellValue("Not-Matched");
		 }
		 
		 WebElement welcome_admin=driver.findElement(By.id("welcome"));
		 welcome_admin.click();
		 
		 Thread.sleep(4000);
		 
		 WebElement logout=driver.findElement(By.linkText("Logout"));
		 logout.click();
		 
		  FileOutputStream file1= new FileOutputStream("./src/com/Excel_Files/Ohrm_Data1.xlsx");
			 workbook.write(file1);
			 workbook.close();
		driver.close();

	}

}
