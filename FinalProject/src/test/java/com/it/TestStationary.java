package com.it;

import net.bytebuddy.TypeCache;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

    public class TestStationary  extends Stationary
    {


        public TestStationary()
        {
        }
            public void testPaperType() throws InterruptedException
            {
                PaperType("Ruled");
             
                assertTrue(driver.findElement(By.xpath("FilterResult"")).isEnabled());

            }
        @Test
        public void testDropDown() throws InterruptedException {

            Thread.sleep(1000L);
            selectDropDown(dropdown, 1);
            Assertions.assertTrue(driver.findElement(By.xpath(dropdown)).isEnabled());
        }
                @Test

                public void testOneItem () throws InterruptedException
                {

                OneItem("ountain Fox Notebook");

                    assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/stationery/16-28-mountain-fox-notebook.html#/22-paper_type-ruled");
                }



    }
