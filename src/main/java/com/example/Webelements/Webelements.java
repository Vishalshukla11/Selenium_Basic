package com.example.Webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("register_Layer")).click();
        WebElement name = driver.findElement(By.id("name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement mobile = driver.findElement(By.id("mobile"));
        // enter the wrong data
        name.sendKeys("vvvvvvvvvvvvvv");
        email.sendKeys("nosfnvjsbsbhjbd@gmail.com");
        password.sendKeys("hbwdsdhiv123");
        mobile.sendKeys("1234986");
        Thread.sleep(2000);
        name.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        email.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        password.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        mobile.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        Thread.sleep(2000);

        name.sendKeys("vishal shukla");
        email.sendKeys("vishalshukla123@gmail.com");
        password.sendKeys("Password132");
        mobile.sendKeys("7771860135");

        driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
WebElement outsideIndiaCheckbox=driver.findElement(By.xpath("(//i[@class='ico resman-icon resman-icon-check-box'])[1]"));

//is selected method
boolean outSideIndia=outsideIndiaCheckbox.isSelected();
System.out.println("outSideIndia:- " + outSideIndia) ;

WebElement outsideIndiaCheckbox1=driver.findElement(By.xpath("//span[text()='Outside India']"));
outsideIndiaCheckbox1.click();
System.out.println("After select:-" +  outSideIndia);



        Thread.sleep(3000);
        driver.quit();
    }
}
