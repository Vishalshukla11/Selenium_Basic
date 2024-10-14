package SeleniumAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class popups {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Explicit wait
        driver.get("https://demoqa.com/alerts");
    }

    @Test
    public void TestAlertPopup() {
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();
    }

    @Test(dependsOnMethods = "TestAlertPopup")
    public void AlertPopupWithExplicitWait() {
        driver.findElement(By.id("timerAlertButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    @Test(dependsOnMethods = "AlertPopupWithExplicitWait")
    public void ConfirmPopup() {
        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().accept();
    }

    @Test(dependsOnMethods = "ConfirmPopup")
    public void ConfirmationPopupReject() {
        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().dismiss();
    }

    @Test(dependsOnMethods = "ConfirmationPopupReject")
    public void PromptPopup() {
        driver.findElement(By.id("promtButton")).click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("vishal shukla");
        prompt.accept();
    }

    @Test(dependsOnMethods = "PromptPopup")
    public void PromptPopupRejected() {
        driver.findElement(By.id("promtButton")).click();
        Alert prompt = driver.switchTo().alert();
        prompt.dismiss();
    }

    @Test(dependsOnMethods = "PromptPopupRejected")
    public void TimerAlertButton() {
        // Handle any potential blocking element before clicking
        wait.until(ExpectedConditions.elementToBeClickable(By.id("timerAlertButton"))).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
