package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AjioPage;
import base.BaseClass;

public class AjioTest extends BaseClass {

@Test
public void tc_01() throws Exception {

driver.get("https://ajio.com/");
Thread.sleep(5000);
//this is code written in github
  //this line code was written by surya
List<String> items = new ArrayList<String>();

items.add("MEN");
items.add("WOMEN");
items.add("KIDS");
items.add("BEAUTY");
items.add("HOME & KITCHEN");

AjioPage hp = new AjioPage(driver);
List<WebElement> eles = hp.menuElements();

System.out.println("Menu size = " + eles.size());

boolean temp = false;

for(int i=0; i<items.size() && i<eles.size(); i++) {

String text = eles.get(i).getText();

System.out.println("Website Menu: " + text);

if(text.contains(items.get(i))) {
temp = true;
}
else {
temp = false;
break;
}

}

Assert.assertTrue(temp);

}

}
