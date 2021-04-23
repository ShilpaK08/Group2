package com.it;

import com.it.BaseClass.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

    public class Stationary extends BaseClass
    {
        public String SortbyRelevance = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/div/a[2]";
        public String Ruled = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/a";
        public String MountainFoxNotebook = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[1]/h2/a";
        public String Nextpage = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[5]/p";

        public void openStatio(String Statio)
        {

            Actions action = new Actions(driver);
            WebElement we = driver.findElement(By.xpath(Statio));
            action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[1]/a"))).click().build().perform();
        }

        public void PaperType(String papertype)
        {
            {
                driver.get("http://40.76.27.113:8085/en/7-stationery");
                WebElement E = driver.findElement(By.xpath(Ruled));
                driver.findElement(By.xpath(Ruled)).click();
            }

        }

        public void ChooseRelevance(String SortbyRelevance, Integer index)
    {

        WebElement E= driver.findElement(By.xpath(SortbyRelevance));
        E.click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
    }

        public void OneItem(String item)
        {

            driver.findElement(By.xpath(item)).click();
        }

        public void clickView(String view)
        {

            Actions action = new Actions(driver);
            WebElement E = driver.findElement(By.xpath(view));
            action.moveToElement(E).moveToElement(driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[2]/a"))).click().build().perform();

        }

    }




