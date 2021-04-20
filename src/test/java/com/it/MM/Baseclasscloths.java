package com.it.base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;

public class Baseclasscloths {

    static WebDriver D1;
    static WebElement E1, E2, E3;
    static JavascriptExecutor js;

    //To open a chrome/firefox window
    @BeforeAll
    public static void Setup()
    {
        D1 = new ChromeDriver();
        //D1 = new FirefoxDriver();
        js = (JavascriptExecutor) D1;

    }

    //To open the url
    @BeforeEach
    public void SetupEach()
    {
        D1.get("http://40.76.27.113:8085/en/");
        D1.manage().window().maximize();

    }


    //To close the window
   /* @AfterEach
    public void Close()
    {
        D1.quit();
    }*/


}
