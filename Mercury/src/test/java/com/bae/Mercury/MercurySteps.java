package com.bae.Mercury;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercurySteps {
	
	Actions action = null;
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	 
	 @Before
	 public void setup(){

	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\Admin\\Desktop\\Development\\chromedriver.exe");
	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        action = new Actions(driver);       
	       
	 } 

	 @After
	 public void teardown() throws InterruptedException {
		 Thread.sleep(5000);
		 reports.endTest(test);
	        reports.flush();
		 driver.quit();
	 }
	 
	 @Given("^the correct web address$")
	 public void the_correct_web_address()  {
		 
		 reports = new ExtentReports("C:\\Users\\Admin\\Desktop\\Reports\\mercury.html", true);//this will replace the old report with a new report each time the test is ran

	     test = reports.startTest("reach flight page");
	     test.log(LogStatus.INFO, "verify if user has logged in and got to the flight page");

	     driver.get("http://newtours.demoaut.com/mercurysignon.php");
		 
	 }

	 @When("^I select REGISTER$")
	 public void i_select_REGISTER() {
		 
		 MercuryHomePage homePage = PageFactory.initElements(driver, MercuryHomePage.class);
		 
         homePage.clickReg();
         
         MercuryRegPage regPage = PageFactory.initElements(driver, MercuryRegPage.class);

         regPage.ContactInformation();

         regPage.mailingInformation();

         regPage.UserDetails();


        


	
	 }

	 @Then("^I can register my details and reach flight page$")
	 public void i_can_register_my_details_and_reach_flight_page(){
	     // Write code here that turns the phrase above into concrete actions 
		 confirmationPage confirm = PageFactory.initElements(driver, confirmationPage.class);

         confirm.clickSignIn();
         
         signInPage sign = PageFactory.initElements(driver, signInPage.class);

         sign.ContactInformation();


     String title = driver.getTitle();

     if (title.equals("Find a Flight: Mercury Tours:")) {
         test.log(LogStatus.PASS, "user logged in successfully");
     } else {
         test.log(LogStatus.FAIL, "unsuccessful login");
     }

         assertEquals("Flight Details", driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText());

     }


	 

	 
	

}
