package com.it.MM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static com.it.MM.Baseclasscloths.D1;
import static com.it.MM.Baseclasscloths.*;

public class ClothsCommonFunctions extends Baseclasscloths
{
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
    public static WebElement E8;

    //Signin
    public void getEmail(String Email)
    {
        D1.findElement(By.name("email")).sendKeys(Email);
    }
    public void getPWD(String PWD)
    {
        D1.findElement(By.name("password")).sendKeys(PWD);
    }

    public void Signin () throws InterruptedException {
        D1.findElement(By.id("_desktop_user_info")).click();
        getEmail("test2group2@test.com");
        getPWD("12345");
        D1.findElement(By.id("submit-login")).click();
        E1 = D1.findElement(By.id("category-3"));
        E2 = D1.findElement(By.id("category-4"));
        Actions action = new Actions(D1);
        action.moveToElement(E1).perform();
        Thread.sleep(2000);
        action.click(E2).perform();
    }

    //Filter by SIZE
    public void ChooseSize(String Size)
    {
      D1.findElement(By.xpath(Size)).click();
    }

    //Filter by color
    public void ChooseColor(String Color)
    {
        D1.findElement(By.xpath(Color)).click();

    }

    //SortbyRelevance
    public void ChooseRelevance(String SortbyRelevance, Integer index)
    {

        E8= D1.findElement(By.xpath(SortbyRelevance));
        E8.click();
        Actions keyDown = new Actions(D1);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
    }


}
