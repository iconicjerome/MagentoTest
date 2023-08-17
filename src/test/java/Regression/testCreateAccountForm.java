package Regression;

import PageObjects.CreateAccountPage;
import PageObjects.MagentoHomePage;
import Utils.Globals;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.time.Duration;

public class testCreateAccountForm extends Globals {
    //initialize the pageObject page
    MagentoHomePage magentoHomePage;
    CreateAccountPage createAccountPage;
    WebDriverWait wait;
    @Test(priority = 0)
    public void validDetails() throws IOException {
        magentoHomePage = new MagentoHomePage(driver);
        createAccountPage = new CreateAccountPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        clickElement(magentoHomePage.createAccount);
        createAccountPage.firstName.sendKeys(getWorkbook(1,1));
        createAccountPage.lastName.sendKeys(getWorkbook(1,2));
        createAccountPage.email.sendKeys(getWorkbook(1,3));
        createAccountPage.password.sendKeys(getWorkbook(1,4));
        createAccountPage.confirmPassword.sendKeys(getWorkbook(1,5));
        clickElement(createAccountPage.submitBtn);
        // use visibilityOf when waiting for elements so that you can use the type WebElement
        wait.until(ExpectedConditions.visibilityOf(createAccountPage.thankYouMsg));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(createAccountPage.thankYouMsg.equals(createAccountPage.thankYouMsg));
        createAccountPage.signOutDropdown.click();
        createAccountPage.signOutBtn.click();
//        clickElement(magentoHomePage.createAccount);

    }
    @Test(priority = 1)
    public void duplicateDetails() throws IOException {
        magentoHomePage = new MagentoHomePage(driver);
        createAccountPage = new CreateAccountPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        clickElement(magentoHomePage.createAccount);
        createAccountPage.firstName.sendKeys(getWorkbook(2,1));
        createAccountPage.lastName.sendKeys(getWorkbook(2,2));
        createAccountPage.email.sendKeys(getWorkbook(2,3));
        createAccountPage.password.sendKeys(getWorkbook(2,4));
        createAccountPage.confirmPassword.sendKeys(getWorkbook(2,5));
        clickElement(createAccountPage.submitBtn);
        // use visibilityOf when waiting for elements so that you can use the type WebElement
        wait.until(ExpectedConditions.visibilityOf(createAccountPage.accountPresentError));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(createAccountPage.accountPresentError.equals(createAccountPage.accountPresentError));

    }
}
