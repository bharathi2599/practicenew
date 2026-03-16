package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import base.BaseClass;

public class Genericutilities extends BaseClass {
    
	public Genericutilities(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Movetoelement(WebElement ele) {
		
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	
		
	}
	public void Screenshot(String text) throws IOException {
		TakesScreenshot tss= (TakesScreenshot)driver;
		
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst =new File("C:\\Users\\bb792\\OneDrive\\Desktop\\work space\\healthmanagement\\src\\test\\resources\\Screenshots"+text+".png");
		
		Files.copy(src, dst);
		}
	
	public void eleScreenshot(WebElement ele,String text) throws IOException {
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dst =new File("C:\\Users\\bb792\\OneDrive\\Desktop\\work space\\healthmanagement\\src\\test\\resources\\Screenshots"+text+".png");
		
		Files.copy(src, dst);
		
	}
	public void selectDropDown(WebElement ele,String text) {
		
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	public void clickEle(WebElement ele) {
		ele.click();
	}
	
	public void enterText(WebElement ele,String text) {
		ele.sendKeys(text);
	}
	
	
	public boolean display(WebElement ele) {
		
		return ele.isDisplayed();
	}
}
