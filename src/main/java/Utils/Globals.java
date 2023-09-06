package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.IOException;
import PageObjects.CreateAccountPage;

public class Globals {
    public static WebDriver driver;
    CreateAccountPage createAccountPage;
    //create method to start the browser
    @BeforeSuite
    public static WebDriver startBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        return driver;
    }
    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
    //use the below function to make sure it accepts type WebElements
    public void clickElement(WebElement element) {

        element.click();
    }

    //create method to access testdata
    public static String getWorkbook1(int rowNum, int colNum) throws IOException {
        String projectPath =System.getProperty("user.dir");
        XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"/Resources/testdata.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        String getData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        return getData;
    }
    public static String getWorkbook2(int rowNum, int colNum) throws IOException {
        String projectPath =System.getProperty("user.dir");
        XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"/Resources/testdata.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet2");
        String getData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        return getData;
    }
    //create method to clear input fields in the textfields
    public void clearFields(){
        createAccountPage = new CreateAccountPage(driver);
        createAccountPage.confirmPassword.clear();
        createAccountPage.email.clear();
        createAccountPage.password.clear();
        createAccountPage.lastName.clear();
        createAccountPage.firstName.clear();
    }

}
