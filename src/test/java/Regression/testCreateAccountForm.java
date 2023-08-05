package Regression;

import PageObjects.CreateAccountPage;
import PageObjects.MagentoHomePage;
import Utils.Globals;
import org.testng.annotations.Test;

import java.io.IOException;

public class testCreateAccountForm extends Globals {
    //initialize the pageObject page
    MagentoHomePage magentoHomePage;
    CreateAccountPage createAccountPage;
    @Test
    public void validDetails() throws IOException {
        magentoHomePage = new MagentoHomePage(driver);
        createAccountPage = new CreateAccountPage(driver);
        clickElement(magentoHomePage.createAccount);
        createAccountPage.firstName.sendKeys(getWorkbook(1,1));
        createAccountPage.lastName.sendKeys(getWorkbook(1,2));
        createAccountPage.email.sendKeys(getWorkbook(1,3));
        createAccountPage.password.sendKeys(getWorkbook(1,4));
          createAccountPage.confirmPassword.sendKeys(getWorkbook(1,5));
        clickElement(createAccountPage.submitBtn);
    }
}
