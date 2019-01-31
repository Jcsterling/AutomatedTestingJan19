package com.bae.ReactAppTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReactAppFormPage {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/button")
	private WebElement countryButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/a[1]")
	private WebElement UK;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/a[2]")
	private WebElement France;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/a[3]")
	private WebElement Germany;
	
	@FindBy(xpath = "//*[@id=\"nameInput\"]")
	private WebElement emailTextBox;
	
	@FindBy(xpath = "//*[@id=\"passInput\"]")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "//*[@id=\"passInput2\"]")
	private WebElement password2TextBox;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/button")
	private WebElement submitButton;
	
	
	
	public void clickCountryButton() {
		countryButton.click();
		
	}
	
	public void selectCountry(String country) {
		
		if(country.equals("United Kingdom")) {
			UK.click();
		}
		else if (country.equals("France")) {
			France.click();
		}
		else if (country.equals("Germany")) {
			Germany.click();	
		}
	}
	
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public void enterPassword(String pw) {
		passwordTextBox.sendKeys(pw);
	}
	
	public void enterPassword2(String pw) {
		password2TextBox.sendKeys(pw);
	}

	public void clickSubmit() {
		submitButton.click();
	}
}
