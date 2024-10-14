package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Frames_Handling {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");
    }

    @Test(priority = 1)
    public void testFrame1() {
        driver.switchTo().frame(0);
        driver.findElement(By.name("mytext1")).sendKeys("this is frame one ");
        driver.switchTo().parentFrame();
    }

    @Test(dependsOnMethods = "testFrame1")
    public void TestFrame2() {
        driver.switchTo().frame(1);
        driver.findElement(By.name("mytext2")).sendKeys("this is frame 2");
        driver.switchTo().parentFrame();
    }

    @Test(dependsOnMethods = "TestFrame2")
    public void TestFrame3() {
        driver.switchTo().frame(2);
        driver.findElement(By.name("mytext3")).sendKeys("this is frame 3");
driver.switchTo().parentFrame();
    }
    @Test(dependsOnMethods = "TestFrame3")
    public void TestFrame4()
    {
        driver.switchTo().frame(3);
        driver.findElement(By.name("mytext4")).sendKeys("this is frame 4");
       // driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("input[name='mytext3']")).click();
        driver.switchTo().parentFrame();

    }

}
