package org.cucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\java\\org\\cucumber\\feature\\"},glue= {"org.cucumber.stepdefinition"})
public class TestRunner {

}
