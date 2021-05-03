package com.it;

import com.it.BaseClass.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

    public class Stationary extends BaseClass {

        public String Ruled = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/a";
        public String MountainFoxNotebook = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[1]/h2/a";
        public String SortbyRelevance = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button";
        public String Accessories = "/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[2]/a";


        public void openStationary(String stationary)
        {

            Actions action = new Actions(driver);
            WebElement E = driver.findElement(By.xpath(stationary));
            action.moveToElement(E).moveToElement(driver.findElement(By.xpath("//*[@id=\"category-7\"]/a"))).click().build().perform();
        }

        public void PaperType(String papertype)
        {
            driver.findElement(By.xpath(papertype)).click();

        }

        public void selectDropDown(String SortbyRelevance, int indexNo) {

            WebElement selectMyElement = driver.findElement(By.xpath(SortbyRelevance));
            selectMyElement.click();

            Actions keyDown = new Actions(driver);
            keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
        }

        public void Item(String item)
        {
            driver.findElement(By.xpath(item)).click();

        }

       /* public void clickView(String view)
        {
            Actions action = new Actions(driver);
            WebElement E = driver.findElement(By.xpath(view));
            action.moveToElement(E).moveToElement(driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[3]/div/div[2]/a"))).click().build().perform();

        }*/
    }







