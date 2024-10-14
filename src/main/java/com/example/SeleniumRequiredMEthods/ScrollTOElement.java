package com.example.SeleniumRequiredMEthods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollTOElement {
    WebDriver driver;
    public ScrollTOElement(WebDriver driver)
    {
        this.driver=driver;
    }

    public void ScrollUntilElementwillNotDisplay(WebElement element)
    {
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        
        
    }

}
