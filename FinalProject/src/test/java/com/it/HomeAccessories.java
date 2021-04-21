package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeAccessories extends BaseClass{
    public void openHomeAcc(String homeAcc) {

        //driver.findElement(By.xpath(homeAcc)).click();
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(homeAcc));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"category-8\"]/a"))).click().build().perform();
    }
    public void selectDropDown(String dropdown,int indexNo) {

        //Select selectDrop = new Select(driver.findElement(By.xpath(dropdown)));
        //selectDrop.selectByIndex(indexNo);

        WebElement selectMyElement = driver.findElement(By.xpath(dropdown));
        selectMyElement.click();

        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
    }
    public void Color(String color) {
        driver.findElement(By.xpath(color)).click();
    }
    public void Composition(String composition) {
        driver.findElement(By.xpath(composition)).click();
    }
    public void Property(String property) {
        driver.findElement(By.xpath(property)).click();
    }
    public void Brand(String brand1) {
        driver.findElement(By.xpath(brand1)).click();
    }

        public void Item(String item) {
            driver.findElement(By.xpath(item)).click();
        }
        public void Quantity(String quantity) {
            driver.findElement(By.name(quantity)).sendKeys("2");
        }
        public void AddCart(String add) {
            driver.findElement(By.cssSelector(add)).click();
        }
        public void clickDescription(String action) {
            driver.findElement(By.xpath(action)).click();
        }
        public void clickShare(String link) {
            driver.findElement(By.xpath(link)).click();
        }
        public void clickView(String view) {

            //driver.findElement(By.xpath(view)).submit();
            Actions action = new Actions(driver);
            WebElement we = driver.findElement(By.xpath(view));
            action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[3]/div/div[2]/a"))).click().build().perform();

    }
}
