package lumaTestInside;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import selenium.ui.drivers.Driver;
import selenium.ui.helper.ElementActions;
import selenium.ui.pagesObjectModel.CreateNewCustomerAccount;

public abstract class BaseTest {

    public WebDriver driver;
    public ElementActions elementActions;
    public CreateNewCustomerAccount createNewCustomerAccount;


    @BeforeClass
    public void setUpBrowser(){
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        createNewCustomerAccount= new CreateNewCustomerAccount();
    }
    @AfterClass
    public void tearDown(){

        Driver.closeDriver();
    }
}

