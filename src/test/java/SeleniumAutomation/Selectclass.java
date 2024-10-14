package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.SeleniumRequiredMEthods.ScrollTOElement;

public class Selectclass {
    private static WebDriver driver;
    ScrollTOElement scdElement ;
    WebDriverWait wait ;



    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        scdElement = new ScrollTOElement(driver);
    }

    @Test(priority = 1)
    public void ClickOnElement() {
       WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]")));
       scdElement.ScrollUntilElementwillNotDisplay(element);
       element.click();
    }

    @Test(priority = 2)
    public void TextBoxes()

    {
      WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']")));
      scdElement.ScrollUntilElementwillNotDisplay(element);
      element.click();
        
    }

}
