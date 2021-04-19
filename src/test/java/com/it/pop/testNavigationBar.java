package com.it.pop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testNavigationBar extends NavigationBar{
    @Test
    public void testColor() throws InterruptedException {
        Thread.sleep(1000);
        Color(White);
        assertTrue(driver1.findElement(By.xpath(FilterResult)).isEnabled());
    }
    @Test
    public void testComposition() throws InterruptedException {
        Thread.sleep(1000);
        Composition(Ceramic);
        assertTrue(driver1.findElement(By.xpath(FilterResult)).isEnabled());
    }
    @Test
    public void testProperty() throws InterruptedException {
        Thread.sleep(1000);
        WebElement Element = driver1.findElement(By.xpath(nextpage));
        js.executeScript("arguments[0].scrollIntoView();", Element);

        Property(RemovableCover);
        assertTrue(driver1.findElement(By.xpath(FilterResult)).isEnabled());
    }
    @Test
    public void testBrand() throws InterruptedException {
        Thread.sleep(1000);
        WebElement Element = driver1.findElement(By.xpath(nextpage));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Brand(StudioDesign);
        assertTrue(driver1.findElement(By.xpath(FilterResult)).isEnabled());
    }
}
