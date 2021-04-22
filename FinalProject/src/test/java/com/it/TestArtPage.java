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
        Composition();
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

    @Test //testcase failing
    public void TestDimensions() throws InterruptedException {
        Dimensions();
        String expUrl1 = "http://40.76.27.113:8085/en/9-art?q=Dimension-60x90cm";
        String curUrl1 = driver.getCurrentUrl();
        assertEquals(expUrl1,curUrl1);

    }






}
