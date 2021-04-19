package com.it;

import org.openqa.selenium.By;

public class PageSearch extends BaseClass{

public void EnterSearchItem(String SearchItem){
    //Check for the search items on the webpage
    driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/input[2]")).sendKeys(SearchItem);
    driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/button/i")).click();
}

public void LoginExistingUser(String EmailId, String PassWord){
    //Function to log into the existing user account
    driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
    driver.findElement(By.name("email")).sendKeys(EmailId);
    driver.findElement(By.name("password")).sendKeys(PassWord);
    driver.findElement(By.id("submit-login")).submit();
}

}
