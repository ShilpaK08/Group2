package com.it;
//import com.it.BaseClass.*;
//import com.it.ClothsMen.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClothsMen extends ClothsMen {
    //TC for Cloths Men from Home page
    @Test
    public void ClickonCloths() throws InterruptedException {
        //LoginExistingUser("Testgroup2@test.com", "12345");
        LoginExistingUser("testacct@gmail.com","Test@1234");
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
    /*@Test
    public void SelectSize() throws InterruptedException {
        LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        ChooseSize(S);
        assertTrue(driver.findElement(By.xpath(SizeResult)).isEnabled());
        WebElement E7 = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[2]/section/p"));
        String S4 = E7.getText();
        Assertions.assertEquals("Active filters", S4);
    } */

    //Filter by color option
    @Test
    public void SelectColor() throws InterruptedException {
        LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        ChooseColor(Black);
        assertTrue(driver.findElement(By.xpath(ColorResult)).isEnabled());
    }

    //Filter by Relevance
    @Test
    public void SortbyRelevance() throws InterruptedException {
        LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
       /* if (E8.isEnabled() && E8.isDisplayed())
        {
            System.out.println("SortbyRelevance dropdown dispalyed");
        }
        else {
            System.out.println("SortbyRelevance dropdown not dispalyed");
        }*/
        ChooseRelevance(SortbyRelevance, 2);
        assertTrue(driver.findElement(By.xpath(SortbyRelevance)).isEnabled());
    }

    //Product image verification
    @Test
    public void ProductImage() throws InterruptedException
    {
        LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        WebElement E9 = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/a/img"));
        js.executeScript("arguments[0].scrollIntoView();", E9 );
        Actions action1 = new Actions(driver);
        action1.moveToElement(E9).perform();
        Thread.sleep(2000);
        System.out.println("The quickview is displayed");
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/div[2]/a")).click();
    }

}
