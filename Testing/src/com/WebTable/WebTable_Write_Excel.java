package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Write_Excel {
	public static void main(String[] args) throws IOException {
		
		String Address="https://www.timeanddate.com/worldclock";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get(Address);
		driver.manage().window().maximize();
		FileInputStream file=new FileInputStream("./src/com/Excel_Files/WebTable_Data.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
	for(int i=1;i<=36;i++)
		{
			WebElement Table_FirstRowWebElements=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[3]"));
			
			String FirstRow_Names=Table_FirstRowWebElements.getText();
			
			System.out.println(FirstRow_Names);
			
			sheet.createRow(i).createCell(0).setCellValue(FirstRow_Names);
			
			FileOutputStream file1=new FileOutputStream("./src/com/Excel_Files/WebTable_Data.xlsx");
			
			workbook.write(file1);
			
			
		}
	
		
	}

}
