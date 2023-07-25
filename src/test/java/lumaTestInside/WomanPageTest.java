package lumaTestInside;

import lumaTestInside.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.ui.drivers.Driver;
import selenium.ui.pagesObjectModel.CustomerMainPage;
import selenium.ui.pagesObjectModel.WomenPage;

public class WomanPageTest extends BaseTest {
    WebDriver driver = Driver.getDriver();
    WomenPage womenPage = new WomenPage();
    CustomerMainPage customerMainPage = new CustomerMainPage();

    @Test
    void WomenPageOpened(){
        driver.get("https://magento.softwaretestingboard.com/");
        customerMainPage.womenBtnClick();
        WebElement text = driver.findElement(By.xpath("//span[@class='base']"));
        Assert.assertEquals(text.getText().trim(), "Women");

    }

}
