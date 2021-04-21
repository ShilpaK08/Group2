package com.it;

import net.bytebuddy.asm.Advice;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

import java.sql.DriverPropertyInfo;

public class PageSearch extends BaseClass{

public void EnterSearchItem(String SearchItem){
    //Check for the search items on the webpage
    driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/input[2]")).sendKeys(SearchItem);
    driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/button/i")).click();
}

public void EnterUserName(String FirstName, String LastName){
    //Enter the First and Last name when creating a new user account
    driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[2]/div[1]/input")).sendKeys(FirstName);
    driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[3]/div[1]/input")).sendKeys(LastName);
}

public void EnterEmail(String NewEmail){
    //Enter the email id
    driver.findElement(By.name("email")).sendKeys(NewEmail);
}

public void EnterPassword(String NewPswd) {
    //Enter the password
    driver.findElement(By.name("password")).sendKeys(NewPswd);
}

public void EnterBirthDate(String BirthDate){
    driver.findElement(By.name("birthday")).sendKeys(BirthDate);
}

public void EnterSocialTitle(String EnterGender){
    //Enter the gender
    if (EnterGender == "Male") {
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input")).click();
    }
    else if (EnterGender == "Female"){
        driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[2]/span/input")).click();
    }
}

public void SelectReceiveOffers(){
    driver.findElement(By.xpath("//*[@id=\"customer-form\"]/section/div[7]/div[1]/span/label/input")).click();
}

public void SelectForNewsLetter(){
    driver.findElement(By.name("newsletter")).click();
}

public void AgreeTermsnConditions(){
    driver.findElement(By.name("psgdpr")).click();
}

public void EnterQuantity(String Quantity){
    //Enter the number of items to order
    driver.findElement(By.id("quantity_wanted")).sendKeys(Quantity);
    //*[@id="add-to-cart-or-refresh"]/div[2]/div/div[1]/div/span[3]/button[1]/i

    //driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i")).click();
}

public void AddtoCart(){
    //Click on the Add to cart button
    driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")).click();
}

public void ProceedtoChekout() throws InterruptedException  {
    //Click to proceed for checkout
    Thread.sleep(1000);

    //driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a")).submit();

    Thread.sleep(1000);
    //driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")).click();
    driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")).submit();
}


public void EnterAddress(String Address){
    //Enter address while placing the order
    driver.findElement(By.name("address1")).sendKeys(Address);
}

public void EnterPostCode(String PostCode){
    //Enter the post code
    driver.findElement(By.name("postcode")).sendKeys(PostCode);
}

public void EnterCity(String City){
    //Enter the city name
    driver.findElement(By.name("city")).sendKeys(City);
}

public void SelectDeliveryOption(String DeliveryOption){
    if (DeliveryOption == "pickup") {
        driver.findElement(By.id("delivery_option_1")).click();
    }
    else if (DeliveryOption == "my carrier"){
        driver.findElement(By.id("delivery_option_2")).click();
    }
}

public void EnterDeliveryMessage(String DeliveryMessage){
    driver.findElement(By.id("delivery_message")).sendKeys(DeliveryMessage);
}

public void SelectPaymentMethod(String PaymentMethod){
    if (PaymentMethod == "check"){
        driver.findElement(By.id("payment-option-1")).click();
    }
    else if (PaymentMethod == "bankwire"){
        driver.findElement(By.id("payment-option-2")).click();
    }
}


}
