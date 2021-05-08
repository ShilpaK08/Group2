package com.it;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SwedishFooter
{
    public static String Mailaoss = "/html/body/main/footer/div[2]/div/div[1]/div[3]/div[1]/a";
    public static String Rea = "/html/body/main/footer/div[2]/div/div[1]/div[1]/div/div[1]/ul/li[1]/a";
    public static String Delivery = "/html/body/main/footer/div[2]/div/div[1]/div[1]/div/div[2]/ul/li[1]/a";
    public static String LegalNotice = "/html/body/main/footer/div[2]/div/div[1]/div[1]/div/div[2]/ul/li[2]/a";

    private static JavascriptExecutor js;
    public static WebDriver driver;
    @BeforeAll
    public static void SetUp(){
        System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("http://40.76.27.113:8085/sv/");
        driver.manage().window().maximize();

    }



    public void Products() throws InterruptedException {
        driver.get("http://40.76.27.113:8085/sv/");
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Rea)).click();
    }

    public void ourCompany() throws InterruptedException {
        driver.get("http://40.76.27.113:8085/sv/");
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Delivery)).click();
        driver.findElement(By.xpath(LegalNotice)).click();
    }

    public void BUTIKSINFORMATION() throws InterruptedException {
        driver.get("http://40.76.27.113:8085/sv/");
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Mailaoss)).click();
    }
    @AfterAll
    public static void tearDown()
    {
        // Close the Chrome webpage after performing each test case
        driver.quit();
    }


}
