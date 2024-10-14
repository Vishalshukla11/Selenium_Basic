package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fileuploadpopups {
    private static WebDriver driver;

    @BeforeClass
    public void setup()
    {driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://smallpdf.com/pdf-converter");
    }

    @Test
    public void FileUploadPopupUsingSendKeys()
    {
        driver.findElement(By.xpath("//button[@class='l3tlg0-0 ggoliT']")).click();
    }

    
}
