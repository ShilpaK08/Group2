package com.it;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAccount extends BaseClass{
    

    @Test
    public void loginErrorMessage(){
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
        driver.findElement(By.name("email")).sendKeys("testacct@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test@123456");
        driver.findElement(By.cssSelector("#submit-login")).click();
        String LoginWithWrongPw = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/ul/li")).getText();
        assertEquals(LoginWithWrongPw,"Authentication failed.");
        driver.quit();

    }



}
