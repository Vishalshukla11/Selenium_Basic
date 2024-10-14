package SeleniumAutomation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebdriverInterface {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }

    @Test
    public void TestGet() {
        // driver.get("https://www.amazon.in/");
        String currenturl = driver.getCurrentUrl();
        System.out.println("currenturl:-" + currenturl);
        AssertJUnit.assertEquals("https://www.amazon.in/", currenturl);

    }
    @Test(dependsOnMethods = "TestGet" )
    public void TestManage()
    {
        driver.manage().window().maximize();
    }
    /*
     * In this case, the method annotated
     * with @Test(dependsOnMethods = "testGet") will only execute if the
     * testGet() method passes successfully.
     */

    @Test(dependsOnMethods = "TestManage")
    public void testGetTitle() {
        String title = driver.getTitle();
        System.out.println("Currect title:- " + title);
        AssertJUnit.assertEquals(
                "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
                title);

    }

    @Test(dependsOnMethods = "testGetTitle")
    public void TestGEtPageSource() {
        String pagesource = driver.getPageSource();
        AssertJUnit.assertNotNull(pagesource, "page source is null ");

    }

    @Test(dependsOnMethods = "TestGEtPageSource")
    public void getcurrentUrl()
    {
        String currenturl=driver.getCurrentUrl();
        AssertJUnit.assertEquals("getcurrent url fails", "https://www.amazon.in/", currenturl);
    }

    @Test(dependsOnMethods = "getcurrentUrl")
    public void getCurrentWindowHandle()
    {
       String currentwindowhandle=driver.getWindowHandle();
       AssertJUnit.assertNotNull(currentwindowhandle,"window handle is null");
    }

    @Test(dependsOnMethods = "getCurrentWindowHandle")
    public void getWindowHandles()
    {
        Set<String>windowhandles=driver.getWindowHandles();
        AssertJUnit.assertTrue(windowhandles.size()>=1);
    }

    @Test(dependsOnMethods="getWindowHandles")
    public void TestNavigateTo()
    {
        driver.navigate().to("https://www.flipkart.com/");
       String url= driver.getCurrentUrl();
       System.out.println("current url:- "+ url);
       AssertJUnit.assertEquals("navigate to is failed", "https://www.flipkart.com/",url);
    }

    @Test(dependsOnMethods="TestNavigateTo")
    public void TestClose()
    {
        driver.close();
       
    }

    @Test(dependsOnMethods = "TestClose")
    public void TestQuit()
    {
        driver.quit();
    }

    @AfterClass
    public void TearDown()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }

}
