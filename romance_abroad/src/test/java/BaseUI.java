import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class BaseUI {
    //webDriver here
    WebDriver driver;
    WebDriverWait wait;

    //now added in 8
    MainPage mainPage;
    SearchPage searchPage;
    MediaPage mediaPage;   
    StorePage storePage;

    //added in 10
    SoftAssert softAssert = new SoftAssert();    //<-----------Soft assert

    @BeforeMethod
    //added in 10 

    @Parameters("browser")
    public void setup(@Optional("chrome") String browser, Method method) {

        // Check if parameter passed from TestNG is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {
            // Create firefox instance
            System.setProperty("webdriver.gecko.driver", "geckodriver");
            driver = new FirefoxDriver();

        }
        // Check if parameter passed as 'chrome'
        else if (browser.equalsIgnoreCase("chrome")) {
            // Set path to chromedriver.exe(windows .exe, Apple no .exe)
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            // Create chrome instance
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");

        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "IEDriverServer");
            driver = new InternetExplorerDriver();
            driver.manage().deleteAllCookies();

        } else {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");    //clean browser data
        }

        //explicit wait must be max 20 sec
        wait = new WebDriverWait(driver, 20);

        //now added all in 8 
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        storePage = new StorePage(driver, wait);

        driver.manage().window().maximize();   //make a window big!
        driver.get(Data.MAIN_URL);
    }

    public void getDropDownListByIndex(WebElement element, int index) {
        Select ageDropDown = new Select(element);
        ageDropDown.selectByIndex(index);
    }

    @AfterMethod
    public void afterActions() {
        //driver.quit(); //<===if commented out - all windows will stay open 
        //windows will stay open as they are if not add - driver.quit();

        driver.quit();
    }
}


