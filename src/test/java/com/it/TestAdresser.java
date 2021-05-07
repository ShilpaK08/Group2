package com.it;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestAdresser {

    static WebDriver driver = new ChromeDriver();

   @BeforeAll
    public static void open (){
        driver.get("http://40.76.27.113:8085/sv/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
        driver.findElement(By.name("email")).sendKeys("testacct@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test@1234");
        driver.findElement(By.cssSelector("#submit-login")).click();
}
    @Test

    public void UpdateAdress(){

        driver.findElement(By.cssSelector("#footer_account_list > li:nth-child(4) > a")).click();
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[1]/span")).click();
        driver.findElement(By.name("address1")).clear();
        driver.findElement(By.name("address1")).sendKeys("Slottsgatan77");
        driver.findElement(By.name("postcode")).clear();
        driver.findElement(By.name("postcode")).sendKeys("703 28");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).click();

        String AddressUpdatesuccefull = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li")).getText();
        assertEquals(AddressUpdatesuccefull,"Adressen uppdaterades!");
        //driver.quit();
    }

    @Test

    public void KontaktaOss() {

        driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
        Select selectMenu = new Select(driver.findElement(By.name("id_contact")));
        selectMenu.selectByIndex(1);
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/form/section/div[3]/div/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/form/section/div[3]/div/input")).sendKeys("testcase@hotmail.se");
        driver.findElement(By.name("message")).sendKeys("Hej! Kolla mail");
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/form/footer/input[3]")).click();

        String MeddelandeSkickat= driver.findElement(By.xpath("//*[@id=\"content\"]/section/form/div/ul/li")).getText();
        assertEquals(MeddelandeSkickat,"Ditt meddelande har skickats till vårt team." );
        //driver.quit();
    }

    @Test

    public void KreditLippStatus (){

        driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[3]/a")).click();
        String KreditsLippStatusen = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li")).getText();
        assertEquals(KreditsLippStatusen, "Du har inte mottagit någon kreditslipp");
        //driver.quit();
    }

    @Test

    public void Reorder(){

        driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[2]/a")).click();
        driver.findElement(By.cssSelector("#content > table > tbody > tr:nth-child(1) > td.text-sm-center.order-actions > a:nth-child(2)")).click();
        driver.findElement(By.name("confirm-addresses")).click();
        driver.findElement(By.name("confirmDeliveryOption")).click();
        driver.findElement(By.name("payment-option")).click();
        driver.findElement(By.id("conditions_to_approve[terms-and-conditions]")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button" )).click();

        String ReorderAgain = driver.findElement(By.xpath("//*[@id=\"content-hook_order_confirmation\"]/div/div/div/h3")).getText();
        assertEquals(ReorderAgain,"\uE876DIN BESTÄLLNING HAR BEKRÄFTATS");
        //driver.quit();
    }

    @Test
    public void uppdateraPeronsInfo()  {

        driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[1]/a")).click();
        driver.findElement(By.cssSelector("#customer-form > section > div:nth-child(3) > div.col-md-6 > input")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Brorsky");
        driver.findElement(By.name("password")).sendKeys("Test@1234");
        driver.findElement(By.name("psgdpr")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button")).click();

        String InfoUpdate= driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li")).getText();
        assertEquals(InfoUpdate,"Informationen uppdaterades.");
        //driver.quit();
    }

    @AfterAll

    public static void TearDown() {

       driver.quit();

    }
}
