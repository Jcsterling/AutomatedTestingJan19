import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class DemoSignUpPage {

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
    private WebElement enterUserName;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input" )
    private WebElement enterPassword;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
    private WebElement clickSaveButton;

    @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
    private WebElement clickLoginButton;




    public void TypeUserName(String username){ //this method was used when signing up a user to the web site

        enterUserName.sendKeys(username);

    }

    public void TypePassword(String password){

        enterPassword.sendKeys(password);

    }

    public void clickSave(){

        clickSaveButton.click();


    }

    public void  clickLogin(){

        clickLoginButton.click();

    }

// i have made a class for each webpage
}
