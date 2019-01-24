package com.bae.TravelPhp;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TravelPhpTest {
	
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
	 public void the_correct_web_address() throws Throwable {
		 
		 driver.get("https://www.phptravels.net/");
		 // Write code here that turns the phrase above into concrete actions
		 throw new PendingException();
	 }

	 @When("^I select flight details$")
	 public void i_select_flight_details() throws Throwable {
		 
		 TravelPhpHomepage homepage = PageFactory.initElements(driver, TravelPhpHomepage.class);
			homepage.clickFlights(action, driver);
		 // Write code here that turns the phrase above into concrete actions
		 throw new PendingException();
	 }

	 @Then("^I can browse a list of available flights$")
	 public void i_can_browse_a_list_of_available_flights() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
		 throw new PendingException();
	 }

	 @When("^I add my personal details$")
	 public void i_add_my_personal_details() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
		 throw new PendingException();
	 }

	 @Then("^I am able to confirm the booking$")
	 public void i_am_able_to_confirm_the_booking() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
		 throw new PendingException();
	 }
	 
	 

}
