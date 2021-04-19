package com.it;

import org.checkerframework.checker.index.qual.GTENegativeOne;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearchFunction extends PageSearch{

@Test
    public void TestSearchASingleItem(){
    //Test to search a particular single item present
        EnterSearchItem("MUG TODAY IS A GOOD DAY");
        String ExpUrl = "http://40.76.27.113:8085/en/search?controller=search&s=MUG+TODAY+IS+A+GOOD+DAY";
        String ActUrl = driver.getCurrentUrl();
        assertEquals(ActUrl,ExpUrl);
}

@Test
    public void TestSearchMultipleItems(){
    //Test to check the multiple items present with the same string in the name
    EnterSearchItem("MUG");
    String ExpUrl = "http://40.76.27.113:8085/en/search?controller=search&s=MUG";
    String ActUrl = driver.getCurrentUrl();
    assertEquals(ActUrl,ExpUrl);
}

@Test
    public void TestNonExistingSearchItem(){
    //Test to check the item that is not present and to validate the message displayed when no relevant item is found
    EnterSearchItem("GLASS");
    String Message = driver.findElement(By.xpath("//*[@id=\"content\"]/h4")).getText();
    assertEquals(Message, "Sorry for the inconvenience.");
}

@Test
    public void SearchInUserLogin(){
    //Test to search for the non existing item after loging into the existing user account
    LoginExistingUser("testacct@gmail.com","Test@1234");
    EnterSearchItem("GLASS");
    String Message = driver.findElement(By.xpath("//*[@id=\"content\"]/h4")).getText();
    assertEquals(Message, "Sorry for the inconvenience.");
}


}
