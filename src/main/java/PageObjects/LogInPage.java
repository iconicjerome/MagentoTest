package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    public WebDriver driver;
    public LogInPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailField;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    public WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"send2\"]")
    public WebElement submitLogInBtn;
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    public WebElement signInBtn;
    @FindBy(xpath = "//*[@id=\"pass-error\"]")
    public WebElement requiredFieldMessage;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/a/img")
    public WebElement lumaImg;
}
