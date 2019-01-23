package com.bae.ShoppingWebsite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ShoppingWebsiteTest {

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
	 
	 
	 @Test
	 public void getBlackBlouse() throws InterruptedException {
		 driver.get("http://automationpractice.com/index.php");
		 
		 
		 ShoppingSiteHomePage homepage = PageFactory.initElements(driver, ShoppingSiteHomePage.class);
		 homepage.clickBlouseButton();
		 
		 ShoppingSiteBlousePage blouse = PageFactory.initElements(driver, ShoppingSiteBlousePage.class);
			blouse.moveToWhiteBlouseImage(action);
			
			
			
		 
		 
	 }
	 
	 //finsh code to add item to cart

	 //add an assert equals to make this a test 
}
