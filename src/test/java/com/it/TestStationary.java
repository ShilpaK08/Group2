package com.it;

import com.it.BaseClass.*;
import com.it.Stationary.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


    public class TestStationary  extends Stationary
    {

        @Test
        public void testPaperType() throws InterruptedException
        {

                Thread.sleep(1000);
                PaperType(Ruled);
                assertTrue(driver.findElement(By.xpath(Ruled)).isEnabled());

        }
        @Test
        public void SortbyRelevance() throws InterruptedException
        {
            Thread.sleep(1000);
            ChooseRelevance(SortbyRelevance, 2);
            assertTrue(driver.findElement(By.xpath(SortbyRelevance)).isEnabled());
        }
        @Test
            public void testOneItem () throws InterruptedException
            {
                OneItem(MountainFoxNotebook);
                Thread.sleep(1000);
                assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/stationery/16-28-mountain-fox-notebook.html#/22-paper_type-ruled");
            }

        @Test
        public void testqView() throws InterruptedException
        {
            Thread.sleep(1000);
            WebElement Element = driver.findElement(By.xpath(Nextpage));
            js.executeScript("arguments[0].scrollIntoView();", Element);
            Thread.sleep(1000);
            clickView(MountainFoxNotebook);

        }

    }
