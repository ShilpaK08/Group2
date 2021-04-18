package com.it.pop;

import org.openqa.selenium.By;

public class NavigationBar extends BaseClass{
    public void Color(String color) {
        driver1.findElement(By.xpath(color)).click();
    }
    public void Composition(String composition) {
        driver1.findElement(By.xpath(composition)).click();
    }
    public void Property(String property) {
        driver1.findElement(By.xpath(property)).click();
    }
    public void Brand(String brand1) {
        driver1.findElement(By.xpath(brand1)).click();
    }

}
