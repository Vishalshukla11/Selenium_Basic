package com.example.Webelements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotmethods {
    public static void main(String args[]) throws IOException, InterruptedException 
    {
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       TakesScreenshot tc= (TakesScreenshot) driver;
       File src = tc.getScreenshotAs(OutputType.FILE);
       File trg=new File("C:\\Users\\acer\\Desktop\\java\\seleniumprac\\src\\Screesnshots.\\sc.png");
       FileUtils.copyFile(src, trg);


       driver.quit();

    }
    
}
