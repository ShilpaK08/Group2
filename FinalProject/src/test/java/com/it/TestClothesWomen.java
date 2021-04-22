package com.it;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.jupiter.api.Assertions.*;

public class TestClothesWomen extends ClothesWomen {

    @Test
    public void testCorrectUrl() {

        String url = driver.getCurrentUrl();
        String currentUrl = "http://40.76.27.113:8085/en/";
        assertEquals(url, currentUrl, "url differs");
    }


    @Test
    public void testSortBy() {
        //Testing the Sortby dropdown
        sortBy(2);
        Select SelectDropdown = new Select(driver.findElement(By.xpath("//*[@id=\"js-product-list-top\"]/div[2]/div/div[1]/button")));
        String Sort = SelectDropdown.getFirstSelectedOption().getText();
        assertEquals("Name, Z to A", Sort);
        System.out.println("testing Sort Method");
    }

    @Test
    public void testFilterBy() {
        filterBy(Checkbox1);
        WebElement chkbox1 = driver.findElement(By.xpath("//*[@id=\"facet_1054\"]/li[1]/label/span/span"));
        assertTrue(chkbox1.isSelected());
        filterBy(Checkbox2);
        WebElement chkbox2 = driver.findElement(By.xpath("//*[@id=\"facet_97297\"]/li[2]/label/span/span/i"));
        assertTrue(chkbox2.isSelected());
        //filterBy(Checkbox3);
        //WebElement chkbox3 = driver.findElement(By.xpath("//*[@id="facet_37025"]/li[3]/label/span/span/i"));
        //assertTrue(chkbox3.isSelected());
        filterBy(Checkbox4);
        WebElement chkbox4 = driver.findElement(By.xpath("//*[@id=\"facet_37025\"]/li[4]/label/span/span"));
        assertTrue(chkbox4.isSelected());
    }
}

