package com.example.Webelements;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMEthods {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://himalayawellness.in/");
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println("Tiitle:- " + title);

        String PageSource = driver.getPageSource();
        System.out.println("page source:- " + PageSource);

        String currenturl = driver.getCurrentUrl();
        System.out.println("current url" + currenturl);

        String getwindowHandle = driver.getWindowHandle();
        System.out.println("get window handle" + getwindowHandle);

        Set<String> getwindowhandles = driver.getWindowHandles();
        System.out.println("get windowhandles " + getwindowhandles);

        driver.quit();

    }

}
