package com.it;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageSearch extends BaseClass{

public void EnterSearchItems(String SearchItem){
    //Check for the search items on the webpage
    driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/input[2]")).sendKeys(SearchItem);
    driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/button/i")).click();
}



public void EnterUserName(String FirstName, String LastName){
    driver.findElement(By.name("firstname")).sendKeys(FirstName);
    driver.findElement(By.name("lastname")).sendKeys(LastName);
}

public void EnterEmail(String NewEmail){
    driver.findElement(By.name("email")).sendKeys(NewEmail);
}

public void EnterPassword(String NewPswd){
    driver.findElement(By.name("password")).sendKeys(NewPswd);
}

public void EnterBirthDate(String BirhtDate){
    driver.findElement(By.name("Birthday")).sendKeys(BirhtDate);
}

public void EnterSocialTitle(String EnterGender){
    driver.findElement(By.name("id_gender")).sendKeys(EnterGender);
}



}
