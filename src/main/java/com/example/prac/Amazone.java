package com.example.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone
{
    public static void main(String args[]) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
        driver.findElement(By.id("nav-search-submit-button")).click();
        // driver.findElement(By.linkText("Apple")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}