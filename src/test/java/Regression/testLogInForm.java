package Regression;

import PageObjects.CreateAccountPage;
import PageObjects.LogInPage;
import Utils.Globals;
import org.testng.annotations.Test;

import java.io.IOException;

public class testLogInForm extends Globals {
    LogInPage logInPage;
    CreateAccountPage createAccountPage;

    @Test(priority = 1)
    public void validLogIn() throws IOException {
        logInPage = new LogInPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        clickElement(logInPage.signInBtn);
        logInPage.emailField.sendKeys(getWorkbook(1,3));
        logInPage.passwordField.sendKeys(getWorkbook(1,4));
        clickElement(logInPage.submitLogInBtn);
        createAccountPage.signOutDropdown.click();
        createAccountPage.signOutBtn.click();
    }
    @Test(priority = 2)
    public void logInWithoutPassword() throws IOException {
        logInPage = new LogInPage(driver);
        clickElement(logInPage.signInBtn);
        logInPage.emailField.sendKeys(getWorkbook(1,3));
        clickElement(logInPage.submitLogInBtn);
        if(logInPage.requiredFieldMessage.isDisplayed()){
            System.out.println("The error message is present");
        }else{
            System.out.println("Check your code oo!");
        }
    }
}
