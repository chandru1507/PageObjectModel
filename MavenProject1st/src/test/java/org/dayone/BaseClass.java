package org.dayone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	
	public static void browserlaunch(String url) {
		
		WebDriverManager.chromedriver().setup();
		
	//	***
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
	//	***
		driver = new ChromeDriver(ops);
		driver.get(url);
		driver.manage().window().maximize();
	
		
		
		
	}	
		
		public static WebElement findElementID(String id) {
			WebElement element = driver.findElement(By.id(id));
			return element;
		}
		
		public static WebElement findElementName(String name) {
			WebElement elementName = driver.findElement(By.name(name));
			return elementName;
			}
		
        public static void sendvalues(WebElement element,String data) {
        	
        	element.sendKeys(data);

           }
		public static void clickvalues(WebElement element) {
			
			element.click();

		}
		
		public static  WebElement  findElementText(String text) {
			WebElement elementText = driver.findElement(By.xpath(text));
			return elementText;

		}
		
	   public static String getDataFromExcel(String pathName ,String sheetName,int rowNo,int cellNo) throws IOException {
		   
		   
		   String cellData=null;
		   File file = new File(pathName);
		   FileInputStream inputStream = new FileInputStream(file);
		   Workbook workbook = new XSSFWorkbook(inputStream);
		   Sheet sheet = workbook.getSheet(sheetName);
		   Row row = sheet.getRow(rowNo);
		   Cell cell = row.getCell(cellNo);
		   
		   int cellType = cell.getCellType();
		   
		   if (cellType==1)
		   {
			   cellData = cell.getStringCellValue();
		   }
		   
		   if (cellType==0)
		   {
			  if(DateUtil.isCellDateFormatted(cell))
			  {
				  Date dateCellValue = cell.getDateCellValue();
				  SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MMM-yyyy");
				  cellData = dateFormat.format(dateCellValue);
			  }
			   
			  else {
				  double numericCellValue = cell.getNumericCellValue();
				  long l = (long) numericCellValue;
				  cellData = String.valueOf(l);
			  }
		   }
		return cellData;	   

	}
	
public static void browserClose() {
  driver.close();
}


public static WebElement findElementXpath(String xpath) {
	WebElement elementXpath = driver.findElement(By.xpath("data"));
	return elementXpath;
}



















 }	


