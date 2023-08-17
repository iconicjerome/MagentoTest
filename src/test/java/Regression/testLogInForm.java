package Regression;

import PageObjects.LogInPage;
import Utils.Globals;
import org.testng.annotations.Test;

import java.io.IOException;

public class testLogInForm extends Globals {
    LogInPage logInPage;

    @Test
    public void validLogIn() throws IOException {
        logInPage = new LogInPage(driver);
        clickElement(logInPage.signInBtn);
        logInPage.emailField.sendKeys(getWorkbook(1,3));
        logInPage.passwordField.sendKeys(getWorkbook(1,4));
        clickElement(logInPage.submitLogInBtn);
    }

}
