package com.OHRMTestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OrangeHrm_Application.OHRM.BaseTest;

public class LogInTest extends BaseTest {
	
	public Logger log = Logger.getLogger(LogInTest.class);
	Row sheet1Row;
	@Test(priority=1)
	public void OHRM_logInTest() throws IOException
	{
		PropertyConfigurator.configure("Log4j.properties");

	excelTestDataFile = new FileInputStream("./src/main/java/com/ExcelFiles/OHRMTestData.xlsx");
	workBook = new XSSFWorkbook(excelTestDataFile);
	workBookSheet=workBook.getSheet("Sheet1");

	sheet1Row=workBookSheet.getRow(1);

	Cell sheet1RowCell=sheet1Row.getCell(0);

	// finding the properties of the Elements - to Automate
	WebElement userNameL=driver.findElement(By.id(prop.getProperty("UserNameL")));
	userNameL.clear();
	String userNameTestData=sheet1RowCell.getStringCellValue();
	userNameL.sendKeys(userNameTestData);
	log.info("Entered UserName");

	WebElement passwordL=driver.findElement(By.name(prop.getProperty("PasswordL")));
	passwordL.clear();

	Cell passwordTestDataCell=sheet1Row.getCell(1);
	String passwordTestData=passwordTestDataCell.getStringCellValue();
	passwordL.sendKeys(passwordTestData);
	log.info("entered Password");

	WebElement LogInButtonL=driver.findElement(By.className(prop.getProperty("logInButtonL")));
	LogInButtonL.click();
log.info("Clicked Login Button");

	}

	@Test(priority=2)
	public void logOutTest() throws IOException
	{
	WebElement welComeAdminL=driver.findElement(By.id(prop.getProperty("welcomeAdminL")));

	String expected_WelComeAdminText="Welcome Admin";
	String actual_WelComeAdminText=welComeAdminL.getText();

	if(actual_WelComeAdminText.equalsIgnoreCase(expected_WelComeAdminText))
	{
	//System.out.println(" PASS ");
	Cell sheet1RowCell=sheet1Row.createCell(2);
	sheet1RowCell.setCellValue("PASS");
	}
	else
	{
	//System.out.println(" FAIL ");
	Cell sheet1RowCell=sheet1Row.createCell(2);
	sheet1RowCell.setCellValue("Fail");
	}


	welComeAdminL.click();
log.info("clicked on WelcomeAdmin Button");
	WebElement logOutL=driver.findElement(By.linkText(prop.getProperty("LogOutL")));
	logOutL.click();
log.info("Logout successfully");
	excelTestResultFile = new FileOutputStream("./src/main/java/com/ExcelFiles/TestDataResultFile.xlsx");
	workBook.write(excelTestResultFile);
	}

}
