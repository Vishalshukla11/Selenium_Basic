package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Actionclass {
    private static WebDriver driver;
    private static Actions action;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        action = new Actions(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void DragandDrop() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.id("droppable"));
        action.dragAndDrop(drag, drop).perform();

    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }

}
