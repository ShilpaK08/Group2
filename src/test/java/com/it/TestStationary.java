package com.it;

import com.it.BaseClass.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

    public class TestStationary  extends Stationary
    {
        @Test
        public void testPaperType() throws InterruptedException
        {
            Thread.sleep(2000);
            openStationary(Accessories);
            Thread.sleep(2000);
            PaperType(Ruled);
            assertTrue(driver.findElement(By.xpath(Ruled)).isEnabled());
        }

        @Test
        public void testDropDown() throws InterruptedException
        {
            Thread.sleep(2000);
            openStationary(Accessories);
            Thread.sleep(2000);
            selectDropDown(SortbyRelevance, 1);
            assertTrue(driver.findElement(By.xpath(SortbyRelevance)).isEnabled());
        }


        @Test
        public void testItem() throws InterruptedException
        {
            Thread.sleep(2000);
            openStationary(Accessories);
            Thread.sleep(2000);
            Item(MountainFoxNotebook);
            assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/stationery/16-28-mountain-fox-notebook.html#/22-paper_type-ruled");
        }


        @Test
        public void testqView() throws InterruptedException
        {
            Thread.sleep(2000);
            WebElement Element = driver.findElement(By.xpath(Newpage));
            js.executeScript("arguments[0].scrollIntoView();", Element);
            Thread.sleep(2000);
            clickView(MountainFoxNotebook);

        }

        @Test
        public void TestDescription() throws InterruptedException
        {
            Description();
            Thread.sleep(1000);
            Assertions.assertTrue(driver.findElement(By.xpath(Mountain)).isDisplayed());
        }
    }
