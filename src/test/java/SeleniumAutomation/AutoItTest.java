package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoItTest {
    private static WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://smallpdf.com/pdf-converter");
    }

    @Test
    public void TestAutoit() {
        // Update this XPath if it's dynamic or auto-generated
        driver.findElement(By.xpath("//span[text()='Choose Files']")).click(); // Adjusted to a more stable locator

        try {
            // Wait for the file upload dialog to appear
            Thread.sleep(2000);

            // Execute the AutoIt script (make sure this path is correct and properly escaped)
            Runtime.getRuntime().exec("\"C:\\Users\\acer\\Desktop\\BridgelabzManualTEsting\\Fileuploadpopup.exe\"");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("fail");

        }
       System.out.println("pass hai bhai pass");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
