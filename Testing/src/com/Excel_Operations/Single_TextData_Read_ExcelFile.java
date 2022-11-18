package com.Excel_Operations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Single_TextData_Read_ExcelFile {
	
	
	public static void main(String[] args) throws IOException {
		//identify the excel file
		FileInputStream file=new FileInputStream("./src/com/Excel_Files/Read_Data_Testing.xlsx");
		
		//identify the workbook in the excel file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//identify the sheet in the workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//identify the row in the sheet
		Row r=sheet.getRow(0);
		
		//identify the cell in the Row
		Cell c=r.getCell(0);
		
		//get the data from the row of a cell
		String data=c.getStringCellValue();
		
		//print the data
		
		System.out.println(data);
		
		
		
		
	}

}
