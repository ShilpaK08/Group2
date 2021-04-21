package com.it;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class TestArtPage extends ArtPage {

    @Test
    public void TestOpenArtTab() {

        OpenArtTab();
        String expUrl = "http://40.76.27.113:8085/en/9-art";
        String curUrl = driver.getCurrentUrl();
        assertEquals(curUrl,expUrl);
    }

    @Test
    public void TestComposition() throws InterruptedException {
        Composition(Matt_paper);
        assertTrue(driver.findElement(By.xpath()).isEnabled());
        String expUrl1 = "http://40.76.27.113:8085/en/9-art?q=Composition-Matt+paper";
        String curUrl1 = driver.getCurrentUrl();
        assertEquals(expUrl1,curUrl1);
    }

    @Test
    public void TestBrand() throws InterruptedException {
        Brand();
        String expUrl1 = "http://40.76.27.113:8085/en/9-art?q=Brand-Graphic+Corner";
        String curUrl1 = driver.getCurrentUrl();
        assertEquals(expUrl1,curUrl1);
    }

    @Test
    public void TestDimensions() throws InterruptedException {
        Dimensions();
        String expUrl1 = "http://40.76.27.113:8085/en/9-art?q=Dimension-60x90cm";
        String curUrl1 = driver.getCurrentUrl();
        assertEquals(expUrl1,curUrl1);

    }

    @Test
    public void TestDoubleFilter() throws InterruptedException {
        DoubleFilter();
        String curText = driver.findElement(By.xpath("//*[@id=\"js-active-search-filters\"]/p")).getText();
        String expText = "Active filters";
        assertEquals(curText,expText);
    }


    @Test
    public void TestDescription() throws InterruptedException {
        Description();
        String curText = driver.findElement(By.xpath("//*[@id=\"description\"]/div/p/span")).getText();
        //String curText = driver.findElement(By.partialLinkText("You have a custom printing creative project?")).getText();
        String expText = "You have a custom printing creative project? The vector graphic Mountain fox illustration can be used for printing purpose on any support, without size limitation.";
        assertEquals(curText, expText);

    }

    @Test //not working
    public void TestQuickView() throws InterruptedException {
        QuickView();
        String curText = driver.findElement(By.xpath("//*[@id=\"quickview-modal-13-0\"]/div/div/div[2]/div/div[2]/h1")).getText();
        String expText = "BROWN BEAR - VECTOR GRAPHICS";
        assertEquals(curText,expText);

    }

}
