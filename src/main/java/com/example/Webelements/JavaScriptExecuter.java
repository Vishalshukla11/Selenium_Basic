package com.example.Webelements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {
    public static  void main(String args[]) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        JavascriptExecutor js= (JavascriptExecutor) driver;

        int i = 0;
        while (i < 10) {
            // Scroll by 50 pixels vertically
            js.executeScript("window.scrollBy(0,500)");
            Thread.sleep(1000);
            i++;
        }
        
        //  Add another sleep to observe the final state of the page before closing
        Thread.sleep(2000);
        driver.quit();
      
    }
    
    
    
}
