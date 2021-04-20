package com.it;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

   public static WebDriver driver;

   public static JavascriptExecutor js;


    @BeforeEach
    public void openUp(){
        //open the Chrome webdriver and maximize the window before performing each test case
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();

    }

    public void LoginExistingUser(String EmailId, String PassWord){
        //Function to log into the existing user account
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
        driver.findElement(By.name("email")).sendKeys(EmailId);
        driver.findElement(By.name("password")).sendKeys(PassWord);
        driver.findElement(By.id("submit-login")).submit();
    }
<<<<<<< HEAD
/*
    @AfterEach
=======

   @AfterEach
>>>>>>> 878be17dc7fc65b7b3832765b9b84d8e1cfeb1b4
    public void tearDown(){
        //Close the Chrome webpage after performing each test case
        //driver.quit();
    }
*/
}
