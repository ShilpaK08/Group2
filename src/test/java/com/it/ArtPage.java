package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ArtPage extends BaseClass {

       public static String sixtyninty = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[4]/ul[1]/li[2]/label[1]/a[1]";
       public static String eightyOneTwenty = "//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[3]/label[1]/a[1]";
       public static String fortysixty = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[4]/ul[1]/li[1]/label[1]/a[1]";
       public static String sort = "//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]";

        public void OpenArtTab() {    driver.findElement(By.xpath("//a[contains(text(),'Art')]")).click();    }


        public void Composition() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            Thread.sleep(1000);
            driver.findElement(By.partialLinkText("Matt pap")).click();
            Thread.sleep(1000);
        }

        public void Brand() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            Thread.sleep(1000);
            driver.findElement(By.partialLinkText("Graphic Corn")).click();
            Thread.sleep(1000);
        }

        public static void Dimensions() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");

            js.executeScript("window.scrollBy(0,150)");
            Thread.sleep(1000);
            driver.findElement(By.xpath(sixtyninty)).click();

        }

        public void DoubleFilter(String size, String size1) throws InterruptedException {
            OpenArtTab();
            driver.findElement(By.xpath(fortysixty)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(eightyOneTwenty)).click();
            Thread.sleep(1000);

        }

        public void QuickView() throws InterruptedException {
            WebElement E1;
            driver.get("http://40.76.27.113:8085/en/9-art");
            js.executeScript("window.scrollBy(0,450)");
            E1 = driver.findElement(By.cssSelector("body.lang-en.country-se.currency-sek.layout-left-column.page-category.tax-display-enabled.category-id-9.category-art.category-id-parent-2.category-depth-level-2:nth-child(2) div.container div.left-column.col-xs-12.col-sm-8.col-md-9 div.products.row article.product-miniature.js-product-miniature:nth-child(5) div.thumbnail-container a.thumbnail.product-thumbnail > img:nth-child(1)"));
            Actions action = new Actions(driver);
            action.moveToElement(E1).perform();
            Thread.sleep(1000);
            //Bear poster
            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[5]/div/div[2]/a")).click();
            Thread.sleep(2000);
            Thread.sleep(1000);


        }

        public void Description() throws InterruptedException {
            OpenArtTab();
            Thread.sleep(1000);

            js.executeScript("window.scrollBy(0,200)");
            //Mountain fox frame
            driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[4]/div[1]/a[1]/img[1]")).click();
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,300)");


        }

    public void sortByDropDown(String Sortby, Integer index)
    {
        WebElement E2;
        OpenArtTab();
        js.executeScript("window.scrollBy(0,150)");
        driver.findElement(By.xpath(sort)).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
        E2 = driver.findElement(By.xpath("//a[contains(text(),'Price, low to high')]"));
        Actions action = new Actions(driver);
        action.moveToElement(E2).perform();
        action.click(E2).perform();
        js.executeScript("window.scrollBy(0,250)");

    }

    public void Facebook() throws InterruptedException {
        OpenArtTab();
        js.executeScript("window.scrollBy(0,150)");
        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[2]/div[1]/a[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Share')]")).click();
        Thread.sleep(1000);

    }

    public void AddToCart() throws InterruptedException {
        OpenArtTab();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[3]/div[1]/a[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/button[1]")).click();
        Thread.sleep(1000);


    }

}
