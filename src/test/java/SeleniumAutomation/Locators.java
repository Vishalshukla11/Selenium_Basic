package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Locators {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }

    // @Test
    // public void id()
    // {
    //     driver.findElement(By.linkText("Register")).click();
    //     driver.findElement(By.id("gender-male")).click();
    //     driver.findElement(By.id("FirstName")).sendKeys("vishal");
    //     driver.findElement(By.id("LastName")).sendKeys("shukla");
    //     driver.findElement(By.id("Email")).sendKeys("vishalshukla123@gmail.com");
    //     driver.findElement(By.id("Password")).sendKeys("1234567890");
    //     driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567890");
    //     driver.findElement(By.id("register-button")).click();
    // }
    // @Test(dependsOnMethods="id")
    // public void xpath()
    // {
    //     driver.findElement(By.xpath("//input[@type='button'][@value='Continue']")).click();
    // }

    @Test
    public void TestLinkText() {
        driver.findElement(By.linkText("Log in")).click();
    }

    @Test(dependsOnMethods = "TestLinkText")
    public void TestId() {
        driver.findElement(By.id("Email")).sendKeys("vishalshukla123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("1234567890");
    }

    @Test(dependsOnMethods = "TestId")
    public void TestXpath() {
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.id("small-searchterms")).click();
    }

    



}
