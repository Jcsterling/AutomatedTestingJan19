package com.bae.ShoppingWebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ShoppingSiteBlousePage {
	
	@FindBy(xpath = "//*[@id=\"thumb_6\"]")
	private WebElement whiteBlousePicture;
	
	
	public void moveToWhiteBlouseImage(Actions action) throws InterruptedException {
		
	
		Thread.sleep(2000);
		action.moveToElement(whiteBlousePicture).perform();
		
		
	
		
	}
	
	
	
	
	
}



