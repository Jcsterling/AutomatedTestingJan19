package com.bae.GoogleSearchWithSenarioOutline;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomepage {

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
    private WebElement searchBox;


    public void googleSearch(String query){
        searchBox.sendKeys(query);
        searchBox.sendKeys(Keys.ENTER);

    }


}