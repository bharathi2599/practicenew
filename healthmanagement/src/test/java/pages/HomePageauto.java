package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class HomePageauto  extends BaseClass {
	
	
	public HomePageauto(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
     By menulocator = By.xpath("//*[@id=\"menu-primary-items\"]");
     
     public List<WebElement>menuElements(){
		return driver.findElements(menulocator);
     }
     
    
}
