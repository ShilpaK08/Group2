package com.it;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

    public class Stationary extends BaseClass
    {
        public void PaperType(String papertype)
        {
            {
                driver.findElement(By.xpath(papertype)).click();
            }

        }
        public void selectDropDown(String dropdown, int indexNo) {
            WebElement selectMyElement = driver.findElement(By.xpath(dropdown));
            selectMyElement.click();
            Actions keyDown = new Actions(driver);
            keyDown.sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.DOWN, Keys.DOWN})}).perform();
        }

        public void  OneItem(String item)
        {

            driver.findElement(By.xpath(item)).click();
        }


}
