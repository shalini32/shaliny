package org.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	static WebDriver driver;
@FindBy(name="email")
private  WebElement username;
@FindBy(name="pass")
private WebElement password;
@FindBy(xpath="//input[@value='Log In']")
private WebElement login;

public Login(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver,this);
	
}


public static WebDriver getDriver() {
	return driver;
}

public static void setDriver(WebDriver driver) {
	Login.driver = driver;
}

public WebElement getUsername() {
	return username;
}

public void setUsername(WebElement username) {
	this.username = username;
}

public WebElement getPassword() {
	return password;
}

public void setPassword(WebElement password) {
	this.password = password;
}

public WebElement getLogin() {
	return login;
}

public void setLogin(WebElement login) {
	this.login = login;
}
}