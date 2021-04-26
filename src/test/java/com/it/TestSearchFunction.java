package com.it;

import org.checkerframework.checker.index.qual.GTENegativeOne;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearchFunction extends PageSearch{

@Test
    public void TestSearchASingleItem(){
    //Test to search a particular single item present
        EnterSearchItems("MUG TODAY IS A GOOD DAY");
        String ExpUrl = "http://40.76.27.113:8085/en/search?controller=search&s=MUG+TODAY+IS+A+GOOD+DAY";
        String ActUrl = driver.getCurrentUrl();
        assertEquals(ActUrl,ExpUrl);
}

@Test
    public void TestSearchMultipleItems(){
    //Test to check the multiple items present with the same string in the name
    EnterSearchItems("MUG");
    String ExpUrl = "http://40.76.27.113:8085/en/search?controller=search&s=MUG";
    String ActUrl = driver.getCurrentUrl();
    assertEquals(ActUrl,ExpUrl);
}

@Test
    public void TestNonExistingSearchItem(){
        //Test to check the item that is not present and to validate the message displayed when no relevant item is found
    EnterSearchItems("GLASS");
    String Message = driver.findElement(By.xpath("//*[@id=\"content\"]/h4")).getText();
    assertEquals(Message, "Sorry for the inconvenience.");
    }

    @Test
    public void SearchInUserLogin(){
        //Test to search for the non existing item after loging into the existing user account
        LoginExistingUser("testacct@gmail.com","Test@1234");
        EnterSearchItems("GLASS");
        String Message = driver.findElement(By.xpath("//*[@id=\"content\"]/h4")).getText();
        assertEquals(Message, "Sorry for the inconvenience.");
    }

    @Test
    public void TestItemOnDiffPage(){
        //Test to search for the item present in a different page
        driver.get("http://40.76.27.113:8085/en/9-art");
        EnterSearchItems("MUG");
        String ExpUrl = "http://40.76.27.113:8085/en/search?controller=search&s=MUG";
        String ActUrl = driver.getCurrentUrl();
        assertEquals(ActUrl,ExpUrl);
    }

    @Test
    public void TestNonExistingItemOnDiffPage(){
        //Test to search for the item present in a different page
        driver.get("http://40.76.27.113:8085/en/9-art");
        EnterSearchItems("GLASS");
        String Message = driver.findElement(By.xpath("//*[@id=\"content\"]/h4")).getText();
        assertEquals(Message, "Sorry for the inconvenience.");
    }


/*@Test
    public void CreateNewUserAccount(){
    driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
    EnterSocialTitle("Female");
    EnterUserName("Prathibha","Reddy");
    EnterEmail("TestABCD1@gmail.com");
    EnterPassword("Test@1234");
    EnterBirthDate("05/13/1982");
    SelectForNewsLetter();
    SelectReceiveOffers();
    AgreeTermsnConditions();
    driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button")).submit();
    System.out.println("New User account registered");
}*/


}
