package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
        public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/a/span/span/img")
    public WebElement item1;
    @FindBy(xpath = "//*[@id=\"option-label-size-143-item-169\"]")
    public  WebElement sizeLarge;
    @FindBy(xpath = "//*[@id=\"option-label-color-93-item-60\"]")
    public WebElement colourYellow;
    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    public WebElement addToCartBtn;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    public WebElement cartIcon;
    @FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
    public WebElement proceedToCheckOutBtn;
    @FindBy(xpath = "//*[@id=\"C4BYSNB\"]")
    public WebElement streetAddress;
    @FindBy(xpath = "//*[@id=\"D8TPBOJ\"]")
    public WebElement city;
    @FindBy(xpath = "//*[@id=\"RJ71TH4\"]")
    public WebElement country;
    @FindBy(xpath ="//*[@id=\"A0XUOTD\"]")
    public WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"U3RLK4O\"]")
    public WebElement phoneNumber;
    @FindBy(xpath ="//*[@id=\"shipping-method-buttons-container\"]/div/button")
    public WebElement nextBtn;
    @FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
    public WebElement placeOrderBtn;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a/span[2]")
    public WebElement cartBtn;
}
