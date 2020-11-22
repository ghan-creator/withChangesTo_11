
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MediaPage extends BaseActions {
    String currentUrl;

    public MediaPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);   // supper
    }



    public String testDropDownListSortBy(){

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println("Current Media Page: "+currentUrlMedia);
        //Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);

        wait.until(ExpectedConditions.elementToBeClickable(Locators.MEDIA_DDL_SORT_BY));
        WebElement dropDownListSortBy = driver.findElement(Locators.MEDIA_DDL_SORT_BY);
        getDropDownListByValue(dropDownListSortBy,Data.mediaSortBy);
        return currentUrlMedia;
    }

    public String testPageSvetlanka44Implicit(){

        driver.findElement(Locators.LINK_MEDIA).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.PHOTOS_SVETLANKA_44).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current vetlanka44 Media Page:  "+ currentUrl);
        return currentUrl;
        
    }

    public String testPageSvetlanka44Explicid(){

        driver.findElement(Locators.LINK_MEDIA).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.PHOTOS_SVETLANKA_44));
        driver.findElement(Locators.PHOTOS_SVETLANKA_44).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        
        return currentUrl;
    }
}