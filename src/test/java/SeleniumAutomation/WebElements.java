package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElements {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }

    @Test
    public void testclearAndSendKeys() throws Exception {
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.clear();
        searchbox.sendKeys("Laptop");
        AssertJUnit.assertEquals("Laptop", searchbox.getAttribute("value"));

    }

    @Test(dependsOnMethods = "testclearAndSendKeys")
    public void TestClick() {
        WebElement searchbox = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
        searchbox.click();
        AssertJUnit.assertTrue(driver.getTitle().contains("Laptop"));
    }

    @Test(dependsOnMethods = "TestClick")
    public void TestGEtAttribute() {
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        String Attribute = searchbox.getAttribute("type");
        AssertJUnit.assertEquals("text", Attribute);

    }

    @Test(dependsOnMethods = "TestGEtAttribute")
    public void TestGetCssValue() {
        WebElement searchbox = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
        String backgroundcolor = searchbox.getCssValue("background-color");
        System.out.println("backgroundcolor:- " + backgroundcolor);
        AssertJUnit.assertNotNull(backgroundcolor);

    }

    @Test(dependsOnMethods = "TestGetCssValue")
    public void TestgetLocation() {
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        Point slocation = searchbox.getLocation();
        System.out.println("SearchBoxLocation:-" + slocation);
        AssertJUnit.assertTrue(slocation.getX() > 0 && slocation.getY() > 0);
    }

    @Test(dependsOnMethods = "TestgetLocation")
    public void TestGEtSize() {
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        Dimension slocation = searchbox.getSize();
        System.out.println("GEt Size:-" + slocation);
        AssertJUnit.assertTrue(slocation.getHeight() > 0 && slocation.getWidth() > 0);

    }

    @Test(dependsOnMethods = "TestGEtSize")
    public void TestGetText() {
        driver.navigate().to("https://gaana.com/lyrics/humein-tumse-pyar-kitna-4");
        WebElement text = driver.findElement(By.xpath("//strong[@title='Humein Tumse Pyar Kitna Lyrics']"));
        String gettext = text.getText();
        System.out.println("gettext:-" + gettext);
        driver.navigate().back();
        // AssertJUnit.assertTrue(gettext.contains(""));
    }

    @Test(dependsOnMethods = "TestGEtSize")
    public void TestIsDisplay() {
        WebElement searchbox = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
        boolean display=searchbox.isDisplayed();
        AssertJUnit.assertTrue(display);

    }

    @Test(dependsOnMethods = "TestIsDisplay")
    public void TestIsEnable() {
        WebElement searchbox = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
boolean enable=searchbox.isEnabled();
AssertJUnit.assertTrue(enable);

    }

    @Test(dependsOnMethods = "TestIsEnable")
    public void TestISSelected()
    {
WebElement select=driver.findElement(By.xpath("//span[text()='Lenovo']"));
AssertJUnit.assertFalse(select.isSelected());
    }

    @Test(dependsOnMethods = "TestISSelected")
    public void TestSubmit()
    {
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.clear();
searchbox.sendKeys("book");
searchbox.submit();
AssertJUnit.assertTrue(driver.getTitle().contains("book"));

    }

}
