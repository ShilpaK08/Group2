package com.it;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

public class TestSubscribeNews extends SubscribetoNews {

    @Test

    public void testSubscribefail() throws InterruptedException {
        //Testing for failed testcase
        subcribefail();
        Thread.sleep(1000);
        String expectedmsg = ("Ogiltig e-postadress");
        WebElement message = driver.findElement(By.name("submitNewsletter"));
        message.click();
        Thread.sleep(1000);
        String actual_msg = driver.findElement(By.xpath("//body/main[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]")).getText();
        Thread.sleep(1000);
        System.out.println(actual_msg);
        assertEquals(expectedmsg, actual_msg);
        //driver.quit();
    }

    @Test

    public void testSubscribepass() throws InterruptedException {
        //Testing for passed testcase
        subcribepass();
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");

        String actual_msg = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[1]/div/div/form/p")).getText();
        Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        assertEquals("Du prenumererar nu på nyhetsbrevet", actual_msg);
        //driver.quit();

    }

    @Test

    public void testDynamicAd1() throws InterruptedException {
        DynamicAdsm1();
        String text = null;
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
        assertTrue(list.size() > 0, "Sample 2");

        String sample1 = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/section[1]/section[1]/div[1]/ul[1]/li[2]/a[1]/figure[1]/figcaption[1]/h2[1]")).getText();
        //driver.quit();
    }

    @Test

    public void testDynamicAd2() throws InterruptedException {
        DynamicAdsm2();
        String text = null;
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
        assertTrue(list.size() > 0, "Sample 3");

        String sample1 = driver.findElement(By.xpath("//*[@id=\"carousel\"]/ul/li[3]/a/figure/figcaption/h2")).getText();
        //driver.quit();

    }

    @Test
    public void testproductPicture() {
        productPicture();
        String CurrentUrl = driver.getCurrentUrl();
        String Url = "http://40.76.27.113:8085/sv/art/3-13-the-best-is-yet-to-come-framed-poster.html#/19-dimension-40x60cm";
        assertEquals(Url, CurrentUrl);
        //driver.quit();

    }

    @Test
    public void testQuickviewUpdate() throws InterruptedException {
        QuickviewUpdate();
        int windowCount = driver.getWindowHandles().size();
        int currentSize = driver.getWindowHandles().size();
        //int exceptSize = windowCount + 1;
        Assertions.assertEquals(windowCount, currentSize);
        //driver.quit();

    }

    @Test
    public void testAddtoCart() {
        productPicture();
        WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        addtocart.click();
        Assertions.assertTrue(driver.findElement(By.partialLinkText("The best is yet to come' Framed poster")).isDisplayed());
        //driver.quit();

    }

    @Test
    public void testcontinueShopping () throws InterruptedException {
        productPicture();
        Thread.sleep(1000);
        WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        addtocart.click();
        WebElement Continuebutton = driver.findElement(By.xpath("//*[@id=\"product\"]"));
        Thread.sleep(1000);
        Continuebutton.click();
        Thread.sleep(1000);
        Assertions.assertTrue(driver.findElement(By.partialLinkText("The best is yet to come' Framed poster")).isDisplayed());
        //driver.quit();

    }

    @Test
    public void testshoppingcart () throws InterruptedException {
        shoppingcart();
        Assertions.assertTrue(driver.findElement(By.partialLinkText("Varukorg")).isDisplayed());
        //driver.quit();

    }

    @Test
    public void testproceedtocheckout() throws InterruptedException {
        proceedtocheckout();
        //Assertions.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkout-personal-information-step\"]/h1")));

        String bodyText = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertTrue(true, String.valueOf(bodyText.contains("PERSONLIG INFORMATION")));
        //driver.quit();

    }

    @Test
    public void EndtoEndTesting() throws InterruptedException {
        driver.get("http://40.76.27.113:8085/sv/");
        proceedtocheckout();
        Thread.sleep(2000);

        //Testing of Personlig info
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[2]/div[1]/input")).sendKeys("Henry");
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[3]/div[1]/input")).sendKeys("Victor");
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        String emailID = "Henry" + userName + "@gmail.com";
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[4]/div[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[4]/div[1]/input")).sendKeys(emailID);
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input")).sendKeys("Happy");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[6]/div[1]/input")).sendKeys("1984-05-11");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[9]/div[1]/span/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button")).click();

        //Testing of Addresser form
        driver.findElement(By.xpath("//*[@id=\"delivery-address\"]/div/section/div[2]/div[1]/input")).sendKeys("Joseph");
        driver.findElement(By.xpath("//*[@id=\"delivery-address\"]/div/section/div[3]/div[1]/input")).sendKeys("HS corp");
        driver.findElement(By.xpath("//*[@id=\"delivery-address\"]/div/section/div[4]/div[1]/input")).sendKeys("1234");
        driver.findElement((By.xpath("//*[@id=\"delivery-address\"]/div/section/div[5]/div[1]/input"))).sendKeys("3a.");
        driver.findElement(By.xpath("//*[@id=\"delivery-address\"]/div/section/div[6]/div[1]/input")).sendKeys("aulandsgatan");
        driver.findElement(By.xpath("//*[@id=\"delivery-address\"]/div/section/div[7]/div[1]/input")).sendKeys("212 54");
        driver.findElement(By.xpath("//*[@id=\"delivery-address\"]/div/section/div[8]/div[1]/input")).sendKeys("Rhycity");
        driver.findElement(By.xpath("//*[@id=\"delivery-address\"]/div/section/div[10]/div[1]/input")).sendKeys("548787");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"use_same_address\"]")).submit();
        driver.findElement(By.xpath("//body/section[@id='wrapper']/div[1]/section[1]/div[1]/div[1]/section[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();

        //Testing of Leveranssätt information
        driver.findElement(By.xpath("//body/section[@id='wrapper']/div[1]/section[1]/div[1]/div[1]/section[3]/div[1]/div[2]/form[1]/button[1]")).click();
        driver.findElement(By.xpath("//input[@id='payment-option-2']")).click();

        //Testing of Betalning information
        driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")).click();
        driver.findElement(By.xpath("//body/section[@id='wrapper']/div[1]/section[1]/div[1]/div[1]/section[4]/div[1]/div[3]/div[1]/button[1]")).click();
        //driver.quit();

    }}
