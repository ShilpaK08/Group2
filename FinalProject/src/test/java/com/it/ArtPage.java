package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ArtPage extends BaseClass{

        public static String sixtyninty = "//*[@id=\"facet_12124\"]/li[2]/label/a";

       public void OpenArtTab() {    driver.findElement(By.xpath("//*[@id=\"_desktop_top_menu\"]")).click();    }

        public void Composition() throws InterruptedException {
            //driver.get("http://40.76.27.113:8085/en/9-art");
            OpenArtTab();
            driver.findElement(By.partialLinkText("Matt pap")).click();
            Thread.sleep(1000);
        }

        public void Brand() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            driver.findElement(By.partialLinkText("Graphic Corn")).click();
            Thread.sleep(1000);
        }

        public void Dimensions(String Size) throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            //Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,150)");
            driver.findElement(By.xpath(Size)).click();
            Thread.sleep(1000);
        }

        public void DoubleFilter() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            driver.findElement(By.partialLinkText("Graphic Corn")).click();
            Thread.sleep(1000);
            driver.findElement(By.partialLinkText("Matt pap")).click();
            Thread.sleep(1000);

        }

        public void QuickView() throws InterruptedException {
            WebElement E1;
            driver.get("http://40.76.27.113:8085/en/9-art");
            js.executeScript("window.scrollBy(0,350)");
            E1 = driver.findElement(By.id("category-3"));
            Thread.sleep(1000);
            //Bear poster
            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[5]/div/div[2]/a")).click();
        }


        public void Zoom() {
            driver.get("http://40.76.27.113:8085/en/9-art");
            js.executeScript("window.scrollBy(0,150)");
            driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[5]/div[1]/a[1]/img[1]")).click();
            driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]")).click();
        }

        public void Description() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,150)");
            //Mountain fox frame
            driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[4]/div/a/img")).click();
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,250)");

        }

        public void Facebook() {
            driver.get("http://40.76.27.113:8085/en/9-art");
            js.executeScript("window.scrollBy(0,150)");
            driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[2]/div[1]/a[1]/img[1]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Share')]")).click();

        }

        public void Twitter() {
            driver.get("http://40.76.27.113:8085/en/9-art");
            js.executeScript("window.scrollBy(0,150)");
            driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[2]/div[1]/a[1]/img[1]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Tweet')]")).click();

        }

        public void Pinterest() {
            driver.get("http://40.76.27.113:8085/en/9-art");
            js.executeScript("window.scrollBy(0,150)");
            driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[2]/div[1]/a[1]/img[1]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Pinterest')]")).click();

        }

}
