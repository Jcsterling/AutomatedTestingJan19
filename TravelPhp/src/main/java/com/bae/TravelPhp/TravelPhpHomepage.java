package com.bae.TravelPhp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelPhpHomepage {
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/div/input")
	private WebElement searchBox;
	
	
	public void clickFlights(Actions action, WebDriver driver ) {
	
		WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"s2id_autogen8\"]/a")));
		
		searchBox.sendKeys("london");
		action.sendKeys(Keys.ARROW_DOWN).perform();
	}
	

}
