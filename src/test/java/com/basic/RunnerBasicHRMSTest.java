package com.basic;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/basic/HRMS_basicTestScenarios.feature"},
		glue={"com.basic"},
		//dryRun=false,
		//monochrome=true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport.html",
				"json:target/cucumber-report2.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/ExtentReport1.html"
		}
		)
public class RunnerBasicHRMSTest {

}
