//public class MainPage added in class 8

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {
    String currentUrl;
    public MainPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);   
    }

    public void clickJoinButton() {  

        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        //System.out.println(Locators.BUTTON_REGISTRATION.toString());
    }
    
    public void completeFirstPartOfRegistration() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD)));
        driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD).sendKeys(Data.Password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.INSERT_REGISTRATION_PASSWORD));
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).click();
                driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(BaseActions.generateNewNumber(Data.Nickname, 5));
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.MAIN_PAGE_DAY_SELECT).click();
        driver.findElement(Locators.MAIN_PAGE_SELECT_DATA).click();
        driver.findElement(Locators.MAIN_PAGE_SELECT_MONTH).click();
        driver.findElement(Locators.MAIN_PAGE_DATA_HANDLER_MONTH_SELECT).click();
        driver.findElement(Locators.MAIN_PAGE_DATASELECT).click();


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD)));
        driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD).sendKeys(Data.Password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.INSERT_REGISTRATION_PASSWORD));
    }

    //end added on lesson 10
    public void insertFirstPartOfRegistrationInformation(){

        WebElement registrationEmail = driver.findElement(Locators.INSERT_REGISTRATION_EMAIL);
        registrationEmail.sendKeys(Data.Email);
        WebElement registrationPassword = driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD);
        registrationPassword.sendKeys(Data.Password);
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void insertSecondPartOfRegistrationInformation(){

        driver.findElement(Locators.INSERT_USERNAME).sendKeys(generateNewNumber(Data.Nickname,4));

        driver.findElement(Locators.INSERT_DOB_DATE).click();
        driver.findElement(Locators.PICK_DOB_DATE).click();

        driver.findElement(Locators.INSERT_DOB_MONTH).click();
       
        driver.findElement(Locators.INSERT_DOB_YEAR).click();
        driver.findElement(Locators.PICK_DOB_YEAR).click();

        driver.findElement(Locators.INSERT_PHONE).sendKeys(Data.Phone);

        driver.findElement(Locators.INSERT_LOCATION).clear();

        driver.findElement(Locators.INSERT_LOCATION).sendKeys(Data.Location);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.PICK_LOCATION));
        driver.findElement(Locators.PICK_LOCATION).click();

        WebElement checkBoxConfirmation = driver.findElement(Locators.CLICK_CHECK_BOX);
        boolean selectedCheckBox = checkBoxConfirmation.isSelected();
        System.out.println(selectedCheckBox + Data.CheckBoxConfirmation);
        checkBoxConfirmation.click();
    }

    public String openStorePage(){
        driver.findElement(Locators.LINK_STORE).click();
        currentUrlStore = driver.getCurrentUrl();
        System.out.println(currentUrlStore);
        return currentUrlStore;
    }

    public void openMediaPage(){
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();

    }

     public boolean checkboxConformation() {
        Boolean result = true;
         WebElement checkboxConformation = driver.findElement(Locators.CHECKBOX_CONFORMATION);
         if (!driver.findElement(Locators.LINK_SEARCH).isSelected()) {
             checkboxConformation.click();
         } else {
             // Assert.fail("Checkbox is already selected");
             result = false;
         }
        return result;
     }


    //public void startYouTubeVideo(){
     public Object startYouTubeVideo(){
        //make in youtube test return void !!! 9oct2020
        WebElement element = driver.findElement(Locators.YOUTUBE_LINK);
        driver.switchTo().frame(element);
        driver.findElement(Locators.YOUTUBE_PLAY).click();
        
            return null;
        }
}
