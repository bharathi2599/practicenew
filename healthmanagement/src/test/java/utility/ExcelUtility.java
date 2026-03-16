package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	
	public File f;
	public FileInputStream fis;
	
	
	String path;
	
	public ExcelUtility(String path) {
		this.path=path;
	}
	
	public int getRows(String sheetname) throws IOException {
		
		f =new File(path);
		fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname);
		int rows = sheet.getLastRowNum();
		  
		return rows;
	
	}
	public int getClos(String sheetname,int rowNum) throws IOException {
		
		f=new File(path);
		fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sheet= wb.getSheet(sheetname);
		row =sheet.getRow(rowNum);
		int cols= row.getLastCellNum();
		
		return cols;
		
	}
	
	public String getData(String sheetname,int rowNum,int colNum) throws IOException {
		
		f= new File(path);
		fis = new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname);
		row = sheet.getRow(rowNum);
		cell =row.getCell(colNum);
		String data = cell.getStringCellValue();
		
		return data;
		
		
	}
}

