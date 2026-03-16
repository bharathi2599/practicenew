package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePageauto;

public class TS_02  extends BaseClass{
	
	@Test(groups="smoke")
	public void tc_01() {
		
		
		driver.get("https://practicetestautomation.com/");
		
		List<String> items = new ArrayList<String>();
		
		items.add("HOME");
		items.add("PRACTICE");
		items.add("COURSES");
		items.add("BLOG");
		items.add("CONTACT");
		
		HomePageauto hp= new HomePageauto(driver);
		List<WebElement> eles = hp.menuElements();
		
		boolean temp=false;
		
		for(int i=0; i<eles.size(); i++) {
			
			if(eles.get(i).getText().contains(items.get(i))) {
				
				System.out.println(eles.get(i).getText()+"  =  "+items.get(i));
				temp=true;
			}
			
			else {
				temp=false;
				break;
			}
		}
		
		Assert.assertTrue(temp);
	}

}
