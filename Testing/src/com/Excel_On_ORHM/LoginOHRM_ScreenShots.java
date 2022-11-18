package com.Excel_On_ORHM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOHRM_ScreenShots {
	
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
		
		String name=sheet.getRow(9).getCell(1).getStringCellValue();
		WebElement Username=driver.findElement(By.id("txtUsername"));
		 Username.sendKeys(name);
		 
		
		 String PW=sheet.getRow(10).getCell(1).getStringCellValue();
		 WebElement password=driver.findElement(By.name("txtPassword"));
		 password.sendKeys(PW);
		 
		 WebElement login=driver.findElement(By.className("button"));
		 login.click();
		 WebElement welcome_admin=driver.findElement(By.id("welcome"));
		 welcome_admin.click();
		 
		 Thread.sleep(4000);
		 
		 WebElement logout=driver.findElement(By.linkText("Logout"));
		 logout.click();
		 
		// driver.navigate().back();
		 //Thread.sleep(4000);
		 String name1=sheet.getRow(14).getCell(1).getStringCellValue();
			WebElement Username1=driver.findElement(By.id("txtUsername"));
			 Username1.sendKeys(name1);
			 
			
			 String PW1=sheet.getRow(15).getCell(1).getStringCellValue();
			 WebElement password1=driver.findElement(By.name("txtPassword"));
			 password1.sendKeys(PW1);
			 
			 WebElement login1=driver.findElement(By.className("button"));
			 login1.click();
			 File InvalidDataSCreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(InvalidDataSCreenShot,new File("./ScreenShots/InvalidData.png"));
		 
		driver.close();
		
	}
	
	
	
	

}
