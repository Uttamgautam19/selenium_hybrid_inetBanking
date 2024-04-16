package com.vtech.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	FileInputStream fins;
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	/*
	 * public ExcelDataProvider(String Filename, String sheetname) { try {
	 * 
	 * File fs = new File("./TestData/" + Filename + ".xlsx"); fins = new
	 * FileInputStream(fs); workbook = new XSSFWorkbook(fins); sheet =
	 * workbook.getSheet(sheetname); } catch (Exception e) { e.printStackTrace(); }
	 * }
	 * 
	 * public ExcelDataProvider(int index, String Filename) { try {
	 * 
	 * File fs = new File("./TestData/" + Filename + ".xlsx"); fins = new
	 * FileInputStream(fs); workbook = new XSSFWorkbook(fins); sheet
	 * =workbook.getSheetAt(index);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

	public ExcelDataProvider(String Filename) {
		try {

			File fs = new File("./TestData/" + Filename + ".xlsx");
			fins = new FileInputStream(fs);
			workbook = new XSSFWorkbook(fins);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int rowCount(String sheetname) {
		return workbook.getSheet(sheetname).getLastRowNum();
	}

	public int rowCount(int index) {
		return workbook.getSheetAt(index).getLastRowNum();
	}

	public int colCount(String sheetname, int row) {
		return workbook.getSheet(sheetname).getRow(row).getLastCellNum();
	}

	public int colCount(int index, int row) {
		return workbook.getSheetAt(index).getRow(row).getLastCellNum();
	}

	public String fetchStringCellValue(String sheetname, int row, int col) {
		return workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();

	}

	public String fetchStringCellValue(int index, int row, int col) {
		return workbook.getSheetAt(index).getRow(row).getCell(col).getStringCellValue();

	}

	public int fetchNumericCellValue(String sheetname, int row, int col) {
		return (int) workbook.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();

	}

	public int fetchNumericCellValue(int index, int row, int col) {
		return (int) workbook.getSheetAt(index).getRow(row).getCell(col).getNumericCellValue();

	}
	
	public String[][] getExcelTestData(String sheetname)
	{
		int rows = rowCount(sheetname);
		int col = colCount(sheetname, 0);
		
	String[][]	data =new String[rows][col];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<col;j++)
		{
		  data[i][j]=workbook.getSheet(sheetname).getRow(i+1).getCell(j).toString();
		}
	}
	
	return data;
	}
	
	public String[][] getNewCustomerData(String sheetname)
	{
		int rows = rowCount(sheetname);
		int col = colCount(sheetname, 0);
		
	String[][]	data1 =new String[rows][col];
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<col;j++)
		{
		  data1[i][j]=workbook.getSheet(sheetname).getRow(i+1).getCell(j).toString();
		}
	}
	return data1;
	}
	
	
	

	/*
	 * public static void main(String[] args) { ExcelDataProvider
	 * excelDataProvider=new ExcelDataProvider("InetBankingTestData");
	 * System.out.println("row count "+excelDataProvider.rowCount("Login"));
	 * System.out.println("row count "+excelDataProvider.rowCount(0));
	 * 
	 * System.out.println("col count "+excelDataProvider.colCount("Login",0));
	 * System.out.println("col count "+excelDataProvider.colCount(0,0));
	 * 
	 * System.out.println("Username : "+excelDataProvider.fetchStringCellValue(
	 * "Login", 0, 0));
	 * System.out.println("Username : "+excelDataProvider.fetchStringCellValue(
	 * "Login", 0, 1));
	 * System.out.println("Username : "+excelDataProvider.fetchStringCellValue(
	 * "Login", 0, 2));
	 * 
	 * System.out.println("Username : "+excelDataProvider.fetchStringCellValue(
	 * "Login", 1, 0));
	 * System.out.println("Username : "+excelDataProvider.fetchStringCellValue(
	 * "Login", 1, 1));
	 * System.out.println("Username : "+excelDataProvider.fetchStringCellValue(
	 * "Login", 1, 2)); }
	 */

}
