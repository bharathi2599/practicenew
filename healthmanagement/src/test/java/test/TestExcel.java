package test;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.ExcelUtility;

public class TestExcel {

	
	@Test
	public void testRows () throws IOException {
		
		ExcelUtility eu= new ExcelUtility("C:\\Users\\bb792\\OneDrive\\Desktop\\testdata.xlsx");
		
		
		int rows = eu.getRows("Sheet1");
		
		System.out.println(rows);
		 
		
		int cols = eu.getClos("Sheet1",1);
		System.out.println(cols);
		
		
		String data1 = eu.getData("Sheet1", 1,0 );
		System.out.println(data1);
		
		
		//String data2 = eu.getData("Sheet1", 1,1 );
		//System.out.println(data2);
		
	}
	
	
}
