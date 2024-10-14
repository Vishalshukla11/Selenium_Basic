package com.example.Webelements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebelementsMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");

        // Click methods
        driver.findElement(By.id("login_Layer")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernametextfield = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Enter your active Email ID / Username']")));
        WebElement passwordTextField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Enter your password']")));

        // SendKeys methods
        usernametextfield.sendKeys("vishalshukla123@gmail.com");
        passwordTextField.sendKeys("Pankaj123");
        Thread.sleep(2000);

        // getAttribute("value") methods to get text entered in input fields
        String usernametext = usernametextfield.getAttribute("value");
        System.out.println("Entered username: " + usernametext);

        String passwordtext = passwordTextField.getAttribute("value");
        System.out.println("Entered password: " + passwordtext);

        // Clear methods
        usernametextfield.clear();
        passwordTextField.clear();
        Thread.sleep(2000);

        // getAttribute("placeholder") method to get the placeholder attribute
        String usernameattrubute = usernametextfield.getAttribute("placeholder");
        System.out.println("Placeholder for username: " + usernameattrubute);

        //get location method
       Point  usernametextFieldLocation=usernametextfield.getLocation();
      Point passowrdTextFieldLocation= passwordTextField.getLocation();
        System.out.println("usernametextFieldLocation:-"+usernametextFieldLocation);
        System.out.println("passowrdTextFieldLocation:- " + passowrdTextFieldLocation);



        // Click on the login button
WebElement LoginButton= driver.findElement(By.xpath("//button[text()='Login']"));
LoginButton.click();
//get css value
String fontFamily=LoginButton.getCssValue("font-family");
String color=LoginButton.getCssValue("color");
String backgroundcolor=LoginButton.getCssValue("background-color");

System.out.println("Login button font-family:- " +fontFamily );
System.out.println("Login button Color :- " +color );
System.out.println("Login button background color:- " +backgroundcolor );

//getTag Name

String usernametagname=usernametextfield.getTagName();
System.out.println("usernametagname:- " + usernametagname);

//isdisplay
boolean loginbuttondisplay=LoginButton.isDisplayed();
System.out.println("loginbuttondisplay:- " + loginbuttondisplay);

//is enable 
boolean loginbuttonIsEnable=LoginButton.isEnabled();
System.out.println("loginbuttonIsEnable:- " + loginbuttonIsEnable);


        //driver.quit();
    }
}
