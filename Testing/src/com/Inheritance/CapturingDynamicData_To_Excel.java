package com.Inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingDynamicData_To_Excel  extends BaseTest{
	

	public void CapturingDynamicData_To_Excel_Test() throws IOException
	{
		 WebElement webTable=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div"));
		 //in the web Table finding the no. of rows
		 List<WebElement>tableRows=webTable.findElements(By.tagName("tr"));
		 
		 FileInputStream file=new FileInputStream("./src/com/Excel_Files/WebTable_Data.xlsx");
		 XSSFWorkbook workbook= new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
		 
		 for(int i=0;i<tableRows.size();i++)
		 {
			 Row row=sheet.createRow(i);
			 //goes to every row and find the no. of cell in that row
			 List<WebElement>tableRowsOFCell=tableRows.get(i).findElements(By.tagName("td"));
			 //goto every cell of the row
			 for(int j=0;j<tableRowsOFCell.size();j++)
			 {
				 Cell cell=row.createCell(j);
				 //goes to every row of a cell - gets the value in it
				 String tableData=tableRowsOFCell.get(j).getText();
				 cell.setCellValue(tableData);
				 //sheet.createRow(i).createCell(j).setCellValue(tableData);
				 FileOutputStream file1=new FileOutputStream("./src/com/Excel_Files/WebTable_Data.xlsx");
				workbook.write(file1);
				 System.out.print(tableData+" ");
				 
			 }
			 System.out.println();
		 }
	}
	public static void main(String[] args) throws IOException {
	
		CapturingDynamicData_To_Excel cdtd = new CapturingDynamicData_To_Excel();
		cdtd.applicationLaunch();
		cdtd.CapturingDynamicData_To_Excel_Test();
		cdtd.applicationClose();
		
	}
}


