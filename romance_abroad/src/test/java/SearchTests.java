import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class SearchTests extends BaseUI{

    String curentUrlBlogOrder;
    String curentUrlBlog;

    @Test
    public void testBlogURL() {
        driver.findElement((Locators.LINK_BLOG)).click();
        curentUrlBlog = driver.getCurrentUrl();
        System.out.println(curentUrlBlog);
        System.out.print((Locators.LINK_BLOG.toString()));
        System.out.print("\n Printing curentUrlBlog " + curentUrlBlog);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(Locators.BLOG_ORDER_GIRLS).click();
        curentUrlBlogOrder = driver.getCurrentUrl();
        System.out.println(curentUrlBlogOrder);
        driver.navigate().to(Data.MAIN_URL);
        Assert.assertNotEquals(curentUrlBlogOrder, Data.MAIN_URL);

        //added in 13
        //System.out.println(BaseActions.currentUrlSearch);
        searchPage.testSortByAge();
        System.out.println(Data.currentUrlSearch);
        Assert.assertEquals(Data.currentUrlSearch, Data.expectedUrlSearch);
    }
}
