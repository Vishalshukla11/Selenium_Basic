package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class cssSelectors {

    WebDriver driver;
    @BeforeClass
    public void setup()
    {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void TestElementSelector()
    {
        // driver.findElement(By.cssSelector())
    }
    
}
