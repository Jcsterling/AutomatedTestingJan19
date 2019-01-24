package com.bae.PassionateT;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:")



public class RunnerClass {
	static ExtentReports report;
//	static ExtentTest test; -- not needed
	
	@BeforeClass
	public static void starTest() {
		report = new ExtentReports(Constant.REPORTFILE, true);//this will replace the old report with a new report each time the test is ran
//        test = reports.startTest("Passionate Test"); -- not needed
		
	}
	
	@AfterClass
	public static void endTest() {
//		reports.endTest(test); -- not needed
        report.flush();
	}
}
