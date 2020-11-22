import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaPageTests extends BaseUI{
    //String currentUrl;

    @Test
    public void testMediaPage(){
        mainPage.openMediaPage();
       Assert.assertEquals(mainPage.currentUrl, Data.expectedUrlMedia);  //assert in test case
    }

    @Test
    public void testPhotosDropDownList(){
        Assert.assertEquals(mediaPage.testDropDownListSortBy(), Data.expectedUrlMedia);
    }

    @Test
    public void testPhotosSvetlanka44Implicit(){
        Assert.assertEquals(mediaPage.testPageSvetlanka44Implicit(), Data.expectedUrlMedia);
       
    }

    @Test
    public void testPhotosSvetlanka44Explicid(){
        Assert.assertEquals(mediaPage.testPageSvetlanka44Explicid(), Data.expectedUrlMedia);
    }
}