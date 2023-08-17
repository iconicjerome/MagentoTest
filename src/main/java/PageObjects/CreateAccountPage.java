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
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
    public WebElement thankYouMsg;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
    public WebElement accountPresentError;
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
    public WebElement signOutDropdown;
    @FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
    public WebElement signOutBtn;
}
