package com.crm.Vtiger.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream file = new FileInputStream(IPathConstant.propertyFile);
		Properties p = new Properties();
		p.load(file);
	    String data = p.getProperty(key);
		
		return data;
		
	}
	public String readDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(IPathConstant.excelpath);
		Workbook wb = WorkbookFactory.create(file);
	    String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileUtility fu= new FileUtility();
		String res = fu.readDataFromExcel("Organization",1 , 1);
		System.out.println(res);
				
	}
}
