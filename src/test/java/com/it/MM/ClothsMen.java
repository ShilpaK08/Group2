package com.it.base;

import com.it.base.Baseclasscloths.*;
import com.it.base.ClothsCommonFunctions.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ClothsMen extends ClothsCommonFunctions {

    //TC for Cloths Men from Home page
    @Test
    public void ClickonCloths() throws InterruptedException {
        //Signin
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
        E3 = D1.findElement(By.xpath("//*[@id=\"wrapper\"]/div/nav/ol"));
        String S = E3.getText();
        Assertions.assertEquals("Home Clothes Men", S);
        WebElement E4 = D1.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a"));
        String S1 = E4.getText();
        Assertions.assertEquals("Men", S1);
        WebElement E5 = D1.findElement(By.id("search_filters"));
        String S2 = E5.getText();
        Assertions.assertEquals("Filter By", S2);
        WebElement E6 = D1.findElement(By.id("js-product-list-header"));
        String S3 = E6.getText();
        Assertions.assertEquals("MEN", S3);

    }




}
