package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {

public WebDriver driver;

@BeforeClass
public void setUp() {

driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://www.ajio.com/");

}

@AfterClass
public void tearDown() {

//driver.quit();

}

}