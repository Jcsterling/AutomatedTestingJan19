package com.bae.UsingSeleniumWebdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheDemoSiteHomepage {
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	private WebElement addUserButton;
	
	
	
	
	
	public void clickAddUser() {
		
		addUserButton.click();
	}
	
	

}