package SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigationInterface {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }

    @Test
    public void TestNavigation() throws Exception {
        Thread.sleep(2000);
        driver.navigate().to("https://www.cricbuzz.com/");
        String crickbuzzurl = driver.getCurrentUrl();
        AssertJUnit.assertTrue(driver.getCurrentUrl().equals(crickbuzzurl));

    }

    @Test(dependsOnMethods = "TestNavigation")
    public void TestBack() {
        driver.navigate().back();
        String amazomeurl = driver.getCurrentUrl();
        AssertJUnit.assertEquals(amazomeurl, driver.getCurrentUrl());

    }
    @Test(dependsOnMethods = "TestBack")
    public void Testforword()
    {
        driver.navigate().forward();
        String crickbuzzurl = driver.getCurrentUrl();
AssertJUnit.assertEquals( crickbuzzurl, driver.getCurrentUrl());
    }

   @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }

}
