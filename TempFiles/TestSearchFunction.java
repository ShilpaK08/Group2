package com.it;

import org.checkerframework.checker.index.qual.GTENegativeOne;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearchFunction extends PageSearch{

/*@Test
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
}*/

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
   // String ErrMessage = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[4]/div[1]/div/ul/li")).getText();
   // if (ErrMessage != " ") {
   //     assertEquals(ErrMessage, "The email is already used, please choose another one or sign in");
   //     System.out.println("User Id already exists");
   // }
}*/

@Test
    public void CheckOutItems() throws InterruptedException {
    LoginExistingUser("testacct@gmail.com","Test@1234");

    driver.get("http://40.76.27.113:8085/en/");
    driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/article[2]/div/a/img")).click();

    //driver.findElement(By.xpath("/html/body/main/section/div/div[1]/div[2]/div[2]/section[1]/ul/li[2]/label/span/span")).click();
    driver.findElement(By.xpath("//*[@id=\"group_1\"]")).sendKeys("L");
    driver.findElement(By.xpath("//*[@id=\"group_1\"]")).click();


    EnterQuantity("1");
    AddtoCart();
    Thread.sleep(1000);

    CheckOutItems();

    Thread.sleep(1000);

    EnterAddress("Frolunda Torg 3");
    EnterPostCode("48135");
    EnterCity("Gothenburg");
    driver.findElement(By.name("confirm-addresses")).click();
    SelectDeliveryOption("pickup");
    driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button")).click();
    SelectPaymentMethod("bankwire");
    driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button")).submit();
    String GetMessage = driver.findElement(By.xpath("//*[@id=\"content-hook_order_confirmation\"]/div/div/div/h3")).getText();
    System.out.println(GetMessage);

    String CheckUrl = driver.getCurrentUrl();
    System.out.println(CheckUrl);
}

}
