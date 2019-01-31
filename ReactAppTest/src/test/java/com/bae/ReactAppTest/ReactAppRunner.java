package com.bae.ReactAppTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:")
public class ReactAppRunner {
	
	
	static ExtentReports report;
	
	@BeforeClass
	public static void startExtentReport() {
		
		 report = new ExtentReports(Constant.REPORTFILE, true);
		
	}

	@AfterClass
	public static void endExtentReport() {
		
		report.flush();
	}

}
