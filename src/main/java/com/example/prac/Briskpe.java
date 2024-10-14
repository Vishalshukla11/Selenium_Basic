package com.example.prac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Briskpe {
    public static void main(String args[]) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.briskpe.com/");
        Thread.sleep(5000);
        driver.getTitle();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\acer\\Desktop\\java\\seleniumprac\\src\\Screesnshots\\briskpeHome.png");
        FileUtils.copyFile(src, trg);
        driver.quit();
    }

}
