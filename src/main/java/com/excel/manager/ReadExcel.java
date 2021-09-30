package com.excel.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	FileInputStream fis;
	XSSFWorkbook wb;
	
	public void getExcelData(int rowIndex,int columnIndex) {
		//Excel location or path
		File file = new File("./src/test/resources/TestingExcel.xlsx");
		
		//convert data to stream
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Apache POI methods to read excel
		//1st step = read whole excel as a book = workbook
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//XSSFSheet sht1 = wb.getSheetAt(1);//Sheet number
		XSSFSheet sht = wb.getSheet("NY Branch");//name
		
		sht.getLastRowNum();
		//int totalRow = sht.getPhysicalNumberOfRows();//total number of rows
		
		//loop all rows
		for(int i=0;i<sht.getLastRowNum();i++) {
			if(i==rowIndex) {
			Row row = sht.getRow(i);
			row.getLastCellNum();
			//row.getLastCellNum();//total column number
			//start another loop for column
			for(int j=0;j<row.getLastCellNum();j++) {
				if(j==columnIndex) {
				Cell cell = row.getCell(j);//actual cell data
				System.out.println(cell.getStringCellValue());
			}
			}
		}
		}
	}
	public static void main(String[] args) {
		new ReadExcel().getExcelData(0,0);//put column index number
	}
}
