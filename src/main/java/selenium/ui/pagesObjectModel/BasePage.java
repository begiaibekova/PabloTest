package selenium.ui.pagesObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.ui.drivers.Driver;
import selenium.ui.helper.ElementActions;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    ElementActions elementActions = new ElementActions();
}
