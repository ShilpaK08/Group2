package com.it;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestArtPage extends ArtPage {

    @Test
    public void TestOpenArtTab() {


        OpenArtTab();
        String expUrl = "http://40.76.27.113:8085/en/9-art";
        String curUrl = driver.getCurrentUrl();
        Assertions.assertEquals(curUrl,expUrl);
    }

    @Test
    public void TestComposition() throws InterruptedException {
        Thread.sleep(1000);
        OpenArtTab();
        Thread.sleep(1000);
        Composition();
        String curText = driver.findElement(By.xpath("//p[contains(text(),'Active filters')]")).getText();
        Assertions.assertEquals(curText, "Active filters");
    }

    @Test
    public void TestBrand() throws InterruptedException {
        Brand();
        String curText = driver.findElement(By.xpath("//p[contains(text(),'Active filters')]")).getText();
        Assertions.assertEquals(curText, "Active filters");
    }

    @Test
    public void TestDimensions() throws InterruptedException {

        Dimensions();
        Thread.sleep(1000);
        Assertions.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[2]/label[1]/span[1]/span[1]/i[1]")).isEnabled());
        String curText = driver.findElement(By.xpath("//p[contains(text(),'Active filters')]")).getText();
        Assertions.assertEquals(curText, "Active filters");
    }

    @Test
    public void TestDoubleFilter() throws InterruptedException {
        DoubleFilter(fortysixty,eightyOneTwenty);
        Assertions.assertTrue(driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[1]/label[1]/span[1]/span[1]/i[1]")).isEnabled());
        Assertions.assertTrue(driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[3]/label[1]/span[1]/span[1]/i[1]")).isEnabled());

    }


    @Test
    public void TestDescription() throws InterruptedException {
        Description();
        Thread.sleep(1000);
        Assertions.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Description')]")).isDisplayed());

    }

    @Test
    public void TestSortByDropDown() throws InterruptedException {
        sortByDropDown(sort,3 );
        Thread.sleep(1000);
        Assertions.assertTrue(driver.findElement(By.xpath(sort)).isEnabled());

    }

    @Test
    public void TestQuickView() throws InterruptedException {
        QuickView();
        Assertions.assertTrue(driver.findElement(By.xpath("/html//body[@id='category']/div[@role='dialog']/div[@role='document']//h1[@class='h1']")).isDisplayed());


    }

    //@Test
    /*public void TestAddToCart() throws InterruptedException {

        int windowCount = driver.getWindowHandles().size();

        AddToCart();
        Thread.sleep(1000);
        int currentSize = driver.getWindowHandles().size();
        Assertions.assertEquals(windowCount, currentSize);


    } */

    @Test
    public void TestFacebook() throws InterruptedException {
        int wCount = driver.getWindowHandles().size();
        Facebook();

        int currentSize2 = driver.getWindowHandles().size();
        int expectSize2 = wCount + 1;

        Assertions.assertEquals(expectSize2, currentSize2);
    }






}
