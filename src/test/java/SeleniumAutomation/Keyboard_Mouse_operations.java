package SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.MouseInfo;
import java.awt.Point;

public class Keyboard_Mouse_operations {
    private static WebDriver driver;
    private Robot robot;

    @BeforeClass
    public void setup()throws AWTException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        robot=new Robot();
    }

    @Test
    public void TestKeyPress() throws Exception
    {
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_DOWN);
        

    }

    @Test
    public void mouseMove()
    {
        robot.mouseMove(200, 300);
        Point mousePosition = MouseInfo.getPointerInfo().getLocation();
        AssertJUnit.assertEquals( 200.0,mousePosition.getX());
        AssertJUnit.assertEquals( 300.0,mousePosition.getY());

        
    }
    @Test
    public void TestMouseScroll() throws Exception
    {
        robot.mouseWheel(5);
        Thread.sleep(2000);
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }

}
