package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class DemoPage extends BaseClass{
	
	public DemoPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
   By computersLOcator= By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a");
   
   public WebElement computer() {
	return driver.findElement(computersLOcator);
	   
   }
   
}
