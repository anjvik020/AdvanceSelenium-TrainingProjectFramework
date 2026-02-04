package com.comcast.crm.genericutility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public String toReaddatafromexcelfile(String sheet,int rownum,int cellnum) throws Throwable
	{
		FileInputStream excel=new FileInputStream("./src\\test\\resources\\AdvanceConcept\\NinjaaddProduct.xlsx");
		 Workbook wb = WorkbookFactory.create(excel);
		String data = wb.getSheet(sheet).getRow(rownum).getCell(cellnum).getStringCellValue();
		wb.close();
		return data;
	}
	public int getrowcount(String sheetname) throws Throwable
	{
		FileInputStream excel=new FileInputStream("./src\\test\\resources\\AdvanceConcept\\NinjaaddProduct.xlsx");
		 Workbook wb = WorkbookFactory.create(excel);
		int data = wb.getSheet(sheetname).getLastRowNum();
		wb.close();
		return data;
	}
	}

