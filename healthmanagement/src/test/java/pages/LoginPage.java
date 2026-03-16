package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	 
  By unlocator = By.xpath("//input[@id='username']");
  By pwdlocator = By.xpath("//input[@id='password']");
  By submitlocator = By.xpath("//*[@id=\"submit\"]");
  
  public void login(String un,String pwd) {
	  
	  
	  driver.findElement(unlocator).sendKeys(un);
	  driver.findElement(pwdlocator).sendKeys(pwd);
	  driver.findElement(submitlocator).click();
  }
 
  
}
