package com.it;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

    public static JavascriptExecutor js;
    public static WebDriver driver1;

    @BeforeAll
    public static void SetUp(){
        //System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver.exe");
        driver1 = new FirefoxDriver();
        js = (JavascriptExecutor) driver1;
        driver1.get("http://40.76.27.113:8085/sv/");
        driver1.manage().window().maximize();

    }

    public void LoginExistingUser(String EmailId, String PassWord){
        //Function to log into the existing user account
        driver1.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
        driver1.findElement(By.name("email")).sendKeys(EmailId);
        driver1.findElement(By.name("password")).sendKeys(PassWord);
        driver1.findElement(By.id("submit-login")).submit();
    }

    public void Products() throws InterruptedException {
        driver1.get("http://40.76.27.113:8085/sv/");
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(1000);
        driver1.findElement(By.xpath(Rea)).click();
    }

    public void ourCompany() throws InterruptedException {
        driver1.get("http://40.76.27.113:8085/sv/");
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(1000);
        driver1.findElement(By.xpath(Delivery)).click();
        driver1.findElement(By.xpath(LegalNotice)).click();
    }

    public void BUTIKSINFORMATION() throws InterruptedException {
        driver1.get("http://40.76.27.113:8085/sv/");
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(1000);
        driver1.findElement(By.xpath(Mailaoss)).click();
    }

    @AfterAll
    public static void tearDown(){
        // Close the Chrome webpage after performing each test case
        driver1.quit();
    }


}
