package com.What_A_Chart.uttilites;

import java.io.FileInputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.WhatAChart.TestCases.BaseClass;

public class ExcelRead 
{
	public static Logger log = Logger.getLogger(BaseClass.class);

	public static String readData(int rowValue , int cellValue) throws Exception
	{
		PropertyConfigurator.configure("log4j.properties");
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("./src/test/java/com/What_A_Chart/uttilites/WhatACart_ManulTestCases.xls");
		log.info(" Read Excel ");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Login Func TestCases");
		Row row1 = sheet.getRow(rowValue);
		String value = df.formatCellValue(row1.getCell(cellValue));
		
		log.info("Ecxel Cell Value "+value);
		
		return value ;
	}
}
