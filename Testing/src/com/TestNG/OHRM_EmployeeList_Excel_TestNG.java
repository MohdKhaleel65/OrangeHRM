package com.TestNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_EmployeeList_Excel_TestNG {
	
WebDriver driver;
	
	@BeforeTest
	public void OHRMApplicationLaunch()
	{

		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
System.setProperty("webdriver.chrome.driver", "./DriverFiles1/chromedriver.exe");

driver= new ChromeDriver();
driver.get(ApplicationUrlAddress);
driver.manage().window().maximize();	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void LoginTest()
	{
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.clear();
		 Username.sendKeys("MohdKhaleel19");
		 
		 WebElement Password=driver.findElement(By.name("txtPassword"));
		 Password.clear();
		 Password.sendKeys("MohdKhaleel@19");
		 
		 WebElement login=driver.findElement(By.className("button"));
		 login.click();

	}
	
	@Test(priority=2)
	public void PIM_Test()
	{
		WebElement PIM1=driver.findElement(By.linkText("PIM"));
		 Actions action=new Actions(driver);
		 action.moveToElement(PIM1).build().perform();
	}
	@Test(priority=3)
	public void EmployeeList_Test()
	{
		WebElement EmployeeListElement=driver.findElement(By.linkText("Employee List"));
		 EmployeeListElement.click();
	}
	@Test(priority=4)
	public void CapturingEmployeeList_To_Excel_Test() throws IOException
	{
		 WebElement webTable=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table"));
		 //in the web Table finding the no. of rows
		 List<WebElement>EmployeeListTableRows=webTable.findElements(By.tagName("tr"));
		 
		 FileInputStream file=new FileInputStream("./src/com/Excel_Files/OHRM-Employee List.xlsx");
		 XSSFWorkbook workbook= new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
		 
		 for(int i=0;i<EmployeeListTableRows.size();i++)
		 {
			 Row row=sheet.createRow(i);
			 //goes to every row and find the no. of cell in that row
			 List<WebElement>tableRowsOFCell=EmployeeListTableRows.get(i).findElements(By.tagName("td"));
			 //goto every cell of the row
			 for(int j=0;j<tableRowsOFCell.size();j++)
			 {
				 Cell cell=row.createCell(j);
				 //goes to every row of a cell - gets the value in it
				 String tableData=tableRowsOFCell.get(j).getText();
				 cell.setCellValue(tableData);
				 //sheet.createRow(i).createCell(j).setCellValue(tableData);
				 FileOutputStream file1=new FileOutputStream("./src/com/Excel_Files/OHRM-Employee List.xlsx");
				workbook.write(file1);
				 System.out.print(tableData+" ");
				 
			 }
			 System.out.println();
	}
	}
	@Test(priority=5)
	public void welcomeAdminTest() throws InterruptedException
	{
		
		 WebElement welcome=driver.findElement(By.id("welcome"));
		 welcome.click();
		 

	}
	@Test(priority=6)
	public void LogoutTest() throws InterruptedException 
	{
//		Thread.sleep(3000);
		WebElement logout=driver.findElement(By.linkText("Logout"));
		 logout.click();
	}
	@AfterTest
	public void OHRMApplicationClose()
	{
		driver.close();
	}


}
