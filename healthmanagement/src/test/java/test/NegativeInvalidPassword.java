package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
@Listeners(utility2.MyLister.class)
public class NegativeInvalidPassword  extends BaseClass{
	@Test(priority=1)
	public void invalidTest1() {
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	@Test(priority=2)
	public void invalidTest2() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		
	}
    
	@Test(priority=3)
	public void invalidTest3() {
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
	}
	@Test(priority=4)
	public void invalidTest4() {
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
	}
	@Test(priority=5)
	public void invalidTest5() {
		
		boolean element=driver.findElement(By.xpath("//*[@id='error']")).isDisplayed();
		
		Assert.assertTrue(true);
	}
	
	@Test(priority=6)
	public void invalidTest() {
		String exceptedText="Your password is invalid!";
		String actualText=driver.findElement(By.xpath("//*[@id='error']")).getText();
		
		boolean temp=false;
		if(actualText.contains(exceptedText)) {
			temp=true;
		}
		Assert.assertTrue(temp);
		
		
		
	}
}
