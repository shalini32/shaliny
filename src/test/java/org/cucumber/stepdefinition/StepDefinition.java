package org.cucumber.stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("^user launch the browser$")
	public void user_launch_the_browser() throws Throwable {
	browserLaunch("chrome");
	geturl("https://www.facebook.com/");
	}

	@When("^user enter the credentials$")
	public void user_enter_the_credentials_(DataTable arg1) throws Throwable {
	  List<Map<String, String>> x = arg1.asMaps(String.class, String.class);
	  System.out.println(x.get(0).get("username"));
	  System.out.println(x.get(1).get("password"));
	}    

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    System.out.println("close the browser");
	}
	
	
	}


