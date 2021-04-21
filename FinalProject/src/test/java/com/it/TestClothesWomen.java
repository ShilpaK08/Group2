package com.it;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.jupiter.api.Assertions.*;
import static com.it.BaseClass.*;


public class TestClothesWomen extends Clotheswomen {

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
    }
}

