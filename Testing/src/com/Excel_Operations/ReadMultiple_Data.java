package com.Excel_Operations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultiple_Data {
	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("./src/com/Excel_Files/Read_Multiple_Data.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		//System.out.println(rowCount);
		for(int i=0;i<=rowCount;i++)
		{
			
			int cellCount=sheet.getRow(i).getLastCellNum();
			//System.out.println(cellCount);
			for(int j=0;j<cellCount;j++)
			{
				Row row=sheet.getRow(i);
				Cell cell=row.getCell(j);
				String data=cell.getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
	}

}
