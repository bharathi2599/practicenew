package test;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.AjioPage;
import utility.Genericutilities;

public class TS_002 extends BaseClass {
	
	
	
	@Test
	public void a() {
		driver.get("https://www.Ajio.com");
		Genericutilities gu =new 	Genericutilities(driver);
		AjioPage ap=new AjioPage(driver);
		
		//gu.Movetoelement(ap.men());
	}
	
 

}
