package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DemoPage;
import utility.Genericutilities;

public class TS_003  extends BaseClass{
	
	@Test
    public void b() throws IOException {
		driver.get("https://demowebshop.tricentis.com/");
		Genericutilities gu =new Genericutilities(driver);
		DemoPage dp=new  DemoPage(driver);
		
		gu.Movetoelement(dp.computer());
		gu.Screenshot("photo2");
	}

}
