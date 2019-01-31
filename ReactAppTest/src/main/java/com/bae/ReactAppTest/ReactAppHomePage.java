package com.bae.ReactAppTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReactAppHomePage {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/ul/li[10]/a ")
	private WebElement automatedTestingLink;
	
	public void clickLink() {
		automatedTestingLink.click();

	}

}
