package com.bae.GoogleSearchWithSenarioOutline;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSerachStepDefinition {
	

	WebDriver driver;

    ExtentReports reports;
    ExtentTest test;

    String url;
    

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                Constant.CROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        test = GoogleRunner.report.startTest("Google Test");


    }
    
    @After
    public void teardown() throws Exception {

        Thread.sleep(3000);
        GoogleRunner.report.endTest(test);
        driver.quit();


    }
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
        url = driver.getCurrentUrl();
        test.log(LogStatus.INFO, "GOOGLE HOMEPAGE ACCESSED");
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) {
		GoogleHomepage homepage = PageFactory.initElements(driver, GoogleHomepage.class);
		homepage.googleSearch(arg1);
		test.log(LogStatus.INFO, "search term searched");
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	@Then("^I am taken to a page with relevant infomation about the searchterm \"([^\"]*)\"$")
	public void i_am_taken_to_a_page_with_relevant_infomation_about_the_searchterm(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		

		 
		assertTrue(!url.equals(driver.getCurrentUrl()));
		
		String title = driver.getTitle();
		
		if (title.equals(arg1 + " - Google Search")) {
			test.log(LogStatus.PASS, "search success");
		}else {
			test.log(LogStatus.FAIL, "search failure");
			
		}
		
		
		 
	   
	}


}
