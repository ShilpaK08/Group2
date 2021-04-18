package com.it.pop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testOneItem extends OneItem{
    @Test
    public void testOneItem() {
        Item(IsAGoodDay);

        assertEquals(driver1.getCurrentUrl(), "http://40.76.27.113:8085/en/home-accessories/8-mug-today-is-a-good-day.html");
    }
    @Test
    public void testAddToCart() {
        int windowCount = driver1.getWindowHandles().size();

        Item(IsAGoodDay);
        Quantity(quantity);
        AddCart(add);
        WebDriverWait wait = new WebDriverWait(driver1, 60);

        int currentSize = driver1.getWindowHandles().size();
        int expectSize = windowCount + 1;

        Assertions.assertEquals(expectSize, currentSize);


    }
    @Test
    public void testDesciption() throws InterruptedException {
        Thread.sleep(1000);
        clickDescription(description);
        assertTrue(driver1.findElement(By.xpath(DescriptionResult)).isDisplayed());
    }
    @Test
    public void testShareLink() throws InterruptedException {
        int windowCount2 = driver1.getWindowHandles().size();

        Thread.sleep(1000);
        clickShare(fb);
        WebDriverWait wait = new WebDriverWait(driver1, 60);

        int currentSize2 = driver1.getWindowHandles().size();
        int expectSize2 = windowCount2 + 1;

        Assertions.assertEquals(expectSize2, currentSize2);
    }
}
