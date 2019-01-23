package com.bae.ShoppingWebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingSiteHomePage {
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a")
	private WebElement blouseButton;
	
	
	public void clickBlouseButton() {
		
		blouseButton.click();
	}

}
