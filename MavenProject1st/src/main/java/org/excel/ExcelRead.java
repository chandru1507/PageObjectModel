package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		
//	
////		File file = new File("C:\\Users\\Chandru\\eclipse-workspace\\MavenProject1st\\src\\test\\re"
////				+ "sources\\ExcelFiles\\Framework.xlsx");
////		FileInputStream inputstream = new FileInputStream(file);
////		
////		Workbook workbook = new XSSFWorkbook(inputstream);
////		
////		Sheet sheet = workbook.getSheet("TestData");
////		
////		Row row = sheet.getRow(0);
////		 
////		Cell cell = row.getCell(1);
////		
////		System.out.println(cell);
////		
////		int physicalNumber = sheet.getPhysicalNumberOfRows();
////		System.out.println(physicalNumber);
////		
////		int cells = row.getPhysicalNumberOfCells();
////		System.out.println(cells);
////		
////		
////		System.out.println("************");
////		
//////		Row row2 = sheet.getRow(0);
//////		
////		for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
////			
////			Cell cell2 = row2.getCell(i);
////			System.out.println(cell2);
////		}
////		
////		System.out.println("************");
////		
////		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
////			
////			Row row3 = sheet.getRow(i);
////			
////			for (int j = 0; j < row3.getPhysicalNumberOfCells(); j++) {
////				
////				Cell cell2 = row3.getCell(j);
////				//System.out.println(cell2);
////				
////				int cellType = cell2.getCellType();
////			//	System.out.println(cellType);
////				
////		//celltype--1  string/alpha
////				
////				if (cellType==1) {
////				 String stringCellValue = cell2.getStringCellValue();
////				 System.out.println(stringCellValue);
////				 
////		//celltype--o  Numberic		 
////				 
////				 if (cellType==0) {
////					 double numericValue = cell2.getNumericCellValue();
////					 long l = (long) numericValue;
////					 String valueOf = String.valueOf(l);
////					 System.out.println(valueOf);
////					 
////				 }
////}   
////				 
////}			 
////}				
//			File file = new File("C:\\Users\\Chandru\\eclipse-workspace\\Maven"
//					+ "Project1st\\src\\test\\resources\\ExcelFiles\\Newframework1.xlsx");
//			
//////			FileInputStream inputstream = new FileInputStream(file);
////			
////			Workbook workbook=new XSSFWorkbook();
////			
////			Sheet sheet = workbook.getSheet("NewSheet");
////			Row row = sheet.getRow(1);
////			Cell cell = row.getCell(0);
////////			System.out.println(cell);
//////			
//////		   int rowsnumber = sheet.getPhysicalNumberOfRows();
//////		   System.out.println(rowsnumber);
////		   
////		  int cellsnumber = row.getPhysicalNumberOfCells();
//////		  System.out.println(cellsnumber);
////			
////		  Row row2 = sheet.getRow(0);
////		  
////		  for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
////			  
////			  Cell cell2 = row2.getCell(i);
//////			  System.out.println(cell2);
////			
////		}
////		  
////		  for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
////			  
////			   Row row3 = sheet.getRow(i);
////			   
////			   for (int j = 0; j <row3.getPhysicalNumberOfCells(); j++) {
////				   
////				   Cell cell2 = row3.getCell(j);
//////				   System.out.println(cell2);
////				   
////				   
////			int cellType = cell2.getCellType();
////			
//////			System.out.println(cellType);
////			
////			if (cellType==1) {
////				
////				String stringCellValue = cell2.getStringCellValue();
////			//	System.out.println(stringCellValue);
////			}
////			
////			if (cellType==0) {
////				
////				if (DateUtil.isCellDateFormatted(cell2)) 
////				{
////					Date dateCellValue = cell2.getDateCellValue();
////					SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
////					String format = dateformat.format(dateCellValue);
////					System.out.println(format);
////				}
////				
////				double numericCellValue = cell2.getNumericCellValue();
////		        long s = (long) numericCellValue;
////				//System.out.println(s);
////			}
////				   
//			Workbook workbook = new XSSFWorkbook();
//			
//			Sheet sheet = workbook.createSheet();
//			
//			Row row = sheet.createRow(0);
//			Cell cell = row.createCell(0);
//			cell.setCellValue("Chandru");
//			
//			FileOutputStream outputstream = new FileOutputStream(file);
//			
//			workbook.write(outputstream);
			
			
			
			File file = new File("C:\\Users\\Chandru\\eclipse-workspace\\MavenProject1st\\src\\test\\resources\\ExcelFiles\\Newframework1.xlsx");
			
			FileInputStream outputstream = new FileInputStream(file);
			
			Workbook workbook = new XSSFWorkbook(outputstream);
			
			Sheet sheet = workbook.getSheet("Sheet0");
			
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			String stringCellValue = cell.getStringCellValue();
			if (stringCellValue.equals("Frame")) {
				cell.setCellValue("Frame1234");
			}
			
			FileOutputStream outputstream1 = new FileOutputStream(file);
			
			workbook.write(outputstream1);
			System.out.println(outputstream1);
			
			
			
			
			
			
			
			
			
	}
	
}
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
	 
				
			
			
		
		  
		
		  
		  
			
			
		
		

			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


