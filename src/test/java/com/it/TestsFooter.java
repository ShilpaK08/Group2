package com.it;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestsFooter extends SwedishFooter
{
    @Test
    public void testProducts() throws InterruptedException
    {
        Products();
        Thread.sleep(2000);
        Assertions.assertTrue(driver.findElement(By.xpath(Rea)).isDisplayed());
        Thread.sleep(2000);

    }

    @Test
    public void testOurCompany() throws InterruptedException
    {
        ourCompany();
        Thread.sleep(2000);
        Assertions.assertTrue(driver.findElement(By.xpath(Delivery)).isDisplayed());
        Thread.sleep(2000);
        Assertions.assertTrue(driver.findElement(By.xpath(LegalNotice)).isDisplayed());
        driver.findElement(By.xpath("/html/body/main/footer/div[2]/div/div[1]/div[1]/div/div[1]/ul/li[2]/a")).sendKeys("note");
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/p[2]/a[1]")).click();

    }
    @Test
    public void testBUTIKSINFORMATION() throws InterruptedException
    {
        BUTIKSINFORMATION();
        Thread.sleep(2000);
        Assertions.assertTrue(driver.findElement(By.xpath(Mailaoss)).isDisplayed());
    }

}
