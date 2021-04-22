package com.it;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import static com.it.BaseClass.*;

import org.openqa.selenium.WebElement;

public class ClothsMen extends BaseClass {

        public static String S = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[1]/label/span/span";
        public static String M = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[2]/label/span/span";
        public static String L = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[3]/label/span/span";
        public static String XL = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[4]/label/span/span";
        public static String SizeResult = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[1]/label/span/span";
        public static String White = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/span/span";
        public static String Black = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[2]/label/span/span";
        public static String ColorResult = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[2]/label/span/span";
        public static String SortbyRelevance = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button";
        //public static String R1 = "a.select-list:nth-child(2)";
        //public static String RelevanceResult = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button";


    //Navigate to cloths men page
    public static void SelectMen() throws InterruptedException {
        WebElement E1, E2;
        E1 = driver.findElement(By.id("category-3"));
        E2 = driver.findElement(By.id("category-4"));
        Actions action = new Actions(driver);
        action.moveToElement(E1).perform();
        Thread.sleep(2000);
        action.click(E2).perform();
    }

        //Filter by SIZE
    public void ChooseSize(String Size)
    {
        driver.findElement(By.xpath(Size)).click();
    }

    //Filter by color
    public void ChooseColor(String Color)
    {
        driver.findElement(By.xpath(Color)).click();

    }

    //SortbyRelevance
    public void ChooseRelevance(String SortbyRelevance, Integer index)
    {

        WebElement E8= driver.findElement(By.xpath(SortbyRelevance));
        E8.click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
    }

}
