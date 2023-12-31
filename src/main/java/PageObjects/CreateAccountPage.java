package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
    public WebDriver driver;

    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"firstname\"]")
    public WebElement firstName;
    @FindBy(xpath = "//*[@id=\"lastname\"]")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id=\"email_address\"]")
    public WebElement email;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;
    @FindBy(xpath = "//*[@id=\"password-confirmation\"]")
    public WebElement confirmPassword;
    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
    public WebElement submitBtn;
}
