package org.framesselenium;

import java.util.List;

import org.dayone.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends BaseClass {
	
	public static void main(String[] args) {
		
	browserlaunch("https://demo.guru99.com/test/web-table-element.php");
	
	WebElement dataTable = driver.findElement(By.xpath("//table[@class='dataTable']"));
	
	List<WebElement> tableRow = dataTable.findElements(By.tagName("tr"));
	int size = tableRow.size();
	System.out.println(size);
	
//	List<WebElement> columntable = dataTable.findElements(By.tagName("th"));
//	int size2 = columntable.size();
//	System.out.println(size2);
//	
//	List<WebElement> tableData = dataTable.findElements(By.tagName("td"));
//	int size3 = tableData.size();
//	System.out.println(size3);
//	
//	String text = tableRow.get(2).getText();
//	System.out.println(text);
//	
//	for (int i = 0; i <tableRow.size(); i++) {
//		
//		String text2 = tableRow.get(i).getText();
//		System.out.println(text2);
//	}
//	
//	
//	List<WebElement> datatable = tableRow.get(3).findElements(By.tagName("td"));
//	
//	for (int i = 0; i < tableRow.size(); i++) {
//		
//		String text2 = datatable.get(i).getText();
//		System.out.println(text2);
//	}
//	
	
	System.out.println("*************");
	for (int i = 0; i <tableRow.size() ; i++) {
		
		List<WebElement> list = tableRow.get(i).findElements(By.tagName("td"));
		
		for (int j = 0; j <list.size(); j++) {
			
			String text2 = list.get(j).getText();
			System.out.println(text2);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
