package lumaTestInside;

import lumaTestInside.BaseTest;
import lumaTestInside.Users;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.ui.drivers.Driver;


import selenium.ui.pagesObjectModel.CreateNewCustomerAccount;

public class CreateNewCustomerAccountTest extends BaseTest {
    WebDriver driver = Driver.getDriver();

    Users user = new Users();
    CreateNewCustomerAccount createNewCustomerAccount = new CreateNewCustomerAccount();

    @Test(priority = 1)
    void CreateNewCustomerAccount1(){
        driver.get("https://magento.softwaretestingboard.com/");
        createNewCustomerAccount.fillUpForm(user.begimai);
        WebElement text = driver.findElement(By.xpath("//h1[@class=\"page-title\"]/span"));
        Assert.assertEquals(text.getText().trim(),"My Account");


    }

    @Test(priority = 0)
    void CreateNewCustomerAccountWithInvalidData() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        createNewCustomerAccount.fillUpForm(user.navat);
        WebElement text = driver.findElement(By.id("email_address-error"));
        WebElement passwordWrong = driver.findElement(By.id("password-error"));
        Assert.assertEquals(text.getText().trim(), "Please enter a valid email address (Ex: johndoe@domain.com).");
        Assert.assertEquals(passwordWrong.getText().trim(), "Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.");
        Thread.sleep(5000);
    }
}
