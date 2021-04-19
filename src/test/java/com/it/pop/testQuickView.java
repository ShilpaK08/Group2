package com.it.pop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testQuickView extends QuickView{
    @Test
    public void testqView() throws InterruptedException {
        Thread.sleep(1000);
        clickView(viewAction);

        //assertTrue(driver1.findElement(By.xpath(FilterResult)).isEnabled());
    }
}
