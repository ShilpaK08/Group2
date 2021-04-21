package com.it;

import com.it.bs;
import org.openqa.selenium.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static com.it.bs.*;

public class TestClothesWomen extends BaseClass{
    public static String Checkbox1 = "//*[@id=\"facet_1054\"]/li[1]/label/span/span";
    public static String Checkbox2 = "//*[@id=\"facet_97297\"]/li[2]/label/span/span/i";
    //public static String Checkbox3 = "//*[@id="facet_37025"]/li[3]/label/span/span/i;
    public static String Checkbox4 = "//*[@id=\"facet_37025\"]/li[4]/label/span/span";

    public void TestUrl() throws InterruptedException{

    driver.findElement(By.xpath("//*[@id=\"category-3\"]/a")).click();
    //Thread.sleep(5000);
    driver.findElement(By.linkText("Women")).click();
    Thread.sleep(5000);

    }

    public void sortBy(int index) {

        Select selectdropdown = new Select(driver.findElement(By.xpath("//*[@id=\"js-product-list-top\"]/div[2]/div/div[1]/button")));
        selectdropdown.selectByIndex(index);
    }

    public void filterBy(String checkbox1) {
        WebElement Checkbox1= driver.findElement(By.xpath("//*[@id=\"facet_1054\"]/li[1]/label/span/span"));
        Checkbox1.click();
        WebElement Checkbox2= driver.findElement(By.xpath("//*[@id=\"facet_97297\"]/li[2]/label/span/span/i"));
        Checkbox2.click();
        WebElement Checkbox3= driver.findElement(By.xpath("//*[@id=\"facet_37025\"]/li[3]/label/span/span/i"));
        Checkbox3.click();
        WebElement Checkbox4= driver.findElement(By.xpath("//*[@id=\"facet_37025\"]/li[4]/label/span/span"));
        Checkbox4.click();
    }


}


