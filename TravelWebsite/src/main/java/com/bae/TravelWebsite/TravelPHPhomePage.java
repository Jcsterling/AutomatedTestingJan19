package com.bae.TravelWebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelPHPhomePage {
	
	@FindBy(id="body-section")
	private WebElement flightsButton;
	
	
	public void clickFlights() {
		flightsButton.click();
	}
	

}
