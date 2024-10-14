package SeleniumAutomation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TakeScreenShot {

    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }

    @Test
    public void TestScreenshot() throws Exception
    {
       TakesScreenshot ts=(TakesScreenshot) driver;
      File src =ts.getScreenshotAs(OutputType.FILE);
      File trg= new File("C:\\Users\\acer\\Desktop\\java\\seleniumprac\\src\\Screesnshots\\screenshot.png");
      FileUtils.copyFile(src, trg);
      driver.quit();
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
    
}
