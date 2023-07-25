package selenium.ui.pagesObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerMainPage extends BasePage{

    @FindBy(id = "ui-id-4")
    public WebElement womenSign;

    public CustomerMainPage womenBtnClick(){
        elementActions.clickTheButton(womenSign);
        return this;
    }
}
