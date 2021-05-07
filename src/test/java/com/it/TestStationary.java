package com.it;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestStationary extends Stationary
{

    @Test
    public void testPaperType() throws InterruptedException
    {
        Thread.sleep(2000);
        openStationary(Accessories);
        Thread.sleep(2000);
        assertTrue(driver.findElement(By.xpath(paperType)).isEnabled());
    }

    @Test
    public void testDropDown() throws InterruptedException
    {
        Thread.sleep(2000);
        openStationary(Accessories);
        Thread.sleep(2000);
        selectDropDown(SortByRelevance, 1);
        assertTrue(driver.findElement(By.xpath(SortByRelevance)).isEnabled());
    }


    @Test
    public void testzItem() throws InterruptedException
    {
        Thread.sleep(2000);
        openStationary(Accessories);
        Thread.sleep(2000);
        item(MountainFoxNotebook);
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/stationery/16-28-mountain-fox-notebook.html#/22-paper_type-ruled");
    }

    @Test
    public void testzQuickView() throws InterruptedException
    {
        Thread.sleep(2000);
        openStationary(Accessories);
        WebElement Element = driver.findElement(By.xpath(view));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
        quickView(MountainFoxNotebook);
    }

    @Test
    public void testDescription() throws InterruptedException
    {
        openStationary(Accessories);
        Thread.sleep(1000);
        WebElement Element = driver.findElement(By.xpath(view));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
        description(MountainFoxNotebook);
        Thread.sleep(1000);
        Assertions.assertTrue(driver.findElement(By.xpath(mountain)).isDisplayed());
    }
   /* @Test
    public void testShare() throws InterruptedException
    {
        int wCount2 = driver.getWindowHandles().size();
        Thread.sleep(2000);
        openStationary(Accessories);
        Thread.sleep(2000);
        item(MountainFoxNotebook);
        Thread.sleep(2000);
        clickShare(twitter);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        int currentSize2 = driver.getWindowHandles().size();
        int expectSize2 = wCount2 + 1;
        Assertions.assertEquals(expectSize2, currentSize2);

    }*/
}
