package com.it.base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.it.base.Baseclasscloths.*;

public class ClothsCommonFunctions extends Baseclasscloths {

    public static String S;
    public static String M;
    public static String L;
    public static String XL;
    public static String White;
    public static String Black;

    //Signin
    public void getEmail(String Email)
    {
        D1.findElement(By.name("email")).sendKeys(Email);
    }
    public void getPWD(String PWD)
    {
        D1.findElement(By.name("password")).sendKeys(PWD);
    }


    //Filter by SIZE
    public void ChooseSize(String Size)
    {
        Select selectsize = new Select(D1.findElement(By.id("facet_54723")));
        selectsize.selectByValue(Size);
    }

    //Filter by color
    public void ChooseColor(String Color)
    {
        Select selectcolor = new Select((D1.findElement(By.id("facet_21995"))));
        selectcolor.selectByValue(Color);
    }


}
