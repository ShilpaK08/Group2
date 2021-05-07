package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Stationary extends BaseClass {

    public String paperType = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/a";
    public String MountainFoxNotebook = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[1]/h2/a";
    public String SortByRelevance = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button";
    public String Accessories = "/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[2]/a";
    public String view = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[2]/a";
    public String mountain = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/ul/li[1]/a";
    public String twitter = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[3]/div/ul/li[2]/a";

    public void openStationary(String stationaryXpath)
    {

        Actions action = new Actions(driver);
        WebElement E = driver.findElement(By.xpath(stationaryXpath));
        action.moveToElement(E).moveToElement(driver.findElement(By.xpath("//*[@id=\"category-7\"]/a"))).click().build().perform();
    }

    public void PaperType(String paperType) {
        driver.findElement(By.xpath(paperType)).click();
    }

    public void selectDropDown(String SortbyRelevance, int indexNo) {

        WebElement selectMyElement = driver.findElement(By.xpath(SortbyRelevance));
        selectMyElement.click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
    }

    public void item(String item) {
        driver.findElement(By.xpath(item)).click();

    }

    public void quickView(String view) {
        Actions action = new Actions(driver);
        WebElement E = driver.findElement(By.xpath(view));
        action.moveToElement(E).moveToElement(driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[3]/div/div[2]/a"))).click().build().perform();
    }
    /*public void clickShare(String link)
    {
        driver.findElement(By.xpath(link)).click();
    }*/

    public void description(String mountain) {
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath(mountain)).click();
    }
}







