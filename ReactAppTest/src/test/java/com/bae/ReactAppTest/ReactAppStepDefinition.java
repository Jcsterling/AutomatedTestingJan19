package com.bae.ReactAppTest;

import org.openqa.selenium.By;
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

public class ReactAppStepDefinition {
	

	WebDriver driver;

    ExtentReports reports;
    ExtentTest test;

    String url;
    
    ReactAppFormPage formpage;
	

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                Constant.CROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        test = ReactAppRunner.report.startTest("ReactAppTest");
        
        formpage = PageFactory.initElements(driver, ReactAppFormPage.class);


    }
    
    @After
    public void teardown() throws Exception {

        Thread.sleep(3000);
        ReactAppRunner.report.endTest(test);
        driver.quit();


    }
	
	@Given("^I navigate to the React Application$")
	public void i_navigate_to_the_React_Application()  {
		
		driver.get(Constant.URL);
		test.log(LogStatus.INFO, "ReactApp HOMEPAGE ACCESSED");
	
	}

	@When("^I click the Link to Automated Testing Exercise Form$")
	public void i_click_the_Link_to_Automated_Testing_Exercise_Form()  {
	 
		ReactAppHomePage hompage = PageFactory.initElements(driver, ReactAppHomePage.class);
		hompage.clickLink();
		test.log(LogStatus.INFO, "Form displayed");
	}

	@When("^I fill click the \"([^\"]*)\" dropdown menu$")
	public void i_fill_click_the_dropdown_menu(String arg1) {
		
		
		formpage.clickCountryButton();
		formpage.selectCountry(arg1);
		test.log(LogStatus.INFO, "country selected");
	
	}

	@When("^I fill out the email field with \"([^\"]*)\"$")
	public void i_fill_out_the_email_field_with(String arg1)  {
		
		formpage.enterEmail(arg1);
		test.log(LogStatus.INFO, "email entered");
  
	}

	@When("^I fill out the first password field with \"([^\"]*)\"$")
	public void i_fill_out_the_first_password_field_with(String arg1)  {
		
		formpage.enterPassword(arg1);
		test.log(LogStatus.INFO, "password entered");
	    
	}

	@When("^I fill out the second password field with \"([^\"]*)\"$")
	public void i_fill_out_the_second_password_field_with(String arg1)  {
	   
		formpage.enterPassword2(arg1);
		test.log(LogStatus.INFO, "password confirmed");
	}

	@Then("^I should see a Success! Message$")
	public void i_should_see_a_Success_Message()  {
		formpage.clickSubmit();
		
		String message = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/h1")).getText();
		
		
		if (message.equals("Success")) {
			test.log(LogStatus.PASS, "correct details entered");
		}else {
			test.log(LogStatus.FAIL, "invalid details");
			
		}
	   
	}

	@When("^I fill out the second password field with the wrong password \"([^\"]*)\"$")
	public void i_fill_out_the_second_password_field_with_the_wrong_password(String arg1)  {
		formpage.enterPassword2(arg1);
		test.log(LogStatus.INFO, "incorrect password entered as planned");
	}

	@Then("^I should see a message stating that the passwords do not match\\.$")
	public void i_should_see_a_message_stating_that_the_passwords_do_not_match() {
		
		formpage.clickSubmit();
		
		String message = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/p[10]")).getText();
		
		
		if (message.equals("The passwords do not match")) {
			test.log(LogStatus.PASS, "successfully entered wrong password");
		}else {
			test.log(LogStatus.FAIL, "something went wrong");
			
		}
		
	  
	}


}
