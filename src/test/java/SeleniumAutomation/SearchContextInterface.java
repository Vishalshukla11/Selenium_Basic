package SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchContextInterface {
    private static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }

    @Test(priority = 1)
    public void FindElement() {
       WebElement felement=driver.findElement(By.id("twotabsearchtextbox"));
       System.out.println("Single element found usinf findelement:-");
       String PlaceholdertextAttribute=felement.getAttribute("placeholder");
       System.out.println("Searchbox placeHolder:- " + PlaceholdertextAttribute);
       org.testng.Assert.assertEquals(PlaceholdertextAttribute,"Search Amazon.in","placeholder text not match");
       
    }

    @Test(priority = 2)
    public void findElements() {
        List<WebElement> felements=driver.findElements(By.tagName("a"));
        for(WebElement elements: felements)
        {
            System.out.println("findelements:- " + elements);
        }
        org.testng.Assert.assertTrue(felements.size()>1);
        driver.quit();

    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }

}
