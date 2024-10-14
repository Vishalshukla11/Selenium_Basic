package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserWindow {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
    }

    @Test
    public void newTab() {
        driver.findElement(By.id("tabButton")).click();
        String originalwindow = driver.getWindowHandle();

        for (String windows : driver.getWindowHandles()) {
            if (!windows.equals(originalwindow)) {
                driver.switchTo().window(windows);
            }}
         WebElement newtabText=  driver.findElement(By.id("sampleHeading"));
         
         System.out.println("new tab text:- " +newtabText.getText());
          driver.switchTo().window(originalwindow);
          //driver.navigate().back();
          
        }

        @Test(dependsOnMethods ="newTab" )
        public void windowHandle()
        {
            driver.findElement(By.id("windowButton")).click();
        }

        @AfterClass
        public void tearDown()
        {
            if(driver!=null)
            {
                driver.quit();
            }
        }

    }


