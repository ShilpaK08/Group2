package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.String;

import static java.lang.Number.*;


public class SubscribetoNews extends BaseClass {
    //public static String Quickview = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[5]/p";



    public SubscribetoNews() {
    }

    public void subcribefail() throws InterruptedException {
        //LoginExistingUser("testacct@gmail.com","Test@1234");
        driver.get("http://40.76.27.113:8085/sv/");
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[1]/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
        Thread.sleep(1000);
        WebElement message = driver.findElement(By.name("submitNewsletter"));
        message.getText();
    }

    public void subcribepass() throws InterruptedException {
        //LoginExistingUser("testacct@gmail.com","Test@1234");
        driver.get("http://40.76.27.113:8085/sv/");
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        String emailID = "Henry" + userName + "@gmail.com";
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[1]/div/div/form/div/div[1]/div[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[1]/div/div/form/div/div[1]/div[1]/input")).sendKeys(emailID);

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,300)");
        WebElement message = driver.findElement(By.name("submitNewsletter"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", message);
        message.click();
    }

    public void DynamicAdsm1() {
        driver.get("http://40.76.27.113:8085/sv/");
        driver.findElement(By.xpath("//*[@id=\"carousel\"]/div/a[2]/span[1]/i")).click();

    }

    public void DynamicAdsm2() throws InterruptedException {
        driver.get("http://40.76.27.113:8085/sv/");
        WebDriverWait waiter = new WebDriverWait(driver, 5000);
        //waiter.until( ExpectedConditions.presenceOfElementLocated(driver.findElement(By.xpath("//*[@id=\"carousel\"]/ul/li[2]/a/figure/figcaption/h2"));
        //Js1.executeScript("window.scrollBy(1000,0)");
        driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/a[2]/span[1]/i[1]")).click();
        Thread.sleep(10000);


        /*js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", F2);*/
    }


    public void productPicture() {
        driver.get("http://40.76.27.113:8085/sv/");
        WebElement pdtpic = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/article[3]/div/a/img"));
        pdtpic.click();

    }

    public void Quickview() {
        //WebElement slider = driver.findElement(By.xpath("//*[@id=\"quickview-modal-2-9\"]"));
        //js.executeScript("window.scrollBy(0,200)");
        driver.get("http://40.76.27.113:8085/sv/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement Quickview = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/article[3]/div/div[2]"));
        Actions move = new Actions(driver);
        Action action = (Action) move.click().build();
        action.perform();
    }

    public void QuickviewUpdate() throws InterruptedException {
        driver.get("http://40.76.27.113:8085/sv/");
        Actions actions = new Actions(driver);
        WebElement quickview = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/article[3]/div/div[2]/a"));
        actions.moveToElement(quickview).perform();
        quickview.click();
    }

    public void shoppingcart () throws InterruptedException {

        productPicture();
        Thread.sleep(1000);
        WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        addtocart.click();
        Thread.sleep(1000);
        WebElement shoppingcart = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        Thread.sleep(1000);
        shoppingcart.click();
    }

    public void proceedtocheckout() throws InterruptedException {

        shoppingcart();
        WebElement proceedtochkout = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        proceedtochkout.click();

    }}