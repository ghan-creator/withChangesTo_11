import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrossBrowserTesting extends BaseUI{
   String currentUrlSearch;

    //Olii: this verification, one of the best way use in check box
    @Test
    public void testSearchPage() {
        //Assert.assertFalse() here!;
        Assert.assertFalse
                (!driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);

        //Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        //softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "URL is wrong"); //possibleUrlSearch); /(curentUrlSearch)
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "URL is wrong");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.SEARCH_BUTTON_SEARCH)));

        //Olii added new
        softAssert.assertAll();
       
    }

    @Test
    public void validateAssertions() {
        Assert.assertEquals("Web", "Web");
        Assert.assertTrue (driver.findElement(By.xpath("//a")).isDisplayed(), "Element is not displayed");
    }

    @Test
    public void validateAssertions1() {
        Assert.assertEquals("Web", "Web");
    }

    @Test
    public void testSearchPage1() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);


        wait.until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_DDL_SORT_BY));
        WebElement dropDownListSortBy = driver.findElement(Locators.SEARCH_DDL_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");
    }

    @Test
    public void validateAssertionsNotTheSame() {
        Assert.assertEquals("Web", "Web");
        driver.findElement(By.xpath("//a")).isDisplayed();
    }

    @Test
    public void validateAssertionsNegative() {
        Assert.assertEquals("Web", "Web");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed());
    }

    @Test
    //boolean
    public void validateAssertionsBoolean() {
            Assert.assertNotEquals("Web", "is Web");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed(), "Element is not displayed");
    }
}


//Olii - can do Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(),"Element is not displayed");
 or can do just if*/
