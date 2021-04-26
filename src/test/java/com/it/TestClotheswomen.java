package com.it;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class TestClotheswomen extends ClothesWomen {

    @Test
    public void testCorrectUrl() throws InterruptedException {
        TestUrl();
        String currentUrl = driver.getCurrentUrl();
        Thread.sleep(1000);
        String url = "http://40.76.27.113:8085/en/5-women";
        assertEquals(url, currentUrl, "url differs");
    }


    @Test
    public void testSortBy() throws InterruptedException {
        //Testing the Sortby dropdown
        sortBy(Relevance, 1);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Select SelectDropdown = new Select(driver.findElement(By.xpath(Relevance)));
        //Thread.sleep(2000);
        //assertTrue(SelectDropdown.getAllSelectedOptions().contains(Relevance));
        //assertEquals("Relevance", SelectDropdown);
        //assertEquals("Name, A to Z", SelectDropdown.selectByValue("Name, A to Z"));
        System.out.println("testing Sort Method");
    }

/*
    @Test
    public void testFilterBy() throws InterruptedException {
        filterBy();
        Thread.sleep(1000);
        WebElement Checkbox1 = driver.findElement(By.xpath("//input[@id='facet_input_66356_0']"));
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //js.executeScript("window.scrollBy(0,500)");
        assertTrue(Checkbox1.isSelected());
/*
          WebElement Checkbox2 = driver.findElement(By.xpath("//*[@id=\"facet_input_20468_1\"]"));
          assertTrue(Checkbox2.isSelected());
          WebElement Checkbox3 = driver.findElement(By.xpath("//*[@id=\"facet_37025\"]/li[3]/label/span/span/i"));
          assertTrue(Checkbox3.isSelected());
          WebElement Checkbox4 = driver.findElement(By.xpath("//*[@id=\"facet_37025\"]/li[4]/label/span/span"));
          assertTrue(Checkbox4.isSelected());
    }


    @Test
    public void testFilterBycategory(){
        filterByCategory();
        ass
    }*/


    @Test
    public void testproductPicture() {
        productPicture();
        String CurrentUrl = driver.getCurrentUrl();
        String Url = "http://40.76.27.113:8085/en/women/2-9-brown-bear-printed-sweater.html#/1-size-s";
        assertEquals(Url, CurrentUrl);

    }
    /*
    @Test
        public void testQuickview() {
        Quickview();
        String CurrentUrl = driver.getCurrentUrl();
        String Url = "http://40.76.27.113:8085/en/5-women?order=product.name.asc";
        assertEquals(Url, CurrentUrl);
    }
*/
    @Test
    public void testAddtoCart() {
        productPicture();
        WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        addtocart.click();
        WebElement pdtname = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]/h1[1]"));
        assertNotEquals("Hummingbird printed sweater", pdtname);
    }

    @Test
        public void testQuickviewUpdate() throws InterruptedException {
       // QuickviewUpdate();
        driver.get("http://40.76.27.113:8085/en/5-women");
        WebDriverWait wait = new WebDriverWait(driver,30);
        js.executeScript("window.scrollBy(0,200)");
        //driver.switchTo().frame(0); //need to switch to this frame before clicking the slider
        Actions move = new Actions(driver);
        WebElement Quickview = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/div[2]/a"));
        move.moveToElement(Quickview).build().perform();
/*
        //Action action = (Action) move.click().build();
        move.perform();
        js.executeScript("window.scrollBy(0,500)");
        Select Quickviewsize = new Select(driver.findElement(By.cssSelector("#group_1")));
        //js.executeScript("arguments[0].click()", Quickviewsize);
        Thread.sleep(1000);
        Quickviewsize.selectByVisibleText("M");
        WebElement Size = driver.findElement(By.id("quantity_wanted"));
        //Thread.sleep(5000);
        js.executeScript("arguments[0].click()", Size);
            for(int i=0;i<2;i++) {
                driver.findElement(By.id("quantity_wanted")).sendKeys(Keys.ARROW_UP);
            }
    Thread.sleep(5000);
    System.out.println("Value incremented");

/*
            String windowTitle= getCurrentWindowTitle();
            String mainWindow = getMainWindowHandle(driver);
            assertTrue(closeAllOtherWindows(mainWindow));
            assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
*/
        }


}




