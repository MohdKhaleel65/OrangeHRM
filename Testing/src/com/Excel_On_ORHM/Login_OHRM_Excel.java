package com.Excel_On_ORHM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_OHRM_Excel {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.navigate().to(ApplicationUrlAddress);
		driver.manage().window().maximize();
		
		FileInputStream file= new FileInputStream("./src/com/Excel_Files/Ohrm_Data.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		String expected_OHRMUrlAddress=sheet.getRow(0).getCell(1).getStringCellValue();
		
		String actual_OHrmUrlAddress=driver.getCurrentUrl();
		sheet.createRow(1).createCell(1).setCellValue(actual_OHrmUrlAddress);
		
		if(actual_OHrmUrlAddress.contains(expected_OHRMUrlAddress))
		{
			sheet.createRow(2).createCell(1).setCellValue("pass");
	 
		}
		else
		{
		 sheet.createRow(2).createCell(1).setCellValue("fail");
		}

		String expected_OHrmTitle=sheet.getRow(3).getCell(1).getStringCellValue();
		String actual_OHrmTitle=driver.getTitle();
		sheet.createRow(4).createCell(1).setCellValue(actual_OHrmTitle);
		if ( actual_OHrmTitle.equals(expected_OHrmTitle))
		{
			sheet.createRow(5).createCell(1).setCellValue("Pass");
	
		}
		else
		{
			sheet.createRow(5).createCell(1).setCellValue("Fail");

		}
		String Expected_LoginText=sheet.getRow(6).getCell(1).getStringCellValue();

		WebElement LoginText=driver.findElement(By.id("logInPanelHeading"));
		 String Actual_LoginText=LoginText.getText();
		 sheet.createRow(7).createCell(1).setCellValue(Actual_LoginText);
		 if(Actual_LoginText.equals(Expected_LoginText))
		 {
			 sheet.createRow(8).createCell(1).setCellValue("Pass");
		 }
		 else {
			 sheet.createRow(8).createCell(1).setCellValue("Fail");
		 }
		
		String name=sheet.getRow(9).getCell(1).getStringCellValue();
		WebElement Username=driver.findElement(By.id("txtUsername"));
		 Username.sendKeys(name);
		 
		
		 String PW=sheet.getRow(10).getCell(1).getStringCellValue();
		 WebElement password=driver.findElement(By.name("txtPassword"));
		 password.sendKeys(PW);
		 
		 WebElement login=driver.findElement(By.className("button"));
		 login.click();
		 
		 String Expected_AdminText=sheet.getRow(11).getCell(1).getStringCellValue(); 
		WebElement adminElement=driver.findElement(By.linkText("Admin"));
		 String Actual_adminText=adminElement.getText();
		 sheet.createRow(12).createCell(1).setCellValue(Actual_adminText);
		 
		 if(Expected_AdminText.equals(Actual_adminText))
		 {
			 sheet.createRow(13).createCell(1).setCellValue("Pass");
		 }
		 else
		 {
			 sheet.createRow(13).createCell(1).setCellValue("Fail");
		 }
		 
		 FileOutputStream file1=new FileOutputStream("./src/com/Excel_Files/Ohrm_Data.xlsx");
		 workbook.write(file1);
		 workbook.close();
		 WebElement welcome_admin=driver.findElement(By.id("welcome"));
		 welcome_admin.click();
		 
		 Thread.sleep(4000);
		 
		 WebElement logout=driver.findElement(By.linkText("Logout"));
		 logout.click();
		 
		 driver.close();
		 }
}
