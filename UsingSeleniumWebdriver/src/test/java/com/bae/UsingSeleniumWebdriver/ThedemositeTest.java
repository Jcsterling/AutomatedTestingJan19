package com.bae.UsingSeleniumWebdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ThedemositeTest {
	
	 WebDriver driver;
	 
	 @Before
	 public void setup(){

	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\Admin\\Desktop\\Development\\chromedriver.exe");
	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	     
	        
	        
	       
	 }
	 
	 @After
	 public void teardown() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.quit();
	
	 }
	 
	 
	 @Test
	 public void addAUser() {
		 
		 driver.get("http://www.thedemosite.co.uk/index.php");
		 
		 TheDemoSiteHomepage homePage = PageFactory.initElements(driver, TheDemoSiteHomepage.class);
		 homePage.clickAddUser();
		 
		 
		 TheDemositeAddUserPage addUserPage = PageFactory.initElements(driver, TheDemositeAddUserPage.class);
		 addUserPage.createUser();
		 
		 
		 
	 }
	 
	 public void login() {
		 
		 
	 }


}
