package com.it.pop;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
    public static WebDriver driver1;
    public static JavascriptExecutor js;

    public static String White = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[1]/label/a";
    public static String Black = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[2]/label/a";
    public static String Ceramic = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/a";
    public static String Polyester = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[2]/label/a";
    public static String RemovableCover = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[3]/ul/li/label/a";
    public static String StudioDesign = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[4]/ul/li/label/a";
    public static String FilterResult = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[1]/p";
    public static String dropdown = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button";
    public static String IsAGoodDay = "//*[@id=\"js-product-list\"]/div[1]/article[3]/div/div[1]/h2/a";
    public static String quantity = "qty";
    public static String add = "#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button";
    public static String nextpage = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[5]/p";
    public static String description = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/ul/li[1]/a";
    public static String proDetial = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/ul/li[2]/a";
    public static String DescriptionResult = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/div/div[1]/div/p/span";
    public static String fb = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[3]/div/ul/li[1]/a";
    public static String viewAction = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[2]/a";

    @BeforeAll

    public static void openPage() {

        driver1 = new ChromeDriver();
        //driver1 = new FirefoxDriver();
        js = (JavascriptExecutor) driver1;
        driver1.get("http://40.76.27.113:8085/en/8-home-accessories");
        driver1.manage().window().maximize();
    }



    @AfterAll
    public static void closePage() {
        //driver1.quit();
    }
}
