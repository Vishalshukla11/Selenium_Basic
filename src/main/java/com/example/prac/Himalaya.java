package com.example.prac;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Himalaya {
    public static void main(String[] args) {
        // To handle notification popup and open incognito
        ChromeOptions setting = new ChromeOptions();
        setting.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(setting);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://himalayawellness.in/");

        // Correct the XPath with quotes around the href value
        
       driver.findElement(By.xpath("//a[@href='/account' and @class='site-nav__link site-nav__link--icon small--hide' ]")).click();


        driver.quit();
    }
}
