package com.it;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClothsMen extends ClothsMen {
    //TC for Cloths Men from Home page
  /*  @Test
    public void ClickonCloths() throws InterruptedException {
       // LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        WebElement E3 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/nav/ol"));
        String S0 = E3.getText();
        Assertions.assertEquals("Home Clothes Men", S0);
        WebElement E4 = driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a"));
        String S1 = E4.getText();
        Assertions.assertEquals("MEN", S1);
        WebElement E5 = driver.findElement(By.xpath("//*[@id=\"search_filters\"]/p"));
        String S2 = E5.getText();
        Assertions.assertEquals("FILTER BY", S2);
        WebElement E6 = driver.findElement(By.xpath("//*[@id=\"js-product-list-header\"]/div/h1"));
        String S3 = E6.getText();
        Assertions.assertEquals("MEN", S3);

    }

    //Filter by size option
    @Test
    public void SelectSize() throws InterruptedException {
        //LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        ChooseSize(M);
        assertTrue(driver.findElement(By.xpath(SizeResult)).isEnabled());
        WebElement E7 = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[2]/section/p"));
        String S4 = E7.getText();
        Assertions.assertEquals("Active filters", S4);
    }

    //Filter by color option
    @Test
    public void SelectColor() throws InterruptedException {
        //LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        ChooseColor(Black);
        assertTrue(driver.findElement(By.xpath(ColorResult)).isEnabled());
    }

    //Filter by Relevance
    @Test
    public void SortbyRelevance() throws InterruptedException {
        //LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        ChooseRelevance(SortbyRelevance, 2);
        assertTrue(driver.findElement(By.xpath(SortbyRelevance)).isEnabled());
    }

    //Product image verification
    @Test
    public void ProductImage() throws InterruptedException
    {
       // LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        WebElement E9 = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/a/img"));
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", E9 );
        Actions action1 = new Actions(driver);
        action1.moveToElement(E9).perform();
        Thread.sleep(2000);
        System.out.println("The quickview is displayed");
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/div[2]/a")).click();
    }

    //Click on product image and verify the page
    @Test
    public void ClickonProductImage() throws InterruptedException
    {
        //LoginExistingUser("testacct@gmail.com", "Test@1234");
        SelectMen();
        driver.findElement(By.xpath
                ("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[1]/div[1]/a[1]")).click();
        //Breadcrumb verification
        WebElement E10 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/nav/ol"));
        String S5 = E10.getText();
        Assertions.assertEquals("Home Clothes Men Hummingbird printed t-shirt", S5);
        //Page header verification
        String S6 = driver.findElement(By.xpath("//h1[contains(text(),'Hummingbird printed t-shirt')]")).getText();
        System.out.println(S6);
        Assertions.assertEquals("HUMMINGBIRD PRINTED T-SHIRT", S6);
        //Size dropdown verification
        WebElement E11 = driver.findElement(By.xpath("//select[@id='group_1']"));
        E11.click();
        if(E11.isEnabled() && E11.isDisplayed())
        {
            System.out.println("Dropdown is enabled and visible");
        }
        else {
            System.out.println("Dropdown is not visible");
        }
        //Quantity dropdown verification
        WebElement E12 = driver.findElement(By.xpath("//span[contains(text(),'Quantity')]"));
        String S7 = E12.getText();
        Assertions.assertEquals("Quantity", S7);
        WebElement E13 = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
        if(E13.isEnabled())
        {
            System.out.println("Dropdown is enabled");
        }
        else
        {
            System.out.println("Drop down is not enabled");
        }
        driver.findElement(By.xpath
                ("//body/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]" +
                        "/form[1]/div[2]/div[1]/div[1]/div[1]/span[3]/button[1]/i[1]")).click();
        System.out.println("The quantity is added");
        driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]" +
                "/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/button[1]")).click();
        //Add to cart page verification
        driver.switchTo().activeElement();
        Thread.sleep(5000);
        //WebElement E15 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/h4[1]"));
        //String S8 = E15.getText();
        //Assertions.assertEquals("Product successfully added to your shopping cart", S8);
        driver.findElement(By.xpath("//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);
    }

    //Quickview functionality in clothsMen page
    @Test
    public void QuickviewMan() throws InterruptedException
    {
        //LoginExistingUser("testacct@gmail.com", "Test@1234");
        SelectMen();
        WebElement E16 = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/a/img"));
        js.executeScript("arguments[0].scrollIntoView();", E16 );
        Actions action1 = new Actions(driver);
        action1.moveToElement(E16).perform();
        driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[1]/div[1]/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
    }

    //Continue Shopping in add to cart page
    @Test
    public void ContinueShopping() throws InterruptedException
    {
        LoginExistingUser("testacct@gmail.com", "Test@1234");
        SelectMen();
        //ProductImage clicking
        driver.findElement(By.xpath
                ("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[1]/div[1]/a[1]")).click();
        //Add to cart button click & get the frame control
        driver.findElement(By.xpath
                ("//body/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/button[1]")).click();
        driver.switchTo().activeElement();
        Thread.sleep(1000);
        //Click on continue shopping
        driver.findElement(By.xpath("//button[contains(text(),'Continue shopping')]")).click();
        Thread.sleep(1000);
        //Home  Clothes  Men  Hummingbird printed t-shirt page header verification
        WebElement E17 = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/nav[1]/ol[1]"));
        String S8 = E17.getText();
        Assertions.assertEquals("Home Clothes Men Hummingbird printed t-shirt", S8);
    }

    //ZoomIn functionality
    @Test
    public void ZoomIn() throws InterruptedException
    {
        LoginExistingUser("testacct@gmail.com", "Test@1234");
        SelectMen();
        //Product Image verification
        driver.findElement(By.xpath
                ("//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[1]/div[1]/a[1]")).click();
        //Click on zoom In
        Actions action = new Actions(driver);
        WebElement E18 = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]"));
        action.moveToElement(E18).build().perform();
        Thread.sleep(2000);
        WebElement E19 = driver.findElement(By.xpath("//i[contains(text(),'\uE8FF')]"));
        E19.click();
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(2000);
        if(E19.isDisplayed())
            System.out.println("The zoom is visible");
        else
            System.err.println("The zoom isn't visible!!");
    }*/
}
