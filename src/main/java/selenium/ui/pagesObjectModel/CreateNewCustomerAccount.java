package selenium.ui.pagesObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.ui.drivers.Driver;
import selenium.ui.helper.ElementActions;
import selenium.ui.models.User;

public class CreateNewCustomerAccount extends BasePage {
   //ElementActions elementActions = new ElementActions();

   HomePage homePage = new HomePage();

   public CreateNewCustomerAccount(){
       PageFactory.initElements(Driver.getDriver(),this);

   }
    @FindBy(id="firstname")
    public WebElement firstname;

   @FindBy(id="lastname")
    public WebElement lastname;

   @FindBy(id = "email_address")
    public  WebElement email;

   @FindBy(id ="password")
    public WebElement password;

   @FindBy(id="password-confirmation")
    public  WebElement confirmPass;

   @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement createBtn;

   @FindBy(xpath = "//span[text()='Create New Customer Account']")
    public WebElement txt;

   public User fillUpForm(User user){
       elementActions.clickTheButton(homePage.createAccountBtn).scrollToElement(txt)
               .writeText(firstname, user.firstName).writeText(lastname,user.lastName)
               .writeText(email,user.userEmail).writeText(password,user.password).writeText(confirmPass,user.password)
               .clickTheButton(createBtn);
       return user;
   }





}
