package com.telus.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//Updated by Tanvi - 19 Feb 2023
public class HashmapToExcel {

	public static void main(String[] args) throws IOException {
		
			
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("data");
		
		HashMap<String,String> userdata=new HashMap<String,String>();
		userdata.put("1","qwerty");
		userdata.put("2","keypad");

		int rowNo=0;
		for(Map.Entry entry:userdata.entrySet())
		{
			XSSFRow row=sheet.createRow(rowNo++);
			
			row.createCell(0).setCellValue((String)entry.getKey());
			row.createCell(1).setCellValue((String)entry.getValue());

		}
		
		FileOutputStream fos=new FileOutputStream(".\\dataFiles\\sheet8.xlsx"); 
		workbook.write(fos);
		fos.close();
		System.out.println("Excel written successfully");
	}

}
