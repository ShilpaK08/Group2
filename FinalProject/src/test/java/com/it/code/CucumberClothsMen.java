package com.it.code;
import com.it.BaseClass;
import com.it.ClothsMen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.it.BaseClass.driver;
import static com.it.ClothsMen.SelectMen;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CucumberClothsMen {
    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        BaseClass.LoginExistingUser("testacct@gmail.com","Test@1234");
    }
    @Given("Navigate to Men page")
    public void navigate_to_men_page() throws InterruptedException {
        SelectMen();
    }
    @Then("Home Cloths Men header is dispalyed")
    public void home_cloths_men_header_is_displayed() {
        WebElement E3 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/nav/ol"));
        String S0 = E3.getText();
        Assertions.assertEquals("Home Clothes Men", S0);

    }
    @Then("Men - product header is displayed")
    public void men_product_header_is_displayed() {
        WebElement E4 = driver.findElement(By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[1]/a"));
        String S1 = E4.getText();
        Assertions.assertEquals("MEN", S1);
    }
    @Then("Filter By option is displayed in Men clothes page")
    public void filter_by_option_is_displayed_in_men_clothes_page() {
        WebElement E5 = driver.findElement(By.xpath("//*[@id=\"search_filters\"]/p"));
        String S2 = E5.getText();
        Assertions.assertEquals("FILTER BY", S2);
    }
    @Then("User verified the Clothes Men page")
    public void User_verified_the_Clothes_Men_page() {
        System.out.println("Page verified");

    }

}

