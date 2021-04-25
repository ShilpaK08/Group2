package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomeAccessories extends BaseClass{

    public static String White = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[1]/label/a";
    public static String Black = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[2]/label/a";
    public static String Ceramic = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/a";
    public static String Polyester = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[2]/label/a";
    public static String RemovableCover = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[3]/ul/li/label/a";
    public static String StudioDesign = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[4]/ul/li/label/a";
    public static String FilterResult = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[1]/p";
    public static String dropdown = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button";
    public static String IsAGoodDay = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[3]/div/div[1]/h2/a";
    public static String quantity = "qty";
    public static String add = "#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button";
    public static String nextpage = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[5]/p";
    public static String description = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/ul/li[1]/a";
    public static String proDetial = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/ul/li[2]/a";
    public static String DescriptionResult = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/div/div[1]/div/p/span";
    public static String fb = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[3]/div/ul/li[1]/a";
    public static String viewAction = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[2]/a";
    public static String Accessories = "/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[2]/a";
    public static String driverType = "";



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
