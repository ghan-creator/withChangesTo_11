import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait){
        super (driver, wait);
    }
    String currentUrlBlog;

    public String verifyBlogLinkIsDisplayed(){
        
        getCurentUrlBlogOrder(Locators.LINK_BLOG);
        currentUrlBlog = driver.getCurrentUrl();
        return currentUrlBlog;  //when you return something you can use it in Test Cases
    }

    //createdNow
    private void getCurentUrlBlogOrder(By linkBlog) {
    ;
    }
}
