package com.it.pop;

import org.openqa.selenium.By;

public class QuickView extends BaseClass{
    public void clickView(String view) {
        driver1.findElement(By.xpath(view)).submit();
    }
}
