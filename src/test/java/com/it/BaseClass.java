package com.it;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BaseClass {

   public static WebDriver driver;

   public static JavascriptExecutor js;
    public static String White = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[1]/label/a";
    public static String Black = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[2]/label/a";
    public static String Ceramic = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[1]/label/a";
    public static String Polyester = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[2]/label/a";
    public static String RemovableCover = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[3]/ul/li/label/a";
    public static String StudioDesign = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[4]/ul/li/label/a";
    public static String FilterResult = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[1]/p";
    public static String dropdown = "/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button";
    public static String IsAGoodDay = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[3]/div/div[1]/h2/a";
    public static String quantity = "qty";
    public static String add = "#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button";
    public static String nextpage = "/html/body/main/section/div/div[1]/div[2]/div[2]/section[5]/p";
    public static String description = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/ul/li[1]/a";
    public static String proDetial = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/ul/li[2]/a";
    public static String DescriptionResult = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[4]/div/div[1]/div/p/span";
    public static String fb = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[3]/div/ul/li[1]/a";
    public static String viewAction = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[1]/div/div[2]/a";
    public static String Accessories = "/html/body/main/header/div[2]/div/div[1]/div[2]/div[1]/ul/li[2]/a";
    public static String driverType = "";
    public static String Check = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a";

   @BeforeAll
   public static void SetUp(){
       System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver.exe");
       driver = new ChromeDriver();
       //driver = new FirefoxDriver();
       js = (JavascriptExecutor) driver;
       driver.get("http://40.76.27.113:8085/en/");
       driver.manage().window().maximize();

   }

/*    @BeforeEach
    public void openUp() {
        //open the Chrome webdriver and maximize the window before performing each test case
        //System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver.exe");
        // driver = new ChromeDriver();
        //driver = new FirefoxDriver();

    }*/

    public void LoginExistingUser(String EmailId, String PassWord){
        //Function to log into the existing user account
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
        driver.findElement(By.name("email")).sendKeys(EmailId);
        driver.findElement(By.name("password")).sendKeys(PassWord);
        driver.findElement(By.id("submit-login")).submit();
    }


   @AfterAll
    public static void tearDown(){
       // Close the Chrome webpage after performing each test case
        driver.quit();
    }

}
