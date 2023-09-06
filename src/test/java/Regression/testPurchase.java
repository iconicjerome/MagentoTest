package Regression;

import PageObjects.HomePage;
import Utils.Globals;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.time.Duration;

public class testPurchase extends Globals {
    HomePage homePage;
    Select selectCountry;
    WebDriverWait wait;
    @Test
    public void validPurchase() throws IOException {
        homePage = new HomePage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        clickElement(homePage.item1);
        clickElement(homePage.sizeLarge);
        clickElement(homePage.colourYellow);
        clickElement(homePage.addToCartBtn);
        clickElement(homePage.cartIcon);
        wait.until(ExpectedConditions.visibilityOf(homePage.cartBtn));
        clickElement(homePage.cartBtn);
        clickElement(homePage.proceedToCheckOutBtn);
        homePage.streetAddress.sendKeys(getWorkbook2(1,1));
        homePage.city.sendKeys(getWorkbook2(1,2));
        selectCountry = new Select(homePage.country);
        selectCountry.selectByVisibleText("Nigeria");
        homePage.zipCode.sendKeys(getWorkbook2(1,3));
        homePage.phoneNumber.sendKeys(getWorkbook2(1,4));
        clickElement(homePage.nextBtn);
        clickElement(homePage.placeOrderBtn);
    }

}
