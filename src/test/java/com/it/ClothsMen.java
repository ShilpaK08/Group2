package com.it;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;



public class ClothsMen extends BaseClass {

    public static String S = "//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[1]/label[1]/a[1]";
    public static String M = "//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[2]/label[1]/a[1]";
    public static String L = "//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[3]/label[1]/a[1]";
    public static String XL = "//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[4]/label[1]/a[1]";
    public static String SizeResult = "//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/ul[1]/li[2]/label[1]";
    public static String White = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/span/span";
    public static String Black = "//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[2]/label[1]/a[1]";
    public static String ColorResult = "//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[2]/label[1]/span[1]/span[1]";
    public static String SortbyRelevance = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button";
    // public static String R1 = "//a[contains(text(),'Name, A to Z')]";
    // public static String RelevanceResult = "//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]";


    //Navigate to cloths men page
    public void SelectMen() throws InterruptedException {
        WebElement E1, E2;
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        E1 = driver.findElement(By.id("category-3"));
        Actions action = new Actions(driver);
        action.moveToElement(E1).perform();
        E2 = driver.findElement(By.id("category-4"));
        E2.click();
        Thread.sleep(1000);
    }

    //Filter by SIZE
    public void ChooseSize(String Size) throws InterruptedException
    {
        driver.findElement(By.xpath(Size)).click();
        Thread.sleep(1000);
    }

    //Filter by color
    public void ChooseColor(String Color) throws InterruptedException
    {
        driver.findElement(By.xpath(Color)).click();
        Thread.sleep(1000);

    }

    //SortbyRelevance
    public void ChooseRelevance(String SortbyRelevance, Integer index) throws InterruptedException
    {

        driver.findElement(By.xpath(SortbyRelevance)).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
        WebElement SR = driver.findElement(By.xpath("//a[contains(text(),'Name, A to Z')]"));
        Actions action = new Actions(driver);
        action.moveToElement(SR).perform();
        action.click(SR).perform();
    }

}
