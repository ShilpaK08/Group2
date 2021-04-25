package com.it;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import static com.it.BaseClass.*;

import org.openqa.selenium.WebElement;

public class ClothesWomen extends BaseClass {
    /*public String Checkbox1 = "//*[@id=\"search_filter_controls\"]";
    public String Checkbox2 = "//*[@id=\"facet_input_20468_1\"]";
    //public  String Checkbox3 = "//*[@id="facet_37025"]/li[3]/label/span/span/i;
    public String Checkbox4 = "//*[@id=\"facet_37025\"]/li[4]/label/span/span";*/

    public String Relevance = "//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]";

/*
    public void filterBy() throws InterruptedException {
        WebElement Checkbox1 = driver.findElement(By.xpath("//input[@id='facet_input_66356_0']"));
        Checkbox1.click();
    }
/*
    {
        WebElement Checkbox2 = driver.findElement(By.xpath("/*[@id=\"facet_input_20468_1\"]"));
        Checkbox2.click();
    }

    {
        WebElement Checkbox3 = driver.findElement(By.xpath("//*[@id=\"facet_37025\"]/li[3]/label/span/span/i"));
        Checkbox3.click();
    }

    {
        WebElement Checkbox4 = driver.findElement(By.xpath("//*[@id=\"facet_37025\"]/li[4]/label/span/span"));
        Checkbox4.click();
    }
*/

    public void TestUrl() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"category-3\"]/a")).click();
        //Thread.sleep(1000);
        driver.findElement(By.linkText("Women")).click();
        Thread.sleep(1000);
    }

    public void sortBy(String Relevance, int index) {
        driver.get("http://40.76.27.113:8085/en/5-women");
        //Select SelectDropdown = new Select(driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")));

        WebElement SelectDropdown = (driver.findElement(By.xpath(Relevance)));
        // SelectDropdown.selectByVisibleText("Name, A to Z");
        SelectDropdown.click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

        /*Select SelectDrop = new Select(SelectDropdown);
          SelectDrop.deselectByVisibleText("Name, A to Z");
          Select SelectDropdown = new Select(driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")));
        }*/
    }
/*
    public void filterByCategory(){
        WebElement Category = driver.findElement(By.id("facet_input_22236_1"));
        Category.click();

    }*/

    public void productPicture() {
        driver.get("http://40.76.27.113:8085/en/5-women");
        WebElement pdtpic = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/a/img"));
        pdtpic.click();

    }
    public void Quickview() {
        //WebElement slider = driver.findElement(By.xpath("//*[@id=\"quickview-modal-2-9\"]"));
        //js.executeScript("window.scrollBy(0,200)");
        driver.get("http://40.76.27.113:8085/en/5-women");
        //js.executeScript("window.scrollBy(0,200)");
        //driver.switchTo().frame(0); //need to switch to this frame before clicking the slider
        WebElement Quickview = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/div[2]/a"));
        Actions move = new Actions(driver);
        Action action = (Action) move.click().build();
        action.perform();
    }


}


