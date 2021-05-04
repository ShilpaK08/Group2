package com.it;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import com.it.ClothsMen;
import com.it.BaseClass.*;
import com.it.ArtPage.*;
import com.it.ClothesWomen;
import java.util.concurrent.TimeUnit;

import static com.it.ArtPage.Dimensions;
import static com.it.BaseClass.SetUp;
import static com.it.ClothesWomen.Relevance;
import static com.it.ClothesWomen.sortBy;
import static com.it.ClothsMen.*;
import static com.it.PageSearch.EnterSearchItems;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CucumberSteps {
    //Login Verification
    @Given("user is on the mystore page")
    public void user_is_on_the_mystore_page() {
        SetUp();
    }
    @Given("user click on Signin link")
    public void user_click_on_Signin_link() {
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();
    }
    @Given("user enter the emailandPWD")
    public void user_enter_the_emailandPWD() {
        driver.findElement(By.name("email")).sendKeys("testacct@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test@1234");
    }
    @Given("user click on signin button")
    public void user_click_on_Signin_button() {
        driver.findElement(By.id("submit-login")).submit();
    }
    @Given("MyStore home page displayed")
    public void MyStore_home_page_displayed() {
        System.out.println("Home page displayed");
    }
    //Clothes Men - Size filter
    @Given("user navigate to cloths men page")
    public void user_navigate_to_cloths_men_page() throws InterruptedException {
        SelectMen();
    }
    @When("user select the size M")
    public void user_select_the_size_m() throws InterruptedException {
        ChooseSize(M);
    }
    @Then("user verified size M is enabled")
    public void user_verified_size_m_is_enabled() {
        assertTrue(driver.findElement(By.xpath(SizeResult)).isEnabled());
    }
    //Art dimension filter
    @Given("user is on the art page")
    public void user_is_on_the_art_page() {
        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")).click();
    }
    @When("user select dimensions sixtyninty")
    public void user_select_dimensions_sixtyninty() throws InterruptedException {
        Dimensions();
        Thread.sleep(1000);
    }
    @Then("the user virified selected dimension is enabled")
    public void the_user_virified_selected_dimension_is_enabled() {
        Assertions.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[2]/ul[1]/li[2]/label[1]/span[1]/span[1]/i[1]")).isEnabled());
    }
    //Clothes-Women Sortby Relevance
    @Given("user is on clothes women page")
    public void user_is_on_clothes_women_page() {
        driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")).click();
    }
    @When("user select sortby index 1")
    public void user_select_sortby_index_1() throws InterruptedException {
        sortBy(Relevance, 2);
        Thread.sleep(1000);
    }
    @Then("Name A to Z selected in sortby dropdown")
    public void Name_A_to_Z_selected_in_sortby_dropdown() {
        assertTrue(driver.findElement(By.xpath(Relevance)).isEnabled());
    }
    //Search - check the multiple items present with the same string in the name
    @Given("user enter mug in search bar")
    public void user_enter_mug_in_search_bar() {
        EnterSearchItems("MUG");
    }
    @Then("verifes the current url")
    public void verifes_the_current_url() {
        String ActUrl = driver.getCurrentUrl();
        System.out.println(ActUrl);
    }
    @Given("user close the window")
    public void user_close_the_window() {
        tearDown();
    }
}
