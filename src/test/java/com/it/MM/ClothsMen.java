package com.it.MM;

import com.it.MM.Baseclasscloths.*;
import com.it.MM.ClothsCommonFunctions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static com.it.MM.Baseclasscloths.D1;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClothsMen extends ClothsCommonFunctions {

    //TC for Cloths Men from Home page
    @Test
    public void ClickonCloths() throws InterruptedException {
        Signin();
        E3 = D1.findElement(By.xpath("//*[@id=\"wrapper\"]/div/nav/ol"));
        String S0 = E3.getText();
        Assertions.assertEquals("Home Clothes Men", S0);
        WebElement E4 = D1.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a"));
        String S1 = E4.getText();
        Assertions.assertEquals("MEN", S1);
        WebElement E5 = D1.findElement(By.xpath("//*[@id=\"search_filters\"]/p"));
        String S2 = E5.getText();
        Assertions.assertEquals("FILTER BY", S2);
        WebElement E6 = D1.findElement(By.xpath("//*[@id=\"js-product-list-header\"]/div/h1"));
        String S3 = E6.getText();
        Assertions.assertEquals("MEN", S3);

    }

    //Filter by size option
    @Test
    public void SelectSize() throws InterruptedException {
        Signin();
        ChooseSize(S);
        assertTrue(D1.findElement(By.xpath(SizeResult)).isEnabled());
        WebElement E7 = D1.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[2]/section/p"));
        String S4 = E7.getText();
        Assertions.assertEquals("Active filters", S4);
    }

    //Filter by color option
    @Test
    public void SelectColor() throws InterruptedException {
        Signin();
        ChooseColor(Black);
        assertTrue(D1.findElement(By.xpath(ColorResult)).isEnabled());
    }

    //Filter by Relevance
    @Test
    public void SortbyRelevance() throws InterruptedException {
        Signin();
       /* if (E8.isEnabled() && E8.isDisplayed())
        {
            System.out.println("SortbyRelevance dropdown dispalyed");
        }
        else {
            System.out.println("SortbyRelevance dropdown not dispalyed");
        }*/
        ChooseRelevance(SortbyRelevance, 5);
        assertTrue(D1.findElement(By.xpath(SortbyRelevance)).isEnabled());
    }


    //Click on product image and verify the pag
    @Test
    public void ClickonPrductImage() throws InterruptedException
    {
        LoginExistingUser("testacct@gmail.com","Test@1234");
        SelectMen();
        //js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article/div/a/img")).click();
        WebElement E10 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/h1"));
        String S5 =  E10.getText();
        Assertions.assertEquals("HUMMINGBIRD PRINTED T-SHIRT", S5);
        WebElement Image = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]"));
        Object Imagepresent = js.executeScript("return arguments[0].complete &&" + "typeof arguments[0].naturalWidth != \"undefined\" &&" +
                "arguments[0].naturalWidth > 0", Image);
        Boolean loaded = false;
        if(Imagepresent instanceof Boolean)
        {
            loaded = (Boolean) Imagepresent;
            System.out.println("The T-shirt image is loaded ");
        }


}
