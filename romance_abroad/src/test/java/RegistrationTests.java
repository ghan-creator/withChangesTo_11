//added in 10 class RegistrationTests8

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration10() {
        searchPage.testSortBy();
        System.out.println("Hi Nat: " + searchPage.currentUrlSearch + " Data: " + Data.expectedUrlSearch + " Test");
        Assert.assertEquals(searchPage.currentUrlSearch, Data.expectedUrlSearch);
    }
}














//======================assertions in test=========================
       // ////////////mainPage.clickJoinButton();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

       ///////// mainPage.insertFirstPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



              //Oleksii added in clas10://unmarket !now!
        //mainPage.insertSecondPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //if !(checkboxConformation()) {
        //////////if  (!(mainPage.checkboxConformation())) {
        /////////    Assert.fail("Checkbox is already selected");
      /////////////  }
        //Oleksii added in clas10:
//        WebElement checkboxConformation = driver.findElement(Locators.CHECKBOX_CONFORMATION);
//        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()) {
//            checkboxConformation.click();
//        } else {
//            Assert.fail("Checkbox is already selected");
//        }
    //}//fail

//need to add it to MainPage, under main.java

//}

//    public void completeThirdPartOfRegistration(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Oleksii added in clas10 above
//        driver.findElement(Locators.BUTTON_NEXT).click();/driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
//        driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
//        //driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 5));
//        driver.findElement(Locators.BUTTON_NEXT).click();
//        driver.findElement(By.cssSelector("#daySelect")).click();
//        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='2']")).click();
//
//
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD)));
//        driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD).sendKeys(Data.Password);
//
//        wait.until(ExpectedConditions.elementToBeClickable(Locators.INSERT_REGISTRATION_PASSWORD));
//    }
//}


//==============================two methods are broken after relocation =======================
/*//added in 10 class RegistrationTests8

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration10() {
        //testSortBy.SearchPage.currentUrlSearch();
        searchPage.testSortBy();
        System.out.println("Hi Nat: " + searchPage.currentUrlSearch + " Data: " + Data.expectedUrlSearch + " Test");
        Assert.assertEquals(searchPage.currentUrlSearch, Data.expectedUrlSearch);
//        if (searchPage.currentUrlSearch != Data.expectedUrlSearch){
//            System.out.println("expected https://romanceabroad.com/users/search is not found," +
//                    "we still");
//        }


       // ////////////mainPage.clickJoinButton();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

       ///////// mainPage.insertFirstPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



              //Oleksii added in clas10://unmarket !now!
        //mainPage.insertSecondPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //if !(checkboxConformation()) {
        //////////if  (!(mainPage.checkboxConformation())) {
        /////////    Assert.fail("Checkbox is already selected");
      /////////////  }
        //Oleksii added in clas10:
//        WebElement checkboxConformation = driver.findElement(Locators.CHECKBOX_CONFORMATION);
//        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()) {
//            checkboxConformation.click();
//        } else {
//            Assert.fail("Checkbox is already selected");
//        }
    }//fail


//need to add it to MainPage, under main.java

}

//    public void completeThirdPartOfRegistration(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Oleksii added in clas10 above
//        driver.findElement(Locators.BUTTON_NEXT).click();/driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
//        driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
//        //driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 5));
//        driver.findElement(Locators.BUTTON_NEXT).click();
//        driver.findElement(By.cssSelector("#daySelect")).click();
//        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='2']")).click();
//
//
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD)));
//        driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD).sendKeys(Data.Password);
//
//        wait.until(ExpectedConditions.elementToBeClickable(Locators.INSERT_REGISTRATION_PASSWORD));
//    }
//}

*/