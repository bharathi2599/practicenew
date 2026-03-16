package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class LoginTest2  extends BaseClass{
	
	@Test(priority=1)
	public void validTest1() {
		
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	}
	
	@Test(priority=2)
	public void validTest2() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		
	}
	@Test(priority=3)
	public void validTest3 () {
		   
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		
	}
	@Test(priority=4)
	public void validTest() {
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
	}
	
	@Test(priority=5)
	public void validTest4() {
		
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
	@Test(priority=6)
	public void validTest5() {
		
		String exceptedText="successfully logged in";
		String actualText=driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']")).getText();
		
		boolean temp=false;
		if(actualText.contains(exceptedText)) {
			temp=true;
		}
		Assert.assertTrue(temp);
		}
	@Test(priority=7)
	public void validTest6() {
		
	boolean element=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).isDisplayed();
		
		Assert.assertTrue(true);
		
	}
	}


