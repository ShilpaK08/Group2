package com.it.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownList extends BaseClass{
    public void selectDropDown(String dropdown,int indexNo) {

        //Select selectDrop = new Select(driver1.findElement(By.xpath(dropdown)));
        //selectDrop.selectByIndex(indexNo);

        WebElement selectMyElement = driver1.findElement(By.xpath(dropdown));
        selectMyElement.click();

        Actions keyDown = new Actions(driver1);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
    }
}
