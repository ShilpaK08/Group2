package com.it;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class TestArtPage extends ArtPage {

    @Test
    public void TestOpenArtTab() {

        OpenArtTab();
        String expUrl = "http://40.76.27.113:8085/en/9-art";
        String curUrl = driver.getCurrentUrl();
        assertEquals(curUrl,expUrl);
    }

    @Test
    public void TestComposition() throws InterruptedException {
        Composition();
        String expUrl1 = "http://40.76.27.113:8085/en/9-art?q=Composition-Matt+paper";
        String curUrl1 = driver.getCurrentUrl();
        assertEquals(expUrl1,curUrl1);
    }

    @Test
    public void TestBrand() throws InterruptedException {
        Brand();
        String expUrl1 = "http://40.76.27.113:8085/en/9-art?q=Brand-Graphic+Corner";
        String curUrl1 = driver.getCurrentUrl();
        assertEquals(expUrl1,curUrl1);
    }

    @Test //testcase failing
    public void TestDimensions() throws InterruptedException {

        Dimensions();
        Thread.sleep(1000);
        assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[2]/label[1]/span[1]/span[1]/i[1]")).isEnabled());
        String curText = driver.findElement(By.xpath("//p[contains(text(),'Active filters')]")).getText();
        Assertions.assertEquals(curText, "Active filters");
    }

    @Test
    public void TestDoubleFilter() throws InterruptedException {
        DoubleFilter(fortysixty,eightyOneTwenty);
        assertTrue(driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[1]/label[1]/span[1]/span[1]/i[1]")).isEnabled());
        assertTrue(driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[3]/label[1]/span[1]/span[1]/i[1]")).isEnabled());
        String curText = driver.findElement(By.xpath("//*[@id=\"js-active-search-filters\"]/p")).getText();
        String expText = "Active filters";
        assertEquals(curText,expText);
    }


    @Test
    public void TestDescription() throws InterruptedException {
        Description();
        String curText = driver.findElement(By.xpath("//span[contains(text(),'You have a custom printing creative project? The v')]")).getText();
        //String curText = driver.findElement(By.partialLinkText("You have a custom printing creative project?")).getText();
        String expText = "You have a custom printing creative project? The vector graphic Mountain fox illustration can be used for printing purpose on any support, without size limitation.";
        assertEquals(curText, expText);

        Dimensions();
        String expUrl1 = "http://40.76.27.113:8085/en/9-art?q=Dimension-60x90cm";
        String curUrl1 = driver.getCurrentUrl();
        assertEquals(expUrl1,curUrl1);

    }

    @Test
    public void TestSortByDropDown() throws InterruptedException {
        sortByDropDown(sort,3 );
        assertTrue(driver.findElement(By.xpath(sort)).isEnabled());
        //String curURL = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).getText();
        //String expURL = "Price, low to high";

        String curUrl = driver.getCurrentUrl();
        //String expURL = "http://40.76.27.113:8085/en/9-art?order=product.price.asc";
        Assertions.assertEquals("http://40.76.27.113:8085/en/9-art?order=product.price.asc",curUrl);

    }

    @Test //not working
    public void TestQuickView() throws InterruptedException {
        QuickView();
        //String curText = driver.findElement(By.xpath("//h1[contains(text(),'Brown bear - Vector graphics')]")).getText();
        String curText = driver.switchTo().alert().getText();
        String expText = "BROWN BEAR - VECTOR GRAPHICS";
        assertEquals(expText,curText);

    }
    @Test
    public void TestFacebook() throws InterruptedException {
        Facebook();

        String expUrl = "https://www.facebook.com/sharer.php?u=http%3A%2F%2F40.76.27.113%3A8085%2Fen%2Fart%2F4-the-adventure-begins-framed-poster.html";
        String curUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl,curUrl);

    }



}
