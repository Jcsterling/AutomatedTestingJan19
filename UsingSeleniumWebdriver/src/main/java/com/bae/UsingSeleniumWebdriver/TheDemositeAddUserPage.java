package com.bae.UsingSeleniumWebdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheDemositeAddUserPage {
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input" )
	private WebElement addUsername;
	
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input" )
	private WebElement addPassword;
	
	
	
	public void createUser() {
		
		addUsername.sendKeys("frozone");
		
		addPassword.sendKeys("1234567");
	}

}
