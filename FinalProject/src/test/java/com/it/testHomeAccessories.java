package com.it;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testHomeAccessories extends HomeAccessories{
    @Test
    public void testDropDown() throws InterruptedException {

        openHomeAcc(Accessories);
        Thread.sleep(1000);
        selectDropDown(dropdown, 1);

        assertTrue(driver.findElement(By.xpath(dropdown)).isEnabled());
    }
    @Test
    public void testColor() throws InterruptedException {

        openHomeAcc(Accessories);
        Thread.sleep(1000);
        Color(White);
        assertTrue(driver.findElement(By.xpath(FilterResult)).isEnabled());
    }
    @Test
    public void testComposition() throws InterruptedException {
        openHomeAcc(Accessories);
        Thread.sleep(1000);
        Composition(Ceramic);
        assertTrue(driver.findElement(By.xpath(FilterResult)).isEnabled());
    }
    @Test
    public void testProperty() throws InterruptedException {
        openHomeAcc(Accessories);
        Thread.sleep(1000);
        WebElement Element = driver.findElement(By.xpath(nextpage));
        js.executeScript("arguments[0].scrollIntoView();", Element);

        Property(RemovableCover);
        assertTrue(driver.findElement(By.xpath(FilterResult)).isEnabled());
    }
    @Test
    public void testBrand() throws InterruptedException {
        openHomeAcc(Accessories);
        Thread.sleep(1000);
        WebElement Element = driver.findElement(By.xpath(nextpage));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Brand(StudioDesign);
        assertTrue(driver.findElement(By.xpath(FilterResult)).isEnabled());
    }
    @Test
    public void testOneItem() throws InterruptedException {
        openHomeAcc(Accessories);
        Thread.sleep(1000);
        Item(IsAGoodDay);

        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/home-accessories/8-mug-today-is-a-good-day.html");
    }
    @Test
    public void testAddToCart() throws InterruptedException {
        int windowCount = driver.getWindowHandles().size();

        openHomeAcc(Accessories);
        Thread.sleep(1000);
        Item(IsAGoodDay);
        Thread.sleep(1000);
        Quantity(quantity);
        Thread.sleep(1000);
        AddCart(add);
        WebDriverWait wait = new WebDriverWait(driver, 60);

        int currentSize = driver.getWindowHandles().size();


        Assertions.assertEquals(windowCount, currentSize);



    }
    @Test
    public void testDesciption() throws InterruptedException {
        openHomeAcc(Accessories);
        Thread.sleep(1000);
        Item(IsAGoodDay);
        Thread.sleep(1000);
        clickDescription(description);
        assertTrue(driver.findElement(By.xpath(DescriptionResult)).isDisplayed());
    }
    @Test
    public void testShareLink() throws InterruptedException {
        int windowCount2 = driver.getWindowHandles().size();

        openHomeAcc(Accessories);
        Thread.sleep(1000);
        Item(IsAGoodDay);
        Thread.sleep(1000);
        clickShare(fb);
        WebDriverWait wait = new WebDriverWait(driver, 60);

        int currentSize2 = driver.getWindowHandles().size();
        int expectSize2 = windowCount2 + 1;

        Assertions.assertEquals(expectSize2, currentSize2);
    }
    @Test
    public void testqView() throws InterruptedException {
        openHomeAcc(Accessories);
        Thread.sleep(1000);
        //WebElement Element = driver.findElement(By.xpath(nextpage));
        //js.executeScript("arguments[0].scrollIntoView();", Element);
        //Thread.sleep(1000);
        clickView(IsAGoodDay);

        //assertTrue(driver.findElement(By.xpath(FilterResult)).isEnabled());
    }
}
