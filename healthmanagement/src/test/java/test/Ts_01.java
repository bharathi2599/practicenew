package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utility.ExcelUtility;

public class Ts_01 extends BaseClass {

	
	@Test(dataProvider="data1",priority=1,groups= {"smoke"})
	public void tc_01(String un, String pwd) throws IOException {
		
		File f= new File(path);
		FileInputStream fis = new FileInputStream(f);
		Properties prop =new Properties();
		prop.load(fis);
		String user= prop.getProperty("username");
		String pass= prop.getProperty("password");
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	LoginPage lp = new LoginPage(driver);
	lp.login(un,pwd);
	
	if(un.equals(user)&&pwd.equals(pass)) {
		
		String exceptedurl="practicetestautomation.com/logged-in-successfully/";
		String actualurl=driver.getCurrentUrl();
		
		
		System.out.println( "excepted uri ="+exceptedurl);
		System.out.println("actual url ="+actualurl);
		
		boolean temp=false;
		if(actualurl.contains(exceptedurl)) {
			temp=true;
		}
		Assert.assertTrue(temp);
	}
	
	else {
		
		
	}
		
	}
	
	@DataProvider(name="data1")
	public String [][]getData() throws IOException{
		
		ExcelUtility eu = new ExcelUtility("C:\\Users\\bb792\\OneDrive\\Desktop\\testdata.xlsx");
	   int rows = eu.getRows("logindata");
	   int cols = eu.getClos("logindata", 1);
	   
	   
	   String [][] values = new String[rows][cols];
	   
	   for(int i=1;i<=rows;i++) {
		    for (int j=0;j<cols;j++) {
		    	values[i-1][j]=eu.getData("logindata", i, j);
		    	
		    }
	   }
	
	return values;
	}
}
