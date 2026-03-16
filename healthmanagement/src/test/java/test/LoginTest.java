package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest  extends BaseClass{
	
	@Test(priority=1)
	public void validTest1() throws InterruptedException {
		 
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		LoginPage lp=new LoginPage(driver);
		lp.login("student","Password123");
		
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

	@Test(priority=2)
	public void validTest2() throws InterruptedException {
		
		
		Thread.sleep(3000);
		String exceptedText="successfully logged in";
		String actualText=driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']")).getText();
		
		boolean temp=false;
		if(actualText.contains(exceptedText)) {
			temp=true;
		}
		Assert.assertTrue(temp);
	}
	
	@Test(priority=3)
	public void validTest3() {
		
		boolean element=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).isDisplayed();
		
		Assert.assertTrue(true);
	}
	}

