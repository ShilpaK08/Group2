package com.it.pop;

import org.openqa.selenium.By;

public class OneItem extends BaseClass{
    public void Item(String item) {
        driver1.findElement(By.xpath(item)).click();
    }
    public void Quantity(String quantity) {
        driver1.findElement(By.name(quantity)).sendKeys("2");
    }
    public void AddCart(String add) {
        driver1.findElement(By.cssSelector(add)).click();
    }
    public void clickDescription(String action) {
        driver1.findElement(By.xpath(action)).click();
    }
    public void clickShare(String link) {
        driver1.findElement(By.xpath(link)).click();
    }
}
