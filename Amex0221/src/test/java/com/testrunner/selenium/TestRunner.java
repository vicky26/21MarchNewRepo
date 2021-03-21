package com.testrunner.selenium;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)	
@CucumberOptions(features="src/test/resources/features/Login.feature",glue="stepDefinition", plugin = {"pretty", "html:target/Vicky-cucumber-html-report"})		
public class TestRunner 				
{		

}
