package com.Excel_Operations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite_operation {
	public static void main(String[] args) throws IOException {
		
		//identify the excel file
		FileInputStream file=new FileInputStream("./src/com/Excel_Files/Write_Data_Operation.xlsx");
		
		//identify the workbook in the excel file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//identify the sheet in the workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		Row row=sheet.createRow(1);
		Cell cell=row.createCell(3);
		cell.setCellValue("selenium");
		FileOutputStream file1= new FileOutputStream("./src/com/Excel_Files/Write_Data_Operation.xlsx");
		workbook.write(file1);
		

	}

}
