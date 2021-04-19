package com.it;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    static WebDriver driver;
    static JavascriptExecutor js;

    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @BeforeEach
    public void openUp(){
        //open the Chrome webdriver and maximize the window before performing each test case
        driver = new ChromeDriver();
        driver.get("http://40.76.27.113:8085/en/");
        driver.manage().window().maximize();

    }

    @AfterEach
    public void tearDown(){
        //Close the Chrome webpage after performing each test case
        driver.quit();
    }

}
