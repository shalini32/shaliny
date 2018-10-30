package org.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver driver;
public static WebDriver browserLaunch(String browser) throws Exception {
	try {
		if (browser=="chrome") {
			System.setProperty("webdriver.chrome.driver","D:\\shalini\\Cucumber\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
	return driver;
}
public void geturl(String url) {
driver.get(url);
}
public String gettitle(String element) {
  String title = driver.getTitle();
  return title;
 

}
public String getcurrenturl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;

}
public String getattribute(WebElement element) {
    String attribute = element.getAttribute("value");
    return attribute;

}
public String gettext(WebElement element) {
	String text = element.getText();
	return text;
}
public String gettagname(WebElement element) {
	String tagName = element.getTagName();
	return tagName;
}
public boolean isdisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
 return displayed;
}
public boolean isselected(WebElement element) {
	boolean selected = element.isSelected();
	return selected;

}
public boolean isenabled(WebElement element) {
	boolean enabled = element.isEnabled();
	return enabled;
}
public void settext(WebElement element) {
	if(isdisplayed(element)&&isselected(element)&&isenabled(element)) {
	element.sendKeys("value");
	}
}
}

