package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AjioPage {

WebDriver driver;

public AjioPage(WebDriver driver) {
this.driver = driver;
}

public List<WebElement> menuElements() {

return driver.findElements(By.xpath("//span[@class='nav-menu-item"));

}

}