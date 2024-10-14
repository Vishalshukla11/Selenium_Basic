package SeleniumAutomation;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JsExecuter {
    private static WebDriver driver;
    

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }
   

    @Test
    public void TestjsExecuter() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,1000)");
        Thread.sleep(2000);

    }

    


    // @AfterClass
    // public void tearDown() {
    //     if (driver != null) {
    //         driver.close();
    //     }
    // }

}
