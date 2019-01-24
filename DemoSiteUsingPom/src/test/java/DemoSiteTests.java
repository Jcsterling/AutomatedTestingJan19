
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class DemoSiteTests {


    ChromeDriver driver;

    ExtentReports report;
    ExtentTest test;
//
//    String spreadSheetFilePath = "C:\\Users\\Admin\\Desktop\\Reports"; 
//
//    String filename ="\\DemoDDT.xlsx";






    @Before
    public void Setup() { //this is done before every test, chrome driver is saved in a specific location

        System.setProperty("webdriver.chrome.driver",
                Constant.CROMEDRIVER);

        driver = new ChromeDriver();
    }

    @After
    public void teardown() throws Exception {

        Thread.sleep(5000);

        report.endTest(test);
        report.flush();
        driver.quit();

    }
    

	@Given("^the correct web address$")
	public void the_correct_web_address() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I sign up$")
	public void i_sign_up() {
	    // Write code here that turns the phrase above into concrete actions
	
	}
	
	@Then("^I can login using my details$")
	public void i_can_login_using_my_details() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



    @Test
    public void testAddAndLoginUser() throws IOException {

        report = new ExtentReports(Constant.REPORTFILE, true);


        driver.get(Constant.URL);

        FileInputStream file = new FileInputStream(Constant.SPREADSHEETFILPATH +Constant.USERNAMEFILE);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);

        for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
        	  test = report.startTest("verify title");
        	  
        	  test.log(LogStatus.INFO, "browser has started");
        	
            Cell username = sheet.getRow(i).getCell(0);
            Cell password = sheet.getRow(i).getCell(1);

            String userN = username.getStringCellValue();
            String passW = password.getStringCellValue();


            String title = driver.getTitle();

   
            if (title.equals("FREE example PHP code and online MySQL database - example username password protected site" )) {
                test.log(LogStatus.PASS, "TITLE NAME VERIFIED");
            } else {
                test.log(LogStatus.FAIL, "TITLE NAME UNVERIFIED");


            }
           
            System.out.println(title);

            DemoHomePage homePage = PageFactory.initElements(driver, DemoHomePage.class);

            homePage.clickAddUser();


            DemoSignUpPage signPage = PageFactory.initElements(driver, DemoSignUpPage.class);

            signPage.TypeUserName(userN);

            signPage.TypePassword(passW);

            signPage.clickSave();

            signPage.clickLogin();


            DemoLoginPage loginPage = PageFactory.initElements(driver, DemoLoginPage.class); //new instance of

            loginPage.TypeLoginUserName(userN);

            loginPage.TypeLoginPassword(passW);

            loginPage.clickLogin();
            

         

            assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());

        }


    }



}





