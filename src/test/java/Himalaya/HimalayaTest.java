package Himalaya;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class HimalayaTest
{
    private WebDriver driver;

    @BeforeClass
    public void setup()
    {
        driver= new ChromeDriver();
        driver.get("https://himalayawellness.in/");
    }

    @Test
    public void testHomePage()
    {
        String title=driver.getTitle();
        Assert.assertTrue(title.contains("Himalaya Wellness"), "Homepage title does not contain 'Himalaya Wellness'");
    }

    @Test
    public void testSearchBarPresence()
    {
        WebElement searchbar = driver.findElement(By.xpath("//input[@type='text'and @placeholder='Search']"));
        Assert.assertTrue(searchbar.isDisplayed());
    }
    @Test
    public void TestUserICon()
    {
        WebElement usericon=driver.findElement(By.linkText("Log in"));
        Assert.assertTrue(usericon.isDisplayed());
    }

    @Test
    public void testclose_popup()
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alter=driver.switchTo().alert();
        alter.accept();
    }



    

}