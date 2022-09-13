package com.idiot.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\User\\Desktop\\xlexamplewithmaven\\ExcelFiles\\Test3.Xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		 String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
		 System.out.println(cellValue);
		 
		 workbook.close();
		 fis.close();
		 
		

	}

}
