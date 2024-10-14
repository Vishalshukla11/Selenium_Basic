package com.example.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1
{
    public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://himalayawellness.in/account/login?return_url=%2Faccount");
Thread.sleep(2000);
driver.findElement(By.id("CustomerEmail")).sendKeys("vishalshukla8310@gmail.com");
driver.findElement(By.id("CustomerPassword")).sendKeys("123456789");
//driver.findElement(By.xpath()).click();

       
    }

}