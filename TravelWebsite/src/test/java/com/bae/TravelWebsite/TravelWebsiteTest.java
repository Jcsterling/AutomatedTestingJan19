package com.bae.TravelWebsite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TravelWebsiteTest {
	

	Actions action = null;
	WebDriver driver;
	 
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
		 driver.quit();
	 }
	 
	 

	@Given("^the correct web address$")
	public void the_correct_web_address() {
		
		driver.get("https://www.phptravels.net/");
		

	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I select flight details$")
	public void i_select_flight_details() {
		
		TravelPHPhomePage homepage = PageFactory.initElements(driver, TravelPHPhomePage.class);
		homepage.clickFlights();
		
		
	    // Write code here that turns the phrase above into concrete actions

	}
	
	@Then("^I can browse a list of available flights\\.$")
	public void i_can_browse_a_list_of_available_flights()  {
	    // Write code here that turns the phrase above into concrete actions
	
	}
	
	@When("^I add the correct personal details$")
	public void i_add_the_correct_personal_details()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("^I am able to confirm the booking$")
	public void i_am_able_to_confirm_the_booking(){
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	 
	 
	 
	 
	 
}	 
	 
	 
	 

