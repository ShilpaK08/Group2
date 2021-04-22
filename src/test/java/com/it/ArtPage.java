package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ArtPage extends BaseClass{

        public void OpenArtTab() {    driver.get("http://40.76.27.113:8085/en/9-art");    }

        public void Composition() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            driver.findElement(By.partialLinkText("Matt pap")).click();
            Thread.sleep(1000);
        }

        public void Brand() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            driver.findElement(By.partialLinkText("Graphic Corn")).click();
            Thread.sleep(1000);
        }

        public void Dimensions() throws InterruptedException {
            driver.get("http://40.76.27.113:8085/en/9-art");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,150)");
            driver.findElement(By.partialLinkText("60x90")).click();
            Thread.sleep(1000);
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
            driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[4]/div[1]/a[1]/img[1]")).click();
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,150)");

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
