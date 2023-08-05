package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagentoHomePage {
    public WebDriver driver;
    //initialize driver with constructor
    public MagentoHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //rollout the pageObjects which are the elements of the webpage
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[3]/a")
    public WebElement createAccount;
   }
