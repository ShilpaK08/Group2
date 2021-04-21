package com.it.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeAccessories extends BaseClass{
    public void openHomeAcc(String homeAcc) {

        //driver1.findElement(By.xpath(homeAcc)).click();
        Actions action = new Actions(driver1);
        WebElement we = driver1.findElement(By.xpath(homeAcc));
        action.moveToElement(we).moveToElement(driver1.findElement(By.xpath("//*[@id=\"category-8\"]/a"))).click().build().perform();
    }
    public void selectDropDown(String dropdown,int indexNo) {

        //Select selectDrop = new Select(driver1.findElement(By.xpath(dropdown)));
        //selectDrop.selectByIndex(indexNo);

        WebElement selectMyElement = driver1.findElement(By.xpath(dropdown));
        selectMyElement.click();

        Actions keyDown = new Actions(driver1);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
    }
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
        public void clickView(String view) {

            //driver1.findElement(By.xpath(view)).submit();
            Actions action = new Actions(driver1);
            WebElement we = driver1.findElement(By.xpath(view));
            action.moveToElement(we).moveToElement(driver1.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[3]/div/div[2]/a"))).click().build().perform();

    }
}
