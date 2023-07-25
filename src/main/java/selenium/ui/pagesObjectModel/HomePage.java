package selenium.ui.pagesObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    public WebElement createAccountBtn;

}
