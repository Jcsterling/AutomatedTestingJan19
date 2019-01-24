import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoLoginPage {

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
    private WebElement enterLoginUserName;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
    private WebElement enterLoginPassword;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
    private  WebElement clickLoginButton;

//the login info for the user name must be the same as the info used to sign up to the website
    public void TypeLoginUserName(String username){

        enterLoginUserName.sendKeys(username);
    }

    public void TypeLoginPassword(String password){

        enterLoginPassword.sendKeys(password);


    }
    public  void clickLogin(){

        clickLoginButton.click();
    }




}
